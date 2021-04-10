/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FA20011;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carito Flores
 */
public class OperacionAritmetica extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Primos numeroPrimo = new Primos();
            int contador = 0, numero = 0;
            Scanner sc = new Scanner(System.in);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Operación Aritmética</title>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("</head>");
            out.println("<body style=\"background-color:rgba(14, 13, 13, 0.952);\">");
            out.println("<style>\n"
                    + "        form{\n"
                    + "            width: 1150px;\n"
                    + "            margin: auto;\n"
                    + "            background-color:#333333;\n"
                    + "            padding: 10px 20px;\n"
                    + "            box-sizing: border-box;\n"
                    + "            margin-top: 20px;\n"
                    + "            border-radius: 7px;\n"
                    + "        }\n"
                    + "    </style>");
            out.println("<h1 style=\"color: red;font-size: 80px;text-align: center;\">");
            out.println("<marquee behavior=\"alternate\">");
            String user = request.getParameter("user");
            out.println("Bienvenido/a " + user);
            out.println("</marquee>");
            out.println("</h1>");
            String numero1 = request.getParameter("numero1");
            String numero2 = request.getParameter("numero2");
            out.println("<form name=\"registro\" action=\"ResultadoOperacionAritmetica\" method=\"POST\">");
            out.println("<fieldset>");
            out.println("<legend style=\"color:red; font-size: 70px;text-align: center; \">Datos</legend>");
            out.println("<p style=\"color: white;font-size: 40px;text-align: center;\">");
            out.println("Los números que ha ingresado son: " + numero1 + " y " + numero2);
            out.println("</p>");
            out.println("</fieldset>");
            out.println("<fieldset>");
            out.println("<legend style=\"color:red; font-size: 70px;text-align: center; \">Resultado</legend>");
            out.println("<p style=\"color: white;font-size: 40px;text-align: center;\">");
            String Suma = request.getParameter("sumar");
            String Resta = request.getParameter("restar");
            String Multiplicación = request.getParameter("multiplicar");
            String División = request.getParameter("dividir");

            if (Suma != null) {
                out.println("<h1 style=\"color: white; font-size: 40px; text-align: center;\">");
                out.println("Usuario: " + (user) + " el resultado de la suma de (" + numero1 + ") y (" + numero2 + ") es: " + ((Integer.parseInt(numero1) + Integer.parseInt(numero2))));
                out.println("</h1");
            } else if (Resta != null) {
                out.println("<h1 style=\"color: white; font-size: 40px; text-align: center;\">");
                out.println("Usuario: " + (user) + " el resultado de la resta de (" + numero1 + ") y (" + numero2 + ") es: " + ((Double.parseDouble(numero1) - Double.parseDouble(numero2))));
                out.println("</h1");
            } else if (Multiplicación != null) {
                out.println("<h1 style=\"color: white; font-size: 40px; text-align: center;\">");
                out.println("Usuario: " + (user) + " el resultado de la multiplicación de (" + numero1 + ") y (" + numero2 + ") es: " + ((Double.parseDouble(numero1) * Double.parseDouble(numero2))));
                out.println("</h1");
            } else if (División != null) {
                if (Double.parseDouble(numero2) != 0) {
                    out.println("<h1 style=\"color: white; font-size: 40px; text-align: center;\">");
                    out.println("Usuario: " + (user) + " el resultado de la división de (" + numero1 + ") y (" + numero2 + ") es: " + ((Double.parseDouble(numero1) / Double.parseDouble(numero2))));
                    out.println("</h1");
                } else {
                    out.println("<h1 style=\"color: white; font-size: 40px; text-align: center;\">");
                    out.println("No es posible dividir entre cero");
                    out.println("</h1");
                }

            }
            out.println("</p>");
            out.println("</fieldset>");
            if (Integer.parseInt(numero2) >= Integer.parseInt(numero1)) {
                out.println("<fieldset>");
                out.println("<legend style=\"color:red; font-size: 70px;text-align: center; \">Números Primos</legend>");
                out.println("<p style=\"color: white;font-size: 40px;text-align: center;\">");
                out.println("Los números primos entre " + numero1 + " y " + numero2 + " son :");
                out.println("</p>");

                for (int x = Integer.parseInt(numero2); x >= Integer.parseInt(numero1); x--) {
                    if (numeroPrimo.esPrimo(x) == true) {
                        contador++;
                        out.println("<p style=\"color: white;font-size: 40px;text-align: center;\">");
                        out.println(String.valueOf(x));
                        out.println("<br>");
                    }
                }

                out.println("<br>");

                out.println("Total de números primos: " + contador);
                out.println("</p>");
                sc.close();
            } else if (Integer.parseInt(numero2) <= Integer.parseInt(numero1)) {
                out.println("<fieldset>");
                out.println("<legend style=\"color:red; font-size: 70px;text-align: center; \">Números Primos</legend>");
                out.println("<p style=\"color: white;font-size: 40px;text-align: center;\">");
                out.println("Los números primos entre " + numero2 + " y " + numero1 + " son :");
                out.println("</p>");
                for (int x = Integer.parseInt(numero1); x >= Integer.parseInt(numero2); x--) {
                    if (numeroPrimo.esPrimo(x) == true) {
                        contador++;
                        out.println("<p style=\"color: white;font-size: 40px;text-align: center;\">");
                        out.println(String.valueOf(x));
                        out.println("<br>");
                    }
                }

                out.println("<br>");

                out.println("Total de números primos: " + contador);
                out.println("</p>");
                sc.close();
            }
            out.println("</fieldset>");
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
