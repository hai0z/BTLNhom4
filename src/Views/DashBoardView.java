/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controller.LoginController;
import Controller.ProductController;
import Controller.UserController;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author HAI PC
 */
public class DashBoardView extends javax.swing.JFrame {

    /**
     * Creates new form DashBoardView
     */
    public DashBoardView() {
        initComponents();
        ProductsView frame = new ProductsView();
        ProductController controller = new ProductController(frame);
        controller.ShowProductList();
        jPanel5.add(frame).setVisible(true);
        txtWelcome.setText("Welcome " + LoginView.username);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtWelcome = new javax.swing.JLabel();
        btnProduct = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnUser = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        JPanel6 = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(35, 166, 97));

        txtWelcome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtWelcome.setForeground(new java.awt.Color(255, 255, 255));
        txtWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtWelcome.setText("WELCOME ADMIN");

        btnProduct.setBackground(new java.awt.Color(1, 189, 83));
        btnProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Products");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icons/icons8_package_60px_1.png"))); // NOI18N

        javax.swing.GroupLayout btnProductLayout = new javax.swing.GroupLayout(btnProduct);
        btnProduct.setLayout(btnProductLayout);
        btnProductLayout.setHorizontalGroup(
                btnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(btnProductLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 228,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        btnProductLayout.setVerticalGroup(
                btnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(btnProductLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(
                                        btnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap()));

        btnUser.setBackground(new java.awt.Color(35, 166, 97));
        btnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Users");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icons/icons8_user_groups_60px.png"))); // NOI18N

        javax.swing.GroupLayout btnUserLayout = new javax.swing.GroupLayout(btnUser);
        btnUser.setLayout(btnUserLayout);
        btnUserLayout.setHorizontalGroup(
                btnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(btnUserLayout.createSequentialGroup()
                                .addContainerGap(18, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 239,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        btnUserLayout.setVerticalGroup(
                btnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(btnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)));

        btnLogout.setBackground(new java.awt.Color(35, 166, 97));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Logout");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icons/icons8_logout_60px.png"))); // NOI18N

        javax.swing.GroupLayout btnLogoutLayout = new javax.swing.GroupLayout(btnLogout);
        btnLogout.setLayout(btnLogoutLayout);
        btnLogoutLayout.setHorizontalGroup(
                btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(btnLogoutLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        btnLogoutLayout.setVerticalGroup(
                btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtWelcome, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProduct, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)
                        .addComponent(btnUser, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(txtWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(283, Short.MAX_VALUE)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        JPanel6.setBackground(new java.awt.Color(255, 255, 255));

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 0, 0));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("X");
        btnExit.setMaximumSize(new java.awt.Dimension(20, 20));
        btnExit.setMinimumSize(new java.awt.Dimension(20, 20));
        btnExit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnExitMouseMoved(evt);
            }
        });
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout JPanel6Layout = new javax.swing.GroupLayout(JPanel6);
        JPanel6.setLayout(JPanel6Layout);
        JPanel6Layout.setHorizontalGroup(
                JPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE));
        JPanel6Layout.setVerticalGroup(
                JPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 906, Short.MAX_VALUE)
                                .addComponent(JPanel6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(JPanel6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }// GEN-LAST:event_btnExitMouseClicked

    private void btnExitMouseMoved(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnExitMouseMoved
        // TODO add your handling code here:
        JPanel6.setBackground(Color.RED);
        btnExit.setForeground(Color.white);
    }// GEN-LAST:event_btnExitMouseMoved

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnExitMouseExited
        // TODO add your handling code here:
        JPanel6.setBackground(Color.white);
        btnExit.setForeground(Color.black);
    }// GEN-LAST:event_btnExitMouseExited

    private void btnProductMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnProductMouseClicked
        // TODO add your handling code here:
        btnProduct.setBackground(new Color(1, 189, 83));
        btnUser.setBackground(new Color(35, 166, 97));
        btnLogout.setBackground(new Color(35, 166, 97));
        ProductsView frame = new ProductsView();
        ProductController controller = new ProductController(frame);
        controller.ShowProductList();
        jPanel5.removeAll();
        jPanel5.add(frame).setVisible(true);

    }// GEN-LAST:event_btnProductMouseClicked

    private void btnUserMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnUserMouseClicked
        // TODO add your handling code here:
        btnUser.setBackground(new Color(1, 189, 83));
        btnProduct.setBackground(new Color(35, 166, 97));
        btnLogout.setBackground(new Color(35, 166, 97));
        UsersView frame = new UsersView();
        UserController controller = new UserController(frame);
        controller.ShowUserList();
        jPanel5.removeAll();
        jPanel5.add(frame).setVisible(true);
    }// GEN-LAST:event_btnUserMouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        btnUser.setBackground(new Color(35, 166, 97));
        btnProduct.setBackground(new Color(35, 166, 97));
        btnLogout.setBackground(new Color(1, 189, 83));
        int rs = JOptionPane.showConfirmDialog(this, "Are you want to logout");
        if (rs == 0) {
            this.setVisible(false);
            LoginView loginView = new LoginView();
            LoginController controller = new LoginController(loginView);
            controller.showForm();
        }
    }// GEN-LAST:event_btnLogoutMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel6;
    private javax.swing.JLabel btnExit;
    private javax.swing.JPanel btnLogout;
    private javax.swing.JPanel btnProduct;
    private javax.swing.JPanel btnUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel txtWelcome;
    // End of variables declaration//GEN-END:variables
}
