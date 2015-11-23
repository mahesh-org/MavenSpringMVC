package com.mahesh.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
		
		Calendar cal = Calendar.getInstance();
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK); //getting the day on which the request is made
		
		if(dayOfWeek == 1) { //1 means Sunday, 2 means Mondya ......
			response.getWriter().write("The website is closed on Sunday, Please try accessing it on any of the week day!");
			return false;
		}
		return true;
	}
	
	@Override
	public void postHandle(
			HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		//This method would be called after Sping mvc executes the reuqest handler method for the request 
		System.out.println("PostHandle: "+ request.getRequestURI().toString());
	}

	@Override
	public void afterCompletion(
			HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//This method would be called after the response object is produced by the view request. 
		System.out.println("afterCompletion: " + request.getRequestURI().toString() );
	}
}
