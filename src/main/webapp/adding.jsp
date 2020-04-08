<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Meal</title>
    <style>
        dl {
            background: none repeat scroll 0 0 #FAFAFA;
            margin: 8px 0;
            padding: 0;
        }
        dt {
            display: inline-block;
            width: 170px;
        }
        dd {
            display: inline-block;
            margin-left: 8px;
            vertical-align: top;
        }
    </style>
</head>
<body>
<section>
    <h3><a href="index.html">Home</a></h3>
    <hr>
<%--    <jsp:useBean id="thing" type="model.RestaurantThing" scope="request"/>--%>
    <form method="post" action="adding">
        <dl>
            <dt>restaurantName:</dt>
            <dd><input type="text"  name="restaurantName" required></dd>
        </dl>
        <dl>
            <dt>dishName:</dt>
            <dd><input type="text"  name="dishName" required></dd>
        </dl>
        <dl>
            <dt>dishPrice:</dt>
            <dd><input type="number" min="0.00" max="10000.00" step="0.01"  name="dishPrice" required></dd>
        </dl>
        <button type="submit">Add</button>
<%--        <button onclick="window.history.back()" type="button">Cancel</button>--%>
    </form>
</section>
</body>
</html>