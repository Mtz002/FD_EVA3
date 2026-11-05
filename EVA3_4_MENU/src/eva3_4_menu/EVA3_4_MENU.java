/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_menu;

/**
 *
 * @author Usuario
 */
public class EVA3_4_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String[] menu = {"tacos", "tortas", "tamales", "comida", "etc"};
        
        System.out.println("Cantidad de elementos del arreglo: " + menu.length);
     
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Elemento " + i + ": " + menu[i]);
        }
    }
    
}
