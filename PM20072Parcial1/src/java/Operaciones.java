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
 * @author Alexishm10
 */
public class Operaciones extends HttpServlet {

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
            out.println("<head><style>       body{\n" +
"	background-color: #C3E3A3;\n" +
"	font-family: Arial;\n" +
"}\n" +
"\n" +
"#main-container{\n" +
"	margin: 150px auto;\n" +
"	width: 300px;\n" +
"}\n" +
"\n" +
"table{\n" +
"	background-color: white;\n" +
"	text-align: left;\n" +
"	border-collapse: collapse;\n" +
"	width: 50%;\n" +
"}\n" +
"\n" +
"th, td{\n" +
"	padding: 20px;\n" +
"}\n" +
"\n" +
"thead{\n" +
"	background-color: #246355;\n" +
"	border-bottom: solid 5px #0F362D;\n" +
"	color: white;\n" +
"}\n" +
"\n" +
"tr:nth-child(even){\n" +
"	background-color: #ddd;\n" +
"}\n" +
"tr:hover td{\n" +
"	background-color: #369681;\n" +
"	color: white;\n" +
"}</style>");
            out.println("<title>PM20072 Operaciones</title>");            
            out.println("</head>");
            out.println("<body>");
            String numero1 = request.getParameter("numero1");
            String numero2 = request.getParameter("numero2");
            String nombre = request.getParameter("nombre");
            String operacion = request.getParameter("operacion");
            int aux,resultado = 0,multiplicacion=0,suma=0,resta=0,division=0,n1,n2,menor = 0,mayor = 0,cprimos=0,k=0,parreglo = 0;
            n1=Integer.parseInt(numero1);
            n2=Integer.parseInt(numero2);
            if(n1>n2){
            mayor=n1;
            menor=n2;}
            else if(n1<n2){
            mayor=n2;
            menor=n1;}
            
            if ("suma".equals(operacion)) {
                suma=Integer.parseInt(numero1)+Integer.parseInt(numero2);
             out.println("<table align='center'border='0px' margin='2px'><tr><td colspan='2' align='center'><strong>¡Bienvenido estimado "+nombre+"!</strong></td></tr>");
                
                out.println("<tr><td bgcolor='#CFD8C6'> Estimado "+nombre+" el resultado obtenido de relizar la suma es:</td><td>"+suma+"</td></tr></table>");              
                
            }else if ("resta".equals(operacion)) {
                resta=Integer.parseInt(numero1)-Integer.parseInt(numero2);
                out.println("<table align='center'border='0px' margin='2px'><tr><td colspan='2' align='center'><strong>¡Bienvenido estimado "+nombre+"!</strong></td></tr>");
                
                out.println("<tr><td > Estimado "+nombre+" el resultado obtenido de relizar la resta es:</td><td >"+resta+"</td></tr></table>");              
                               
            }else if ("multiplicacion".equals(operacion)) {
                multiplicacion=Integer.parseInt(numero1)*Integer.parseInt(numero2);
                out.println("<table align='center'border='0px' margin='2px'><tr><td colspan='2' align='center'bgcolor='#A8B69A'><strong>¡Bienvenido estimado "+nombre+"!</strong></td></tr>");
                
                out.println("<tr><td bgcolor='#CFD8C6'> Estimado "+nombre+" el resultado obtenido de relizar la multiplicacion es:</td><td >"+multiplicacion+"</td></tr></table>");              
                
            }else if ("division".equals(operacion)) {
                division=Integer.parseInt(numero1)/Integer.parseInt(numero2);
                out.println("<table align='center'border='0px' margin='2px'><tr><td colspan='2' align='center'><strong>¡Bienvenido estimado "+nombre+"!</strong></td></tr>");
                
                out.println("<tr><td > Estimado "+nombre+" el resultado obtenido de relizar la division es:</td><td >"+division+"</td></tr></table>");              
                
            }          
            for(int i=menor;i<=mayor;i++){
                int contador=0;
                for(int j=1; j<=i;j++){
                if(i%j==0)
                contador++;                
                }
                if(contador==2){                                       
                cprimos++;                
                }                
                }
                int arr[]=new int[cprimos];                
                for(int i=menor;i<=mayor;i++){
                int contador=0;
                for(int j=1; j<=i;j++){
                if(i%j==0)
                contador++;
                
                }
                if(contador==2){
                      arr[parreglo]=i;
                parreglo++;                
                }                
                }                
                for(int i=0;i<parreglo;i++){
            for(int j=i+1;j<parreglo;j++){
            if(arr[i]<arr[j]){
            aux=arr[i];
            arr[i]=arr[j];
            arr[j]=aux;
            }
            }
            }out.println("<table align='center'><tr><td bgcolor='#A8B69A'><strong>Los numeros primos obtenidos Ordenados de mayor a menor son:</<strong></td></tr><tr><td align='center' bgcolor='#CFD8C6'>");
                for (int i=0;i<parreglo;i++){
                out.println(arr[i]+"");
                }if(menor==1){
                out.println("1</td></tr></table>");
                }else{out.println("</td></tr></table>");}
                
            
            out.println("<br><br><br><br><br><br><br><p align='center'>PM20072 Gerson Alexis Perez Monterroza <br>todos los derechos reservados &#xa9;</p> </body>");
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
