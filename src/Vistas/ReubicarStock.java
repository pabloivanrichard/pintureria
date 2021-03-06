/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import Controladores.AlmacenJpaController;
import Controladores.LocalizacionJpaController;
import Entidades.Almacen;
import Entidades.Localizacion;
import Entidades.Tipo_Cliente;
import Entidades.Tipo_Doc;
import Facade.FacadeAlmacen;
import Facade.FacadeLocalizacion;
import Facade.FacadeTipoDoc;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pablo
 */
public class ReubicarStock extends javax.swing.JFrame {
Almacen productoAlmacen;
Localizacion localizacion;
    /**
     * Creates new form ReubicarStock
     */
    public ReubicarStock() {
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText(org.openide.util.NbBundle.getMessage(ReubicarStock.class, "ReubicarStock.jLabel1.text")); // NOI18N

        jTextField1.setText(org.openide.util.NbBundle.getMessage(ReubicarStock.class, "ReubicarStock.jTextField1.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(ReubicarStock.class, "ReubicarStock.jLabel2.text")); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jButton1.setText(org.openide.util.NbBundle.getMessage(ReubicarStock.class, "ReubicarStock.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setText(org.openide.util.NbBundle.getMessage(ReubicarStock.class, "ReubicarStock.jTextField2.text")); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jButton2.setText(org.openide.util.NbBundle.getMessage(ReubicarStock.class, "ReubicarStock.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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

        jLabel3.setText(org.openide.util.NbBundle.getMessage(ReubicarStock.class, "ReubicarStock.jLabel3.text")); // NOI18N

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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel4.setText(org.openide.util.NbBundle.getMessage(ReubicarStock.class, "ReubicarStock.jLabel4.text")); // NOI18N

        jTextField3.setText(org.openide.util.NbBundle.getMessage(ReubicarStock.class, "ReubicarStock.jTextField3.text")); // NOI18N

        jLabel5.setText(org.openide.util.NbBundle.getMessage(ReubicarStock.class, "ReubicarStock.jLabel5.text")); // NOI18N

        jTextField4.setText(org.openide.util.NbBundle.getMessage(ReubicarStock.class, "ReubicarStock.jTextField4.text")); // NOI18N

        jLabel6.setText(org.openide.util.NbBundle.getMessage(ReubicarStock.class, "ReubicarStock.jLabel6.text")); // NOI18N

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh.png"))); // NOI18N
        jButton3.setText(org.openide.util.NbBundle.getMessage(ReubicarStock.class, "ReubicarStock.jButton3.text")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton4.setText(org.openide.util.NbBundle.getMessage(ReubicarStock.class, "ReubicarStock.jButton4.text")); // NOI18N
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
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(31, 31, 31))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(354, 354, 354))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButton4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          if(!jTextField1.getText().equals("")){
        buscarProducto();
        }
        if(jTextField1.getText().equals("")){
        cargarTablaProducto();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if(!jTextField2.getText().equals("")){
        buscarxcodigo();
        }
        if(jTextField2.getText().equals("")){
        cargarTablaProducto();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
          if(jTable1.getSelectedRow()!=-1){
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");  
      String valorTabla=(jTable1.getValueAt(jTable1.getSelectedRow(),0)).toString();
      Long valor=Long.parseLong(valorTabla);
      productoAlmacen=new AlmacenJpaController(emf).findAlmacen(valor);
      buscarxLocalizacion();
          }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        if(jTable2.getSelectedRow()!=-1){
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");  
      String valorTabla=(jTable2.getValueAt(jTable2.getSelectedRow(),0)).toString();
      Long valor=Long.parseLong(valorTabla);
      localizacion=new LocalizacionJpaController(emf).findLocalizacion(valor);
      jTextField3.setText(localizacion.getDescripcion());
      //jTextField4.setText(String.valueOf(localizacion.getCantidad()));
      llenarComboLocalizacion();
          }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(!jTextField3.getText().equals("")&& !jTextField4.getText().equals("")){
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("pintureriaPU");
        //Restar Origen
        float valor=Float.parseFloat(jTextField4.getText());
        float resultado=localizacion.getCantidad()-valor;
        System.out.print(localizacion.getDescripcion());
        System.out.print(localizacion.getCantidad());
        System.out.print(resultado);
        // Sumar Destino
        List<Localizacion> listalo=new FacadeLocalizacion().buscarxTodo(jComboBox1.getSelectedItem().toString(),String.valueOf(localizacion.getId_almacen()), String.valueOf(localizacion.getId_producto()));
        Localizacion loca;
        if(listalo.size()==0){
        loca=new Localizacion();
        loca.setDescripcion(jComboBox1.getSelectedItem().toString());
        loca.setId_almacen(String.valueOf(localizacion.getId_almacen()));
        loca.setId_producto(String.valueOf(localizacion.getId_producto()));
        loca.setCantidad(0);
        }
        else{ loca=listalo.get(0);}
        float suma=loca.getCantidad()+valor;
        if(localizacion.getDescripcion()!=loca.getDescripcion()){
        if(resultado >= 0){
            try {
                localizacion.setCantidad(resultado);
                localizacion.setId_almacen(String.valueOf(productoAlmacen.getId()));
                localizacion.setId_producto(String.valueOf(productoAlmacen.getProducto().getId()));
                LocalizacionJpaController ljc=new LocalizacionJpaController(emf);
                ljc.edit(localizacion);
                loca.setCantidad(suma);
                loca.setId_almacen(String.valueOf(productoAlmacen.getId()));
                loca.setId_producto(String.valueOf(productoAlmacen.getProducto().getId()));
                ljc.edit(loca);
                buscarxLocalizacion();
            } catch (Exception ex) {
                Logger.getLogger(ReubicarStock.class.getName()).log(Level.SEVERE, null, ex);
            }
         }else{JOptionPane.showMessageDialog(rootPane, "El valor a transferir es mayor a las unidades disponible en esta ubicacion");}
        
        }else{JOptionPane.showMessageDialog(rootPane, "No se puede Transferir al mismo Destino");}
        
        }
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
            java.util.logging.Logger.getLogger(ReubicarStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReubicarStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReubicarStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReubicarStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReubicarStock().setVisible(true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
    
    public void cargarTablaProducto(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("pintureriaPU");
        List<Almacen> listaproducto= new FacadeAlmacen().listar();
        DefaultTableModel modeloTabla=new DefaultTableModel();
        modeloTabla.addColumn("Id");
        modeloTabla.addColumn("Producto");
        modeloTabla.addColumn("Proveedor");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Unidades Disponibles");
        //modeloTabla.addColumn("Localizacion");
        
        
        for(int i=0; i<listaproducto.size(); i++){
        Vector vector=new Vector();
        vector.add(listaproducto.get(i).getId());
        vector.add(listaproducto.get(i).getProducto().getDescripcion());
        vector.add(listaproducto.get(i).getProducto().getProveedor().getNombre());
        vector.add(listaproducto.get(i).getProducto().getPrecio().getPrecio_contado());
        vector.add(listaproducto.get(i).getCantidad());
        //vector.add(listaproducto.get(i).getLocalizacion());
        modeloTabla.addRow(vector);
        }
        jTable1.setModel(modeloTabla);
    }

    private void buscarProducto() {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("pintureriaPU");
        List<Almacen> listaproducto= new FacadeAlmacen().buscarxnombre(jTextField1.getText().toUpperCase());
        DefaultTableModel modeloTabla=new DefaultTableModel();
        modeloTabla.addColumn("Id");
        modeloTabla.addColumn("Producto");
        modeloTabla.addColumn("Proveedor");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Unidades Disponibles");
        //modeloTabla.addColumn("Localizacion");
        
        
        for(int i=0; i<listaproducto.size(); i++){
        Vector vector=new Vector();
        vector.add(listaproducto.get(i).getId());
        vector.add(listaproducto.get(i).getProducto().getDescripcion());
        vector.add(listaproducto.get(i).getProducto().getProveedor().getNombre());
        vector.add(listaproducto.get(i).getProducto().getPrecio().getPrecio_contado());
        vector.add(listaproducto.get(i).getCantidad());
       // vector.add(listaproducto.get(i).getLocalizacion());
        modeloTabla.addRow(vector);
        }
        jTable1.setModel(modeloTabla);
    }
        private void buscarxcodigo() {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("pintureriaPU");
        List<Almacen> listaproducto= new FacadeAlmacen().buscarxcod(jTextField2.getText());
        DefaultTableModel modeloTabla=new DefaultTableModel();
        modeloTabla.addColumn("Id");
        modeloTabla.addColumn("Producto");
        modeloTabla.addColumn("Proveedor");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Unidades Disponibles");
        //modeloTabla.addColumn("Localizacion");
        
        
        for(int i=0; i<listaproducto.size(); i++){
        Vector vector=new Vector();
        vector.add(listaproducto.get(i).getId());
        vector.add(listaproducto.get(i).getProducto().getDescripcion());
        vector.add(listaproducto.get(i).getProducto().getProveedor().getNombre());
        vector.add(listaproducto.get(i).getProducto().getPrecio().getPrecio_contado());
        vector.add(listaproducto.get(i).getCantidad());
        //vector.add(listaproducto.get(i).getLocalizacion());
        modeloTabla.addRow(vector);
        }
        jTable1.setModel(modeloTabla);
    }

    private void inicializarComponentes() {
    cargarTablaProducto();
    inicializarTablaLocalizacion();
    }

    private void inicializarTablaLocalizacion() {
        DefaultTableModel modeloTabla=new DefaultTableModel();
        modeloTabla.addColumn("Id");
        modeloTabla.addColumn("Descripcion");
        modeloTabla.addColumn("Cantidad");
        modeloTabla.addColumn("id_producto");
        modeloTabla.addColumn("id_almacen");
        jTable2.setModel(modeloTabla);
          
    }

    private void buscarxLocalizacion() {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("pintureriaPU");
        List<Localizacion> listaproducto= new FacadeLocalizacion().buscarxAlmance(String.valueOf(productoAlmacen.getId()));
        DefaultTableModel modeloTabla=new DefaultTableModel();
        modeloTabla.addColumn("Id");
        modeloTabla.addColumn("Descripcion");
        modeloTabla.addColumn("Cantidad");
        modeloTabla.addColumn("id_producto");
        modeloTabla.addColumn("id_almacen");
        
        
        for(int i=0; i<listaproducto.size(); i++){
        Vector vector=new Vector();
        vector.add(listaproducto.get(i).getId());
        vector.add(listaproducto.get(i).getDescripcion());
        vector.add(listaproducto.get(i).getCantidad());
        vector.add(listaproducto.get(i).getId_producto());
        vector.add(listaproducto.get(i).getId_almacen());
        modeloTabla.addRow(vector);
        }
        jTable2.setModel(modeloTabla);
    }

    private void llenarComboLocalizacion() {
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
     List<String> lista;
     lista=new FacadeLocalizacion().listardistintos1();
    
     for(int i=0;  i < lista.size(); i++){
      Vector vector = new Vector();
      vector.add(lista.get(i));
      modeloCombo.addElement(lista.get(i));
     }
     
     jComboBox1.setModel(modeloCombo);
     }  
    


}
