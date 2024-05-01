<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <title>Liste Projets</title>
                <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
                <link rel="stylesheet" href="<c:url value='/css/main.css' />">
            </head>

            <body>
                <div class="container">
                    <div class="card">
                        <div class="card-header">
                            Liste des Projets
                        </div>
                        <div class="card-body">
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Nom Projet</th>
                                        <th>Manager</th>
                                        <th>Cout</th>
                                        <th>Start Date</th>
                                        <th>Actions</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${projets}" var="p">
                                        <tr>
                                            <td>${p.idProjet}</td>
                                            <td>${p.nomProjet}</td>
                                            <td>${p.manager}</td>
                                            <td>${p.cout}</td>
                                            <td>
                                                <fmt:formatDate pattern="dd/MM/yyyy" value="${p.startDate}" />
                                            </td>
                                            <td>
                                                <a onclick="return confirm('Êtes-vous sûr ?')" href="supprimerProjet?id=${p.idProjet}">Supprimer</a> |
                                                <a href="modifierProjet?id=${p.idProjet}">Éditer</a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>

                <!-- Bootstrap JS (optional) -->
                <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
            </body>

            </html>