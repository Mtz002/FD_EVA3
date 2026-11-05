/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_menu2_;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_MENU2_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           String[] opciones = {"ventas", "clientes", "proveedores", "salir"};
        
        System.out.println("-------- Menu ----------");
        
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i + 1) + " - " + opciones[i]);
        }
        
        Scanner captu = new Scanner(System.in);
        System.out.print("\nSelecciona una opcion: ");
        int seleccion = captu.nextInt();
        
        System.out.println("Has seleccionado la opcion: " + seleccion);
    }
    
}
