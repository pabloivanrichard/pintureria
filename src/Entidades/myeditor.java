/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
//import vistas.busquedaOrdencmpa;
//import vistas.verElementos;

/**
 *
 * @author osep
 */
public class myeditor extends AbstractCellEditor implements TableCellEditor, ActionListener  {

    Boolean currentValue;
    JButton button;
    protected static final String EDIT = "edit";
    private JTable jTable1;
    public static long idVenta;

    public myeditor(JTable jTable1) {
        button = new JButton();
        button.setActionCommand(EDIT);
        button.addActionListener(this);
        button.setBorderPainted(false);
        this.jTable1 = jTable1;
    }

    public void actionPerformed(ActionEvent e) {
        // mymodel t = (mymodel) jTable1.getModel();
        // t.addNewRecord();
        fireEditingStopped();
        if (jTable1.getSelectedRow() != -1) {
       /*     
      try {
        pedidoElementos pe = new pedidoElementos().buscar((Object) (jTable1.getValueAt(jTable1.getSelectedRow(),3)));
         expediente=pe.getIdexpediente();
         verElementos vent = new verElementos(null, true);
         vent.setVisible(true);
   
      } catch (SQLException ex) {
        Logger.getLogger(myeditor.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
        Logger.getLogger(myeditor.class.getName()).log(Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
        Logger.getLogger(myeditor.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
        Logger.getLogger(myeditor.class.getName()).log(Level.SEVERE, null, ex);
      }
     */
   }
   
  }
    
    

    //Implement the one CellEditor method that AbstractCellEditor doesn't.
    public Object getCellEditorValue() {
        return currentValue;
    }

    //Implement the one method defined by TableCellEditor.
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        // Va a mostrar el botón solo en la última fila.
        // de otra forma muestra un espacio en blanco.
       // if (row == table.getModel().getRowCount() - 1 ) {

            currentValue = (Boolean) value;
            return button;
        //}
        //return new JLabel();
    }


}
