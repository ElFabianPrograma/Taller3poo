/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto11poo;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Luis Fabian
 */
public class punto11 {
    
static void inverted(){
      JTextArea salida = new JTextArea();
 int run=0,div,inv=0;
       run= Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
       int numero []=new int [run];
       while(run>0){
            
        
           div=run%10;
           
           inv=inv*10+div;
           
           run/=10; 
           
          
        }
       
        
            salida.append("El numero invertido es: "+inv);
            
           JOptionPane.showMessageDialog(null, salida);
                      
          finaly();
    } 
 
 static void finaly(){
        
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?","",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); //0=si, 1=no
        
        switch (opcion) {
            case 0:
                inverted();
                break;
            case 1:
                System.exit(0);
                break;
            default:
                break;
        }
    }
 
 
   
    public static void main(String[] args) {
        inverted();
        
    
    }

}