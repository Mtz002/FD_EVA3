/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_4_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String[] menuProductos = {
            "Hamburguesa HMM", 
            "Papas FRITAS", 
            "Pizza Pepperoni", 
            "Tacos al Pastor (orden)", 
            "Alitas BBQ", 
            "Refresco de Cola", 
            "Agua Fresca de Horchata", 
            "Ensalada Cesar", 
            "Pastel de Chocolate", 
            "Helado de Vainilla"
        };
        
        double[] precios = {
            95.50, 
            45.00, 
            140.00, 
            80.50, 
            110.00, 
            25.00, 
            30.00, 
            75.50, 
            50.00, 
            35.00
        };
        
        
        System.out.println("========================================");
        System.out.println("        MENU DEL RESTAURANTE            ");
        System.out.println("========================================");
        
        for (int i = 0; i < menuProductos.length; i++) {
            System.out.printf("%d. %-25s $%.2f\n", (i + 1), menuProductos[i], precios[i]);
        }
        
        System.out.println("========================================");
            
        }
}
//EVA_7_RESTAURANTE
//IMPRIMIR EL MENU DE UN RESTAURANTE; 10 PRODUCTOS; CADA UNO CON SU PRECIO(CON DECIMAL)
