package br.com.mvc.controller;

import br.com.mvc.model.Usuario;
import com.google.gson.Gson;

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
            Usuario u = new Usuario();
            u.setId(1010);
            u.setUsername("isidro");
            u.setFullName("Professor Isidro");
            u.setEmail("isidro@professorisidro.com.br");
            if (pModo.equals("html")) {
                req.setAttribute("Usuario", u);
                pagina = "/ok.jsp";
            } else {
                Gson gson = new Gson();
                String resultado = gson.toJson(u);
                req.setAttribute("UsuarioJSON", resultado);
                pagina = "/result.jsp";
            }

        }

        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher(pagina);
        dispatcher.forward(req, resp);

    }
}
