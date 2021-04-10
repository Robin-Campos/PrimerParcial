package web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import web.procesos;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String usuario = request.getParameter("name");
        String numero1 = request.getParameter("numero1");
        String numero2 = request.getParameter("numero2");
        String operacion = request.getParameter("Operacion");

        out.print("<html>");
        out.print("<head>");
        out.print("<title>Respuesta</title>");
        
        out.print("</head>");
        
        out.print("<body>");
        out.print("<h1>Bienvenido:" + usuario + "</h1>");
        
        out.print("<p>" + procesos.operacion(numero1, numero2, operacion) + "</p>");
        out.print("<p>El rango entre: " + numero1 + " y " + numero2 +"</p>");
        out.print("<div width=90% height=auto>");
        out.print("<p>"+ procesos.numeroPrimos(numero1, numero2) +"</p>");
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");

    }

}
