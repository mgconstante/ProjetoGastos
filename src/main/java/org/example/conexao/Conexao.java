package org.example.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    static AcessoBD acessoBD = new AcessoBD();
    private static final String url = acessoBD.getUrl();
    private static final String user = acessoBD.getUser();
    private static final String password = acessoBD.getPassword();

    private static Connection conn;

    public static Connection getConnection() throws SQLException {
        try{
            if (conn == null){
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            } else {
                return conn;
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            return null;}
    }
}
