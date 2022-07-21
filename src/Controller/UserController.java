/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import Model.UserModel;
import Views.UsersView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HAI PC
 */
public class UserController {

    private final UsersView userView;
    private final UserModel userModel;

    public UserController(UsersView userView) {
        this.userView = userView;
        userModel = new UserModel();
        userView.addUser(new AddUser());
        userView.deleteUser(new DeleteUser());
        userView.searchUser(new SearchUser());
        userView.updateUser(new UpdateUser());
    }

    private boolean validateUser(User user) {
        if (user.getUsername().isEmpty()) {
            JOptionPane.showMessageDialog(userView, "Username is required", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (user.getPassword().isEmpty()) {
            JOptionPane.showMessageDialog(userView, "Password is required", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (user.getFullname().isEmpty()) {
            JOptionPane.showMessageDialog(userView, "Full name is required", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (user.getAddress().isEmpty()) {
            JOptionPane.showMessageDialog(userView, "Address is required", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    class AddUser implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (validateUser(userView.getInputData())) {
                boolean insertSuccess = userModel.insertUser(userView.getInputData());
                if (insertSuccess) {
                    JOptionPane.showMessageDialog(userView, "Add user successfully");
                    ShowUserList();
                    userView.clearInput();
                } else {
                    JOptionPane.showMessageDialog(userView, "user already exists", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    class UpdateUser implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (validateUser(userView.getInputData())) {
                boolean updateSuccess = userModel.updateUser(userView.getInputData());
                if (updateSuccess) {
                    JOptionPane.showMessageDialog(userView, "Update user successfully");
                    ShowUserList();
                    userView.clearInput();
                } else {
                    JOptionPane.showMessageDialog(userView, "user not exists", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    class DeleteUser implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            int confirm = JOptionPane.showConfirmDialog(userView, "Are you sure");
            if (confirm == 0) {
                userModel.deleteUser(userView.getInputData().getUsername());
                ShowUserList();
            }
        }
    }

    class SearchUser implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            ArrayList<User> userList = userModel.getListUser(userView.getSearchValue());
            userView.showListUser(userList);
        }

    }

    public void ShowUserList() {
        ArrayList<User> userList = userModel.getListUser();
        userView.showListUser(userList);
    }

}
