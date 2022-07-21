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
public class ProductModel {

    public ProductModel() {

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

    public ArrayList<Product> getListProduct() {
        Connection conn = this.getConnection();
        ArrayList<Product> productList = new ArrayList<Product>();
        String sql = "Select *from product";
        try
        {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {
                Product product = new Product();
                product.setId(Integer.parseInt(rs.getString("id")));
                product.setName(rs.getString("name"));
                product.setPrice(Integer.parseInt(rs.getString("price")));
                product.setQuantity(rs.getInt("quantity"));
                productList.add(product);
            }
            st.close();
            rs.close();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        return productList;
    }

    public ArrayList<Product> getListProduct(String searchValue) {
        ArrayList<Product> productList = new ArrayList<>();
        if (searchValue.equals(""))
        {
            this.getListProduct();

        } else
        {
            Connection conn = this.getConnection();

            String sql = "Select *from product where name like ?";
            try
            {
                ResultSet rs;
                try ( PreparedStatement st = conn.prepareStatement(sql))
                {
                    st.setString(1, "%" + searchValue + "%");
                    rs = st.executeQuery();
                    while (rs.next())
                    {
                        Product product = new Product();
                        product.setId(Integer.parseInt(rs.getString("id")));
                        product.setName(rs.getString("name"));
                        product.setPrice(Integer.parseInt(rs.getString("price")));
                        product.setQuantity(rs.getInt("quantity"));
                        productList.add(product);
                    }
                }
                rs.close();

            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
            return productList;
        }
        return this.getListProduct();
    }

    public boolean insertProduct(Product product) {
        Connection conn = this.getConnection();
        try
        {
            String sql = "insert into product(id,name,price,quantity) values(?,?,?,?)";
            PreparedStatement insertStatment = conn.prepareStatement(sql);
            insertStatment.setString(1, null);
            insertStatment.setString(2, product.getName());
            insertStatment.setString(3, Integer.toString(product.getPrice()));
            insertStatment.setInt(4, product.getQuantity());
            int rs = insertStatment.executeUpdate();
            return rs > 0;
        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        return false;

    }

    public boolean updateProduct(Product product) {
        Connection conn = this.getConnection();
        try
        {
            String sql = "update product set name = ?,price= ?,quantity=? where id =?";
            PreparedStatement updateStament = conn.prepareStatement(sql);
            updateStament.setString(1, product.getName());
            updateStament.setInt(2, product.getPrice());
            updateStament.setInt(3, product.getQuantity());
            updateStament.setString(4, Integer.toString(product.getId()));
            int rs = updateStament.executeUpdate();
            System.out.println(product.getId());
            return rs > 0;
        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        return false;
    }

    public boolean deleteProduct(int productId) {
        Connection conn = this.getConnection();
        try
        {
            String sql = "delete from product where id= ?";
            PreparedStatement deleteStatment = conn.prepareStatement(sql);
            deleteStatment.setString(1, Integer.toString(productId));
            int rs = deleteStatment.executeUpdate();
            return rs > 0;

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        return false;
    }
}
