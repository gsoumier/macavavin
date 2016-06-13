﻿<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MaCavaVin</title>
    <link href="<c:url value="/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet" />

</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Macavavin</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <form class="navbar-form navbar-right">
                <div class="form-group">
                    <input type="text" placeholder="Appelation, producteur" class="form-control">
                </div>
                <button type="submit" class="btn btn-success">Rechercher</button>
            </form>
        </div><!--/.navbar-collapse -->
    </div>
</nav>

<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron">
    <div class="container">
        <h1>Macavavin</h1>
        <p>Bienvenue dans votre cave à vin.
            Vous pouvez visualiser l'ensemble des bouteilles actuellement en cave.
            Vous avez actuellement ${bottles.size()} bouteilles.
        </p>
        <p><a class="btn btn-primary" href="#" role="button">Ajouter</a></p>
    </div>
</div>

<div class="container">
    <!-- Example row of columns -->

    <c:forEach items="${bottles}" var="bottle">
        <div class="panel panel-default">
            <div class="panel-heading">${bottle.appellation} - ${bottle.color.label}</div>
            <div class="panel-body">
                ${bottle.producer}
                ${bottle.plot}
            </div>
        </div>
    </c:forEach>


    <hr>

    <footer>
        <p>&copy; 2016 Arolla, Inc.</p>
    </footer>
</div> <!-- /container -->

<script src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>
</body>
</html>
