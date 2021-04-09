<%-- 
    Document   : UsuarioError
    Created on : 8 abr. 2021, 06:33:26
    Author     : Akamegakill
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Inicio</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <style>

            body{
                background: rgb(129,190,2);
                background: linear-gradient(90deg, rgba(129,190,2,1) 0%, rgba(3,176,171,1) 74%);
            }
        </style>
    </head>
    <body>
        <div class="container w-25 bg-light mt-5 rounded shadow">
            <div class="row align-items-stretch">
                <div class="col p-5 rounded-end">
                    <h1 class="fw-bold text-center py-5">Operaciones Aritméticas</h1>

                    <!-- LOGIN -->

                    <form action="UsuarioServlet" method="post">
                        <div class="mb-5">
                            <label for="text" class="form-label">Usuario</label>
                            <input type="text" class="form-control" name="usuario" placeholder="Ingrese un usuario">
                            <div id="emailHelp" class="form-text">El usuario debe contener al menos 3 caracteres</div>
                        </div>
                        <div class="d-grid">
                            <center>
                                <button type="submit" class="btn btn-primary">Siguiente</button>
                            </center>
                            <div class="alert alert-danger" role="alert">
                                ¡Error!, el usuario debe contener 4 o más caracteres
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
