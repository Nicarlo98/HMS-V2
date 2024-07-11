package Admins;

import Doctors.*;
import Main.Hospital;
import javax.swing.ImageIcon;

/**
 *
 * @author KNA
 */
public class doctorManagement extends javax.swing.JFrame {

    public static String username;

    public doctorManagement() {
        initComponents();
    }

    public void User(String Username) {
        username = Username;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        addReceptionbtn1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        updateReceptionbtn = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        deleteReceptionbtn = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        viewReceptionbtn = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        searchReceptionbtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doctor Management !");

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 0));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Doctor Panel");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backs.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap(556, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(441, 441, 441)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)
                                .addGap(20, 20, 20)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout
                                                .createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel21)
                                                        .addComponent(jLabel17))))
                                .addGap(0, 0, Short.MAX_VALUE)));

        jPanel6.setBackground(new java.awt.Color(153, 153, 0));
        jPanel6.setPreferredSize(new java.awt.Dimension(150, 100));

        addReceptionbtn1.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        addReceptionbtn1.setForeground(new java.awt.Color(255, 255, 255));
        addReceptionbtn1.setText("Add New");
        addReceptionbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addReceptionbtn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addComponent(addReceptionbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 121,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addReceptionbtn1)
                                .addGap(15, 15, 15)));

        jPanel4.setBackground(new java.awt.Color(153, 153, 0));

        updateReceptionbtn.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        updateReceptionbtn.setForeground(new java.awt.Color(255, 255, 255));
        updateReceptionbtn.setText("Update");
        updateReceptionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateReceptionbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(updateReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(30, Short.MAX_VALUE)));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateReceptionbtn)
                                .addGap(15, 15, 15)));

        jPanel7.setBackground(new java.awt.Color(153, 153, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(150, 100));

        deleteReceptionbtn.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        deleteReceptionbtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteReceptionbtn.setText("Delete ");
        deleteReceptionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteReceptionbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap(30, Short.MAX_VALUE)
                                .addComponent(deleteReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)));
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(deleteReceptionbtn)
                                .addContainerGap(17, Short.MAX_VALUE)));

        jPanel8.setBackground(new java.awt.Color(153, 153, 0));
        jPanel8.setPreferredSize(new java.awt.Dimension(150, 100));

        viewReceptionbtn.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        viewReceptionbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewReceptionbtn.setText("View ");
        viewReceptionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewReceptionbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addContainerGap(36, Short.MAX_VALUE)
                                .addComponent(viewReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)));
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(viewReceptionbtn)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel9.setBackground(new java.awt.Color(153, 153, 0));
        jPanel9.setPreferredSize(new java.awt.Dimension(150, 100));

        searchReceptionbtn.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        searchReceptionbtn.setForeground(new java.awt.Color(255, 255, 255));
        searchReceptionbtn.setText("Search ");
        searchReceptionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchReceptionbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addContainerGap(34, Short.MAX_VALUE)
                                .addComponent(searchReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addContainerGap(17, Short.MAX_VALUE)
                                .addComponent(searchReceptionbtn)
                                .addGap(15, 15, 15)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(86, 86, 86)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 64,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(49, 49, 49)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 62,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(72, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel1MouseMoved

    }// GEN-LAST:event_jPanel1MouseMoved

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel17MouseClicked
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }// GEN-LAST:event_jLabel17MouseClicked

    private void addReceptionbtn1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addReceptionbtn1MouseClicked
        addDoctor aDoctor = new addDoctor();
        aDoctor.setVisible(true);
        dispose();
    }// GEN-LAST:event_addReceptionbtn1MouseClicked

    private void updateReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_updateReceptionbtnMouseClicked
        updateDoctor uReceptionist = new updateDoctor();
        uReceptionist.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_updateReceptionbtnMouseClicked

    private void deleteReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_deleteReceptionbtnMouseClicked
        deleteDoctor dDoctor = new deleteDoctor();
        dDoctor.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_deleteReceptionbtnMouseClicked

    private void viewReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_viewReceptionbtnMouseClicked
        viewDoctor vReceptionist = new viewDoctor();
        vReceptionist.setVisible(true);
        dispose();
    }// GEN-LAST:event_viewReceptionbtnMouseClicked

    private void searchReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_searchReceptionbtnMouseClicked
        searchDoctor sReceptionist = new searchDoctor();
        sReceptionist.setVisible(true);
        dispose();
    }// GEN-LAST:event_searchReceptionbtnMouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel21MouseClicked
        AdminActivity aActivity = new AdminActivity();
        aActivity.setVisible(true);
        dispose();
    }// GEN-LAST:event_jLabel21MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new doctorManagement().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addReceptionbtn1;
    private javax.swing.JLabel deleteReceptionbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel searchReceptionbtn;
    private javax.swing.JLabel updateReceptionbtn;
    private javax.swing.JLabel viewReceptionbtn;
    // End of variables declaration//GEN-END:variables
}
