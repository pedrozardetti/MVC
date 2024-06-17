package br.com.carstore.dao;

import br.com.carstore.model.Car;

import java.sql.Connection;
import java.sql.DriverManager;

public class CarDAO {

    public void createCar(Car car) {

        String SQL = "INSERT INTO CAR (NAME) VALUES (?)";

        try {

            Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");


            System.out.println("Sucess in Connection");
        } catch (Exception e) {

            System.out.println("Error in connection");

        }

    }
}
