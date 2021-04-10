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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lourdes Jiménez
 */
public class ValidaciondeOperaciones extends HttpServlet {

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
            out.println("<title>Servlet ValidaciondeOperaciones</title>");
            out.println("</head>");
            out.println("<body>");
            String Numero1 = "", Numero2 = "", Sumar = "", Restar = "", Multiplicar = "", Dividir = "", resultado = "", Numprimos = "", resultados = "";

            Numero1 = request.getParameter("numero1");
            Numero2 = request.getParameter("numero2");
            Sumar = request.getParameter("Suma");
            Restar = request.getParameter("Resta");
            Multiplicar = request.getParameter("Multiplicacion");
            Dividir = request.getParameter("Division");

            int Num1 = 0, Num2 = 0, contador = 0, i, j, tamaniovector = 0, posisionvector = 0;
            Num1 = Integer.parseInt(Numero1);
            Num2 = Integer.parseInt(Numero2);

            if (Sumar != null) {
                resultado = "" + (Num1 + Num2);
                resultados = "Suma";
            }

            if (Restar != null) {
                resultado = "" + (Num1 - Num2);
                resultados = "Resta";
            }

            if (Multiplicar != null) {
                resultado = "" + (Num1 * Num2);
                resultados = "Multiplicación";
            }

            if (Dividir != null) {
                resultado = "" + (Num1 / Num2);
                resultados = "División";
            }
            out.println(resultado);
            out.println("");
            //números primos
            if (Num2 > Num1) {
                for (i = Num1; i <= Num2; i++) {
                    contador = 0;
                    for (j = 1; j <= Num2; j++) {
                        if (i % j == 0) {
                            contador++;
                        }
                    }
                    if (contador == 2) {

                        tamaniovector++;
                    }
                }
            }
            if (Num1 > Num2) {
                for (i = Num2; i <= Num1; i++) {
                    contador = 0;
                    for (j = 1; j <= Num1; j++) {
                        if (i % j == 0) {
                            contador++;
                        }
                    }
                    if (contador == 2) {

                        tamaniovector++;
                    }
                }
            }
            if (Num1 == Num2) {
                for (i = 1; i <= Num1; i++) {
                    contador = 0;
                    for (j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            contador++;
                        }
                    }
                    if (contador == 2) {
                        tamaniovector++;
                    }
                }
            }
            int Vector[] = new int[tamaniovector];
            if (Num2 > Num1) {

                for (i = Num1; i <= Num2; i++) {
                    contador = 0;
                    for (j = 1; j <= Num2; j++) {
                        if (i % j == 0) {
                            contador++;
                        }
                    }
                    if (contador == 2) {
                        Vector[posisionvector] = i;
                        posisionvector++;
                    }
                }
            }
            if (Num1 > Num2) {
                for (i = Num2; i <= Num1; i++) {
                    contador = 0;
                    for (j = 1; j <= Num1; j++) {
                        if (i % j == 0) {
                            contador++;
                        }
                    }
                    if (contador == 2) {

                        Vector[posisionvector] = i;
                        posisionvector++;

                    }
                }
            }
            if (Num1 == Num2) {
                for (i = 1; i <= Num1; i++) {
                    contador = 0;
                    for (j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            contador++;
                        }
                    }
                    if (contador == 2) {
                        if (i == Num1) {
                            Vector[posisionvector] = i;
                            posisionvector++;
                        }

                    }
                }
            }
            if (Num1 == Num2) {
                if (Num1==(Vector[0])){
                  Numprimos ="" + (Vector[0]); 
                }else{
                 Numprimos="No hay números primos";  
                }
            } else {
                for (i = tamaniovector - 1; i >= 0; i--) {
                    Numprimos = Numprimos + "" + (Vector[i] + ",");
                }
            }

            HttpSession session = request.getSession();
            session.setAttribute("resultado", resultado);
            session.setAttribute("Numprimos", Numprimos);
            session.setAttribute("resultados", resultados);
            response.sendRedirect("Resultados.jsp");

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
