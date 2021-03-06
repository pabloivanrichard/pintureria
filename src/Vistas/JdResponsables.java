/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import Controladores.Responsable_ContratoJpaController;
import Entidades.Alumno;
import Entidades.Responsable_Contrato;
import Entidades.Tipo_Doc;
import Facade.FacadeAlumno;
import Facade.FacadeTipoDoc;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pablo
 */
public class JdResponsables extends javax.swing.JDialog {
List<Responsable_Contrato> listaresponsable=new ArrayList<>();
DefaultTableModel modeloTabla = new DefaultTableModel(); 

    /**
     * Creates new form Responsables
     */
    public JdResponsables(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText(org.openide.util.NbBundle.getMessage(JdResponsables.class, "JdResponsables.jLabel1.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(JdResponsables.class, "JdResponsables.jLabel2.text")); // NOI18N

        jLabel3.setText(org.openide.util.NbBundle.getMessage(JdResponsables.class, "JdResponsables.jLabel3.text")); // NOI18N

        jLabel4.setText(org.openide.util.NbBundle.getMessage(JdResponsables.class, "JdResponsables.jLabel4.text")); // NOI18N

        jTextField1.setText(org.openide.util.NbBundle.getMessage(JdResponsables.class, "JdResponsables.jTextField1.text")); // NOI18N

        jTextField2.setText(org.openide.util.NbBundle.getMessage(JdResponsables.class, "JdResponsables.jTextField2.text")); // NOI18N

        jTextField3.setText(org.openide.util.NbBundle.getMessage(JdResponsables.class, "JdResponsables.jTextField3.text")); // NOI18N

        jLabel5.setText(org.openide.util.NbBundle.getMessage(JdResponsables.class, "JdResponsables.jLabel5.text")); // NOI18N

        jTextField4.setText(org.openide.util.NbBundle.getMessage(JdResponsables.class, "JdResponsables.jTextField4.text")); // NOI18N

        jLabel6.setText(org.openide.util.NbBundle.getMessage(JdResponsables.class, "JdResponsables.jLabel6.text")); // NOI18N

        jTextField5.setText(org.openide.util.NbBundle.getMessage(JdResponsables.class, "JdResponsables.jTextField5.text")); // NOI18N

        jLabel7.setText(org.openide.util.NbBundle.getMessage(JdResponsables.class, "JdResponsables.jLabel7.text")); // NOI18N

        jTextField6.setText(org.openide.util.NbBundle.getMessage(JdResponsables.class, "JdResponsables.jTextField6.text")); // NOI18N

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        jButton1.setText(org.openide.util.NbBundle.getMessage(JdResponsables.class, "JdResponsables.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        jButton2.setText(org.openide.util.NbBundle.getMessage(JdResponsables.class, "JdResponsables.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton3.setText(org.openide.util.NbBundle.getMessage(JdResponsables.class, "JdResponsables.jButton3.text")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addComponent(jTextField4)
                            .addComponent(jTextField6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField5))
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!jTextField1.getText().equals("")&& !jTextField2.getText().equals("") && !jTextField3.getText().equals("")&&!jTextField4.getText().equals("")&&!jTextField5.getText().equals("")){
            //Agrego los Valores a la tabla
              Vector vector = new Vector();
              vector.add(jTextField1.getText().toUpperCase());
              vector.add(jTextField2.getText().toUpperCase());
              vector.add(jComboBox1.getSelectedItem().toString());
              vector.add(jTextField3.getText());
              vector.add(jTextField4.getText().toUpperCase());
              vector.add(jTextField5.getText());
              vector.add(jTextField6.getText());
              
            modeloTabla.addRow(vector);
    
            
            EntityManagerFactory emf=Persistence.createEntityManagerFactory("pintureriaPU");
            Responsable_Contrato responsable=new Responsable_Contrato();
            responsable.setApellido(jTextField1.getText().toUpperCase());
            responsable.setNombre(jTextField2.getText().toUpperCase());
            responsable.setTipodoc(jComboBox1.getSelectedItem().toString());
            responsable.setDni(jTextField3.getText());
            responsable.setDomicilio(jTextField4.getText().toUpperCase());
            responsable.setTelefono(jTextField5.getText());
            responsable.setEmail(jTextField6.getText());
            //Responsable_ContratoJpaController rjc=new Responsable_ContratoJpaController(emf);
            //rjc.create(responsable);
            listaresponsable.add(responsable);
            
            limpiarCampos();
        }else{JOptionPane.showMessageDialog(rootPane, "Los Campos con * son Obligatorios");}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       int index=jTable1.getSelectedRow();
       listaresponsable.remove(index);
       modeloTabla.removeRow(index);
       jTable1.setModel(modeloTabla);
       limpiarCampos();
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
            java.util.logging.Logger.getLogger(JdResponsables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JdResponsables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JdResponsables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JdResponsables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JdResponsables dialog = new JdResponsables(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

    private void inicializarComponentes() {
    jTextField1.setEnabled(true);
    jTextField2.setEnabled(true);
    jTextField3.setEnabled(true);
    jTextField4.setEnabled(true);
    jTextField5.setEnabled(true);
    jTextField6.setEnabled(true);
    jComboBox1.setEnabled(true);
    jButton1.setEnabled(true);
    jButton2.setEnabled(true);
    jButton3.setEnabled(true);
    cargarCombos();
    inicializartabla();
    if(jfContrato.listaresponsable.size()!=0){
    CargarTabla();
    }
    if(Menu.opcion==4){
    CargarTablaResponsables();
    }
    }
    private void cargarCombos() {
     DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
     List<Tipo_Doc> lista;
     lista=new FacadeTipoDoc().listar();
     if(lista.get(0).getId()!=null){
      for(int i=0;  i < lista.size(); i++){
      Vector vector = new Vector();
      vector.add(lista.get(i).getDescripcion());
      modeloCombo.addElement(lista.get(i).getDescripcion());
     }
     jComboBox1.setModel(modeloCombo);            
    }
    }

    private void inicializartabla() {
    modeloTabla = new DefaultTableModel(); 
      
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Apellido");
    modeloTabla.addColumn("Nombre");
    modeloTabla.addColumn("Tipo doc");
    modeloTabla.addColumn("Nro doc");
    modeloTabla.addColumn("Telefono");
    modeloTabla.addColumn("Email");
    modeloTabla.addColumn("Domicilio");
    
        
     jTable1.setModel(modeloTabla);
    
    
    }

    private void limpiarCampos() {
     jTextField1.setText("");
     jTextField2.setText("");
     jTextField3.setText("");
     jTextField4.setText("");
     jTextField5.setText("");
     jTextField6.setText("");
    }

    private void CargarTabla() {
        List<Responsable_Contrato> listarespo=jfContrato.listaresponsable;
        modeloTabla = new DefaultTableModel(); 
      
       Vector<String> columnas = new Vector<String>();
       modeloTabla.addColumn("Apellido");
       modeloTabla.addColumn("Nombre");
       modeloTabla.addColumn("Tipo doc");
       modeloTabla.addColumn("Nro doc");
       modeloTabla.addColumn("Telefono");
       modeloTabla.addColumn("Email");
       modeloTabla.addColumn("Domicilio");
    
        for(int i =0; i<listarespo.size();i++){
             //Agrego los Valores a la tabla
              Vector vector = new Vector();
              vector.add(listarespo.get(i).getApellido());
              vector.add(listarespo.get(i).getNombre());
              vector.add(listarespo.get(i).getTipodoc());
              vector.add(listarespo.get(i).getDni());
              vector.add(listarespo.get(i).getTelefono());
              vector.add(listarespo.get(i).getEmail());
              vector.add(listarespo.get(i).getDomicilio());
              
            modeloTabla.addRow(vector);
    
        
        }
        jTable1.setModel(modeloTabla);
    }

    private void CargarTablaResponsables() {
        List<Responsable_Contrato> listarespo=jfContrato.listaresponsable;
       DefaultTableModel modeloTabla = new DefaultTableModel(); 
      
       Vector<String> columnas = new Vector<String>();
       modeloTabla.addColumn("Apellido");
       modeloTabla.addColumn("Nombre");
       modeloTabla.addColumn("Tipo doc");
       modeloTabla.addColumn("Nro doc");
       modeloTabla.addColumn("Telefono");
       modeloTabla.addColumn("Email");
       modeloTabla.addColumn("Domicilio");
    
        for(int i =0; i<listarespo.size();i++){
             //Agrego los Valores a la tabla
              Vector vector = new Vector();
              vector.add(listarespo.get(i).getApellido());
              vector.add(listarespo.get(i).getNombre());
              vector.add(listarespo.get(i).getTipodoc());
              vector.add(listarespo.get(i).getDni());
              vector.add(listarespo.get(i).getTelefono());
              vector.add(listarespo.get(i).getEmail());
              vector.add(listarespo.get(i).getDomicilio());
              
            modeloTabla.addRow(vector);
    
        
        }
        jTable1.setModel(modeloTabla);
    }
}
