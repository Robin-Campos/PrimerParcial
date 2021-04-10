<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <style>
            body{
                background: linear-gradient(to right, #f1aae3, #a4d6f5);
            }
        </style> 
    </head>
    <body>
        <center>
                <div class="container w-25 mt-5">
                   
                    <div class="mb-2">
                        <H1 class="fst-italic text-center py-3"><%out.println(session.getAttribute("user"));%>, el resultado de la <%out.println(session.getAttribute("resultados"));%> es: </h1>
                        <br>
                        <h3 class="fst-italic text-center py-3"><%out.println(session.getAttribute("resultado"));%></h3> 
                        <br>
                        <H3 class="fst-italic text-center py-3">Números primos entre los números brindados ordenados de mayor a menor:</h3>
                        <H3 class="fst-italic text-center py-3"><%out.println(session.getAttribute("Numprimos"));%></H3>
                    </div>
                </div>  
        </center>
        </body>
</html>

        
         