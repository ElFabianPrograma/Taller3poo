/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1poo;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Luis Fabian
 */
public class punto1 {
    
    static int[] A;
    static int[] B;
    static int [] C;
    JTextArea salida = new JTextArea();
    
        public static void main(String[] args) {
        JTextArea salida = new JTextArea();
        int cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos: "));
        
        A=new int[cant];
        B=new int[cant];
        C=new int[cant];
        
        for (int i = 0; i <A.length; i++) {
            A[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresar código del producto: "));
            
            B[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresar el valor de venta del producto: "));
            
            C[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de unidades vendidas del producto: "));           
    }
            
        salida.setText ("Código\tValor\tcantidad\n\n");
        for (int i = 0; i <A.length; i++) {
         salida.append(A[i]+"\t" +B[i]+"\t"+C[i]+"\n\n");
        }
        JOptionPane.showMessageDialog( null,salida);
        prodvendidos(C);
        ingreventas(B);
        prodmasvendido(A,C);
        prodmascostoso(A,B);
        
}
    
    static void prodvendidos(int C[]){
        
        int suma =0;
        for (int i=0; i<C.length; i++){
            suma= suma + C[i];
        } 
        JOptionPane.showMessageDialog(null,"Total de productos vendidos por dia: "+suma);
        
    }
    
    static void ingreventas(int B[]){
        
        int suma =0;
        for (int i=0; i<B.length; i++){
            suma= suma + B[i];
        }    
        JOptionPane.showMessageDialog(null,"Total de ingreso de dia: "+suma);
        
        
    }
    
    static void prodmasvendido (int A[], int C[]){
        
        int promasvendido = C[0];
        for (int i=0; i<C.length; i++){
            if (C[i] > promasvendido)
                promasvendido=A[i];
        }
        JOptionPane.showMessageDialog(null,"El producto más vendido fue el código: "+promasvendido);
        
        
    }
    
    static void prodmascostoso (int A[], int B[]){
        int mayorcostoso = B[0];
        for (int i=0; i<B.length; i++){
            if (B[i] > mayorcostoso)
                mayorcostoso=A[i];
        }
        
        JOptionPane.showMessageDialog(null,"El producto más costoso vendido fue el código: "+mayorcostoso);
    
    }
    
}