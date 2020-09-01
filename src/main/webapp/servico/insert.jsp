<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Novo Serviço</title>
    </head>
    <body>
        <h1>Novo Serviço</h1>
        <form action="insert" method="POST">
            <label for="nome">Nome</label>
            <input type="text" name="nome" /><br />
            <label for="descricao">Descrição</label>
            <input type="text" name="descricao" />
            <input type="submit" value="Salvar" />
        </form>
    </body>
</html>