/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.swing.ImageIcon;

/**
 *
 * @author PC
 */
public class Loser extends javax.swing.JDialog {

    /**
     * Creates new form Loser
     */
    public Loser(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setOpacity(0.92f);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnLose = new javax.swing.JPanel();
        lbOk = new javax.swing.JLabel();
        lbBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        pnLose.setPreferredSize(new java.awt.Dimension(1000, 700));
        pnLose.setLayout(null);

        lbOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Board/Ok.png"))); // NOI18N
        lbOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbOkMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbOkMouseReleased(evt);
            }
        });
        pnLose.add(lbOk);
        lbOk.setBounds(423, 398, 172, 73);

        lbBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Board/Thua.png"))); // NOI18N
        lbBg.setOpaque(false);
        pnLose.add(lbBg);
        lbBg.setBounds(0, 0, 1000, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnLose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnLose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbOkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOkMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Board/Ok_press.png"));
        lbOk.setIcon(II);
    }//GEN-LAST:event_lbOkMousePressed

    private void lbOkMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOkMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Board/Ok.png"));
        lbOk.setIcon(II);
        int x = evt.getX();
        int y = evt.getY();
        if ((x > 0) && (x < (lbOk.getWidth())) && (y > 0) && (y < (lbOk.getHeight()))){
            dispose();
        }
    }//GEN-LAST:event_lbOkMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbBg;
    private javax.swing.JLabel lbOk;
    private javax.swing.JPanel pnLose;
    // End of variables declaration//GEN-END:variables
}
