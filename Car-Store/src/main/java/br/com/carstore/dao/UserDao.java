package br.com.carstore.dao;

import br.com.carstore.config.ConnectionPoolConfig;
import br.com.carstore.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

    public boolean verifyCredentials(User user) {

        String SQL = "SELECT * FROM USR WHERE USERNAME = ?";

        try {

            Connection con = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = con.prepareStatement(SQL);

            preparedStatement.setString(1, user.getUsername());
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                String password = resultSet.getString("password");
            }

            System.out.println("Success in select username");

            con.close();

            return true;
        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

            return false;

        }


    }
}
