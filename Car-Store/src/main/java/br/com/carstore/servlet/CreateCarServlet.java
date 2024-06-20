package br.com.carstore.servlet;

import br.com.carstore.dao.CarDAO;
import br.com.carstore.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String carId = req.getParameter("id");
        String carName = req.getParameter("car-name");


        Car car = new Car(carName);

        CarDAO carDao = new CarDAO();

        if (carId.isBlank()) {

            carDao.createCar(car);
        } else {

            carDao.updateCar(car);
        }


        // Redireciona o usuário para a nova página após o insert de um novo carro no nosso banco de dados
        // A req é direcionada para ListCarServlet, que executa o doPost(), faz a consulta no BD e redireciona para dashboard.jsp.
        resp.sendRedirect("/find-all-cars");


    }

}
