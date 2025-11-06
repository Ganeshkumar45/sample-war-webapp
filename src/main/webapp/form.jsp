<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
  <head>
    <meta charset="UTF-8"/>
    <title>Form Demo</title>
  </head>
  <body>
    <h1>Form Demo</h1>
    <form method="post" action="${pageContext.request.contextPath}/response">
      <label for="name">Your name:</label>
      <input id="name" name="name" type="text"/>
      <button type="submit">Submit</button>
    </form>
    <p><a href="${pageContext.request.contextPath}/">Back to index</a></p>
  </body>
</html>
