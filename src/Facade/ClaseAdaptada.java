/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author Daniel
 */
public class ClaseAdaptada extends JPanel {

public ClaseAdaptada() {
super();
}

@Override
public void paintComponent(Graphics g) {
Dimension tam = getSize();
ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/serviciotecnico.jpg"));
g.drawImage(imagen.getImage(), 0, 0, tam.width, tam.height, null);
setOpaque(false);
super.paintComponent(g);
}

}