<%--
  Created by IntelliJ IDEA.
  User: pedro
  Date: 6/14/2024
  Time: 12:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="Usuario" type="br.com.mvc.model.Usuario" scope="request"/>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <h1>Bem Vindo!</h1>
    <hr/>
    Seu id: <strong> ${Usuario.id} </strong> <br/>
    Seu nome: <strong> ${Usuario.fullName} </strong> <br/>
    Seu username: <strong> ${Usuario.username} </strong> <br/>
    Seu email: <strong> ${Usuario.email}</strong> <br/>
</body>
</html>
