<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
            <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
            <html>

            <head>
                <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
                <title>Modifier un Projet</title>
                <link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
                <c:url value="/css/main.css" var="jstlCss" />
                <link href="${jstlCss}" rel="stylesheet" />
                <script type="text/javascript" src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
            </head>

            <body>
                <div class="container">
                    <div class="card-body">
                        <form action="updateProjet" method="post">
                            <div class="form-group">
                                <label class="control-label">ID Projet :</label>
                                <input type="text" name="idProjet" value="${projet.idProjet}" readonly class="form-control" />
                            </div>
                            <div class="form-group">
                                <label class="control-label">Nom Projet :</label>
                                <input type="text" name="nomProjet" value="${projet.nomProjet}" class="form-control" />
                            </div>
                            <div class="form-group">
                                <label class="control-label">Manager :</label>
                                <input type="text" name="manager" value="${projet.manager}" class="form-control" />
                                <!-- Corrected 'manager' -->
                            </div>
                            <div class="form-group">
                                <label class="control-label">Cout :</label>
                                <input type="text" name="cout" value="${projet.cout}" class="form-control" />
                                <!-- Corrected 'cout' -->
                            </div>
                            <div class="form-group">
                                <label class="control-label">Start date :</label>
                                <fmt:formatDate pattern="yyyy-MM-dd" value="${projet.startDate}" var="formatDate" />
                                <!-- Corrected 'startDate' -->
                                <input type="date" name="date" value="${formatDate}" class="form-control" />
                            </div>
                            <div>
                                <button type="submit" class="btn btn-primary">Modifier</button>
                            </div>
                        </form>
                    </div>
                    <br/>
                    <br/>
                    <a href="ListeProjets">Liste Projets</a>
                </div>
            </body>

            </html>