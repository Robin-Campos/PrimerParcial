
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Operaciones Aritméticas</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <style>
            body{
                background: linear-gradient(to right, #f1aae3, #a4d6f5);
            }
        </style> 
    </head>

    <body>
        
        <H1 class="fst-italic text-center py-3">Bienvenido/a, <%out.println(session.getAttribute("user"));%> </h1>
        <br>
        <form name="login" action="ValidaciondeOperaciones" method="post">
            <center>
                <div class="container w-25 mt-5">
                    <img src="Imagenes/calculadora.png" alt="Imagen" width="100" height="100">
                    <div class="mb-2">
                        <H4 class="fst-italic text-center py-3">Ingrese el primer número</H4>
                        <input type="text" class="form-control" id="numero1" name="numero1" aria-describedby="userHelp">
                        <br>
                        <H4 class="fst-italic text-center py-3">Ingrese el segundo número</H4>
                        <input type="text" class="form-control" id="numero2" name="numero2" aria-describedby="userHelp">
                        <br>

                    </div>
                </div> 
                <div class="container w-50 mt-5">
                    <div class="mb-2">
                        <button type="submit" class="btn btn-dark" name="Suma" >Sumar</button>
                        <button type="submit" class="btn btn-dark" name="Resta" >Restar</button>
                        <button type="submit" class="btn btn-dark" name="Multiplicacion" >Multiplicar</button> 
                        <button type="submit" class="btn btn-dark" name="Division" >Dividir</button>   
                    </div> 

                </div>   
            </center>  
        </form>

    </body>
</html>
