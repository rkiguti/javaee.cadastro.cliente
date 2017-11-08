<%-- 
    Document   : alterarCliente
    Created on : 04/11/2017, 10:13:21
    Author     : kiguti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar cliente</title>
        <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    </head>
    <body class="container">
        <h1>Alterar cliente!</h1>
        <form method="POST" action="${pageContext.request.contextPath}/alterar">
            <div class="form-group">
                <label>Id</label>
                <input type="text" name="id" value="${cliente.id}" class="form-control">
            </div>
            <div class="form-group">
                <label>Nome</label>
                <input type="text" name="nome" value="${cliente.nome}" class="form-control">
            </div>
            <div class="form-group">
                <label>Telefone</label>
                <input type="text" name="telefone" value="${cliente.telefone}" class="form-control">
            </div>
            <input type="submit" value="Alterar" class="btn">
        </form>
    </body>
</html>
