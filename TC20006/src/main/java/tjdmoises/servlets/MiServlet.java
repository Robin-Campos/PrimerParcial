/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tjdmoises.servlets;
import tjdmoises.servlets.Primos;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Moisés
 */
public class MiServlet extends HttpServlet {
Primos numPrimo = new Primos();
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
            String user, numero1, numero2, suma, resta, multi, division;
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
            out.println("<link href=\"css/style.css\" rel=\"stylesheet\">");
            out.println("<title>Servlet MiServlet</title>");
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet MiServlet at " + request.getContextPath() + "</h1>");
            out.println("<form>");
            out.println("<h1>Resultado</h1>");
            out.println("<p>");
            user = request.getParameter("user");
            numero1 = request.getParameter("num1");
            numero2 = request.getParameter("num2");
            suma = request.getParameter("suma");
            resta = request.getParameter("resta");
            multi = request.getParameter("multi");
            division = request.getParameter("division");
            int cont = 0, num = 0;
            double resul;
            Scanner sc = new Scanner(System.in);
            if (suma != null) {
                resul = Double.parseDouble(numero1) + Double.parseDouble(numero2);
                out.println("Usuario " + user + " | El resultado de la suma ( " + numero1 + " ) + ( " + numero2 + " ) es: " + "\n" + resul + "\n");
                out.println("<br>");
                out.println("Los numeros primos entre " + numero1 + " y " + numero2 + " son :");
                for (int x = Integer.parseInt(numero2); x >= Integer.parseInt(numero1); x--) {
                    if (this.numPrimo.esPrimo(x) == true) {
                        cont++;
                        out.println("<br>");
                        out.println(String.valueOf(x) + ",");
                    }
                }
                out.println("<br>");
                out.println("\nTotal de numeros primos: " + cont);
                sc.close();
            }
            if (resta != null) {
                // out.println("<h1>Bienvenido de nuevo "+nombre+" </h1>");
                resul = Double.parseDouble(numero1) - Double.parseDouble(numero2);
                out.println("Usuario " + user + " | El resultado de la resta (" + numero1 + ") - (" + numero2 + ") es : " + resul);
                out.println("<br>");
                out.println("Los numeros primos entre " + numero1 + " y " + numero2 + " son :");
                for (int x = Integer.parseInt(numero2); x >= Integer.parseInt(numero1); x--) {
                    //out.println("Holamundo2");
                    if (this.numPrimo.esPrimo(x) == true) {
                        cont++;
                        out.println("<br>");
                        out.println(String.valueOf(x) + ",");
                    }
                }

                out.println("<br>");
                out.println("\nTotal de numeros primos: " + cont);
                sc.close();
            }
            if (multi != null) {
                // out.println("<h1>Bienvenido de nuevo "+nombre+" </h1>");
                resul = Double.parseDouble(numero1) * Double.parseDouble(numero2);
                out.println("Usuario " + user + " | El resultado de la multiplicación (" + numero1 + ") * (" + numero2 + ") es : " + resul);
                out.println("<br>");
                out.println("Los numeros primos entre " + numero1 + " y " + numero2 + " son :");
                for (int x = Integer.parseInt(numero2); x >= Integer.parseInt(numero1); x--) {
                    //out.println("Holamundo2");
                    if (this.numPrimo.esPrimo(x) == true) {
                        cont++;
                        out.println("<br>");
                        out.println(String.valueOf(x) + ",");
                    }
                }

                out.println("<br>");
                out.println("\nTotal de numeros primos: " + cont);
                sc.close();
            }
            if (division != null) {
                // out.println("<h1>Bienvenido de nuevo "+nombre+" </h1>");
                resul = Double.parseDouble(numero1) / Double.parseDouble(numero2);
                out.println("Usuario " + user + " | El resultado de la división (" + numero1 + ") / (" + numero2 + ") es : " + resul);
                out.println("<br>");
                out.println("Los numeros primos entre " + numero1 + " y " + numero2 + " son :");
                for (int x = Integer.parseInt(numero2); x >= Integer.parseInt(numero1); x--) {
                    //out.println("Holamundo2");
                    if (this.numPrimo.esPrimo(x) == true) {
                        cont++;
                        out.println("<br>");
                        out.println(String.valueOf(x) + ",");
                    }
                }

                out.println("<br>");
                out.println("\nTotal de numeros primos: " + cont);
                sc.close();
            }
            out.println("</p>");
            out.println("<div class=\"button\">");
            out.println("<a href=\"javascript:history.back()\" class=\"button-button-a\">Regresar</a>");
            out.println("</div>");
            out.println("</form>");
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
