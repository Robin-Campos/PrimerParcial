package com.mycompany.ft19004;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletParcial extends HttpServlet {

    String nombre;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html bgcolor=000000>");
            out.println("<head>");
            out.println("<title>Servlet servletParcial</title>");
            out.println("</head>");
            out.println("<body bgcolor=2BE099>");

            nombre = request.getParameter("nombre");
            out.println("<br>");
            out.println("<h1 align= center >Bienvenid@: " + nombre + "</h1>");

            int num1 = Integer.parseInt(request.getParameter("numero1"));
            int num2 = Integer.parseInt(request.getParameter("numero2"));
//parametros-------------------------------------------------------------------

            String suma = request.getParameter("sumar");
            String resta = request.getParameter("restar");
            String multiplicar = request.getParameter("multiplicar");
            String dividir = request.getParameter("dividir");

//suma--------------------------------------------------------------------------
            int resultado = 0;
            int numerosPrimos = 0;
            String salida = "";
            int sucesion = 0;

            if (suma != null) {
                resultado = num1 + num2;
                out.println("<h2 align= center >El resultado de la suma es: " + resultado + "</h2>");
                out.println("<h2 align= center >El rango de numeros primos entre " + num1 + " y " + num2 + " es : ");

                for (int i = num1; i <= num2; i++) {
                    int count = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            count++;
                        }
                    }
                    if (count == 2) {
                        numerosPrimos++;
                    }
                }
                int llenado[] = new int[numerosPrimos];
                for (int i = num1; i <= num2; i++) {
                    int contador = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            contador++;
                        }
                    }
                    if (contador == 2) {
                        llenado[sucesion] = i;
                        sucesion++;
                    }
                }

                for (int m = llenado.length - 1; m > -1; m--) {
                    salida += llenado[m] + ", ";
                }
                out.print(salida);
            }
//resta----------------------------------------------------------------------------------------------------------------------
            if (resta != null) {
                resultado = num1 - num2;
                out.println("<h2 align= center >El resultado de la resta es: " + resultado + "</h2>");
                out.println("<h2 align= center >El rango de numeros primos entre " + num1 + " y " + num2 + " es : ");
                for (int i = num1; i <= num2; i++) {
                    int count = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            count++;
                        }
                    }
                    if (count == 2) {
                        numerosPrimos++;
                    }
                }
                int llenado[] = new int[numerosPrimos];
                for (int i = num1; i <= num2; i++) {
                    int contador = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            contador++;
                        }
                    }
                    if (contador == 2) {
                        llenado[sucesion] = i;
                        sucesion++;
                    }
                }

                for (int m = llenado.length - 1; m > -1; m--) {
                    salida += llenado[m] + ", ";
                }
                out.print(salida);
            }

//multiplicacion----------------------------------------------------------------------------------------------------------------------
            int resultado2 = 0;

            if (multiplicar != null) {
                resultado2 = num1 * num2;
                out.println("<h2 align= center >El resultado de la multiplicacion es: " + resultado2 + "</h2>");
                out.println("<h2 align= center >El rango de numeros primos entre " + num1 + " y " + num2 + " es : ");
                for (int i = num1; i <= num2; i++) {
                    int count = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            count++;
                        }
                    }
                    if (count == 2) {
                        numerosPrimos++;
                    }
                }
                int llenado[] = new int[numerosPrimos];
                for (int i = num1; i <= num2; i++) {
                    int contador = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            contador++;
                        }
                    }
                    if (contador == 2) {
                        llenado[sucesion] = i;
                        sucesion++;
                    }
                }

                for (int m = llenado.length - 1; m > -1; m--) {
                    salida += llenado[m] + ", ";
                }
                out.print(salida);
            }

//division----------------------------------------------------------------------------------------------------------------------            
            if (dividir != null) {
                resultado2 = num1 / num2;
                out.println("<h2 align= center >El resultado de la division es: " + resultado2 + "</h2>");
                out.println("<h2 align= center >El rango de numeros primos entre " + num1 + " y " + num2 + " es : ");
                for (int i = num1; i <= num2; i++) {
                    int count = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            count++;
                        }
                    }
                    if (count == 2) {
                        numerosPrimos++;
                    }
                }
                int llenado[] = new int[numerosPrimos];
                for (int i = num1; i <= num2; i++) {
                    int contador = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            contador++;
                        }
                    }
                    if (contador == 2) {
                        llenado[sucesion] = i;
                        sucesion++;
                    }
                }

                for (int m = llenado.length - 1; m > -1; m--) {
                    salida += llenado[m] + ", ";
                }
                out.print(salida);
            }

            out.println("<br>");
            out.println("<br>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
