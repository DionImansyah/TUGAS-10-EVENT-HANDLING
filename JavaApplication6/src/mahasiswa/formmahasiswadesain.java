/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dslein
 */
public class formmahasiswadesain extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public formmahasiswadesain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLnim = new javax.swing.JLabel();
        jLnama = new javax.swing.JLabel();
        jLprodi = new javax.swing.JLabel();
        jLipk = new javax.swing.JLabel();
        NIM = new javax.swing.JTextField();
        NAMA = new javax.swing.JTextField();
        PRODI = new javax.swing.JTextField();
        IPK = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMhs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formulir Mahasiswa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLnim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLnim.setForeground(new java.awt.Color(255, 255, 255));
        jLnim.setText("NIM");

        jLnama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLnama.setForeground(new java.awt.Color(255, 255, 255));
        jLnama.setText("Nama");

        jLprodi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLprodi.setForeground(new java.awt.Color(255, 255, 255));
        jLprodi.setText("Program Studi");
        jLprodi.setToolTipText("");

        jLipk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLipk.setForeground(new java.awt.Color(255, 255, 255));
        jLipk.setText("IPk");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MASUKAN DATA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLipk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IPK, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLprodi)
                                    .addGap(18, 18, 18)
                                    .addComponent(PRODI, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLnama)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NAMA, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLnim)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NIM, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2))
                        .addGap(0, 40, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLnim, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NIM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLnama, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NAMA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLprodi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PRODI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IPK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLipk, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21))
        );

        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndel.setText("Delete");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        jTableMhs.setBackground(new java.awt.Color(204, 204, 204));
        jTableMhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Program Studi", "IPK"
            }
        ));
        jScrollPane1.setViewportView(jTableMhs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(btnadd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btndel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnupdate)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btndel)
                    .addComponent(btnupdate))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTableMhs.getModel();
        try {
            int nim = Integer.parseInt(NIM.getText());
            String nama = NAMA.getText();
            String prodi = PRODI.getText();
            Double ipk = Double.parseDouble(IPK.getText());
            Object[] o = {nim,nama,prodi,ipk};
            int pil = JOptionPane.showConfirmDialog(this, "Ingin Menambahkan Data ?","Tambah Data",JOptionPane.YES_NO_OPTION);
            if(pil == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(this, "Data Telah diTambahkan");
                model.addRow(o);}
            else if(pil == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(this, "Data Gagal diTambahkan");}
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " Harap Masukkan Data ! / Data Salah ! ",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTableMhs.getModel();

        try {
            int pil = JOptionPane.showConfirmDialog(this, "Ingin Merubah data ?","Update Data",JOptionPane.YES_NO_OPTION);
            if(pil == JOptionPane.YES_OPTION){
                int upd = jTableMhs.getSelectedRow();
                model.setValueAt(NIM.getText(), upd, 0);
                model.setValueAt(NAMA.getText(), upd, 1);
                model.setValueAt(PRODI.getText(), upd, 2);
                model.setValueAt(IPK.getText(), upd, 3);
                JOptionPane.showMessageDialog(this, "Data Telah diUpdate");
            }
            else if(pil == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(this, "Data Gagal diUpdate");}
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Data Belum diPilih",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTableMhs.getModel();
        try {

            int pil = JOptionPane.showConfirmDialog(this, "Ingin Menghapus Data ?","Hapus Data",JOptionPane.YES_NO_OPTION);
            if(pil == JOptionPane.YES_OPTION){
                int del = jTableMhs.getSelectedRow();
                model.removeRow(del);
                JOptionPane.showMessageDialog(this, "Data dihapus");
            }else if(pil == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(this, "Data Gagal diHapus");}
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Pilih Data",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btndelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formmahasiswadesain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formmahasiswadesain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formmahasiswadesain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formmahasiswadesain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formmahasiswadesain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IPK;
    private javax.swing.JTextField NAMA;
    private javax.swing.JTextField NIM;
    private javax.swing.JTextField PRODI;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLipk;
    private javax.swing.JLabel jLnama;
    private javax.swing.JLabel jLnim;
    private javax.swing.JLabel jLprodi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMhs;
    // End of variables declaration//GEN-END:variables
}
