/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import Controladores.AlmacenJpaController;
import Controladores.ContratoJpaController;
import Entidades.Alumno;
import Entidades.Contrato;
import Entidades.Organizacion;
import Entidades.Tipo_Doc;
import Facade.FacadeAlumno;
import Facade.FacadeContrato;
import Facade.FacadeTipoDoc;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pablo
 */
public class ConsultarContrato extends javax.swing.JDialog {
    int opcion;
    Organizacion org;
    static Contrato contrato;
    Contrato cont;

    /**
     * Creates new form ConsultarContrato
     */
    public ConsultarContrato(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        incializarComponentes();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Seleccione una opcion de Busqueda:"); // NOI18N

        jButton1.setText("Nro de Contrato"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Organizacion"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nro de Contrato:"); // NOI18N

        jTextField1.setText(""); // NOI18N

        jLabel3.setText("Estado"); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EN TRAMITE", "SALDADO", "CERRADO", "TODOS" }));

        jLabel4.setText("Organizacion"); // NOI18N

        jTextField2.setText(""); // NOI18N

        jButton4.setText("...");// NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Promocion"); // NOI18N

        jTextField3.setText(""); // NOI18N

        jLabel6.setText("Estado"); // NOI18N

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EN TRAMITE", "SALDADO", "CERRADO", "TODOS", " " }));

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

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar2.png"))); // NOI18N
        jButton5.setText("Buscar"); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton6.setText("Volver"); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel10.setText("Integrantes"); // NOI18N

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

        jLabel11.setText("Contrato:"); // NOI18N

        jTextField5.setText(""); // NOI18N

        jButton7.setText("Ver Detalle"); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane2)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton5))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton7)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        opcion=1;
     jTextField1.setEnabled(true);
     jTextField2.setEnabled(false);
     jTextField3.setEnabled(false);
  
     jTextField5.setEnabled(false);
     jButton1.setEnabled(true);
     jButton2.setEnabled(true);
   
     jButton4.setEnabled(true);
     jButton5.setEnabled(true);
     jButton6.setEnabled(true);
     jButton7.setEnabled(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        BuscarOrganizacion ventana=new BuscarOrganizacion(null, true);
        ventana.setVisible(true);
        org=ventana.org;
        jTextField2.setText(org.getNombre());
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
     opcion=2;
     jTextField1.setEnabled(false);
     jTextField2.setEnabled(false);
     jTextField3.setEnabled(true);
  
     jTextField5.setEnabled(false);
     jButton1.setEnabled(true);
     jButton2.setEnabled(true);
   
     jButton4.setEnabled(true);
     jButton5.setEnabled(true);
     jButton6.setEnabled(true);
     jButton7.setEnabled(true);
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(opcion==1){
        if(!jTextField1.getText().equals("")){
        buscarxNrodeContrato();
        }
        else{
        buscarTodos();
        }
       }
        if(opcion==2){
        if(!jTextField2.getText().equals("")&& !jTextField3.getText().equals("")){
        buscarxOrganizacion();
        }
        else{
        buscarTodos();
        }
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
      if(jTable1.getSelectedRow()!=-1){
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");  
      String valorTabla=(jTable1.getValueAt(jTable1.getSelectedRow(),0)).toString();
      Long valor=Long.parseLong(valorTabla);
      contrato=new ContratoJpaController(emf).findContrato(valor);
      cont=contrato;
      jTextField5.setText(contrato.getNroContrato());
      CargarTablaAlumnos();
      }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(contrato!=null){
        jdDetalleCompras ventana=new jdDetalleCompras(null, true);
        ventana.setVisible(true);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsultarContrato dialog = new ConsultarContrato(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    private void buscarxNrodeContrato() {
        String anulado="NO";
          SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
       List<Contrato> lista=new ArrayList<>();
      if(!jComboBox1.getSelectedItem().toString().equals("TODOS")){
        lista=new FacadeContrato().buscarxnroContratoanulado(jTextField1.getText(), jComboBox1.getSelectedItem().toString(),anulado);
      } 
      
      if(jComboBox1.getSelectedItem().toString().equals("TODOS")){
        lista=new FacadeContrato().buscarxnroContrato(jTextField1.getText(),anulado);
      } 
      DefaultTableModel modeloTabla = new DefaultTableModel(); 
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Nro de contrato");
    modeloTabla.addColumn("Fecha inicio");
    modeloTabla.addColumn("Fecha Fin");
    modeloTabla.addColumn("Organizacion");
    modeloTabla.addColumn("Año");
    modeloTabla.addColumn("Division");
    modeloTabla.addColumn("Estado");
    
    
    
    for (int i = 0; i < lista.size(); i++) {
      Vector vector = new Vector();
      vector.add(lista.get(i).getId());
      vector.add(lista.get(i).getNroContrato());
      String MyFecha = formato.format(lista.get(i).getFec_inicio());
      String MyFecha1 = formato.format(lista.get(i).getFec_fin());
      vector.add(MyFecha);
      vector.add(MyFecha1);
    
      vector.add(lista.get(i).getOrganizacion().getNombre());
      vector.add(lista.get(i).getOrganizacion().getAnio());
      vector.add(lista.get(i).getOrganizacion().getDivision());
      vector.add(lista.get(i).getEstado());
       
      
      modeloTabla.addRow(vector);
    }
     jTable1.setModel(modeloTabla); 
    }

    private void incializarComponentes() {
     jTextField1.setEnabled(false);
     jTextField2.setEnabled(false);
     jTextField3.setEnabled(false);
    
     jTextField5.setEnabled(false);
     jButton1.setEnabled(true);
     jButton2.setEnabled(true);
    
     jButton4.setEnabled(true);
     jButton5.setEnabled(true);
     jButton6.setEnabled(true);
     jButton7.setEnabled(true);
     inicializarTablaContrato();
     inicializarTablaAlumnos();
     if(jfEntregaProductoContrato.paracierre==1){
     SetearCombos();
     }
    }

   

    private void buscarTodos() {
        String anulado="NO";
        SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
        
    List<Contrato> lista=new ArrayList<>();
      if(!jComboBox1.getSelectedItem().toString().equals("TODOS")){
        lista=new FacadeContrato().listaranulado(jComboBox1.getSelectedItem().toString(),anulado);
      } 
      
      if(jComboBox1.getSelectedItem().toString().equals("TODOS")){
        lista=new FacadeContrato().listarTodos(anulado);
      } 
      DefaultTableModel modeloTabla = new DefaultTableModel(); 
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Nro de contrato");
    modeloTabla.addColumn("Fecha inicio");
    modeloTabla.addColumn("Fecha Fin");
    modeloTabla.addColumn("Organizacion");
    modeloTabla.addColumn("Año");
    modeloTabla.addColumn("Division");
    modeloTabla.addColumn("Estado");
    
    
    
    for (int i = 0; i < lista.size(); i++) {
      Vector vector = new Vector();
      vector.add(lista.get(i).getId());
      vector.add(lista.get(i).getNroContrato());
      String MyFecha = formato.format(lista.get(i).getFec_inicio());
      String MyFecha1 = formato.format(lista.get(i).getFec_fin());
      vector.add(MyFecha);
      vector.add(MyFecha1);
      vector.add(lista.get(i).getOrganizacion().getNombre());
      vector.add(lista.get(i).getOrganizacion().getAnio());
      vector.add(lista.get(i).getOrganizacion().getDivision());
      vector.add(lista.get(i).getEstado());
     
      
      modeloTabla.addRow(vector);
    }
     jTable1.setModel(modeloTabla); 
    }

    private void buscarxOrganizacion() {
      String anulado="NO";  
      SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
      List<Contrato> lista=new ArrayList<>();
      if(!jComboBox1.getSelectedItem().toString().equals("TODOS")){
        lista=new FacadeContrato().buscarxOrganizacionanulado(org.getId(), jTextField3.getText(),jComboBox2.getSelectedItem().toString(),anulado);
      } 
      
      if(jComboBox1.getSelectedItem().toString().equals("TODOS")){
        lista=new FacadeContrato().buscarxOrganizacion(org.getId(), jTextField3.getText(),anulado);
 
      } 
      DefaultTableModel modeloTabla = new DefaultTableModel(); 
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Nro de contrato");
    modeloTabla.addColumn("Fecha inicio");
    modeloTabla.addColumn("Fecha Fin");
    modeloTabla.addColumn("Organizacion");
    modeloTabla.addColumn("Año");
    modeloTabla.addColumn("Division");
    modeloTabla.addColumn("Estado");
    
    
    
    for (int i = 0; i < lista.size(); i++) {
      Vector vector = new Vector();
      vector.add(lista.get(i).getId());
      vector.add(lista.get(i).getNroContrato());
      String MyFecha = formato.format(lista.get(i).getFec_inicio());
      String MyFecha1 = formato.format(lista.get(i).getFec_fin());
      vector.add(MyFecha);
      vector.add(MyFecha1);
    
      vector.add(lista.get(i).getOrganizacion().getNombre());
      vector.add(lista.get(i).getOrganizacion().getAnio());
      vector.add(lista.get(i).getOrganizacion().getDivision());
      vector.add(lista.get(i).getEstado());
      
      modeloTabla.addRow(vector);
    }
     jTable1.setModel(modeloTabla); 
    
    }

    private void inicializarTablaContrato() {
    SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
    DefaultTableModel modeloTabla = new DefaultTableModel(); 
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Nro de contrato");
    modeloTabla.addColumn("Fecha inicio");
    modeloTabla.addColumn("Fecha Fin");
    modeloTabla.addColumn("Organizacion");
    modeloTabla.addColumn("Año");
    modeloTabla.addColumn("Division");
    modeloTabla.addColumn("Estado");
     jTable1.setModel(modeloTabla);
    }

    private void inicializarTablaAlumnos() {
             DefaultTableModel modeloTabla = new DefaultTableModel(); 
      
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Organizacion");
    modeloTabla.addColumn("Promocion");
    modeloTabla.addColumn("Apellido");
    modeloTabla.addColumn("Nombre");
    modeloTabla.addColumn("Tipo doc");
    modeloTabla.addColumn("Nro doc");
    modeloTabla.addColumn("Telefono");
    modeloTabla.addColumn("Email");
    modeloTabla.addColumn("Domicilio");
    jTable2.setModel(modeloTabla);
            
    }

    private void CargarTablaAlumnos() {
   List<Alumno> lista;
        lista=contrato.getAlumnos();
                DefaultTableModel modeloTabla = new DefaultTableModel(); 
      
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Organizacion");
    modeloTabla.addColumn("Promocion");
    modeloTabla.addColumn("Apellido");
    modeloTabla.addColumn("Nombre");
    modeloTabla.addColumn("Tipo doc");
    modeloTabla.addColumn("Nro doc");
    modeloTabla.addColumn("Telefono");
    modeloTabla.addColumn("Email");
    modeloTabla.addColumn("Domicilio");
    
    
  
    for (int i = 0; i < lista.size(); i++) {
      Vector vector = new Vector();
      vector.add(lista.get(i).getId());
      vector.add(lista.get(i).getOrg().getNombre()+"-"+lista.get(i).getOrg().getAnio()+" "+lista.get(i).getOrg().getDivision());
      vector.add(lista.get(i).getPromocion());
      vector.add(lista.get(i).getApellido());
      vector.add(lista.get(i).getNombre());
      vector.add(lista.get(i).getTipodoc());
      vector.add(lista.get(i).getDni());
      vector.add(lista.get(i).getTel());
      vector.add(lista.get(i).getEmail());
      vector.add(lista.get(i).getDomicilio());
      
      modeloTabla.addRow(vector);
    }
        
    
     jTable2.setModel(modeloTabla);
   
    }

    private void SetearCombos() {
     DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
      Vector vector = new Vector();
     // vector.add("SALDADO");
      modeloCombo.addElement("SALDADO");
     jComboBox1.setModel(modeloCombo);  
      jComboBox2.setModel(modeloCombo);  
    }
              
    
    
}
