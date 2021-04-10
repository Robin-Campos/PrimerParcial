<%-- 
    Document   : control
    Created on : 9 abr. 2021, 21:12:17
    Author     : Figueroa
--%>

<%@page import="com.mycompany.mavenproject1.Operaciones"%>
<%@page import="com.mycompany.mavenproject1.Prime"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="jspstyles.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>

        <%

            Prime primos = new Prime();
            Operaciones op = new Operaciones();

            String nombre = request.getParameter("name");
            String num1 = request.getParameter("numero1");
            String num2 = request.getParameter("numero2");

            String value = request.getParameter("operacion");

            int primeList[] = primos.primeList(Integer.parseInt(num1), Integer.parseInt(num2));

            primos.reverse(primeList);

            double numero1 = Double.parseDouble(num1);
            double numero2 = Double.parseDouble(num2);


        %>

        <div class="container">
            <div>
            <h1> Hola! <%= nombre%> el resultado de la <%= value%> es:
                <% switch (value) {

                        case "suma":

                            out.print(op.suma(numero1, numero2));

                            break;
                        case "resta":
                            out.print(op.resta(numero1, numero2));
                            break;
                        case "multiplicacion":
                            out.print(op.multiplicacion(numero1, numero2));
                            break;
                        case "division":
                            out.print(op.division(numero1, numero2));
                            break;
                    }%>
            </h1>
            
            
             <div class="primos">
                 <span> Lista de numeros primos</span>
                <%
                    for (int i : primeList) {
                        out.print( "<h2>"+ i + "</h2>");
                    }
                %>
            
        </div>
        </div>
        </div>

       










    </body>
</html>
