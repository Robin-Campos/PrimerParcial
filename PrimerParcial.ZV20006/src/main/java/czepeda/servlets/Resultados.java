/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package czepeda.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlos
 */
public class Resultados extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String num1, num2, name, operacion;
    double resultado;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            name = request.getParameter("name");
            num1 = request.getParameter("numero1");
            num2 = request.getParameter("numero2");
            operacion = request.getParameter("operaciones");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Muestra de Resultados</title>");
            out.println("<link rel=\"stylesheet\" href=\"css/estilos.css\">");
            out.println("</head>");
            out.println("<body><center>");
            if (operacion.equals("suma")) {
                resultado = Double.parseDouble(num1) + Double.parseDouble(num2);
                out.println(name + " el resultado de la suma es: " + resultado);
            } else {
                if (operacion.equals("resta")) {
                    resultado = Double.parseDouble(num1) - Double.parseDouble(num2);
                    out.println(name + " el resultado de la resta es: " + resultado);
                } else {
                    if (operacion.equals("multiplicacion")) {
                        resultado = Double.parseDouble(num1) * Double.parseDouble(num2);
                        out.println(name + " el resultado de la multiplicación es: " + resultado);
                    } else {
                        if (num2.equals(0)) {
                            out.println(name + " no se puede dividir un número entre 0");
                        } else {
                            resultado = Double.parseDouble(num1) / Double.parseDouble(num2);
                            out.println(name + " el resultado de la división es: " + resultado);

                        }
                    }
                }
            }
            out.println("<br>");

            int resultadoInt = (int) resultado;

            if (resultadoInt > 0) {
                out.println("Números primos:");
                for (int i = resultadoInt; i >= 2; i--) {
                    int creciente = 2;
                    boolean Primo = true;
                    while (Primo == true && creciente < i) {
                        if (i % creciente == 0) {
                            Primo = false;
                        } else {
                            creciente++;
                        }
                    }
                    if (Primo == true) {
                        out.println(i);
                    }

                }
            } else {
                if (resultadoInt == 1) {
                    out.println("1 no se considera como número primo");
                } else {
                    if (resultadoInt == 0) {
                        out.println(name + "el número que ingreso es 0, el cual no es un número primo");
                    } else {
                        out.println("El número que ingreso es negativo, por lo tanto no sacaremos los números primos");
                    }
                    out.println("</center></body>");
                    out.println("</html>");
                }
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
