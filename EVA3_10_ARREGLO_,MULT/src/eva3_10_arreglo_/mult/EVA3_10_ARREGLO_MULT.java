/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_arreglo_.mult;

/**
 *
 * @author Usuario
 */
public class EVA3_10_ARREGLO_MULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int datos []= new int [10];
        //arreglo de dos dimensiones (matriz)
        int matriz[][] = new int [3][5];
        
        /*
        ejemplo de como queda
        [][][]
        [][][]
        [][][]
        */
        for (int i = 0; i < matriz.length; i++) {// este controla las filas
            for (int j = 0; j < matriz[i].length; j++) { // este controla columnas
             matriz[i][j] = (int) (Math.random()* 100);  
            }
            
        }
       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
              System.out.print("[" + matriz[i][j]+ "]" );
            
            }
            System.out.println();
       }
    }
    
}
