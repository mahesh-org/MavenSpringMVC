# MavenSpringMVC

Deployment or maven build problems problems:
If you are using Eclipse as your IDE and using Maven as your build tool and tomcat as your server; remember Tomcat server will not look on the jars which are just inside the folders. For that there's a small trick,
	Right click on your project and select properties
	From the displayed window, select Deployment Assembly
	Select Add
	Add Maven dependencies
	Click Apply and Click OK
	else
	Make sure to check the build path and move the maven dependency up.
	
	https://github.com/mahesh-org/MavenSpringMVC.git
