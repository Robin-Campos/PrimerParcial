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
        int cambio = 0, num1 = 0, num2 = 0;
        String usuario = request.getParameter("name");
        String numero1 = request.getParameter("numero1");
        String numero2 = request.getParameter("numero2");
        String operacion = request.getParameter("Operacion");

        num1 = Integer.parseInt(numero1);
        num2 = Integer.parseInt(numero2);
        if (num1 > num2) {
            cambio = num1;
            num1 = num2;
            num2 = cambio;
        }
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Respuesta</title>");
        out.print(" <style type =text/css> ");
        out.print("body {");
        out.print("background-color: #17223b;");
        out.print("color:white;}");
        out.print("");
        out.print("text-aling: center;");
        out.print("</style> ");

        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Bienvenido: " + usuario + "</h1>");
        out.print("<p>" + procesos.operacion(numero1, numero2, operacion) + "</p>");
        out.print("<p>El rango entre: " + num1 + " y " + num2 + "</p>");
        out.print("<p> Los numero primos:</p>");
        out.print("<pNumeros: >" + procesos.numeroPrimos(numero1, numero2) + "</p>");
        out.print("</body>");
        out.print("</html>");
    }

}
