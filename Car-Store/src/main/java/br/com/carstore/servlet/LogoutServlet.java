package br.com.carstore.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //Ao fazer o doGet, invalidamos a sessão do usuário que está fazendo a requisição. Ele será deslogado
        req.getSession().invalidate();

        // É usado para armazenar temporariamente uma mensagem de sucesso na requisição HTTP atual
        req.setAttribute("message", "Success on logout");

        
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }
}
