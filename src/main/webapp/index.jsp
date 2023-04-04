<%-- 
    Document   : indexjsp
    Created on : 28-03-2023, 15:18:36
    Author     : Alumno
--%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<script>
                function soloNumeros(e) {
            var key = Window.Event ? e.which : e.keyCode
                    return (key >= 48 && key <= 57)
        }</script>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>   
        <form action ="NewServlet" method="POST">
            <label>Nombre
                <input type="text" name="Nombre">
            </label>
            <label>Apellido Paterno
                <input type="text" name="Apellido Paterno">
            </label>
            <label>Apellido Materno
                <input type="text" name="Apellido Materno">
            </label>
            <br>
            <label>Fecha Nacimiento
                <input type="date" name="Fecha Nacimiento">
            </label>
            <label>Correo
                <input type="text" name="Correo">
            </label>
            <label>Dirección
                <input type="text" name="Direccion">
            </label>
            <br>
            <label>Teléfono
                <input type="text" name="Telefono">
            </label>
            <label>Contraseña
                <input type="text" name="Contrasena">
            </label>
            <label>Rut
                <input type="text" name="Rut">
            </label>
            <label>
                <input type="text" name="DIG">
            </label>
             <button type="submit" class="btn btn-primary btn-sm">Enviar</button>
        </form>
    </body>
</html>