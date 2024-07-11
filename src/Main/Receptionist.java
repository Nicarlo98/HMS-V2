package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import Receptionists.ReceptionistActivity;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author KNA
 */

public class Receptionist extends javax.swing.JFrame {

    PreparedStatement prp = null;
    ResultSet result = null;
    Connection connection = null;
    String username;

    public Receptionist() {
        initComponents();
        setVisible(true);
        setSize(1000, 550);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mLabel = new java.awt.Label();
        dUser = new javax.swing.JLabel();
        rUserField = new javax.swing.JTextField();
        plbl = new javax.swing.JLabel();
        rPassField = new javax.swing.JPasswordField();
        rExitBtn = new javax.swing.JButton();
        rLoginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receptionist");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 550));

        mLabel.setAlignment(java.awt.Label.CENTER);
        mLabel.setBackground(new java.awt.Color(153, 153, 0));
        mLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        mLabel.setForeground(new java.awt.Color(255, 255, 255));
        mLabel.setText("Hospital Management System");

        dUser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dUser.setText("Username:");

        rUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rUserFieldActionPerformed(evt);
            }
        });

        plbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        plbl.setText("Password:");

        rPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPassFieldActionPerformed(evt);
            }
        });

        rExitBtn.setBackground(new java.awt.Color(153, 153, 0));
        rExitBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rExitBtn.setForeground(new java.awt.Color(255, 255, 255));
        rExitBtn.setText("Home");
        rExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rExitBtnActionPerformed(evt);
            }
        });

        rLoginBtn.setBackground(new java.awt.Color(153, 153, 0));
        rLoginBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        rLoginBtn.setText("Login");
        rLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rLoginBtnActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1010,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dUser)
                                        .addComponent(plbl))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 279,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 279,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(rExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(99, 99, 99)
                                                .addComponent(rLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(mLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(dUser)
                                                                .addGap(101, 101, 101)
                                                                .addComponent(plbl))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(rUserField,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(101, 101, 101)
                                                                .addComponent(rPassField,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(71, 71, 71)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(rExitBtn,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                35,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(rLoginBtn,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                35,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))))));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rUserFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rUserFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_rUserFieldActionPerformed

    private void rPassFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rPassFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_rPassFieldActionPerformed

    private void rExitBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rExitBtnActionPerformed
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }// GEN-LAST:event_rExitBtnActionPerformed

    private void rLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rLoginBtnActionPerformed
        connection = Connector.ConnectDb();
        String user = rUserField.getText();
        String pass = String.valueOf(rPassField.getPassword());
        try {
            String sql = "select username, password from receptionist where username='" + user + "'";
            prp = connection.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            result = prp.executeQuery();
            result.first();
            if (pass.equals(result.getString("password"))) {
                ReceptionistActivity rActivity = new ReceptionistActivity();
                rActivity.setVisible(true);
                username = user;
                ReceptionistActivity.username = username;
                JOptionPane.showMessageDialog(null, "Login Succesful", "Welcome " + user,
                        JOptionPane.INFORMATION_MESSAGE);
                dispose();
                connection.close();
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "User or Password wrong.");
        }

    }// GEN-LAST:event_rLoginBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Receptionist().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dUser;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label mLabel;
    private javax.swing.JLabel plbl;
    private javax.swing.JButton rExitBtn;
    private javax.swing.JButton rLoginBtn;
    private javax.swing.JPasswordField rPassField;
    private javax.swing.JTextField rUserField;
    // End of variables declaration//GEN-END:variables
}