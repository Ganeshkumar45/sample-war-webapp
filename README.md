# sample-war-webapp

Maven-based Jakarta EE WAR sample (Java 17+ compatible)

## Build
```
mvn clean package
```

## Deploy
Drop `target/sample-war-webapp.war` into Tomcat 10/11 `webapps/` directory and start Tomcat.

## Endpoints
- `/` → index.jsp
- `/hello` → HelloServlet (GET)
- `/form.jsp` → demo form (POSTs to /response)
- `/response` → ResponseServlet (POST)

