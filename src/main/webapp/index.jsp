<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/task2" method="post">
    <label>
        <input type="text" name="first" id="first">
    </label>
    <label>
        <input type="text" name="second" id="second">
    </label>
    <label>
        <input type="text" name="third" id="third">
    </label>
    <br>
    <label>
        func Max <input type="radio" name="radio" value="max" id="Max">
    </label>
    <br>
    <label>
        func Min <input type="radio" name="radio" value="min" id="Min">
    </label>
    <br>
    <label>
        func Average <input type="radio" name="radio" value="avr" id="Aver">
    </label>
    <br>
    <input type="submit">
</form>
<a href="/task3">Task3</a>
</body>
</html>