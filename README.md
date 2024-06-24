# non-spring-boot-mvc-application-with-virtual-threads

The WAR file of this Spring MVC application should be deployed to a servlet container/web server. If Tomcat is used, then to execute Spring servlet/Controllers on virtual threads the `Connector` element of Tomcat `server.xml` file should be configured to use virtual threads:

```xml
<Connector ...
           useVirtualThreads="true" /> 
```

The project also demonstrates unrelated to servlet container/web server usage of virtual threads in Spring Beans asynchronous methods, annotated with `@Async`. 

To test deploy the WAR file to your servlet container/web server and point a browser to <a href="http://localhost:8080/home">http://localhost:8080/spring-mvc-virtual-threads/home</a>.

Java 21 or later is required.