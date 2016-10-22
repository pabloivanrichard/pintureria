/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import Controladores.ContratoJpaController;
import Controladores.FiadoJpaController;
import Entidades.Cliente;
import Entidades.Contrato;
import Entidades.Fiado;
import Facade.FacadeContrato;
import Facade.FacadeFiado;
import static Vistas.ConsultarContrato.contrato;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
public class jdBuscarFiado extends javax.swing.JDialog {
    Cliente cliente;
    Fiado fiado;
    /**
     * Creates new form jdBuscarFiado
     */
    public jdBuscarFiado(java.awt.Frame parent, boolean modal) {
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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText(org.openide.util.NbBundle.getMessage(jdBuscarFiado.class, "jdBuscarFiado.jLabel1.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(jdBuscarFiado.class, "jdBuscarFiado.jLabel2.text")); // NOI18N

        jTextField1.setText(org.openide.util.NbBundle.getMessage(jdBuscarFiado.class, "jdBuscarFiado.jTextField1.text")); // NOI18N

        jButton1.setText(org.openide.util.NbBundle.getMessage(jdBuscarFiado.class, "jdBuscarFiado.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText(org.openide.util.NbBundle.getMessage(jdBuscarFiado.class, "jdBuscarFiado.jLabel3.text")); // NOI18N

        jLabel4.setText(org.openide.util.NbBundle.getMessage(jdBuscarFiado.class, "jdBuscarFiado.jLabel4.text")); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TODOS", "EN TRAMITE", "CERRADO" }));

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

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar2.png"))); // NOI18N
        jButton2.setText(org.openide.util.NbBundle.getMessage(jdBuscarFiado.class, "jdBuscarFiado.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        jButton3.setText(org.openide.util.NbBundle.getMessage(jdBuscarFiado.class, "jdBuscarFiado.jButton3.text")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton4.setText(org.openide.util.NbBundle.getMessage(jdBuscarFiado.class, "jdBuscarFiado.jButton4.text")); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(0, 62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BuscarCliente ventana=new BuscarCliente(null, true);
        ventana.setVisible(true);
        if(ventana.cliente!=null){
        cliente=ventana.cliente;
        jTextField1.setText(cliente.getApellido()+" "+cliente.getNombre());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(!jTextField1.getText().equals("")&& jXDatePicker1.getDate()!=null && jComboBox1.getSelectedItem().toString().equals("TODOS")){
        buscarxClienteFecha();
        }
        if(!jTextField1.getText().equals("")&& jXDatePicker1.getDate()==null && !jComboBox1.getSelectedItem().toString().equals("TODOS")){
        buscarxClienteEstado();
        }
        if(!jTextField1.getText().equals("")&& jXDatePicker1.getDate()!=null && !jComboBox1.getSelectedItem().toString().equals("TODOS")){
        buscarxTodos();
        }
         if(jTextField1.getText().equals("")&& jXDatePicker1.getDate()!=null && jComboBox1.getSelectedItem().toString().equals("TODOS")){
        buscarxFecha();
        }
          if(!jTextField1.getText().equals("")&& jXDatePicker1.getDate()==null && jComboBox1.getSelectedItem().toString().equals("TODOS")){
        buscarxCliente();
        }
        if(jTextField1.getText().equals("")&& jXDatePicker1.getDate()==null && jComboBox1.getSelectedItem().toString().equals("TODOS")){
         listar();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
      if(jTable1.getSelectedRow()!=-1){
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");  
      String valorTabla=(jTable1.getValueAt(jTable1.getSelectedRow(),0)).toString();
      Long valor=Long.parseLong(valorTabla);
      fiado=new FiadoJpaController(emf).findFiado(valor);
          JOptionPane.showMessageDialog(rootPane, "Seleccione la operacion id: "+fiado.getId());
      }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
           this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(jdBuscarFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdBuscarFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdBuscarFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdBuscarFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdBuscarFiado dialog = new jdBuscarFiado(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    // End of variables declaration//GEN-END:variables

    private void inicializarComponentes() {
    jTextField1.setEnabled(true);
    jXDatePicker1.setFormats("dd/MM/yyyy");
    jXDatePicker1.setEnabled(true);
    jButton1.setEnabled(true);
    jButton2.setEnabled(true);
    jButton3.setEnabled(true);
    jButton4.setEnabled(true);
    inicializarTabla();
    }

    private void inicializarTabla() {
    SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
    DefaultTableModel modeloTabla = new DefaultTableModel(); 
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Cliente");
    modeloTabla.addColumn("Fecha inicio");
    modeloTabla.addColumn("Monto");
    modeloTabla.addColumn("Saldo");
    modeloTabla.addColumn("Estado");
     jTable1.setModel(modeloTabla);
    
    }

    private void buscarxTodos() {
      String anulado="NO";  
      SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
      List<Fiado> lista=new ArrayList<>();
      lista=new FacadeFiado().buscarxClienteEstadoFecha(jTextField1.getText().toUpperCase(),jComboBox1.getSelectedItem().toString(), anulado, jXDatePicker1.getDate());
    DefaultTableModel modeloTabla = new DefaultTableModel(); 
    Vector<String> columnas = new Vector<String>();
   modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Cliente");
    modeloTabla.addColumn("Fecha inicio");
    modeloTabla.addColumn("Monto");
    modeloTabla.addColumn("Saldo");
    modeloTabla.addColumn("Estado");
    
    
    
    for (int i = 0; i < lista.size(); i++) {
      Vector vector = new Vector();
      vector.add(lista.get(i).getId());
      vector.add(lista.get(i).getNombrefiador());
      String MyFecha = formato.format(lista.get(i).getFecha());
      vector.add(MyFecha);
      vector.add(lista.get(i).getMonto());
      vector.add(lista.get(i).getSaldo());
      vector.add(lista.get(i).getEstado());
      
      modeloTabla.addRow(vector);
    }
     jTable1.setModel(modeloTabla); 
    }

    private void buscarxClienteEstado() {
     String anulado="NO";  
      SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
      List<Fiado> lista=new ArrayList<>();
      lista=new FacadeFiado().buscarxClienteEstado(jTextField1.getText().toUpperCase(),jComboBox1.getSelectedItem().toString(), anulado);
      DefaultTableModel modeloTabla = new DefaultTableModel(); 
    Vector<String> columnas = new Vector<String>();
   modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Cliente");
    modeloTabla.addColumn("Fecha inicio");
    modeloTabla.addColumn("Monto");
    modeloTabla.addColumn("Saldo");
    modeloTabla.addColumn("Estado");
    
    
    
    for (int i = 0; i < lista.size(); i++) {
      Vector vector = new Vector();
      vector.add(lista.get(i).getId());
      vector.add(lista.get(i).getNombrefiador());
      String MyFecha = formato.format(lista.get(i).getFecha());
      vector.add(MyFecha);
      vector.add(lista.get(i).getMonto());
      vector.add(lista.get(i).getSaldo());
      vector.add(lista.get(i).getEstado());
      
      modeloTabla.addRow(vector);
    }
     jTable1.setModel(modeloTabla); 
    }

    private void buscarxClienteFecha() {
      String anulado="NO";  
      SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
      List<Fiado> lista=new ArrayList<>();
      lista=new FacadeFiado().buscarxFechayCliente(jTextField1.getText().toUpperCase(),jXDatePicker1.getDate());
      DefaultTableModel modeloTabla = new DefaultTableModel(); 
    Vector<String> columnas = new Vector<String>();
   modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Cliente");
    modeloTabla.addColumn("Fecha inicio");
    modeloTabla.addColumn("Monto");
    modeloTabla.addColumn("Saldo");
    modeloTabla.addColumn("Estado");
    
    
    
    for (int i = 0; i < lista.size(); i++) {
      Vector vector = new Vector();
      vector.add(lista.get(i).getId());
      vector.add(lista.get(i).getNombrefiador());
      String MyFecha = formato.format(lista.get(i).getFecha());
      vector.add(MyFecha);
      vector.add(lista.get(i).getMonto());
      vector.add(lista.get(i).getSaldo());
      vector.add(lista.get(i).getEstado());
      
      modeloTabla.addRow(vector);
    }
     jTable1.setModel(modeloTabla); 
    }

    private void buscarxFecha() {
    String anulado="NO";  
      SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
      List<Fiado> lista=new ArrayList<>();
      lista=new FacadeFiado().buscarxFecha(jXDatePicker1.getDate(), anulado);
      DefaultTableModel modeloTabla = new DefaultTableModel(); 
    Vector<String> columnas = new Vector<String>();
   modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Cliente");
    modeloTabla.addColumn("Fecha inicio");
    modeloTabla.addColumn("Monto");
    modeloTabla.addColumn("Saldo");
    modeloTabla.addColumn("Estado");
    
    
    
    for (int i = 0; i < lista.size(); i++) {
      Vector vector = new Vector();
      vector.add(lista.get(i).getId());
      vector.add(lista.get(i).getNombrefiador());
      String MyFecha = formato.format(lista.get(i).getFecha());
      vector.add(MyFecha);
      vector.add(lista.get(i).getMonto());
      vector.add(lista.get(i).getSaldo());
      vector.add(lista.get(i).getEstado());
      
      modeloTabla.addRow(vector);
    }
     jTable1.setModel(modeloTabla); 
    }

    private void buscarxCliente() {
     String anulado="NO";  
      SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
      List<Fiado> lista=new ArrayList<>();
      lista=new FacadeFiado().buscarxCliente(jTextField1.getText().toUpperCase(), anulado);
     DefaultTableModel modeloTabla = new DefaultTableModel(); 
    Vector<String> columnas = new Vector<String>();
   modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Cliente");
    modeloTabla.addColumn("Fecha inicio");
    modeloTabla.addColumn("Monto");
    modeloTabla.addColumn("Saldo");
    modeloTabla.addColumn("Estado");
    
    
    
    for (int i = 0; i < lista.size(); i++) {
      Vector vector = new Vector();
      vector.add(lista.get(i).getId());
      vector.add(lista.get(i).getNombrefiador());
      String MyFecha = formato.format(lista.get(i).getFecha());
      vector.add(MyFecha);
      vector.add(lista.get(i).getMonto());
      vector.add(lista.get(i).getSaldo());
      vector.add(lista.get(i).getEstado());
      
      modeloTabla.addRow(vector);
    }
     jTable1.setModel(modeloTabla); 
    }

    private void listar() {
    String anulado="NO";  
    SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
    List<Fiado> lista=new ArrayList<>();
    lista=new FacadeFiado().listar(anulado);
    DefaultTableModel modeloTabla = new DefaultTableModel(); 
    Vector<String> columnas = new Vector<String>();
   modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Cliente");
    modeloTabla.addColumn("Fecha inicio");
    modeloTabla.addColumn("Monto");
    modeloTabla.addColumn("Saldo");
    modeloTabla.addColumn("Estado");
    
    
    
    for (int i = 0; i < lista.size(); i++) {
      Vector vector = new Vector();
      vector.add(lista.get(i).getId());
      vector.add(lista.get(i).getNombrefiador());
      String MyFecha = formato.format(lista.get(i).getFecha());
      vector.add(MyFecha);
      vector.add(lista.get(i).getMonto());
      vector.add(lista.get(i).getSaldo());
      vector.add(lista.get(i).getEstado());
      
      modeloTabla.addRow(vector);
    }
     jTable1.setModel(modeloTabla); 
    }
}