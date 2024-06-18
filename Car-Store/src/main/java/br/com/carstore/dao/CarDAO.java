package br.com.carstore.dao;

import br.com.carstore.model.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

        // Declaração da consulta SQL para selecionar todos os registros da tabela CAR
        String SQL = "SELECT * FROM CAR";

        try {
            // Abertura da conexão com o banco de dados H2 usando JDBC
            Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            // Log que a conexão foi bem-sucedida
            System.out.println("Success in database connection");

            // Criação de um PreparedStatement para preparar e executar a consulta SQL
            PreparedStatement preparedStatement = con.prepareStatement(SQL);

            // Execução da consulta SQL e armazenamento dos resultados em um ResultSet
            ResultSet resultSet = preparedStatement.executeQuery();

            // Criação de uma lista para armazenar os objetos Car
            List<Car> cars = new ArrayList<>();

            // Iteração sobre os resultados da consulta
            while (resultSet.next()) {
                // Recuperação do nome do carro da coluna "name" do ResultSet
                String carName = resultSet.getString("name");

                // Criação de um novo objeto Car com o nome recuperado
                Car car = new Car(carName);

                // Adição do objeto Car à lista de carros
                cars.add(car);
            }

            // Log que a consulta foi bem-sucedida
            System.out.println("Success in Select * Car");

            // Fechamento da conexão com o banco de dados
            con.close();

            // Retorno da lista de carros
            return cars;

        } catch (Exception e) {
            // Log que a conexão com o banco de dados falhou
            System.out.println("Fail in DataBase connection");

            // Retorno de uma lista vazia em caso de exceção
            return Collections.emptyList();
        }
    }

}
