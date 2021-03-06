/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import Controladores.ClienteJpaController;
import Controladores.OrganizacionJpaController;
import Entidades.Organizacion;
import Facade.FacadeOrganizacion;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pablo
 */
public class BuscarOrganizacion extends javax.swing.JDialog {
int opcion;
Organizacion org;
    /**
     * Creates new form BuscarOrganizacion
     */
    public BuscarOrganizacion(java.awt.Frame parent, boolean modal) {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Organizacion"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar Organizacion"); // NOI18N

        jLabel2.setText("Nombre:"); // NOI18N

        jTextField1.setText(""); // NOI18N

        jLabel3.setText("Anio:"); // NOI18N

        jTextField2.setText(""); // NOI18N

        jLabel4.setText("Division:"); // NOI18N

        jTextField3.setText(""); // NOI18N

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Buscar"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Aceptar"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Volver"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jButton3)
                        .addGap(35, 35, 35)
                        .addComponent(jButton4)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(!jTextField1.getText().equals("")&& !jTextField2.getText().equals("")&&!jTextField3.getText().equals("")){
        buscarxTodo();
        }
         if(!jTextField1.getText().equals("")&& !jTextField2.getText().equals("")&&jTextField3.getText().equals("")){
         buscarxOrgyAnio();
         }
          if(!jTextField1.getText().equals("")&& jTextField2.getText().equals("")&&!jTextField3.getText().equals("")){
          bucarxOrgyDivision();
          }
          if(!jTextField1.getText().equals("")&& jTextField2.getText().equals("")&& jTextField3.getText().equals("")){
          BuscarOrg();
          }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(org!=null){
        this.dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
      if (jTable1.getSelectedRow() != -1) {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");  
      String valorTabla=(jTable1.getValueAt(jTable1.getSelectedRow(),0)).toString();
      Long valor=Long.parseLong(valorTabla);
      org= new OrganizacionJpaController(emf).findOrganizacion(valor);
      JOptionPane.showMessageDialog(rootPane, "Selecciono:"+ org.getNombre() +"");
      jButton3.setEnabled(true);
      }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    jTextField1.setEnabled(true);
    jTextField2.setEnabled(true);
    jTextField3.setEnabled(true);
    jButton2.setEnabled(true);
    
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarOrganizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarOrganizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarOrganizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarOrganizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarOrganizacion dialog = new BuscarOrganizacion(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private void inicializarComponentes() {
    jTextField1.setEnabled(false);
    jTextField2.setEnabled(false);
    jTextField3.setEnabled(false);
    jButton1.setEnabled(true);
    jButton2.setEnabled(false);
    jButton3.setEnabled(false);
    jButton4.setEnabled(true);
    inicializarTabla();
    
    }

    private void inicializarTabla() {
          SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
      List<Organizacion> lista;
         Date fec= new Date();
        lista=new FacadeOrganizacion().listar();
         DefaultTableModel modeloTabla = new DefaultTableModel(); 
      
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Nombre");
    modeloTabla.addColumn("Division");
    modeloTabla.addColumn("Anio");
    modeloTabla.addColumn("Domicilio");
    modeloTabla.addColumn("Telefono");
    modeloTabla.addColumn("email");
    
    
    
    for (int i = 0; i < lista.size(); i++) {
      Vector vector = new Vector();
      vector.add(lista.get(i).getId());
      vector.add(lista.get(i).getNombre());
      vector.add(lista.get(i).getDivision());
      vector.add(lista.get(i).getAnio());
      vector.add(lista.get(i).getDomicilio());
      vector.add(lista.get(i).getTel());
      vector.add(lista.get(i).getEmail());

      modeloTabla.addRow(vector);
    }
     jTable1.setModel(modeloTabla);
  
    
    }

    private void buscarxTodo() {
     List<Organizacion> lista;
         Date fec= new Date();
        lista=new FacadeOrganizacion().buscarxOrgDivAnio(jTextField1.getText().toUpperCase(), jTextField2.getText().toUpperCase(), jTextField3.getText().toUpperCase());
         DefaultTableModel modeloTabla = new DefaultTableModel(); 
      
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Nombre");
    modeloTabla.addColumn("Division");
    modeloTabla.addColumn("Anio");
    modeloTabla.addColumn("Domicilio");
    modeloTabla.addColumn("Telefono");
    modeloTabla.addColumn("email");
    
    
    
    for (int i = 0; i < lista.size(); i++) {
      Vector vector = new Vector();
      vector.add(lista.get(i).getId());
      vector.add(lista.get(i).getNombre());
      vector.add(lista.get(i).getDivision());
      vector.add(lista.get(i).getAnio());
      vector.add(lista.get(i).getDomicilio());
      vector.add(lista.get(i).getTel());
      vector.add(lista.get(i).getEmail());

      modeloTabla.addRow(vector);
    }
     jTable1.setModel(modeloTabla);
  
    
    }

    private void buscarxOrgyAnio() {
     List<Organizacion> lista;
         Date fec= new Date();
        lista=new FacadeOrganizacion().buscarxOrgAnio(jTextField1.getText().toUpperCase(), jTextField2.getText().toUpperCase());
         DefaultTableModel modeloTabla = new DefaultTableModel(); 
      
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Nombre");
    modeloTabla.addColumn("Division");
    modeloTabla.addColumn("Anio");
    modeloTabla.addColumn("Domicilio");
    modeloTabla.addColumn("Telefono");
    modeloTabla.addColumn("email");
    
    
    
    for (int i = 0; i < lista.size(); i++) {
      Vector vector = new Vector();
      vector.add(lista.get(i).getId());
      vector.add(lista.get(i).getNombre());
      vector.add(lista.get(i).getDivision());
      vector.add(lista.get(i).getAnio());
      vector.add(lista.get(i).getDomicilio());
      vector.add(lista.get(i).getTel());
      vector.add(lista.get(i).getEmail());

      modeloTabla.addRow(vector);
    }
     jTable1.setModel(modeloTabla);
  
    
    }

    private void bucarxOrgyDivision() {
     List<Organizacion> lista;
         Date fec= new Date();
        lista=new FacadeOrganizacion().buscarxOrgDiv(jTextField1.getText().toUpperCase(), jTextField3.getText().toUpperCase());
         DefaultTableModel modeloTabla = new DefaultTableModel(); 
      
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Nombre");
    modeloTabla.addColumn("Division");
    modeloTabla.addColumn("Anio");
    modeloTabla.addColumn("Domicilio");
    modeloTabla.addColumn("Telefono");
    modeloTabla.addColumn("email");
    
    
    
    for (int i = 0; i < lista.size(); i++) {
      Vector vector = new Vector();
      vector.add(lista.get(i).getId());
      vector.add(lista.get(i).getNombre());
      vector.add(lista.get(i).getDivision());
      vector.add(lista.get(i).getAnio());
      vector.add(lista.get(i).getDomicilio());
      vector.add(lista.get(i).getTel());
      vector.add(lista.get(i).getEmail());

      modeloTabla.addRow(vector);
    }
     jTable1.setModel(modeloTabla);
  
    
    }

    private void BuscarOrg() {
     List<Organizacion> lista;
         Date fec= new Date();
        lista=new FacadeOrganizacion().buscarxOrg(jTextField1.getText());
         DefaultTableModel modeloTabla = new DefaultTableModel(); 
      
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Nombre");
    modeloTabla.addColumn("Division");
    modeloTabla.addColumn("Anio");
    modeloTabla.addColumn("Domicilio");
    modeloTabla.addColumn("Telefono");
    modeloTabla.addColumn("email");
    
    
    
    for (int i = 0; i < lista.size(); i++) {
      Vector vector = new Vector();
      vector.add(lista.get(i).getId());
      vector.add(lista.get(i).getNombre());
      vector.add(lista.get(i).getDivision());
      vector.add(lista.get(i).getAnio());
      vector.add(lista.get(i).getDomicilio());
      vector.add(lista.get(i).getTel());
      vector.add(lista.get(i).getEmail());

      modeloTabla.addRow(vector);
    }
     jTable1.setModel(modeloTabla);
  
    
    }
}
