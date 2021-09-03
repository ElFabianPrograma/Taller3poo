/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5poo;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Luis Fabian
 */
public class punto5 {
    
public static void main(String[] args) {
        
        JTextArea salida = new JTextArea();
        salida.setText("Comuna\tCandidato A\t Candidato B\t Candidato C\t Candidato D\t\n");
        
                
        
        int fl=5;
        int cm=4;
        
        int fl_contcandidatoA=0;
        int fl_contcandidatoB=0;
        int fl_contcandidatoC=0;
        int fl_contcandidatoD=0;
        
        int cm_comuna1=0;
        int cm_comuna2=0;
        int cm_comuna3=0;
        int cm_comuna4=0;
        int cm_comuna5=0;
                
        
        int [][]pr= new int[fl][cm];
        
        pr[0][0]=194;
        pr[0][1]=48;
        pr[0][2]=206;
        pr[0][3]=45;
        
        
        pr[1][0]=180;
        pr[1][1]=20;
        pr[1][2]=320;
        pr[1][3]=16;
        
        
        pr[2][0]=221;
        pr[2][1]=90;
        pr[2][2]=140;
        pr[2][3]=20;
     
     
        pr[3][0]=432;
        pr[3][1]=50;
        pr[3][2]=821;
        pr[3][3]=14;
        
        
        pr[4][0]=820;
        pr[4][1]=61;
        pr[4][2]=947;
        pr[4][3]=18;
        
        int a=1;
        for (int i = 0; i< fl; i++) {
            salida.append(""+a+"\t");
            for (int j = 0; j <cm; j++) {
                salida.append(""+pr[i][j]+"\t");
            }
                salida.append("\n");
                a=a+1;
        }
        
        for (int i = 0; i <fl; i++) {
            
            for (int j = 0; j <cm; j++) {
                if (j==0) {
                    fl_contcandidatoA=fl_contcandidatoA+pr[i][j];
                }else{} 
                    if (j==1) {
                        fl_contcandidatoB=fl_contcandidatoB+pr[i][j];
                    }else{}
                        if (j==2) {
                            fl_contcandidatoC=fl_contcandidatoC+pr[i][j];
                        }else{}
                            if (j==3) {
                                fl_contcandidatoD=fl_contcandidatoD+pr[i][j];
                            }           
            }
          
        }
        for (int j = 0; j <cm; j++) {
                
             for (int i = 0; i <fl; i++) {
                if (i==0) {
                    cm_comuna1=cm_comuna1+pr[i][j];
                }else{} 
                    if (i==1) {
                        cm_comuna2=cm_comuna2+pr[i][j];
                    }else{}
                        if (i==2) {
                            cm_comuna3=cm_comuna3+pr[i][j];
                        }else{}
                            if (i==3) {
                                cm_comuna4=cm_comuna4+pr[i][j];
                            }else{}
                              if(i==4){
                                 cm_comuna5=cm_comuna5+pr[i][j];
                              }
            }
          
        }
        
            
         
        
        float fl_total_votos=fl_contcandidatoA+fl_contcandidatoB+fl_contcandidatoC+fl_contcandidatoD;
        
        float porcencandidatoA=(fl_contcandidatoA*100)/fl_total_votos;
        float porcencandidatoB=(fl_contcandidatoB*100)/fl_total_votos;
        float porcencandidatoC=(fl_contcandidatoC*100)/fl_total_votos;
        float porcencandidatoD=(fl_contcandidatoD*100)/fl_total_votos;
        
        float cm_total_votos=cm_comuna1+cm_comuna2+cm_comuna3+cm_comuna4+cm_comuna5;
        
        float porcencomuna1=(cm_comuna1*100)/cm_total_votos;
        float porcencomuna2=(cm_comuna2*100)/cm_total_votos;
        float porcencomuna3=(cm_comuna3*100)/cm_total_votos;
        float porcencomuna4=(cm_comuna4*100)/cm_total_votos;
        float porcencomuna5=(cm_comuna5*100)/cm_total_votos;
        
        salida.append("----------------------------------------------------------------------------------------------------------------\n");
        salida.append("\n");
        salida.append("VOTOS POR CONDIDATOS");
        salida.append("\n");
        salida.append("\n");
        
        salida.append("El candidato A obtuvo un total de: "+fl_contcandidatoA+" votos, con un porcentaje del "+porcencandidatoA+"%\n");
        salida.append("El candidato B obtuvo un total de: "+fl_contcandidatoB+" votos, con un porcentaje del "+porcencandidatoB+"%\n");
        salida.append("El candidato C obtuvo un total de: "+fl_contcandidatoC+" votos, con un porcentaje del "+porcencandidatoC+"%\n");
        salida.append("El candidato D obtuvo un total de: "+fl_contcandidatoD+" votos, con un porcentaje del "+porcencandidatoD+"%\n");
        
        salida.append("----------------------------------------------------------------------------------------------------------------\n");
        salida.append("\nEL CANDIDATO CON MAS VOTOS FUE\n");
        
        
        if(fl_contcandidatoA>fl_contcandidatoB && fl_contcandidatoA>fl_contcandidatoC && fl_contcandidatoA>fl_contcandidatoD ) {            
            salida.append("\nEl canditato A es el que conto con mas votos, con un toltal de :"+fl_contcandidatoA+" votos\n");            
         }else{
        if(fl_contcandidatoB>fl_contcandidatoA && fl_contcandidatoB>fl_contcandidatoC && fl_contcandidatoC>fl_contcandidatoD ){
            salida.append("\nEl candidato B es el que conto con mas votos, con un total de :"+fl_contcandidatoB+" votos\n");
         }else{
        if(fl_contcandidatoC>fl_contcandidatoB && fl_contcandidatoC>fl_contcandidatoA && fl_contcandidatoC>fl_contcandidatoD ){
           salida.append("\nEl candidato C es el que conto con mas votos, con un total de :"+fl_contcandidatoC+" votos\n");
        }else{
        if(fl_contcandidatoD>fl_contcandidatoB && fl_contcandidatoD>fl_contcandidatoA && fl_contcandidatoD>fl_contcandidatoA ){
           salida.append("\nEl candidato D es el que conto con mas votos, con un total de :"+fl_contcandidatoD+" votos\n");
                 }
              }
           }
        }
        
        if(porcencandidatoA>50){
            salida.append("\nEl candidato A es el GANADOR ABSOLUTO con mas del 50% de valoracion \nRESULTADO :"+porcencandidatoA+"%\n" );
        }else{
        if(porcencandidatoB>50){
            salida.append("\nEl candidato B es el GANADOR ABSOLUTO con mas del 50% de valoracion \nRESULTADO :"+porcencandidatoB+"%\n" );
        }else{
        if(porcencandidatoC>50){
            salida.append("\nEl candidato C es el GANADOR ABSOLUTO con mas del 50% de valoracion \nRESULTADO :"+porcencandidatoC+"%\n" );
        }else{
        if(porcencandidatoD>50){
            salida.append("\nEl candidato D es el GANADOR ABSOLUTO con mas del 50% de valoracion \nRESULTADO :"+porcencandidatoD+"%\n" );            
        }else{
            salida.append("\nNO HAY GANADOR ABSOLUTO\n" );
        }
        }
        }
        }
        salida.append("----------------------------------------------------------------------------------------------------------------");
        salida.append("\n");
        salida.append("VOTOS POR COMUNAS");
        salida.append("\n");
        salida.append("\n");
        
        salida.append("La comuna 1 obtuvo un total de: "+cm_comuna1+" votos, con un porcentaje del: "+porcencomuna1+"%\n");
        salida.append("La comuna 2 obtuvo un total de: "+cm_comuna2+" votos, con un porcentaje del: "+porcencomuna2+"%\n");
        salida.append("La comuna 3 obtuvo un total de: "+cm_comuna3+" votos, con un porcentaje del: "+porcencomuna3+"%\n");
        salida.append("La comuna 4 obtuvo un total de: "+cm_comuna4+" votos, con un porcentaje del: "+porcencomuna4+"%\n");
        salida.append("La comuna 5 obtuvo un total de: "+cm_comuna5+" votos, con un porcentaje del: "+porcencomuna5+"%\n");
        
        if(porcencomuna1>porcencomuna2 && porcencomuna1>porcencomuna5 && porcencomuna1>porcencomuna4 && porcencomuna1>porcencomuna5) {            
            salida.append("\nLa COMUNA1 fue quien mas porcentaje tuvo, fue de :"+porcencomuna1+"% \n");
        }else{
           if(porcencomuna2>porcencomuna3 && porcencomuna2>porcencomuna5 && porcencomuna2>porcencomuna4 && porcencomuna2>porcencomuna1){             
            salida.append("\nLa COMUNA2 fue quien mas porcentaje tuvo, fue de :"+porcencomuna2+"% \n");
           }else{
              if(porcencomuna3>porcencomuna2 && porcencomuna3>porcencomuna5 && porcencomuna3>porcencomuna4 && porcencomuna3>porcencomuna1){             
               salida.append("\nLa COMUNA3 fue quien mas porcentaje tuvo, fue de :"+porcencomuna3+"% \n");
            }else{
              if(porcencomuna4>porcencomuna3 && porcencomuna4>porcencomuna5 && porcencomuna4>porcencomuna2 && porcencomuna4>porcencomuna1){             
                 salida.append("\nLa COMUNA4 fue quien mas porcentaje tuvo, fue de :"+porcencomuna4+"% \n");
        }else{
              if(porcencomuna5>porcencomuna3 && porcencomuna5>porcencomuna2 && porcencomuna5>porcencomuna4 && porcencomuna5>porcencomuna1)             
            salida.append("\nLa COMUNA5 fue quien mas porcentaje tuvo, fue de :"+porcencomuna5+"% \n");
              }
              
              salida.append("----------------------------------------------------------------------------------------------------------------");
       
              
              salida.append("\nLISTA DESCENDIENTE POR VALORACION DE VOTOS ALCANZADA\n");
              salida.append("\nEl CANDIDATO C TUVO UN RESULTADO DE: "+fl_contcandidatoA+" VOTOS");
              salida.append("\nEl CANDIDATO A TUVO UN RESULTADO DE: "+fl_contcandidatoB+" VOTOS");
              salida.append("\nEl CANDIDATO B TUVO UN RESULTADO DE: "+fl_contcandidatoC+" VOTOS");
              salida.append("\nEl CANDIDATO D TUVO UN RESULTADO DE: "+fl_contcandidatoD+" VOTOS");
              
       
              
              
        JOptionPane.showMessageDialog(null, salida);
        
          
    }}}}}
    
               