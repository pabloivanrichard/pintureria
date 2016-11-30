/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.ClienteJpaController;
import Controladores.Cuenta_ClienteJpaController;
import Controladores.exceptions.NonexistentEntityException;
import Entidades.Cliente;
import Entidades.Cuenta_Cliente;
import Entidades.Tipo_Cliente;
import Entidades.Tipo_Doc;
import Facade.FacadeCliente;
import Facade.FacadeTipoCliente;
import Facade.FacadeTipoDoc;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author laura
 */
public class JfCliente extends javax.swing.JFrame {
    int menu=Menu.opcion; // Variable de menu para manejar los abm
    Cliente cliente;
    /**
     * Creates new form Cliente
     */
    public JfCliente() {
        initComponents();
         setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ingreso los Datos:");

        jLabel2.setText("*Apellido:");

        jLabel3.setText("*Nombres:");

        jLabel4.setText("*Tipo de Documento:");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setText("*Nro Documento:");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jLabel6.setText("Telefono:");

        jLabel7.setText("Email:");

        jLabel8.setText("Domicilio:");

        jLabel9.setText("Tipo de Cliente:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(menu==1 || JfVenta.opcion==1){
        if(!jTextField1.getText().equals("")&&!jTextField2.getText().equals("")&&!jTextField3.getText().equals("") ){    
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("pintureriaPU");
        Cliente clientes=new Cliente();
        clientes.setApellido(jTextField1.getText().toUpperCase());
        clientes.setNombre(jTextField2.getText().toUpperCase());
        List<Tipo_Doc> td;
        td= new FacadeTipoDoc().buscarxdescripcion(jComboBox1.getSelectedItem().toString());
        clientes.setTipo_doc(td.get(0));
        clientes.setDoc(jTextField3.getText().toUpperCase());
        clientes.setTel(jTextField4.getText());
        clientes.setEmail(jTextField5.getText().toUpperCase());
        clientes.setDomicilio(jTextField6.getText().toUpperCase());
        List<Tipo_Cliente> tc;
        tc=new FacadeTipoCliente().buscarxdescripcion(jComboBox2.getSelectedItem().toString());
        clientes.setDescripcion(tc.get(0));
        //a continuacuion cuando doy de alta un cliente me crea una cuenta para el mismo no si antes validar si ya existe 
         boolean valido= new FacadeCliente().validarCliente(td.get(0).getDescripcion(), jTextField3.getText());
         if(!valido){
            Cuenta_Cliente cuenta=new Cuenta_Cliente();
            cuenta.setNombre(td.get(0).getDescripcion()+jTextField3.getText());
            cuenta.setEstado("SIN DEUDA");
            Cuenta_ClienteJpaController ccjp=new Cuenta_ClienteJpaController(emf);
            ccjp.create(cuenta);
            clientes.setCuenta(cuenta);
        ClienteJpaController cjc=new ClienteJpaController(emf);
        cjc.create(clientes);
         JOptionPane.showMessageDialog(rootPane, "La operacion se realizo con exito");
         limpiarCampos();
        }
         if(valido){
         JOptionPane.showMessageDialog(rootPane, "El cliente ya existe no se puede ingresar");
         }
         }else {JOptionPane.showMessageDialog(rootPane, "Los campos con (*) son obligatorios");}
        }
        if(menu==2){
            if(!jTextField1.getText().equals("")&&!jTextField2.getText().equals("")&&!jTextField3.getText().equals("") ){    
            try {
                EntityManagerFactory emf=Persistence.createEntityManagerFactory("pintureriaPU");
               Cliente clientes=cliente;
               clientes.setApellido(jTextField1.getText().toUpperCase());
               clientes.setNombre(jTextField2.getText().toUpperCase());
               List<Tipo_Doc> td;
               td= new FacadeTipoDoc().buscarxdescripcion(jComboBox1.getSelectedItem().toString());
               clientes.setTipo_doc(td.get(0));
               clientes.setDoc(jTextField3.getText().toUpperCase());
               clientes.setTel(jTextField4.getText());
               clientes.setEmail(jTextField5.getText().toUpperCase());
               clientes.setDomicilio(jTextField6.getText().toUpperCase());
               List<Tipo_Cliente> tc;
               tc=new FacadeTipoCliente().buscarxdescripcion(jComboBox2.getSelectedItem().toString());
               clientes.setDescripcion(tc.get(0));
                ClienteJpaController cjc=new ClienteJpaController(emf);
               cjc.edit(clientes);
                JOptionPane.showMessageDialog(rootPane, "La operacion se realizo con exito");
               limpiarCampos();
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(JfCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(JfCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{JOptionPane.showMessageDialog(rootPane, "Los campos con (*) son Obligatorios");}
        }
        if(menu==3){
            try {
                EntityManagerFactory emf=Persistence.createEntityManagerFactory("pintureriaPU");
                Cliente clientes=cliente;
                   clientes.setApellido(jTextField1.getText().toUpperCase());
                   clientes.setNombre(jTextField2.getText().toUpperCase());
                   List<Tipo_Doc> td;
                   td= new FacadeTipoDoc().buscarxdescripcion(jComboBox1.getSelectedItem().toString());
                   clientes.setTipo_doc(td.get(0));
                   clientes.setDoc(jTextField3.getText().toUpperCase());
                   clientes.setTel(jTextField4.getText());
                   clientes.setEmail(jTextField5.getText().toUpperCase());
                   clientes.setDomicilio(jTextField6.getText().toUpperCase());
                   List<Tipo_Cliente> tc;
                   tc=new FacadeTipoCliente().buscarxdescripcion(jComboBox2.getSelectedItem().toString());
                   clientes.setDescripcion(tc.get(0));
                    ClienteJpaController cjc=new ClienteJpaController(emf);
                   cjc.destroy(clientes.getId());
                    JOptionPane.showMessageDialog(rootPane, "El registro se borro");
                    limpiarCampos();
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(JfCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
           float k = (float) evt.getKeyChar(); 
      if (k >= 97 && k <= 122 || k >= 65 && k <= 90) { 
      evt.consume(); 
      JOptionPane.showMessageDialog(null, "No puede ingresar Letras!!!", "Error Datos", JOptionPane.ERROR_MESSAGE); 
      }
    }//GEN-LAST:event_jTextField3KeyTyped

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
            java.util.logging.Logger.getLogger(JfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

    private void inicializarComponentes() {
    if(menu==1 || JfVenta.opcion==1){    
    jTextField1.setEnabled(true);
    jTextField2.setEnabled(true);
    jTextField3.setEnabled(true);
    jTextField4.setEnabled(true);
    jTextField5.setEnabled(true);
    jTextField6.setEnabled(true);
    jComboBox1.setEnabled(true);
    jComboBox2.setEnabled(true);
    jButton1.setEnabled(true);
    jButton2.setEnabled(true);
    cargarCombos();
     }
    if(menu==2){    
    jTextField1.setEnabled(true);
    jTextField2.setEnabled(true);
    jTextField3.setEnabled(true);
    jTextField4.setEnabled(true);
    jTextField5.setEnabled(true);
    jTextField6.setEnabled(true);
    jComboBox1.setEnabled(true);
    jComboBox2.setEnabled(true);
    jButton1.setEnabled(true);
    jButton2.setEnabled(true);
    cargarCombos();
    BuscarCliente ventana=new BuscarCliente(this, true);
    ventana.setVisible(true);
    cliente=ventana.cliente_filtrado;
    jTextField1.setText(cliente.getApellido());
    jTextField2.setText(cliente.getNombre());
    jComboBox1.setSelectedItem(cliente.getTipo_doc().getDescripcion());
    jTextField3.setText(cliente.getDoc());
    jTextField4.setText(cliente.getTel());
    jTextField5.setText(cliente.getEmail());
    jTextField6.setText(cliente.getDomicilio());
    jComboBox2.setSelectedItem(cliente.getDescripcion().getDescripcion());
    
    
    
     }
    if(menu==3){    
    jTextField1.setEnabled(false);
    jTextField2.setEnabled(false);
    jTextField3.setEnabled(false);
    jTextField4.setEnabled(false);
    jTextField5.setEnabled(false);
    jTextField6.setEnabled(false);
    jComboBox1.setEnabled(false);
    jComboBox2.setEnabled(false);
    jButton1.setEnabled(true);
    jButton2.setEnabled(true);
    cargarCombos();
     BuscarCliente ventana=new BuscarCliente(this, true);
    ventana.setVisible(true);
    cliente=ventana.cliente_filtrado;
    jTextField1.setText(cliente.getApellido());
    jTextField2.setText(cliente.getNombre());
    jComboBox1.setSelectedItem(cliente.getTipo_doc().getDescripcion());
    jTextField3.setText(cliente.getDoc());
    jTextField4.setText(cliente.getTel());
    jTextField5.setText(cliente.getEmail());
    jTextField6.setText(cliente.getDomicilio());
    jComboBox2.setSelectedItem(cliente.getDescripcion().getDescripcion());
     }
    }

    private void cargarCombos() {
        
     DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
     DefaultComboBoxModel modeloCombo1 = new DefaultComboBoxModel();
     List<Tipo_Doc> lista;
     List<Tipo_Cliente> listac;
     listac=new Facade.FacadeTipoCliente().listar();
     lista=new FacadeTipoDoc().listar();
     if(lista.get(0).getId()!=null && listac.get(0).getId()!=null){
     for(int i=0;  i < lista.size(); i++){
      Vector vector = new Vector();
      vector.add(lista.get(i).getDescripcion());
      modeloCombo.addElement(lista.get(i).getDescripcion());
     }
     for(int j=0;  j < listac.size(); j++){
      Vector vector1 = new Vector();
      vector1.add(listac.get(j).getDescripcion());
      modeloCombo1.addElement(listac.get(j).getDescripcion());
     }
     jComboBox1.setModel(modeloCombo);
     jComboBox2.setModel(modeloCombo1);            
    }
     
  }
   public void limpiarCampos(){
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField6.setText("");
   } 
}
