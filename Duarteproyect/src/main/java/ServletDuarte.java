/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Manuel Duarte
 */
public class ServletDuarte extends HttpServlet {

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
    public void doGet(HttpServletRequest request, HttpServletResponse response)
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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>calculadora</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            String Nombre = request.getParameter("txtNombre");
            String num1 = request.getParameter("txtNum1");
            String num2 = request.getParameter("txtNum2");
            String btnSumar = request.getParameter("btnSumar");
            String btnRestar = request.getParameter("btnRestar");
            String btnMultiplicar = request.getParameter("btnMultiplicar");
            String btnDividir = request.getParameter("btnDividir");
            Metodo primos = new Metodo();// llamamos la clase o metodo

            int vectorcito[] = primos.Lista(Integer.parseInt(num1), Integer.parseInt(num2));//ingresamos parametros y convertimos

            primos.conteoVectorcito(vectorcito);

            String numerosPrimos = "";

            int index = vectorcito.length - 1;
            for (int i = 0; i < vectorcito.length; i++) {
                if (i == index) {
                    numerosPrimos += vectorcito[i];
                } else {
                    numerosPrimos += vectorcito[i] + "-";
                }
            }
            if (btnSumar != null) {
                double resultado = Double.parseDouble(num1) + Double.parseDouble(num2);
                out.println("<h1>Bienvenido " + Nombre + "</h1><br>");
                out.println(" el resultado de la suma es :" + resultado + ""
                        + "<h2> Numeros Primos </h2>"
                        + "<br>" + numerosPrimos + "<br>"
                        + "<br><font size=+2><b></font>inicio de pagina</b><a href=\"index.html\"> Click aqui</a></br>");
            }
            if (btnRestar != null) {
                double resultado = Double.parseDouble(num1) - Double.parseDouble(num2);
                out.println("<h1>Bienvenido " + Nombre + "</h1><br>");
                out.println(" el resultado de la Resta es :" + resultado + ""
                        + "<h2> Numeros Primos </h2>"
                        + "<br>" + numerosPrimos+ ""
                        + "<h2> Numeros Primos </h2>"
                        + "<br>" + numerosPrimos + "<br>"
                        + "<br><font size=+2><b></font>inicio de pagina</b><a href=\"index.html\"> Click aqui</a></br>");
            }
            if (btnMultiplicar != null) {
                double resultado = Double.parseDouble(num1) * Double.parseDouble(num2);
                out.println("<h1>Bienvenido " + Nombre + "</h1><br>");
                out.println(" el resultado de la Multiplicacion es :" + resultado + ""
                        + "<h2> Numeros Primos </h2>"
                        + "<br>" + numerosPrimos + ""
                        + "<h2> Numeros Primos </h2>"
                        + "<br>" + numerosPrimos + "<br>"
                        + "<br><font size=+2><b></font>inicio de pagina</b><a href=\"index.html\"> Click aqui</a></br>");
            }
            if (btnDividir != null) {
                double resultado = Double.parseDouble(num1) / Double.parseDouble(num2);
                out.println("<h1>Bienvenido " + Nombre + "</h1><br>");
                out.println(" el resultado de la Division es :" + resultado + ""
                        + "<h2> Numeros Primos </h2>"
                        + "<br>" + numerosPrimos + ""
                        + "<h2> Numeros Primos </h2>"
                        + "<br>" + numerosPrimos + "<br>"
                        + "<br><font size=+2><b></font>inicio de pagina</b><a href=\"index.html\"> Click aqui</a></br>");
            }
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
        }
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
