/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_.prac;

/**
 *
 * @author Usuario
 */
public class EVA3_11_PRAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cube [][][] = new int [2][3][4];
        
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length ; k++) {
                    cube[i][j][k]= (int)(Math.random()*100);
                }
            }
            
        }
        for (int i = 0; i < cube.length; i++) {
        System.out.println("Capa " + (i + 1) + ":");
        for (int j = 0; j < cube[i].length; j++) {
        for (int k = 0; k < cube[i][j].length; k++) {
        System.out.print("[" + cube[i][j][k] + "] ");
         }
        System.out.println();
    }
    System.out.println(); 
    }
    
    }
}
