/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facade;
import Controladores.StocktempJpaController;
import Entidades.Stocktemp;
import com.mysql.jdbc.Statement;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author Pablo
 */
public class FacadeMigracion {
     Connection conexion;
      Statement st;
    public FacadeMigracion() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
             conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pintureria","root","123");
             st = (Statement) conexion.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacadeMigracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public List<Stocktemp> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT s FROM Stocktemp s");
        return quTc.getResultList();
    }
    

  public void crearTabla(){
      Statement sentencia = null;
      Connection coneccionini = null;
      int controlTermino=0; // variable q sirve para avisar que ya termino el procesos de migracion
      String rutaMySql = "C:\\xampp\\mysql\\bin\\mysql.exe";
      String bd="salud";
      String password="123";
      String login="root";
      //String nombrebackup=String.valueOf(archivo.getName());
     if (conexion!=null){
          
      try{
          
          coneccionini = DriverManager.getConnection("jdbc:mysql://localhost:3306/pintureria","root","123");
          //sentencia = st;
         //String comsSQLborra = "DROP DATABASE " + bd;
         // sentencia.executeUpdate(comsSQLborra);
          coneccionini =conexion;
          sentencia = st;
         // String comsSQL = "CREATE DATABASE "+bd;
          //sentencia.executeUpdate(comsSQL);
          
          //Crear Tabla para migrar
          final String stock_csv = "create table stock_csv ( "
          + " codigo VARCHAR(50), descripcion VARCHAR(200))";
          sentencia.executeUpdate(stock_csv);
          
          try{
//              String cad = "\"" + rutaMySql + "\" --password=" + password + " --user=" + login + " " + bd + " < \"" + rutaFile +"\"\n";
//              
//              
//              File fcopi = new File("copia_seguridad.bat");
//              FileWriter fw = new FileWriter(fcopi);
//              fw.write(cad, 0, cad.length());
//              fw.close();
//              Process child =Runtime.getRuntime().exec("copia_Seguridad.bat");
//              child.waitFor();
          }catch(Exception ex){
              ex.printStackTrace();
          }
      }catch(SQLException ex){
              Logger.getLogger(FacadeMigracion.class.getName()).log(Level.SEVERE, null, ex);
         }
      }
    }   
  public void importarExcel(File fichero){
   try{
            EntityManagerFactory emf=Persistence.createEntityManagerFactory("pintureriaPU");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pintureria","root","123");
            con.setAutoCommit(false);
            PreparedStatement pstm = null ;
            //FileInputStream input = new FileInputStream("D://file.xls");
            FileInputStream input = new FileInputStream(fichero);
            POIFSFileSystem fs = new POIFSFileSystem( input );
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            HSSFSheet sheet = wb.getSheetAt(0);
            Row row;
            for(int i=1; i<=sheet.getLastRowNum(); i++){
                
                row = sheet.getRow(i);
                if(row.getCell(0)!=null || row.getCell(1)!=null){
                //int id = i;
                    
                double codigo = row.getCell(0).getNumericCellValue();
                String descripcion = row.getCell(1).getStringCellValue();
                Stocktemp registro=new Stocktemp();
                registro.setCodigo(codigo);
                registro.setDescripcion(descripcion);
                StocktempJpaController stc=new StocktempJpaController(emf);
                stc.create(registro);
                //String sql = "INSERT INTO stock_csv VALUES('"+codigo+"','"+descripcion+"')";
                //pstm = (PreparedStatement) con.prepareStatement(sql);
                //pstm.execute();
                System.out.println("Import rows "+i+" "+codigo+" "+descripcion);
                }
            }
            con.commit();
            pstm.close();
            con.close();
            input.close();
            System.out.println("Success import excel to mysql table");
        }catch(ClassNotFoundException e){
            //System.out.println(e);
        }catch(SQLException ex){
            //System.out.println(ex);
        }catch(IOException ioe){
            //System.out.println(ioe);
        }

    }
   public void importData(File file)
    {   
        Statement stmt;
        String query;
        String ruta="C:\\"+file.getName();
        try
        {
            stmt = (Statement) conexion.createStatement(
            ResultSet.TYPE_SCROLL_SENSITIVE,
            ResultSet.CONCUR_UPDATABLE);
 
            query = "LOAD DATA LOCAL INFILE '"+file.getAbsolutePath()+
    "' INTO TABLE stock_csv (codigo,descripcion,cantidad,costo);";
 
            stmt.executeUpdate(query);
                 
        }
        catch(Exception e)
        {
            e.printStackTrace();
            stmt = null;
        }
    }
   
   public void ImportarExel() {

        List cellDataList = new ArrayList();
        try {
            /**
             * Create a new instance for FileInputStream class
             */
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(chooser);
            File selectedFile = chooser.getSelectedFile();
            FileInputStream fileInputStream = new FileInputStream(selectedFile);
            /**
             * Create a new instance for POIFSFileSystem class
             */
            JOptionPane.showMessageDialog(null, "ruta " + selectedFile);
            POIFSFileSystem fsFileSystem = new POIFSFileSystem(fileInputStream);
            /*
             * Create a new instance for HSSFWorkBook Class
             */

            HSSFWorkbook workBook = new HSSFWorkbook(fsFileSystem);
            HSSFSheet hssfSheet = workBook.getSheetAt(0);
            /**
             * Iterate the rows and cells of the spreadsheet to get all the
             * datas.
             */
            Iterator rowIterator = hssfSheet.rowIterator();
            while (rowIterator.hasNext()) {
                HSSFRow hssfRow = (HSSFRow) rowIterator.next();
                Iterator iterator = hssfRow.cellIterator();
                List cellTempList = new ArrayList();
                while (iterator.hasNext()) {
                    HSSFCell hssfCell = (HSSFCell) iterator.next();
                    cellTempList.add(hssfCell);
                }
                cellDataList.add(cellTempList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        /**
         * Call the printToConsole method to print the cell data in the console.
         */
        //printToConsole(cellDataList);
    }

    public void borrarTabla(){
         try {
             String tabla="stocktemp";
             Statement sentencia = null;
             Connection coneccionini = null;
             coneccionini = DriverManager.getConnection("jdbc:mysql://localhost:3306/pintureria","root","123");
             sentencia = st;
             String comsSQLborra = "DROP TABLE " + tabla;
             sentencia.executeUpdate(comsSQLborra);
         } catch (SQLException ex) {
             Logger.getLogger(FacadeMigracion.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
}
