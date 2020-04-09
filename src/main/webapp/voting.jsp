<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Voting list</title>
    <style>
        .no {
            color: green;
        }

        .yes {
            color: red;
        }
    </style>
</head>
<body>
<section>
    <h3><a href="index.html">Home</a></h3>
    <hr/>
    <h2>VotingList</h2>
    <table border="1" cellpadding="8" cellspacing="0">
        <thead>
        <tr>
            <th>RestaurantName</th>
            <th>DishName</th>
            <th>DishPrice</th>
            <th></th>
        </tr>
        </thead>
        <c:forEach items="${things}" var="thing">
            <jsp:useBean id="thing" type="DLVS.model.RestaurantThing"/>
            <tr class="${thing.wasVoted ? 'yes' : 'no'}">
                <td>${thing.restaurantName}</td>
                <td>${thing.dishName}</td>
                <td>${thing.dishPrice}</td>
                <td><a href="voting?action=vote&id=${thing.id}">Vote</a></td>
            </tr>
        </c:forEach>
    </table>
    <h3><a href="adding">Add</a></h3>
</section>
</body>
</html>