<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
  <head>
    <meta charset="UTF-8"/>
    <title>Sample WAR Webapp</title>
  </head>
  <body>
    <h1>sample-war-webapp (Jakarta EE)</h1>
    <ul>
      <li><a href="${pageContext.request.contextPath}/hello">Hello Servlet (GET)</a></li>
      <li><a href="${pageContext.request.contextPath}/form.jsp">Form demo</a></li>
    </ul>
  </body>
</html>
