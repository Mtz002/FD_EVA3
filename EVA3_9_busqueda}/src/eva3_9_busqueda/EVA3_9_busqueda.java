/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_busqueda;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_9_busqueda {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu= new Scanner (System.in);
        int valor;
        int[] valores= new int [10];
        for (int i = 0; i < valores.length; i++) {
            valores[i]= (int)(Math.random() * 100);
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.print("[" + valores[i] + "]");
            
        }
        do{
            System.out.println ("INTRODUCE EL VALOR A BUSCAR EN EL ARREGLO: ");
            valor= captu.nextInt();
            captu.nextLine();
            //buscar
            //recorrer todos los valores del arreglo
            for (int i = 0; i < valores.length; i++) {
                if (valor == valores[i]){
                    
                    System.out.println ("ENCONTRAR EL VALOR:  ESTA ENLA POSICION: "+ i);    
                }
                
            }
            
        }while(true);
    }
}     
    
    

