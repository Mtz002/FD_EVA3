/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_arreglos;

import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class EVA3_2_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[],x,y;// solo arrerglo es un arreglo
        arreglo = new int[10];//ARREGLO CON 10 INT
        //arreglo[10]=100; EMPEZAmo de 0 a n-1 (10-1= 9) de 0 a 9
        for (int i = 0; i< 10; i++) {
           arreglo[i] =  (int) (Math.random()* 100); //casting  --> compatibles
            
            
        }
        for (int i = 0; i< 10; i++){
            System.out.print(arreglo[i] + "-");
        }
    }
    
}
