package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author HAI PC
 */
public class UserModel {

    public UserModel() {

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

    public ArrayList<User> getListUser() {
        Connection conn = this.getConnection();
        ArrayList<User> userList = new ArrayList<User>();
        String sql = "Select *from user";
        try
        {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setAddress(rs.getString("address"));
                user.setFullname(rs.getString("fullname"));
                userList.add(user);
            }
            st.close();
            rs.close();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        return userList;
    }

    public ArrayList<User> getListUser(String searchValue) {
        ArrayList<User> userList = new ArrayList<>();
        if (searchValue.equals(""))
        {
            this.getListUser();
        } else
        {
            Connection conn = this.getConnection();

            String sql = "Select *from user where username like ?";
            try
            {
                ResultSet rs;
                try ( PreparedStatement st = conn.prepareStatement(sql))
                {
                    st.setString(1, "%" + searchValue + "%");
                    rs = st.executeQuery();
                    while (rs.next())
                    {
                        User user = new User();
                        user.setUsername(rs.getString("username"));
                        user.setPassword(rs.getString("password"));
                        user.setAddress(rs.getString("address"));
                        user.setFullname(rs.getString("fullname"));
                        userList.add(user);
                    }
                }
                rs.close();

            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
            return userList;
        }
        return this.getListUser();
    }

    public boolean insertUser(User user) {
        Connection conn = this.getConnection();
        try
        {
            String sql = "insert into user(username,password,fullname,address) values(?,?,?,?)";
            PreparedStatement insertStatment = conn.prepareStatement(sql);
            insertStatment.setString(1, user.getUsername());
            insertStatment.setString(2, user.getPassword());
            insertStatment.setString(3, user.getFullname());
            insertStatment.setString(4, user.getAddress());

            int rs = insertStatment.executeUpdate();
            return rs > 0;
        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        return false;

    }

    public boolean updateUser(User user) {
        Connection conn = this.getConnection();
        try
        {
            String sql = "update user set password = ?,fullname= ?,address=? where username =?";
            PreparedStatement updateStament = conn.prepareStatement(sql);
            updateStament.setString(1, user.getPassword());
            updateStament.setString(2, user.getFullname());
            updateStament.setString(3, user.getAddress());
            updateStament.setString(4, user.getUsername());
            int rs = updateStament.executeUpdate();
            return rs > 0;
        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        return false;
    }

    public boolean deleteUser(String username) {
        Connection conn = this.getConnection();
        try
        {
            String sql = "delete from user where username = ?";
            PreparedStatement deleteStatment = conn.prepareStatement(sql);
            deleteStatment.setString(1, username);
            int rs = deleteStatment.executeUpdate();
            return rs > 0;

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        return false;
    }
}
