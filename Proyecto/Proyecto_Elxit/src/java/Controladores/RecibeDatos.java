package Controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RecibeDatos
 */
public class RecibeDatos extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "josender";
    private static final String EMAIL = "gjet3110@gmail.com";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response, String msg)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RecibeDatos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RecibeDatos at " + msg + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("usuario");
        String email = request.getParameter("email");
        String pass = request.getParameter("contra");
        
        int numero = 0;
        try {
            numero = Integer.parseInt(numeroStr); 
        } catch (NumberFormatException e) {
            e.printStackTrace(); 
        }

        if(USERNAME.equals(user) && PASSWORD.equals(pass) && EMAIL.equals(email)) {
            processRequest(request, response, "Registro Exitoso");
        } else {
            processRequest(request, response, "Registro Invalidado");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
