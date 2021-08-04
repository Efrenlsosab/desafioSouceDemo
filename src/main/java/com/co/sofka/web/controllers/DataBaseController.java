package com.co.sofka.web.controllers;

import com.co.sofka.web.data.DataInformation;

import java.sql.*;

public class DataBaseController {

    Connection connection = null;
    Statement statement;
    ResultSet resulset;

    public void startConnection(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://sofka-training.cpxphmd1h1ok.us-east-1.rds.amazonaws.com/DB_SauceDemo","sofka_training","BZenX643bQHw");
        } catch (Exception e) {
            System.err.println("Error:" +e);
        }
    }

    public void dorequery(String query, String username, String psswrd, DataInformation datosUsuario) throws SQLException {

        try {
            statement = connection.createStatement();
            resulset = statement.executeQuery(query);

            while (resulset.next()){
                datosUsuario.setUsername(resulset.getString(username));
                datosUsuario.setPassword(resulset.getString(psswrd));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            connection.close();
        }
    }
}
