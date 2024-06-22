package br.com.carstore.servlet;

import br.com.carstore.dao.UserDao;
import br.com.carstore.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = new User(username, password);

        boolean isValidUser = new UserDao().verifyCredentials(user);

        if (isValidUser) {
            // Obtém a sessão atual da requisição. Se não existir, retorna uma mensagem de credencial inválida.
            // A sessão é um objeto que permite armazenar dados entre diferentes requisições HTTP do mesmo user.
            req.getSession().setAttribute("loggedUser", username);

            // Redireciona o cliente para a nova URL
            resp.sendRedirect("/find-all-cars");
        } else {

            req.setAttribute("message", "Invalid credentials");


            // Caso o usuário não esteja logado, ele é devolvido para a página de login novamente
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}
