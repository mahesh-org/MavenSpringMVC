package com.mahesh.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * we can create our own interceptors in Spring by either implementing org.springframework.web.servlet.HandlerInterceptor interface 
 * or 
 * by overriding abstract class org.springframework.web.servlet.handler.HandlerInterceptorAdapter that provides the base implementation of this interface.
 * 
 * use mvc:interceptors element to wire all the interceptors.
 * HandlerInterceptor declared three methods based on where we want to intercepts the HTTP Request.
 * 
 */
public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {
	/**
	 * This method is used to intercept the request before it’s handed over to the handler method.
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
		long startTime = System.currentTimeMillis();
        System.out.println("Request URL::" + request.getRequestURL().toString() + ":: Start Time=" + System.currentTimeMillis());
        request.setAttribute("startTime: ", startTime);
        
        
		Calendar cal = Calendar.getInstance();
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK); //getting the day on which the request is made
		
		if(dayOfWeek == 1) { //1 means Sunday, 2 means Mondya ......
			response.getWriter().write("The website is closed on Sunday, Please try accessing it on any of the week day!");
			return false;
		}
		return true;
	}
	
	/**
	 * This interceptor method is called when HandlerAdapter has invoked the handler but DispatcherServlet is yet to render the view. 
	 * This method can be used to add additional attribute to the ModelAndView object to be used in the view pages. 
	 * We can use this interceptor to determine the time taken by handler method to process the client request.
	 */
	@Override
	public void postHandle(
			HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		//This method would be called after Sping mvc executes the reuqest handler method for the request 
		System.out.println("PostHandle: "+ request.getRequestURI().toString());
	}

	/**
	 * This is a callback method that is called once the handler is executed and view is rendered.
	 */
	@Override
	public void afterCompletion(
			HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//This method would be called after the response object is produced by the view request. 
		 long startTime = (Long) request.getAttribute("startTime");
	     System.out.println("Request URL::" + request.getRequestURL().toString() + ":: End Time=" + System.currentTimeMillis());
	     System.out.println("Request URL::" + request.getRequestURL().toString() 
	    		 + ":: Time Taken=" + (System.currentTimeMillis() - startTime));
	}
}
