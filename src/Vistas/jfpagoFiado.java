/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import Controladores.ContratoJpaController;
import Controladores.CuentaFiadoJpaController;
import Controladores.DetalleCuentaFiadoJpaController;
import Controladores.FiadoJpaController;
import Controladores.cuenta_contratoJpaController;
import Controladores.detalle_cuenta_contratoJpaController;
import Entidades.CuentaFiado;
import Entidades.DetalleCuentaFiado;
import Entidades.Fiado;
import Entidades.cuenta_contrato;
import Entidades.detalleFiado;
import Entidades.detalle_cuenta_contrato;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.eclipse.persistence.internal.helper.ClassConstants;

/**
 *
 * @author Pablo
 */
public class jfpagoFiado extends javax.swing.JFrame {
    Fiado fiado;
    DetalleCuentaFiado dcc;

    /**
     * Creates new form jfpagoFiado
     */
    public jfpagoFiado() {
        initComponents();
        inicializarComponentes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText(org.openide.util.NbBundle.getMessage(jfpagoFiado.class, "jfpagoFiado.jLabel1.text")); // NOI18N

        jTextField1.setText(org.openide.util.NbBundle.getMessage(jfpagoFiado.class, "jfpagoFiado.jTextField1.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(jfpagoFiado.class, "jfpagoFiado.jLabel2.text")); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar2.png"))); // NOI18N
        jButton1.setText(org.openide.util.NbBundle.getMessage(jfpagoFiado.class, "jfpagoFiado.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel3.setText(org.openide.util.NbBundle.getMessage(jfpagoFiado.class, "jfpagoFiado.jLabel3.text")); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setText(org.openide.util.NbBundle.getMessage(jfpagoFiado.class, "jfpagoFiado.jLabel4.text")); // NOI18N

        jTextField2.setText(org.openide.util.NbBundle.getMessage(jfpagoFiado.class, "jfpagoFiado.jTextField2.text")); // NOI18N

        jLabel5.setText(org.openide.util.NbBundle.getMessage(jfpagoFiado.class, "jfpagoFiado.jLabel5.text")); // NOI18N

        jTextField3.setText(org.openide.util.NbBundle.getMessage(jfpagoFiado.class, "jfpagoFiado.jTextField3.text")); // NOI18N

        jLabel6.setText(org.openide.util.NbBundle.getMessage(jfpagoFiado.class, "jfpagoFiado.jLabel6.text")); // NOI18N

        jTextField4.setText(org.openide.util.NbBundle.getMessage(jfpagoFiado.class, "jfpagoFiado.jTextField4.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel7.setText(org.openide.util.NbBundle.getMessage(jfpagoFiado.class, "jfpagoFiado.jLabel7.text")); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel8.setText(org.openide.util.NbBundle.getMessage(jfpagoFiado.class, "jfpagoFiado.jLabel8.text")); // NOI18N

        jLabel9.setText(org.openide.util.NbBundle.getMessage(jfpagoFiado.class, "jfpagoFiado.jLabel9.text")); // NOI18N

        jTextField5.setText(org.openide.util.NbBundle.getMessage(jfpagoFiado.class, "jfpagoFiado.jTextField5.text")); // NOI18N

        jLabel10.setText(org.openide.util.NbBundle.getMessage(jfpagoFiado.class, "jfpagoFiado.jLabel10.text")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        jButton2.setText(org.openide.util.NbBundle.getMessage(jfpagoFiado.class, "jfpagoFiado.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton3.setText(org.openide.util.NbBundle.getMessage(jfpagoFiado.class, "jfpagoFiado.jButton3.text")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jdBuscarFiado ventana=new jdBuscarFiado(this, true);
        ventana.setVisible(true);
        fiado=ventana.fiado;
        CargarDatos();
        llenarTablaPagos();
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(Menu.opcion==1){
        if(fiado!=null && !jTextField2.getText().equals("") && !jTextField5.getText().equals("")){
            if(!fiado.getEstado().equals("CERRADO")){
            try {
                EntityManagerFactory emf=Persistence.createEntityManagerFactory("pintureriaPU");
                DetalleCuentaFiado dcc=new DetalleCuentaFiado();
                dcc.setFecha(jXDatePicker2.getDate());
                dcc.setMonto_pago(Float.parseFloat(jTextField5.getText()));
                dcc.setAnulado("NO");
                dcc.setUsuario(JLogin.usu);
                float saldo=Float.parseFloat(jTextField4.getText())-Float.parseFloat(jTextField5.getText());
                FiadoJpaController cjc=new FiadoJpaController(emf);
                List<DetalleCuentaFiado> listadetalle=fiado.getCuenta().getListadetallecuentafiado();
                listadetalle.add(dcc);
                CuentaFiado cuenta=fiado.getCuenta();
                cuenta.setListadetallecuentafiado(listadetalle);
                //cuenta.setSaldo(saldo);
                if(saldo <=0){
                    fiado.setEstado("CERRADO");
                    cuenta.setSaldo(0);
                }else{
                cuenta.setSaldo(saldo);
                }
                fiado.setSaldo(saldo);
                fiado.setCuenta(cuenta);
                cjc.edit(fiado);
                JOptionPane.showMessageDialog(rootPane, "Pago registrado");
                limpiarCampos();
                jButton2.setEnabled(false);
                CargarDatos();
                llenarTablaPagos();
            } catch (Exception ex) {
                Logger.getLogger(jfpagoFiado.class.getName()).log(Level.SEVERE, null, ex);
             }
            }else{JOptionPane.showMessageDialog(rootPane, "No se puede Realizar la operacion Fiado ya saldado");}
            
          }else{JOptionPane.showMessageDialog(rootPane, "Datos Incompletos");}
        }
        
         if(Menu.opcion==2){
        if(dcc!=null){
            try {
                EntityManagerFactory emf=Persistence.createEntityManagerFactory("pintureriaPU");
                dcc.setAnulado("SI");
                DetalleCuentaFiadoJpaController dccjc=new DetalleCuentaFiadoJpaController(emf);
                dccjc.edit(dcc);
                CuentaFiado cuenta=fiado.getCuenta();
                float saldo=Float.parseFloat(jTextField4.getText())+Float.parseFloat(jTextField5.getText());
                cuenta.setSaldo(saldo);
                CuentaFiadoJpaController cjc=new CuentaFiadoJpaController(emf);
                cjc.edit(cuenta);
                if(saldo>0){
                fiado.setEstado("EN TRAMITE");
                }else{
                fiado.setEstado("CERRADO");
                }
                fiado.setSaldo(saldo);
                 FiadoJpaController cojc=new FiadoJpaController(emf);
                cojc.edit(fiado);
                JOptionPane.showMessageDialog(rootPane, "Pago anulado");
                jButton2.setEnabled(false);
            } catch (Exception ex) {
                Logger.getLogger(jfPago_cuenta_contrato.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(jfpagoFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfpagoFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfpagoFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfpagoFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfpagoFiado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    // End of variables declaration//GEN-END:variables

    private void inicializarComponentes() {
     jLabel10.setText("");
     if(Menu.opcion==1){   
     jTextField1.setEnabled(false);
     jTextField2.setEnabled(false);
     jTextField3.setEnabled(false);
     jTextField4.setEnabled(false);
     jTextField5.setEnabled(true);
     jXDatePicker1.setEnabled(false);
     jXDatePicker2.setEnabled(true);
     jXDatePicker1.setFormats("dd/MM/YYYY");
     jXDatePicker2.setFormats("dd/MM/yyyy");
     Date hoy=new Date();
     jXDatePicker2.setDate(hoy);
     jButton1.setEnabled(true);
     jButton2.setEnabled(true);
     jButton3.setEnabled(true);
     inicializarTablaDetalle();
     inicializarTablaPagos();
     }
      if(Menu.opcion==2){   
     jTextField1.setEnabled(false);
     jTextField2.setEnabled(false);
     jTextField3.setEnabled(false);
     jTextField4.setEnabled(false);
     jTextField5.setEnabled(false);
     jXDatePicker1.setEnabled(false);
     jXDatePicker2.setEnabled(false);
     jXDatePicker1.setFormats("dd/MM/YYYY");
     jXDatePicker2.setFormats("dd/MM/yyyy");
     Date hoy=new Date();
     jXDatePicker2.setDate(hoy);
     jButton1.setEnabled(false);
     jButton2.setEnabled(true);
     jButton3.setEnabled(false);
     jButton2.setText("Anular Pago");
     inicializarTablaDetalle();
     inicializarTablaPagos();
     }
    }

    private void CargarDatos() {
    jTextField1.setText(fiado.getNombrefiador().toUpperCase());
    jXDatePicker1.setDate(fiado.getFecha());
    //Cargar tabla de detalle de elemento del fiado
       DefaultTableModel modelo=new DefaultTableModel();
       modelo.addColumn("Id");
       modelo.addColumn("Producto");
       modelo.addColumn("Precio");
       modelo.addColumn("Cantidad");
        System.out.println(fiado.getDetalle().size());
       for(int i=0; i < fiado.getDetalle().size();i++){
         Vector vector=new Vector();
         vector.add(fiado.getDetalle().get(i).getId());
         vector.add(fiado.getDetalle().get(i).getProducto().getDescripcion());
         vector.add(fiado.getDetalle().get(i).getMonto());
         vector.add(fiado.getDetalle().get(i).getCantidad());
         modelo.addRow(vector);
       }
       jTable1.setModel(modelo);
       
       jTextField2.setText(String.valueOf(fiado.getMonto()));
       jTextField3.setText(String.valueOf(fiado.getAnticipo()));
       jTextField4.setText(String.valueOf(fiado.getSaldo()));
       jLabel10.setText(fiado.getEstado());
    }
    private void llenarTablaPagos() {
    SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
    List<DetalleCuentaFiado> lista=new ArrayList<>();
    lista=fiado.getCuenta().getListadetallecuentafiado();
    DefaultTableModel modeloTabla = new DefaultTableModel(); 
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Fecha Entrega");
    modeloTabla.addColumn("Monto Entrega");
       
    
    
    
    for (int i = 0; i < lista.size(); i++) {
      if(lista.get(i).getAnulado().equals("NO")){  
      Vector vector = new Vector();
      vector.add(lista.get(i).getId());
      String MyFecha = formato.format(lista.get(i).getFecha());
      vector.add(MyFecha);
      vector.add(lista.get(i).getMonto_pago());
      
      
      modeloTabla.addRow(vector);
      }
    }
     jTable2.setModel(modeloTabla); 
   
    }
    public void limpiarCampos(){
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    }

    private void inicializarTablaDetalle() {
    DefaultTableModel modelo=new DefaultTableModel();
       modelo.addColumn("Id");
       modelo.addColumn("Producto");
       modelo.addColumn("Precio");
       modelo.addColumn("Cantidad");
    jTable1.setModel(modelo);
    }

    private void inicializarTablaPagos() {
      DefaultTableModel modeloTabla = new DefaultTableModel(); 
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Fecha Entrega");
    modeloTabla.addColumn("Monto Entrega");
    jTable2.setModel(modeloTabla);
    }
}
