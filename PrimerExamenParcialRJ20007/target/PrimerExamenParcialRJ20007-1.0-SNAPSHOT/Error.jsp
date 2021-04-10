
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <style>
            body{
                background: linear-gradient(to right, #f1aae3, #a4d6f5);
            }
        </style> 
    </head>
    <body>
        <form name="login" action="VolverPagina" method="post">
         <center>
        <div class="container w-25 mt-5">
                    <img src="Imagenes/error.png" alt="Imagen" width="100" height="100">
                    <div class="mb-2">
                        <H4 class="fst-italic text-center py-3">Error al ingresar el usuario, por favor intente de nuevo</H4>
                        <br>
                        <button type="submit" class="btn btn-dark" name="volver">Volver a la página principal</button>
                        

                    </div>
                </div>  
    </center>   
        </form>
    
    </body>
</html>
