/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.LoginModel;
import Model.User;
import Views.DashBoardView;
import Views.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author HAI PC
 */
public class LoginController {

    private LoginModel loginModel;
    private LoginView loginView;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        loginModel = new LoginModel();
        loginView.login(new loginAction());
    }

    private boolean validateInput(User user) {
        if (user.getUsername().isEmpty())
        {
            JOptionPane.showMessageDialog(loginView, "please enter your username");
        } else if (user.getPassword().isEmpty())
        {
            JOptionPane.showMessageDialog(loginView, "please enter your password");
        } else
        {
            return true;
        }
        return false;
    }

    public void showForm() {
        this.loginView.setVisible(true);
    }

    public void hideForm() {
        this.loginView.setVisible(false);
    }

    class loginAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            boolean validate = validateInput(loginView.getInputData());
            if (validate)
            {
                boolean loginSuccess = loginModel.login(loginView.getInputData());
                if (loginSuccess)
                {
                    JOptionPane.showMessageDialog(loginView, "Login Success");
                    loginView.username = loginView.getInputData().getUsername();
                    DashBoardView dbView = new DashBoardView();
                    dbView.setVisible(true);
                    hideForm();
                } else
                {
                    JOptionPane.showMessageDialog(loginView, "Wrong username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }

    }
}
