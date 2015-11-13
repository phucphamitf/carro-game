/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import dungchung.message_Cls;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class Register extends javax.swing.JDialog {

    /**
     * Creates new form Register
     */
    Menu mn;
    public Register(java.awt.Dialog parent, boolean modal,Menu mn) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.mn = mn;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnRegister = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirm = new javax.swing.JPasswordField();
        lbRegister = new javax.swing.JLabel();
        lbBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName(""); // NOI18N
        setUndecorated(true);
        setResizable(false);

        pnRegister.setPreferredSize(new java.awt.Dimension(1000, 700));
        pnRegister.setLayout(null);

        lbExit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Login/x.png"))); // NOI18N
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbExitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbExitMouseReleased(evt);
            }
        });
        pnRegister.add(lbExit);
        lbExit.setBounds(717, 130, 70, 71);

        txtLogin.setFont(new java.awt.Font("VNI-Disney", 0, 24)); // NOI18N
        pnRegister.add(txtLogin);
        txtLogin.setBounds(444, 220, 273, 45);

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        pnRegister.add(txtPassword);
        txtPassword.setBounds(444, 380, 273, 45);

        txtConfirm.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmActionPerformed(evt);
            }
        });
        pnRegister.add(txtConfirm);
        txtConfirm.setBounds(444, 299, 273, 45);

        lbRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Login/dang_ky.png"))); // NOI18N
        lbRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbRegisterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbRegisterMouseReleased(evt);
            }
        });
        pnRegister.add(lbRegister);
        lbRegister.setBounds(397, 480, 210, 70);

        lbBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Register/Register.png"))); // NOI18N
        pnRegister.add(lbBg);
        lbBg.setBounds(0, 0, 1000, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Login/x_press.png"));
        lbExit.setIcon(II);
    }//GEN-LAST:event_lbExitMousePressed

    private void lbExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Login/x.png"));
        lbExit.setIcon(II);
        int x = evt.getX();
        int y = evt.getY();
        if ((x > 0) && (x < (lbExit.getWidth())) && (y > 0) && (y < (lbExit.getHeight()))) {
            if(this.mn.getSk()!=null){
                this.mn.getSk();
            }
            dispose();
        }
    }//GEN-LAST:event_lbExitMouseReleased

    private void lbRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRegisterMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Login/dang_ky_press.png"));
        lbRegister.setIcon(II);
    }//GEN-LAST:event_lbRegisterMousePressed

    private void lbRegisterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRegisterMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Login/dang_ky.png"));
        lbRegister.setIcon(II);
        int x = evt.getX();
        int y = evt.getY();
        if ((x > 0) && (x < (lbRegister.getWidth())) && (y > 0) && (y < (lbRegister.getHeight()))) {
            message_Cls sms = new message_Cls("dang ky", "");
            sms.setName(this.txtLogin.getText());
            sms.setEmail(this.txtLogin.getText()+"@gmail.com");
            sms.setPass(this.txtPassword.getText());
            this.mn.setSk(new GuiDataDemoThs("name"));
            if(this.mn.getSk().openConnect(sms,this.mn)){
                //thanh cong
//                HangDoiTimPhong on = new HangDoiTimPhong(mn);
//                on.setVisible(true);
                this.setVisible(false);
                this.mn.dispose();
                this.dispose();
            }else{
                System.out.println("loi ket noi");
                JOptionPane.showMessageDialog(null,mn.getNotice());
            }
        }
    }//GEN-LAST:event_lbRegisterMouseReleased

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbBg;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbRegister;
    private javax.swing.JPanel pnRegister;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
