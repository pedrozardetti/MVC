package br.com.carstore.dao;

import br.com.carstore.model.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class CarDAO {

    public void createCar(Car car) {

        String SQL = "INSERT INTO CAR (NAME) VALUES (?)";

        try {

            Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            PreparedStatement preparedStatement = con.prepareStatement(SQL);
            preparedStatement.setString(1, car.getName());
            preparedStatement.execute();
            System.out.println("Success in insert command");

            con.close();


            System.out.println("Success in Connection");
        } catch (Exception e) {

            System.out.println("Error in connection");

        }

    }

    public List<Car> findAllCars() {

        String SQL = "SELECT * FROM CAR";
        

    }
}
