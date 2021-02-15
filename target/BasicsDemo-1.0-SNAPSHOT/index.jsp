<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <title>Java Basic Demo</title>
</head>
<body>
<h1><%= "Welcome to our basic menu" %>
</h1>
<br/>
<div>
    <h3>
        <jsp:text>Select what you want to do from the menu below</jsp:text>
    </h3>
</div>
<ul>
    <li>
        <a href="./assets/happycat.jpg">Look at a happy cat &#x1F408 </a>
    </li>
    <li>
        <a href="views/type-text.jsp">Print a text on the screen</a>
    </li>
</ul>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>