package br.com.projetospotify.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/show-user")
public class ShowUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // Obtém o RequestDispatcher para a página JSP "ok.jsp"
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/ok.jsp");

        // Log para depuração, indica que a requisição chegou aqui
        System.out.println("Chegou aqui");

        // Encaminha a requisição e a resposta para "ok.jsp"
        dispatcher.forward(req, resp);
    }
}
