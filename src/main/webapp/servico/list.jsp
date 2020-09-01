<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Serviços</title>
    </head>
    <body>
        <h1>Serviços</h1>
        <table>
            <thead>
                <th>Id</th>
                <th>Nome</th>
                <th>Descrição</th>
            </thead>
            <tbody>
                <c:forEach var="s" items="${servicos}">
                    <tr>
                        <td>${s.id}</td>
                        <td>${s.nome}</td>
                        <td>${s.descricao}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>