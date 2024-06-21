package br.com.carstore.dao;

import br.com.carstore.model.User;

public class UserDao {

    public boolean verifyCredentials(User user) {

        String SQL = "SELECT * FROM USR WHERE USERNAME = ?";

        return false;


    }
}
