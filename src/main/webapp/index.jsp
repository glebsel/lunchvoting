<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>--%>
<html>
<head>
    <title>Vote's list</title>
    <style>
        .normal {
            color: green;
        }
        .excess {
            color: red;
        }
    </style>
</head>
<body>
<section>
    <h3><a href="index.jsp">Home</a></h3>
    <hr/>
    <h2>Votes</h2>
    <table border="1" cellpadding="8" cellspacing="0">
        <thead>
        <tr>
            <th>RestaurantName</th>
            <th>DishName</th>
            <th>DishPrice</th>
        </tr>
        </thead>
        <c:forEach items="${things}" var="thing">
            <jsp:useBean id="thing" type="model.RestaurantThing"/>
<%--            <tr class="${meal.excess ? 'excess' : 'normal'}">--%>
            <tr>
                <td>
                        <%--${meal.dateTime.toLocalDate()} ${meal.dateTime.toLocalTime()}--%>
                        <%--<%=TimeUtil.toString(meal.getDateTime())%>--%>
                        <%--${fn:replace(meal.dateTime, 'T', ' ')}--%>
<%--                        ${fn:formatDate(restaurantThing.getDate)}--%>
                </td>
                <td>${thing.getRestaurantName()}</td>
                <td>${thing.getDishName()}</td>
                <td>${thing.getDishPrice()}</td>
            </tr>
        </c:forEach>
    </table>
</section>
</body>
</html>