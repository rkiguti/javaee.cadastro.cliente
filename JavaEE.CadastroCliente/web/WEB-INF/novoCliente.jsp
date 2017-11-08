<%-- 
    Document   : novoCliente
    Created on : 04/11/2017, 10:11:09
    Author     : kiguti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo cliente</title>
        <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    </head>
    <body class="container">
        <h1>Novo cliente!</h1>
        <form method="POST" action="${pageContext.request.contextPath}/novo">
            <div class="form-group">
                <label>Id</label>
                <input type="text" name="id" class="form-control">
            </div>
            <div class="form-group">
                <label>Nome</label>
                <input type="text" name="nome" class="form-control">
            </div>
            <div class="form-group">
                <label>Telefone</label>
                <input type="text" name="telefone" class="form-control">
            </div>
            <input type="submit" value="Incluir" class="btn">
        </form>
    </body>
</html>
