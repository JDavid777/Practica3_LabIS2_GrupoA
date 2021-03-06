/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.clientes.vista;

import co.unicauca.clientes.modelo.ClientesDB;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Juan David
 */
public class GUIEstadisticaPorSexo extends javax.swing.JFrame implements Observer{

    /**
     * Creates new form GUIEstadisticaPorSexo
     * @param
     */
    public GUIEstadisticaPorSexo(int h, int v) {
        initComponents();
        setLocation(h, v);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHombres = new javax.swing.JLabel();
        lblMujeres = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMujeres = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtHombres = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHombres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHombres.setText("Hombres: ");

        lblMujeres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMujeres.setText("Mujeres: ");

        txtMujeres.setEditable(false);
        txtMujeres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMujeres.setText("0");
        jScrollPane1.setViewportView(txtMujeres);

        txtHombres.setEditable(false);
        txtHombres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHombres.setText("0");
        jScrollPane2.setViewportView(txtHombres);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMujeres)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblHombres)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblHombres))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMujeres)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUIEstadisticaPorSexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIEstadisticaPorSexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIEstadisticaPorSexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIEstadisticaPorSexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUIEstadisticaPorSexo(100,100).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHombres;
    private javax.swing.JLabel lblMujeres;
    private javax.swing.JTextPane txtHombres;
    private javax.swing.JTextPane txtMujeres;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable obs, Object obj) {
        ClientesDB cliDB = (ClientesDB)obs;
        txtHombres.setText("" + cliDB.getTotalHombres());
        txtMujeres.setText("" + cliDB.getTotalMujeres());
        this.setTitle("Estadísticas por sexo. Profesión: " + cliDB.getProfesion());
    }
}
