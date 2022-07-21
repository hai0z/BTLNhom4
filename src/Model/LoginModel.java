/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.*;

/**
 *
 * @author HAI PC
 */
public class LoginModel {

    public LoginModel() {

    }

    public Connection getConnection() {
        Connection conn = null;
        try
        {
            String url = "jdbc:mysql://localhost:3306/nhom4";
            conn = DriverManager.getConnection(url, "root", "");
            System.out.println("Ket noi db thanh cong");
            return conn;
        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        return conn;
    }

    public void closeConnection(Connection conn) {
        try
        {
            conn.close();
        } catch (SQLException ex)
        {
            System.out.println("can't close connection");
        }
    }

    public boolean login(User user) {
        Connection conn = this.getConnection();
        try
        {
            String sql = "select *from user where username = ? and password =?";
            PreparedStatement loginStatement = conn.prepareStatement(sql);
            loginStatement.setString(1, user.getUsername());
            loginStatement.setString(2, user.getPassword());
            ResultSet rs = loginStatement.executeQuery();
            return rs.next();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        return false;

    }
}
