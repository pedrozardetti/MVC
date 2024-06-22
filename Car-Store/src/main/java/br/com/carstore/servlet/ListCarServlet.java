package br.com.carstore.servlet;

import br.com.carstore.dao.CarDAO;
import br.com.carstore.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


//A classe atende requisições no endpoint find-all-cars e admin/find-all-cars
@WebServlet({"/find-all-cars", "admin/find-all-cars"})
public class ListCarServlet extends HttpServlet {

    @Override //Sobrescrevemos o método doGet, pois essa classe vai receber requisições do tipo Get
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //Assim que o método for acionado, vamos chamar a Dao e o método findAllCars, que retorna uma lista de cars
        List<Car> cars = new CarDAO().findAllCars();

        // Atribui a lista de carros ao atributo "cars" da requisição
        req.setAttribute("cars", cars);

        // Encaminha a requisição e a resposta para a página "dashboard.jsp" que será criada
        req.getRequestDispatcher("dashboard.jsp").forward(req, resp);

    }
}
