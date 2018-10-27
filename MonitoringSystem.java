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
        // Variable for main menu selection
        int selection = 0;
        // Variable for menus
        Menus menu = new Menus();
        // Variable for scanner
        Scanner scanner = new Scanner(System.in);
        
        // While the user doesn't select the quit number 3...
        while(selection != 3){
            // Call method main menu
            menu.mainMenu();
            // Store selection of user
            selection = scanner.nextInt();
            
            // Checks if the selection is between and including 1 and 3
            if(selection >= 1 && selection <= 3){
                // If the selection is correct, display proper menu options
                switch(selection) {
                    // Menu for animals
                    case 1:
                        menu.animalsMenu();
                        break;
                            
                    // Menu for habitats                            
                    case 2:
                        menu.habitatsMenu();
                        break;
                            
                    // Quits the application       
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
