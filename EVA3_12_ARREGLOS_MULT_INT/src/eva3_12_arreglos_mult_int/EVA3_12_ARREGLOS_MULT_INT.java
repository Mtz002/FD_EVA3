/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12_arreglos_mult_int;

/**
 *
 * @author Usuario
 */
public class EVA3_12_ARREGLOS_MULT_INT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dias []={"Domigo","Domigo","Domigo", "Domigo", "Domigo", "Domigo", "Domigo"};
        int califas [][]={{50,100,75,30},{80,66,22,10}};
        for (int i = 0; i < dias.length; i++) {
            System.out.print("["+ dias[i]+"]");
            
        }
        System.out.println("");
        for (int i = 0; i < califas.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("["+ califas[i][j]+"]");
            }
            System.out.println();
        }
    }
    
}
