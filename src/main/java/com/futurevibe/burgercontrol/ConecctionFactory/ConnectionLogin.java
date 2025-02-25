package com.futurevibe.burgercontrol.ConecctionFactory;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConnectionLogin {

    private static final String URL = "jdbc:mysql://localhost:3306/users";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado");
        } catch (SQLException ex) {
            System.out.println("ERRO:" + ex);
            JOptionPane.showMessageDialog(null, "Erro ao se conectar ao banco de Dados");
        }
        return con;
    }

    public static void closeConnectio(Connection con) {

        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                Logger.getLogger(ConnectionLogin.class.getName()).log(Level.SEVERE, "Erro ao conectar ao banco de dados", e);
            }
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {
        closeConnectio(con);
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        closeConnection(con, stmt);
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
