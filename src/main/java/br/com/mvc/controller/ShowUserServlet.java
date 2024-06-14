package br.com.mvc.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/showUser")
public class ShowUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String pUser = req.getParameter("user");
        String pSenha = req.getParameter("senha");
        String pModo = req.getParameter("modo");

        System.out.println("User - " + pUser);
        System.out.println("Senha - " + pSenha);
        System.out.println("Modo - " + pModo);

        String pagina = "/erro.jsp";

            if (pUser.equals("isidro") && pSenha.equals("1234")) {
                pagina = "/ok.jsp";
            }

        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher(pagina);
        dispatcher.forward(req, resp);

    }
}
