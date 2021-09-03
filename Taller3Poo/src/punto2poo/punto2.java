/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2poo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Fabian
 */
public class punto2 {
    
static void customers (){
    int limitpermitido=500000;
    Scanner empty = new Scanner (System.in);
    System.out.println("ingrese el monto a inicios de mes: ");
    int saldoinicial= empty.nextInt();
    System.out.println("ingrese el abono total en el mes");
    int abonomes = empty.nextInt(); 

    saldoinicial+=abonomes;
    saldoinicial=saldoinicial/70*100;
    
    if(saldoinicial>limitpermitido){
        System.out.println("credito aprobado");
    
    }else{
        System.out.println("credito denegado");
    }
}
    
static void investiga(){
    int perso=0;
    do{
        perso =Byte.parseByte(JOptionPane.showInputDialog(
            "Bienvenido querido cliente...\n"
            +"1. Daniel \n"
            +"2. Rodrigo \n"
            +"3. Jose \n"
            +"4. exit\n"));
        switch(perso){
            case 1:
                JOptionPane.showMessageDialog(null, "continue");
                customers ();
                break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "continue");
                        customers ();
                        break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "continue");
                                customers ();
                                break;
                                    case 4:
                                            perso=4;
                                                    JOptionPane.showMessageDialog(null, " Gracias! Vuelva pronto ");
                                                    break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null, "opcion incorrecta");
                                                            break;
        }

    }while(perso!=4);
    
}
   
    
    
    public static void main(String[] args) {
      investiga();  
    }
}