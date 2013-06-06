/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacias;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class ArchivosBinarios {
private File f; 

public void crearArchivo(){
    try{
        f=new File("Binary.txt");
       }catch(Exception e){
        JOptionPane.showMessageDialog(null,"error en la c"
                + "reacion del archivo "+ e.toString());
       }
}

/*Escribe un archivo binario en formato UTF8
//para ser mandado al algoritmo de mezcla equilibrada
//recordar que el algoritmo unicamente trabaja con este tipo de formato.
//Ademas que solo se escribiran las claves en el archivo ya que es lo unico
//que se pide ordenar*/
public void escribirArchivo(HashMap<String ,Farmacia> mapafarmacia) {
try{
    FileOutputStream fos = new FileOutputStream("Binary.txt");
    DataOutputStream dos = new DataOutputStream(fos);
    
    for (Map.Entry<String,Farmacia> elemento : mapafarmacia.entrySet() ) {
           String aux=elemento.getKey();
           
           dos.writeUTF(aux);
          }dos.close();
}catch(Exception e){
    
}
    
 }
    
//Leemos unicamente las claves para enviarlas al algoritmo de 
public void leerClaves(){
        try {
		File fileDir = new File("Binary.txt");
 
		BufferedReader in = new BufferedReader(
		   new InputStreamReader(
                      new FileInputStream(fileDir), "UTF8"));
 
		String str;
 
		while ((str = in.readLine()) != null) {
		    System.out.println(str);
		}
 
                in.close();
	    } 
	    catch (UnsupportedEncodingException e) 
	    {
			System.out.println(e.getMessage());
	    } 
	    catch (IOException e) 
	    {
			System.out.println(e.getMessage());
	    }
	    catch (Exception e)
	    {
			System.out.println(e.getMessage());
	    }

}
   
//Recuperamos las claves ordenadas y las devolvemos en una variable string
public String recuperar(String nombreArchivo)throws Exception{
	String nombre = null;
        String msj="";
        DataInputStream dis = null;
        int index = 0;
        //DataOutputStream dos = null;
	try
        {
            dis = new DataInputStream( new FileInputStream(nombreArchivo));
            while (dis.available()!=0)
            {
                nombre = dis.readUTF();
                msj=msj+nombre+"\n";
                //Aqui hize un cambio
                //JOptionPane.showMessageDialog(null, msj=msj+nombre+"\n");
                //System.out.println(++index + ") "+nombre);
            }
	}
        catch (FileNotFoundException e){
            System.out.println("Error de Apertura-Lectura archivo: "+nombreArchivo);
	}
	catch (IOException e){
            System.out.println("Error de lectura archivo: "+nombreArchivo);
	}
        finally{
            if(dis != null){
                dis.close();
            }
        }
        
        //JOptionPane.showMessageDialog(null, msj);
        return msj;
    }
   
//Finalmente devolvemos el resultado obtenido, en el archivo de texto que 
//se llama "Final.txt" ahi encontraremos las claves ordenadas y en formato 
//de texto plano
   public  void conversionBinarioPlano(String msj)
   {
       try{
           FileWriter fr=new FileWriter("Final.txt");
           fr.write(msj);
          // JOptionPane.showMessageDialog(null,"Informacion escrita correctamente" +msj);
            
           fr.close();
           
       }catch(Exception e){
           e.toString();
       }
   }
}