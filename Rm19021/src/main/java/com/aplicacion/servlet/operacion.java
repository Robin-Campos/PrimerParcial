/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacion.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import primos.servlets.primos;

/**
 *
 * @author laptop
 */
@WebServlet(name = "operacion", urlPatterns = {"/operacion"})
public class operacion extends HttpServlet {

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
            out.println("<title>Servlet operacion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet operacion at " + request.getContextPath() + "</h1>");
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
         response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Operacion</title>");            
            out.println("</head>");
            out.println("<body>");
            String user=request.getParameter("user");
            String num1=request.getParameter("numero1");
            String num2=request.getParameter("numero2");
            String sumar1=request.getParameter("sumar1");
            String restar1=request.getParameter("restar1");
            String dividir1=request.getParameter("dividir1");
            String multiplicar1=request.getParameter("multiplicar1");
            primos primos =new primos();
            int array[]= primos.primeList(Integer.parseInt(num1),Integer.parseInt(num2));
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
            
            if(sumar1!=null){
                int resultado=Integer.parseInt(num1)+Integer.parseInt(num2);
                out.print(" Bienvenido!!"+user+"El resultado de la suma es:"+resultado+"<p>Los numeros primos son"+numerosprimos);
            }
             if(restar1!=null){
                int resultado=Integer.parseInt(num1)-Integer.parseInt(num2);
                out.print(" Bienvenido!!"+user+"El resultado de la resta es:"+resultado+"<p>Los numeros primos son"+numerosprimos);
               
             }
             if(dividir1!=null){
                double resultado=Integer.parseInt(num1)/Integer.parseInt(num2);
                out.print(" Bienvenido!!"+user+"El resultado de la divisio es:"+resultado+"<p>Los numeros primos son"+numerosprimos);
             }
              if(multiplicar1!=null){
                int resultado=Integer.parseInt(num1)*Integer.parseInt(num2);
                out.print(" Bienvenido!!"+user+"El resultado de la multiplicacion es:"+resultado+"<p>Los numeros primos son"+numerosprimos);
              
            }
            
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
