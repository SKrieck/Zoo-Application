/*
 * Suzanne Krieck
 * Foundation in App Development IT-145
 * Final Project - Main
 */
package monitoring.system;

import java.util.Scanner;
import java.io.IOException;

public class MonitoringSystem {
    
    public static void main(String[] args) throws IOException {
        // Variables for animals file
        String animal = "";
        String name = "";
        int age = 0;
        String health = "";
        String feeding = "";
        // Variables for habitats file
        String habitat = "";
        String temperature = "";
        String food = "";
        String clean = "";
        // Variable for main menu selection
        int selection = 0;
        // Variable for file management
        FileManagement file = new FileManagement();
        // Variable for menus
        Menus menu = new Menus();
        // Variable for scanner
        Scanner scanner = new Scanner(System.in);
        // Variables for animalsMenu select and habitatsMenu select
        int animalsSelect = 0;
        int habitatsSelect = 0;
        
        while(selection != 3){
            menu.mainMenu();
            selection = scanner.nextInt();
            
            // Checks if the selection is between and including 1 and 3
            if(selection >= 1 && selection <= 3){
                // If the selection is correct, display proper menu options
                switch(selection) {
                    // Menu for animals
                    case 1: menu.animalsMenu();
                            file.animalsInfoFile();
                            break;
                    // Menu for habitats
                    case 2: menu.habitatsMenu();
                            habitatsSelect = scanner.nextInt();
                            break;
                    case 3: System.out.println("Logging you out...");
                            break;
                }
            }
            else {
                System.out.println("");
                System.out.println("That number is not a selection.");
                System.out.println("");
            } // End if/else condition                 
        } // End while loop
    } // End main  
}
