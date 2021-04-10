/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Glass
 */
public class Metodo extends HttpServlet {

    NumerosPrimos numPrimo = new NumerosPrimos();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Primer Parcial</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");

            String nombre = request.getParameter("Nombre");
            String primerNumero = request.getParameter("primerNumero");
            String segundoNumero = request.getParameter("segundoNumero");
            String suma = request.getParameter("Suma");
            String resta = request.getParameter("Resta");
            String multi = request.getParameter("Multiplicacion");
            String div = request.getParameter("Division");

            double resultado;
            ArrayList<Integer> primos = new ArrayList<>();

            //encontrando los numeros primos
            for (int x = Integer.parseInt(segundoNumero); x >= Integer.parseInt(primerNumero); x--) {
                if (numPrimo.buscarPrimo(x) == true) {
                    primos.add(x);
                }
            }

            //Operaciones Aritmeticas
            if (primerNumero != null && segundoNumero != null && nombre != null) {

                if (suma != null) {
                    resultado = Double.parseDouble(primerNumero) + Double.parseDouble(segundoNumero);
                    out.println("<h1>" + nombre + " el resultado de la Suma es : " + resultado + "<h1>");
                    out.print("<h1>Numeros Primos de " + primerNumero + " hasta " + segundoNumero + " son:</h1>");
                    for (int x = 0; x < primos.size(); x++) {
                        out.print("<h2>" + primos.get(x) + "</h2>");
                    }
                }
                if (resta != null) {
                    resultado = Double.parseDouble(primerNumero) - Double.parseDouble(segundoNumero);
                    out.println("<h1>" + nombre + " el resultado de la Resta es : " + resultado + "<h1>");
                    out.print("<h1>Numeros Primos de " + primerNumero + " hasta " + segundoNumero + " son:</h1>");
                    for (int x = 0; x < primos.size(); x++) {
                        out.print("<h2>" + primos.get(x) + "</h2>");
                    }
                }
                if (multi != null) {
                    resultado = Double.parseDouble(primerNumero) * Double.parseDouble(segundoNumero);
                    out.println("<h1>" + nombre + " el resultado de la Multiplicacion es : " + resultado + "<h1>");
                    out.print("<h1>Numeros Primos de " + primerNumero + " hasta " + segundoNumero + " son:</h1>");
                    for (int x = 0; x < primos.size(); x++) {
                        out.print("<h2>" + primos.get(x) + "</h2>");
                    }
                }
                if (div != null) {
                    if (Integer.parseInt(segundoNumero) != 0) {
                        resultado = Double.parseDouble(primerNumero) / Double.parseDouble(segundoNumero);
                        out.println("<h1>" + nombre + " el resultado de la Division es : " + resultado + "<h1>");
                        out.print("<h1>Numeros Primos de " + primerNumero + " hasta " + segundoNumero + " son:</h1>");
                        for (int x = 0; x < primos.size(); x++) {
                            out.print("<h2>" + primos.get(x) + "</h2>");
                        }
                    } else {
                        out.print("<h1> Error Matematico no se puede dividir entre 0</h1>");
                    }

                }
            } else {
                out.print("<h1>Debe llenar los campos Requeridos</h1>");
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
