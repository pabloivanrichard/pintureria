/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import Controladores.MesaJpaController;
import Controladores.VentaJpaController;
import Entidades.Localizacion;
import Entidades.Mesa;
import Entidades.Mozo;
import Entidades.ServicioMesa;
import Entidades.Venta;
import Facade.FacadeLocalizacion;
import Facade.FacadeMozo;
import Facade.FacadeServicioMesa;
import Facade.FacadeVenta;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
public class ConsultarVentasxMozo extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarVentasxMozo
     */
    public ConsultarVentasxMozo() {
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
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText(org.openide.util.NbBundle.getMessage(ConsultarVentasxMozo.class, "ConsultarVentasxMozo.jLabel1.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(ConsultarVentasxMozo.class, "ConsultarVentasxMozo.jLabel2.text")); // NOI18N

        jLabel3.setText(org.openide.util.NbBundle.getMessage(ConsultarVentasxMozo.class, "ConsultarVentasxMozo.jLabel3.text")); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar2.png"))); // NOI18N
        jButton1.setText(org.openide.util.NbBundle.getMessage(ConsultarVentasxMozo.class, "ConsultarVentasxMozo.jButton1.text")); // NOI18N
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

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

        jLabel4.setText(org.openide.util.NbBundle.getMessage(ConsultarVentasxMozo.class, "ConsultarVentasxMozo.jLabel4.text")); // NOI18N

        jLabel5.setText(org.openide.util.NbBundle.getMessage(ConsultarVentasxMozo.class, "ConsultarVentasxMozo.jLabel5.text")); // NOI18N

        jTextField1.setText(org.openide.util.NbBundle.getMessage(ConsultarVentasxMozo.class, "ConsultarVentasxMozo.jTextField1.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton2.setText(org.openide.util.NbBundle.getMessage(ConsultarVentasxMozo.class, "ConsultarVentasxMozo.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton2)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jXDatePicker1.getDate()!=null && jXDatePicker2.getDate()!=null && jComboBox1.getSelectedItem().toString().equals("TODOS")){
        buscarporFecha();
        calcularTotal();
        }
        if(jXDatePicker1.getDate()!=null && jXDatePicker2.getDate()!=null && !jComboBox1.getSelectedItem().toString().equals("TODOS")){
        buscarporMozo();
        calcularTotal();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
      if(jTable1.getSelectedRow()!=-1){
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");  
      String valorTabla=(jTable1.getValueAt(jTable1.getSelectedRow(),0)).toString();
      Long valor=Long.parseLong(valorTabla);
      Venta venta=new VentaJpaController(emf).findVenta(valor);
      List<ServicioMesa> serviciomesa=new FacadeServicioMesa().buscarxId(venta.getId());
        ServicioMesa ser=serviciomesa.get(0);  
        jfDetalleConsultaVentasxMozo ventana=new jfDetalleConsultaVentasxMozo(this, true,ser);
        ventana.setVisible(true);
      }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(ConsultarVentasxMozo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarVentasxMozo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarVentasxMozo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarVentasxMozo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarVentasxMozo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    // End of variables declaration//GEN-END:variables

    private void inicializarComponentes() {
    jXDatePicker1.setFormats("dd/MM/yyyy");
    jXDatePicker2.setFormats("dd/MM/yyyy");
    Date hoy=new Date();
    jXDatePicker1.setDate(hoy);
    jXDatePicker2.setDate(hoy);
    inicializarCombo();
    inicializarTablaVentas();
    calcularTotal();
    }

    private void inicializarCombo() {     
     DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
     List<Mozo> lista;
     lista=new FacadeMozo().listar();
     if(lista.get(0).getId()!=null){
     modeloCombo.addElement("TODOS");
     for(int i=0;  i < lista.size(); i++){
      Vector vector = new Vector();
      vector.add(lista.get(i).getApellido()+" "+lista.get(i).getNombre());
      modeloCombo.addElement(lista.get(i).getApellido()+" "+lista.get(i).getNombre());
     }
       jComboBox1.setModel(modeloCombo);
     }
    }

    private void inicializarTablaVentas() {
    buscarporFecha();
    
    }
    
     private void buscarporFecha() {
   SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
   SimpleDateFormat formato1=new SimpleDateFormat("HH:mm:ss");
    DefaultTableModel modeloTabla = new DefaultTableModel();  
                Date fec=jXDatePicker1.getDate();                
                Date fec1=jXDatePicker2.getDate();       
                List<Venta> lista = new FacadeVenta().buscarxFecha(fec,fec1);
    modeloTabla = new DefaultTableModel();
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Fecha");
    modeloTabla.addColumn("Inicio");
    modeloTabla.addColumn("Fin");
    modeloTabla.addColumn("Mesa");
    modeloTabla.addColumn("Monto");
    modeloTabla.addColumn("Tipo Pago");
    modeloTabla.addColumn("Mozo");
    for (int i = 0; i < lista.size(); i++) {
      Vector vector = new Vector();
        List<ServicioMesa> serviciomesa=new FacadeServicioMesa().buscarxId(lista.get(i).getId());
        ServicioMesa ser=serviciomesa.get(0);
      vector.add(lista.get(i).getId());
     // vector.add(lista.get(i).getFecha_diagnostico());
      String MyFecha = formato.format(lista.get(i).getFecha());
      String inicio = formato1.format(ser.getInicio());
      String fin = formato1.format(ser.getFin());
      vector.add(MyFecha);
      vector.add(inicio);
      vector.add(fin);
      vector.add(ser.getMesa());
      
     // vector.add(lista.get(i).getCliente().getApellido() + " " + lista.get(i).getCliente().getNombre());
     // vector.add(lista.get(i).getCliente().getTipo_doc().getDescripcion());
     // vector.add(lista.get(i).getCliente().getDoc());
      vector.add(lista.get(i).getMonto());
      vector.add(lista.get(i).getDescripcion());
      vector.add(lista.get(i).getMozo());
      modeloTabla.addRow(vector);
    }
     jTable1.setModel(modeloTabla);
     }    
     private void calcularTotal() {
    if(jTable1.getRowCount()>0){
    float total=0;    
    for(int i=0; i<jTable1.getRowCount();i++){
    float precio= Float.parseFloat(jTable1.getValueAt(i, 5).toString());
    total=total+precio;
    }
    jTextField1.setText(String.valueOf(total));    
    }else{jTextField1.setText(String.valueOf(0));} 
    
    }

    private void buscarporMozo() {
     SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
   SimpleDateFormat formato1=new SimpleDateFormat("HH:mm:ss");
    DefaultTableModel modeloTabla = new DefaultTableModel();  
                Date fec=jXDatePicker1.getDate();                
                Date fec1=jXDatePicker2.getDate();       
                List<Venta> lista = new FacadeVenta().buscarxFechayMozo(fec,fec1,jComboBox1.getSelectedItem().toString());
    modeloTabla = new DefaultTableModel();
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Fecha");
    modeloTabla.addColumn("Inicio");
    modeloTabla.addColumn("Fin");
    modeloTabla.addColumn("Mesa");
    modeloTabla.addColumn("Monto");
    modeloTabla.addColumn("Tipo Pago");
    modeloTabla.addColumn("Mozo");
    for (int i = 0; i < lista.size(); i++) {
      Vector vector = new Vector();
        List<ServicioMesa> serviciomesa=new FacadeServicioMesa().buscarxId(lista.get(i).getId());
        ServicioMesa ser=serviciomesa.get(0);
      vector.add(lista.get(i).getId());
     // vector.add(lista.get(i).getFecha_diagnostico());
      String MyFecha = formato.format(lista.get(i).getFecha());
      String inicio = formato1.format(ser.getInicio());
      String fin = formato1.format(ser.getFin());
      vector.add(MyFecha);
      vector.add(inicio);
      vector.add(fin);
      vector.add(ser.getMesa());
      
     // vector.add(lista.get(i).getCliente().getApellido() + " " + lista.get(i).getCliente().getNombre());
     // vector.add(lista.get(i).getCliente().getTipo_doc().getDescripcion());
     // vector.add(lista.get(i).getCliente().getDoc());
      vector.add(lista.get(i).getMonto());
      vector.add(lista.get(i).getDescripcion());
      vector.add(lista.get(i).getMozo());
      modeloTabla.addRow(vector);
    }
     jTable1.setModel(modeloTabla);
    }
}
