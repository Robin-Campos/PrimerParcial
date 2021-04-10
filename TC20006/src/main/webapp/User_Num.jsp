<%-- 
    Document   : Usuario y Números
    Created on : 04-09-2021, 04:02:53 PM
    Author     : Moisés Tejada
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet">
        <title>Usuario y Operación</title>
    </head>
    <body>
        <h1>
            Inicio
        </h1>

        <form action="MiServlet_URL" method="post">

            <fieldset>
                <legend>Ingresa tu usuario:</legend>
                <input type="text" name="user" placeholder="Usuario" required id="text"><br>
            </fieldset>

            <fieldset>
                <legend>Escribir dos numeros:</legend>
                <fieldset>
                    <legend>Numero 1:</legend>
                    <input type="number" name="num1" placeholder="Digita un número" value="2" required id="number">
                </fieldset>
                <fieldset>
                    <legend>Numero 2:</legend>
                    <input type="number" name="num2" placeholder="Digita un número" value="4" required id="number">
                </fieldset>
            </fieldset>

            <fieldset>
                <legend>Selecciona:</legend>
                <h3>Operación Aritmética:</h3>
                <input type="submit" name="suma" class="button-button-a" value="Suma" id="enviar1">
                <input type="submit" name="resta" class="button-button-a" value="Resta" id="enviar1">
                <input type="submit" name="multi" class="button-button-a" value="Multiplicación" id="enviar1">
                <input type="submit" name="division" class="button-button-a" value="División" id="enviar1">
                <br>
                <fieldset>
                    <legend>Otro:</legend>
                    <input type="reset" value="Limpiar campos" id="enviar1">
                </fieldset>
            </fieldset>
        </form>
    </body>
</html>
