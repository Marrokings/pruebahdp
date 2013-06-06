/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacias;


import Interfaces.Principal;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;



public class Table extends javax.swing.JFrame {
    JTable table;
    JLabel ok;
    
    
    public Table(HashMap<String ,Farmacia> mapafarmacia){
    setLayout(new FlowLayout());
    
    
    String[] columNames={"Clave","Producto","Precio","Impuesto","Presentacion","Proveedor","Caducidad"};
    
    Object[][] data=new Object[mapafarmacia.size()][8];
        try {
        Scanner a=new Scanner(new File("Farmacia2.txt"));
        for(int i=0;i<mapafarmacia.size();i++)
        {
        for(int j=0;j<7;j++)
        data[i][j]=a.nextLine();    
        
        }
        } catch (Exception e) {
        }
    
    
    
    table=new JTable(data,columNames);
    table.setPreferredScrollableViewportSize(new Dimension(600,100));
    table.setFillsViewportHeight(true);
    JScrollPane jsp=new JScrollPane(table);
    add(jsp);
    
    }
    
}
  
   
    // TODO add your handling code here:

 
     
             
    