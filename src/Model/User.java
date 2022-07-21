/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HAI PC
 */
public class User {

    private String username;
    private String password;
    private String fullname;
    private String address;

    public User() {
        this.username = "";
        this.password = "";
        this.fullname = "";
        this.address = "";
    }

    public User(String username, String password, String fullname, String address) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
