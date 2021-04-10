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
 * @author Anton
 */
public class proyecto1servlet extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet proyecto1servlet</title>");
            out.println("</head>");
            out.println("<style>\n"
                    + "  body {\n"
                    + "    background-color:deepskyblue\n"
                    + "  }\n"
                    + "</style>");
            out.println("<center>");
            String nombre = request.getParameter("nombre");
            String numero1 = request.getParameter("numero1");
            String numero2 = request.getParameter("numero2");
            String suma = request.getParameter("suma");
            String resta = request.getParameter("resta");
            String multi = request.getParameter("multi");
            String divi = request.getParameter("division");
            out.println("<h1>Bienvenido " + nombre + "</h1>");
            out.println("<h2>Resultados: </h2>");
            if (suma == null && resta == null && multi == null && divi == null){
                out.println("(Por favor seleccione una opción de método)");
            }if (suma != null && (resta == null || multi == null || divi == null)) {
                int TSuma = Integer.parseInt(numero1) + Integer.parseInt(numero2);
                out.println("<p>El total de la suma es: " + TSuma);
            }if (resta != null && (suma == null || multi == null || divi == null)) {
                int TResta = Integer.parseInt(numero1) - Integer.parseInt(numero2);
                out.println("<p>El total de la resta es: " + TResta);
            }if (multi != null && (suma == null || resta == null || divi == null)) {
                int TMulti = Integer.parseInt(numero1) * Integer.parseInt(numero2);
                out.println("<p>El total de la multiplicación es: " + TMulti);
            }if (divi != null && (suma == null || resta == null || multi == null))  {
              double TDivi = Double.parseDouble(numero1) / Integer.parseInt(numero2);
                out.println("<p>El total de la división es: " + TDivi);
            }if(suma!=null && resta!=null && multi!=null && divi!=null){
                int TSuma = Integer.parseInt(numero1) + Integer.parseInt(numero2);
                out.println("<p>El total de la suma es: " + TSuma);
                 int TResta = Integer.parseInt(numero1) - Integer.parseInt(numero2);
                out.println("<p>El total de la resta es: " + TResta);
                int TMulti = Integer.parseInt(numero1) * Integer.parseInt(numero2);
                out.println("<p>El total de la multiplicación es: " + TMulti);
                double TDivi = Double.parseDouble(numero1) / Integer.parseInt(numero2);
                out.println("<p>El total de la división es: " + TDivi);
            }
            out.println("<p><h2>Números primos:</h2>");
            Primos primos = new Primos();
            int array[] = primos.primeList(Integer.parseInt(numero1), Integer.parseInt(numero2));
            primos.reverse(array);
            String numerosprimos = "";
            int index = array.length - 1;
            for (int i = 0; i < array.length; i++) {
                if (i == index) {
                    numerosprimos += array[i];
                } else {
                    numerosprimos += array[i] + "-";
                }
            }
            out.println("<p>"+numerosprimos);
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
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
