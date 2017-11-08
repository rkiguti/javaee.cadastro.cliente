/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devblog.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rkiguti
 */
public class BaseDAO {
    
    //String driver = "com.mysql.jdbc.Driver";
    String driver = "org.postgresql.Driver";
    String user = "postgres";
    String senha = "postgres";
    //String url = "jdbc:mysql://localhost/teste";
    String url = "jdbc:postgresql://localhost:5432/teste";
    
    protected Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, senha);
        return con;
    }
}
