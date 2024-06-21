<html>
<body>
<h2>Hello World!</h2>

<form action="/create-car" method="post">

    <label>Car Name</label>
    <input type="text" name="car-name" id="car-name" value="${param.name}">
    <input type="hidden" name="id" id="id" value="${param.id}">

    <button type="submit">Save</button>



</form>
</body>
</html>
