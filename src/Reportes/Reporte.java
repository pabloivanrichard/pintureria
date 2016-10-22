/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Reportes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Pablo
 */
public class Reporte {
     Connection conexion;
    JasperReport masterReport=null;
    //private final String logotipo="C:\\Users\\Daniel\\Documents\\NetBeansProjects\\Cabañas\\src\\Reportes\\vallehermoso_opt";
     private final String logotipo="/Reportes/vallehermoso_opt.jpg";
    
     public void ejecutarReportexNro_fac(long nr) throws JRException, InstantiationException, IllegalAccessException{
         try {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             try {
                 conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pintureria", "root" , "123");
             } catch (SQLException ex) {
                 Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
             }
             String Archivo = "C:\\pintureria\\src\\Reportes\\Factura.jasper";
             //String Archivo = "C:\\Users\\Pablo\\Desktop\\pintureria\\src\\Reportes\\Factura.jasper";
             masterReport = (JasperReport) JRLoader.loadObject(Archivo);
            
            Map parametro=new HashMap();
            parametro.put("idfactura", nr);
            //parametro.put("logo",this.getClass().getResourceAsStream(logotipo) );
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport,parametro, conexion);
              /* JRExporter exporter = new JRPdfExporter();

              exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
              exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("reportePDF.pdf"));
              exporter.exportReport();
      */
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setVisible(true);
           // jviewer.viewReport(jasperPrint);
             try {
                 conexion.close();
             } catch (SQLException ex) {
                 Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
             }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
     public void ejecutarReporteCaja(Date fec,Date fec1, String desc) throws InstantiationException, IllegalAccessException, JRException{
         try {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             try {
                 conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pintureria", "root" , "123");
             } catch (SQLException ex) {
                 Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
             }
             String Archivo = "C:\\pintureria\\src\\Reportes\\ReporteCaja.jasper";
             //String Archivo = "C:\\Users\\Pablo\\Desktop\\pintureria\\src\\Reportes\\Factura.jasper";
             masterReport = (JasperReport) JRLoader.loadObject(Archivo);
            
            Map parametro=new HashMap();
            parametro.put("fec", fec);
            parametro.put("fec1", fec1);
            parametro.put("desc", desc);
            //parametro.put("logo",this.getClass().getResourceAsStream(logotipo) );
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport,parametro, conexion);
              /* JRExporter exporter = new JRPdfExporter();

              exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
              exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("reportePDF.pdf"));
              exporter.exportReport();
      */
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setVisible(true);
           // jviewer.viewReport(jasperPrint);
             try {
                 conexion.close();
             } catch (SQLException ex) {
                 Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
             }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
    public void ejecutarReporteCajaAll(Date fec,Date fec1) throws InstantiationException, IllegalAccessException, JRException{
         try {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             try {
                 conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pintureria", "root" , "123");
             } catch (SQLException ex) {
                 Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
             }
             String Archivo = "C:\\pintureria\\src\\Reportes\\ReporteCajaAll.jasper";
             //String Archivo = "C:\\Users\\Pablo\\Desktop\\pintureria\\src\\Reportes\\Factura.jasper";
             masterReport = (JasperReport) JRLoader.loadObject(Archivo);
            
            Map parametro=new HashMap();
            parametro.put("fec", fec);
            parametro.put("fec1", fec1);
            //parametro.put("logo",this.getClass().getResourceAsStream(logotipo) );
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport,parametro, conexion);
              /* JRExporter exporter = new JRPdfExporter();

              exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
              exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("reportePDF.pdf"));
              exporter.exportReport();
      */
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setVisible(true);
           // jviewer.viewReport(jasperPrint);
             try {
                 conexion.close();
             } catch (SQLException ex) {
                 Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
             }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
     public void ejecutarReporteCodBarraProducto(long id) throws JRException, InstantiationException, IllegalAccessException{
         try {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             try {
                 conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pintureria", "root" , "123");
             } catch (SQLException ex) {
                 Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
             }
             String Archivo = "C:\\pintureria\\src\\Reportes\\codigoProducto.jasper";
            // String Archivo = "/Reportes/reportcabania.jasper";
            masterReport = (JasperReport) JRLoader.loadObject(Archivo);
            
            Map parametro=new HashMap();
            parametro.put("idprod", id);
            //parametro.put("clave", afil.getClave_Numero());
            
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport,parametro, conexion);
              /* JRExporter exporter = new JRPdfExporter();

              exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
              exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("reportePDF.pdf"));
              exporter.exportReport();
      */
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setVisible(true);
           // jviewer.viewReport(jasperPrint);
             try {
                 conexion.close();
             } catch (SQLException ex) {
                 Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
             }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
     public void ejecutarReporteCocina(long nr) throws JRException, InstantiationException, IllegalAccessException{
         try {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             try {
                 conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pintureria", "root" , "123");
             } catch (SQLException ex) {
                 Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
             }
             String Archivo = "C:\\pintureria\\src\\Reportes\\ticket.jasper";
             //String Archivo = "C:\\Users\\Pablo\\Desktop\\pintureria\\src\\Reportes\\Factura.jasper";
             masterReport = (JasperReport) JRLoader.loadObject(Archivo);
            
            Map parametro=new HashMap();
            parametro.put("idticket", nr);
            //parametro.put("logo",this.getClass().getResourceAsStream(logotipo) );
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport,parametro, conexion);
              /* JRExporter exporter = new JRPdfExporter();

              exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
              exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("reportePDF.pdf"));
              exporter.exportReport();
      */
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setVisible(true);
           // jviewer.viewReport(jasperPrint);
             try {
                 conexion.close();
             } catch (SQLException ex) {
                 Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
             }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
}
