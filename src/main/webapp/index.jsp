<html>
<head>
    <% pageContext.setAttribute("APP_PATH", request.getContextPath());%>
    <%--引入jQuery--%>
    <script type="text/javascript" src="${APP_PATH}/js/jquery-3.2.1.min.js"></script>
    <%--引入样式--%>
    <link href="${APP_PATH}/css/bootstrap.css" rel="stylesheet">
    <script src="${APP_PATH}/js/bootstrap.js"></script>
</head>
<body>
<h2>Hello World!</h2>
</body>
</html>
