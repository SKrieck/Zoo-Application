/*
 * Suzanne Krieck
 * Foundation in App Development IT-145
 * Final Project - Menus
 */
package monitoring.system;

import java.io.IOException;

public class Menus {
    // Prints out the main menu of the system
    void mainMenu(){
       System.out.println("Type in the number you want: ");
       System.out.println("1. Animals");
       System.out.println("2. Habitats");
       System.out.println("3. Exit");
    }
    // Prints out user prompt and calls file management...
    void animalsMenu() throws IOException { 
        // Creates a new FileManagement class
        FileManagement file = new FileManagement();
        System.out.println("\nType in the number you want: ");
        // ...Type of animal menu
        file.animalsFile();
        // ...Information on selected animal
        file.animalsInfoFile();   
        }
    // Prints out user prompt and calls file management...
    void habitatsMenu() throws IOException {
        // Creates a new FileManagement class
        FileManagement file = new FileManagement();
        System.out.println("\nType in the number you want: ");
        // ...Type of animal menu
        file.habitatsFile();
        // ...Information on selected animal
        file.habitatsInfoFile();
    }
}
