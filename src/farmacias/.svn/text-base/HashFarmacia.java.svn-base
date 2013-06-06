/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacias;

import Interfaces.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author PadawanSistemas
 */
public class HashFarmacia {

    
    //Funcion que elimina un elemento del HashMap
    public static void eliminarElementoHashMap(HashMap<String ,Farmacia> mapafarmacia)
    {
     String eliminar=JOptionPane.showInputDialog(null,"Ingrese la clave a eliminar");
     if(mapafarmacia.containsKey(eliminar))
         {
         int confirmar=JOptionPane.showConfirmDialog(null,"Esta seguro que desea eliminar la clave "+eliminar);    
         if(confirmar==0)
         {
         mapafarmacia.remove(eliminar);    
         JOptionPane.showMessageDialog(null,"Se ELIMINO la clave "+eliminar);
         }
         else
         JOptionPane.showMessageDialog(null,"No se elimino la clave");
         }
     else
         JOptionPane.showMessageDialog(null,"No se encontro la clave "+eliminar);
         //Si confirmar es SI entonces devuelve 0
         //Si confirmar es NO entonces devuelve 1
     }
    
    //Funcion que asigna informacion leida de un Archivo de Texto a un HashMap
    //para su posterior manipulacion
    public static void asignarHashTexto(HashMap<String ,Farmacia> mapafarmacia) {
    
    String clave,nombre,proveedor,caducidad,unidades;
    double precio,impuesto;
    Integer existencia ,maximo,minimo;
     try{
     
     Scanner r=new Scanner(new File("Farmacia.txt"));
     while(r!=null)
     {    
     
     clave=r.nextLine();
     nombre=r.nextLine();
     precio=Double.parseDouble(r.nextLine());
     impuesto=Double.parseDouble(r.nextLine());
     existencia=Integer.parseInt(r.nextLine());
     minimo=Integer.parseInt(r.nextLine());
     maximo=Integer.parseInt(r.nextLine());
     proveedor=r.nextLine();
    // JOptionPane.showMessageDialog(null,proveedor);
     unidades=r.nextLine();
     caducidad=r.nextLine();
     
     
     mapafarmacia.put(clave,new Farmacia(nombre,precio,impuesto,
     existencia,minimo,maximo,proveedor,unidades,caducidad));    
     
     //JOptionPane.showMessageDialog(null,"Se agrego la clave "+clave+" con exito" );  
     }
     }  
    catch(Exception e)
    {
    //JOptionPane.showMessageDialog(null,"error en HashTexto "+e.toString());
    }
    }
       //Este metodo envia la informacion almacenada en un HashMap a un
       //archivo de texto.
       public static void asignarTextoHash(HashMap<String ,Farmacia> mapafarmacia)
       {
       try{
           FileWriter fr=new FileWriter("Farmacia.txt");
           
           String msj;
           String mandril;
           
           for (Map.Entry<String,Farmacia> elemento : mapafarmacia.entrySet() ) {
           msj="";
           
           
           Farmacia aux=(Farmacia)mapafarmacia.get(elemento.getKey());
           msj=elemento.getKey()+"\n"+aux.getNombre()+"\n"+
           aux.getPrecio()+"\n"+aux.getImpuesto()+"\n"+aux.getExistencia()+"\n"+
           aux.getMinimo()+"\n"+aux.getMaximo()+"\n"+aux.getProveedor()+"\n"+
           aux.getUnidades()+"\n"+aux.getCaducidad()+"\n";
          // JOptionPane.showMessageDialog(null,aux.getProveedor());
           fr.write(msj);
          //JOptionPane.showMessageDialog(null,"Informacion escrita correctamente \n" +msj);
           } 
           fr.close();
           
       }catch(Exception e){
         //  JOptionPane.showMessageDialog(null,"error en TextoHash "+e.toString());
       }
       
       
   }
  
   public static String textoClavesOrdenadas(HashMap<String ,Farmacia> mapafarmacia){
 
    String  clave;
    
     String msj="";
     try{
     
     Scanner r=new Scanner(new File("Final.txt"));
     //FileWriter fr=new FileWriter("Farmacia2.txt");
     
     while(r!=null)
     {    
     
     clave=r.nextLine();
     //Aqui hize un cambio
     //JOptionPane.showMessageDialog(null,clave);
     Farmacia aux=(Farmacia)mapafarmacia.get(clave);
     
     msj= msj+ clave+"\n"+aux.getNombre()+"\n"+aux.getPrecio()+"\n"+
           aux.getImpuesto()+"\n"+aux.getUnidades()+"\n"+
           aux.getProveedor()+"\n"+aux.getCaducidad()+"\n";
           
     }
     //JOptionPane.showMessageDialog(null, msj);    
     JOptionPane.showMessageDialog(null, msj);
     return msj;
     
  }  
    catch(Exception e)
    {
        //JOptionPane.showMessageDialog(null,"Error en la escritura tCO "+e.toString());           
    }
     return msj;
    }
   
   public static  void asignarOrdenado(String ordenacion)
   {
       try {
           FileWriter fr=new FileWriter("Farmacia2.txt");
           fr.write(ordenacion);
           fr.close();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Error en la escritura asignarOrdenado "+e.toString());
       }
   }
   
   public static void ordenarClaves(HashMap<String ,Farmacia> mapafarmacia)
   {
       
    final Table gui=new Table(mapafarmacia); 
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setSize(650,220);
    gui.setLocationRelativeTo(null);
    gui.setVisible(true);
    gui.setTitle("Productos Ordenados");
    ImageIcon imag = new ImageIcon("./src/Interfaces/ok.png");
    gui.ok = new JLabel(imag);
    gui.add(gui.ok);
    
    gui.ok.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) { 
              Principal menu = new Principal();
              menu.setLocationRelativeTo(null);
              menu.setVisible(true);
              gui.dispose();
              
            }
        });
    
    
    }        
   
        
       
}
