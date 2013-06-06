/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacias;

import MezclaEquilibrada.MezclaEquilibrada;

/**
 *
 * @author PadawanSistemas
 */
public class Mezcla {
 MezclaEquilibrada m1= new MezclaEquilibrada();
 //Creacion de un metodo que se ocupa de realizar al mezcla
 public void Mezcla()
 {
 try{
 m1.desplegar("Binary.txt");  
 m1.ordenar("Binary.txt");
 m1.desplegar("Binary.txt");
 }catch(Exception e)
 {
     
 }
 }         
}
