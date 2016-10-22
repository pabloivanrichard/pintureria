/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;
import Controladores.ProductoJpaController;
import Controladores.VentaJpaController;
import Entidades.Tipo_Doc;
import Entidades.Venta;
import Facade.FacadeTipoDoc;
import Facade.FacadeVenta;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author laura
 */
public class BuscarVentaGenerica extends javax.swing.JDialog {
    int opcion;
    Venta venta;
    /**
     * Creates new form BuscarVentaGenerica
     */
    public BuscarVentaGenerica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        jButton4.setText("Aceptar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel2.setText("/");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
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

        jLabel1.setText("Fecha:");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Fecha");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jLabel4.setText("Tipo de Doc:");

        jLabel5.setText("Nro de Doc:");

        jLabel3.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        float k = (float) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "No puede ingresar Letras!!!", "Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (jTextField2.getText().length()==2){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        float k = (float) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "No puede ingresar Letras!!!", "Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (jTextField1.getText().length()==2){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(PagoContado.op==0){
            if(jTable1.getSelectedRow()!=-1){
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
                String valorTabla=(jTable1.getValueAt(jTable1.getSelectedRow(),0)).toString();
                Long valor=Long.parseLong(valorTabla);
                VentaJpaController vjc= new VentaJpaController(emf);
                venta=vjc.findVenta(valor);
                JOptionPane.showMessageDialog(rootPane, "Seleccione la Venta del cliente: " + venta.getCliente().getApellido() +" "+venta.getCliente().getNombre());
                System.out.print("Entro con op=0");
            }
        }
        if(PagoContado.op==1){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
            String valorTabla=(jTable1.getValueAt(jTable1.getSelectedRow(),0)).toString();
            Long valor=Long.parseLong(valorTabla);
            VentaJpaController vjc= new VentaJpaController(emf);
            Venta vent=vjc.findVenta(valor);
            if(vent.getTipoventa().getTipo().equals("CONTADO")){
                venta=vent;
                JOptionPane.showMessageDialog(rootPane, "Seleccione la Venta del cliente: " + venta.getCliente().getApellido() +" "+venta.getCliente().getNombre());
                System.out.print("Entro con op=1 y pago contado");
            }
            if(!vent.getTipoventa().getTipo().equals("CONTADO")){
                JOptionPane.showMessageDialog(rootPane, "La venta no es con contado");
                System.out.print("Entro con op=1 y pago tarjeta");
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(opcion==1){
            if(!jTextField1.getText().equals("")&&!jTextField2.getText().equals("")&&!jTextField3.getText().equals("")){
                buscarxFecha();
            }
        }
        if(opcion==2){
            if(!jTextField4.getText().equals("")){
                buscarxCliente();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        opcion=2;
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
        jTextField4.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jComboBox1.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        opcion=1;
        jTextField1.setEnabled(true);
        jTextField2.setEnabled(true);
        jTextField3.setEnabled(true);
        jTextField4.setEnabled(false);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jComboBox1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        float k = (float) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "No puede ingresar Letras!!!", "Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (jTextField3.getText().length()==4){
            evt.consume();
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
            java.util.logging.Logger.getLogger(BuscarVentaGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarVentaGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarVentaGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarVentaGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarVentaGenerica dialog = new BuscarVentaGenerica(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
 private void inicializarComponentes() {
    jTextField1.setEnabled(false);
    jTextField2.setEnabled(false);
    jTextField3.setEnabled(false);
    jTextField4.setEnabled(false);
    jButton1.setEnabled(true);
    jButton2.setEnabled(true);
    jButton3.setEnabled(false);
    jButton4.setEnabled(true);
    jButton5.setEnabled(true);
    jComboBox1.setEnabled(false);
    inicializarCombo();
    inicializarTabla();
    }

    private void inicializarCombo() {
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

    private void buscarxFecha() {
   SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
    DefaultTableModel modeloTabla = new DefaultTableModel();  
        Calendar fecha = Calendar.getInstance();
                int dia=Integer.parseInt(jTextField1.getText());
                int mes=Integer.parseInt(jTextField2.getText());
                int año=Integer.parseInt(jTextField3.getText());
                fecha.set(año, mes-1, dia);
                Date fec=(Date)fecha.getTime();
                List<Venta> lista = new FacadeVenta().buscarxFechatodo(fec);
    modeloTabla = new DefaultTableModel();
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Fecha");
    modeloTabla.addColumn("Cliente");
    modeloTabla.addColumn("tipo de Doc");
    modeloTabla.addColumn("Doc");
    modeloTabla.addColumn("Tipo");
    modeloTabla.addColumn("Monto");
    modeloTabla.addColumn("Anulada");
   modeloTabla.addColumn("Pago registrado");

    for (int i = 0; i < lista.size(); i++) {
      Vector vector = new Vector();
      vector.add(lista.get(i).getId());
     // vector.add(lista.get(i).getFecha_diagnostico());
      String MyFecha = formato.format(lista.get(i).getFecha());
      vector.add(MyFecha); 
      vector.add(lista.get(i).getCliente().getApellido() + " " + lista.get(i).getCliente().getNombre());
      vector.add(lista.get(i).getCliente().getTipo_doc().getDescripcion());
      vector.add(lista.get(i).getCliente().getDoc());
      vector.add(lista.get(i).getTipoventa().getTipo());
      vector.add(lista.get(i).getMonto());
      vector.add(lista.get(i).getAnulacion());
      vector.add(lista.get(i).getPagoRegistrado());
      modeloTabla.addRow(vector);
    }
     jTable1.setModel(modeloTabla); 
    }

    private void buscarxCliente() {
    SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
    DefaultTableModel modeloTabla = new DefaultTableModel();  
                List<Venta> lista = new FacadeVenta().buscarxDoctodo(jComboBox1.getSelectedItem().toString(), jTextField4.getText());
    modeloTabla = new DefaultTableModel();
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Fecha");
    modeloTabla.addColumn("Cliente");
    modeloTabla.addColumn("tipo de Doc");
    modeloTabla.addColumn("Doc");
    modeloTabla.addColumn("Tipo");
    modeloTabla.addColumn("Monto");
    modeloTabla.addColumn("Anulada");
    modeloTabla.addColumn("Pago registrado");

    for (int i = 0; i < lista.size(); i++) {
      Vector vector = new Vector();
      vector.add(lista.get(i).getId());
     // vector.add(lista.get(i).getFecha_diagnostico());
      String MyFecha = formato.format(lista.get(i).getFecha());
      vector.add(MyFecha); 
      vector.add(lista.get(i).getCliente().getApellido() + " " + lista.get(i).getCliente().getNombre());
      vector.add(lista.get(i).getCliente().getTipo_doc().getDescripcion());
      vector.add(lista.get(i).getCliente().getDoc());
      vector.add(lista.get(i).getTipoventa().getTipo());
      vector.add(lista.get(i).getMonto());
      vector.add(lista.get(i).getAnulacion());      
      vector.add(lista.get(i).getPagoRegistrado());
      modeloTabla.addRow(vector);
    }
     jTable1.setModel(modeloTabla); 
    }

    private void inicializarTabla() {
    DefaultTableModel modeloTabla = new DefaultTableModel();  
    modeloTabla = new DefaultTableModel();
    Vector<String> columnas = new Vector<String>();
    modeloTabla.addColumn("Id");
    modeloTabla.addColumn("Fecha");
    modeloTabla.addColumn("Cliente");
    modeloTabla.addColumn("tipo de Doc");
    modeloTabla.addColumn("Doc");
    modeloTabla.addColumn("Tipo");
    modeloTabla.addColumn("Monto");
    modeloTabla.addColumn("Anulada");
    modeloTabla.addColumn("Pago registrado");
    jTable1.setModel(modeloTabla);
    }

}
