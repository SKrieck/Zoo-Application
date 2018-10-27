/*
 * Suzanne Krieck
 * Foundation in App Development IT-145
 * Final Project - File Management
 */
package monitoring.system;

import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class FileManagement {
    // Prints type of animals menu
    void animalsFile() throws IOException {
        // Opens the file animals
        File file = new File("D:\\Classes\\App Development\\Code\\MonitoringSystem\\textfiles", "animals.txt");
        Scanner scanner = new Scanner(file);
        // This number will be printed infront of the menu selection
        int number = 1;
        // While the file has more lines to read
        while(scanner.hasNext()) {
            // Capture the animal type menu...
            String menu = scanner.nextLine();
            // ...if the menu has ------ in it...
            if (menu.equals("------")) {
                // Exit the while statement
                break;
            }            
            else {
                // ...else print out number and type of animal
                System.out.print(number + ". ");
                System.out.println(menu);  
                // Increments number for next iteration
                ++number;      
                } // End if/else
            } // End while loop      
        } // End animalsFile method
    
    // Prints the user's selection of animal information
    void animalsInfoFile() throws IOException {
        // Makes a scanner for user input
        Scanner animalSelection = new Scanner(System.in);
        // Opens the file animals
        File file = new File("D:\\Classes\\App Development\\Code\\MonitoringSystem\\textfiles", "animals.txt");
        // Initiates a new scanner for the file to be read
        Scanner scanner = new Scanner(file);
        // Initiates the warning box class
        WarningBox warning = new WarningBox();   
        // Stores input number from user
        int number = animalSelection.nextInt();        
        System.out.println("");
        
        // While the file has more lines to read
        while (scanner.hasNext()) {
            // Initiates habitatInfo to store the lines in the file
            String animalInfo = scanner.nextLine();
            // If habitatInfo doesn't contain a "D" or "------" or "======"...
            if (animalInfo.contains("D") || animalInfo.contains("------") || animalInfo.contains("======")) {
                // Continue out of the if statement and go back to the start of the loop
                continue;             
            } // End if statement
            // ...else if number = 1 and habitatInfo contains "Lion"...
            else if (number == 1 && animalInfo.contains("Lion")) {
                // prints type of animal
                System.out.println(animalInfo);
                animalInfo = scanner.nextLine();
                // prints name of animal
                System.out.println(animalInfo);
                animalInfo = scanner.nextLine();
                // prints age of animal
                System.out.println(animalInfo);
                animalInfo = scanner.nextLine();
                // If there are ****** in front of the category...
                if (animalInfo.contains("*")) {
                    warning.warningBox(animalInfo);
                }
                else {
                // prints health of animal
                System.out.println(animalInfo);
                } // End if/else
                animalInfo = scanner.nextLine();
                // If there are ****** in front of the category...
                if (animalInfo.contains("*")) {
                    // Call warningBox method and pass habitatInfo string
                    warning.warningBox(animalInfo);
                }
                else {
                // prints feeding of animal
                System.out.println(animalInfo);
                } // End if/else
            } // End else if
            // ...else if number = 1 and habitatInfo contains "Tiger"...
            else if(number == 2 && animalInfo.contains("Tiger")) {
                // prints type of animal
                System.out.println(animalInfo);
                animalInfo = scanner.nextLine();
                // prints name of animal
                System.out.println(animalInfo);
                animalInfo = scanner.nextLine();
                // prints age of animal
                System.out.println(animalInfo);
                animalInfo = scanner.nextLine();
                // If there are ****** in front of the category...
                if (animalInfo.contains("*")) {
                    // Call warningBox method and pass habitatInfo string
                    warning.warningBox(animalInfo);
                }
                else {
                // prints health of animal
                System.out.println(animalInfo);
                } // End if/else
                animalInfo = scanner.nextLine();    
                // If there are ****** in front of the category...
                if (animalInfo.contains("*")) {
                    // Call warningBox method and pass habitatInfo string
                    warning.warningBox(animalInfo);
                }
                else {
                // prints feeding of animal
                System.out.println(animalInfo);
                } // End if/else
            } // End else if
            // ...else if number = 1 and animalInfo contains "Bear"...
            else if (number == 3 && animalInfo.contains("Bear")) {
                // prints type of animal
                System.out.println(animalInfo);
                animalInfo = scanner.nextLine();
                // prints name of animal
                System.out.println(animalInfo);
                animalInfo = scanner.nextLine();
                // prints age of animal
                System.out.println(animalInfo);
                animalInfo = scanner.nextLine();
                // If there are ****** in front of the category...    
                if (animalInfo.contains("*")) {
                    // Call warningBox method and pass habitatInfo string
                    warning.warningBox(animalInfo);
                }
                else {
                // prints health of animal
                System.out.println(animalInfo);
                }
                animalInfo = scanner.nextLine();  
                // If there are ****** in front of the category...
                if (animalInfo.contains("*")) {
                    // Call warningBox method and pass habitatInfo string
                    warning.warningBox(animalInfo);
                }
                else {
                // Prints feeding of animal
                System.out.println(animalInfo);
                } // End if/else
            } // End else if
            // ...else if number = 1 and animalInfo contains "Giraffe"...
            else if (number == 4 && animalInfo.contains("Giraffe")) {
                // prints type of animal
                System.out.println(animalInfo);
                animalInfo = scanner.nextLine();
                // prints name of animal
                System.out.println(animalInfo);
                animalInfo = scanner.nextLine();
                // prints age of animal
                System.out.println(animalInfo);
                animalInfo = scanner.nextLine();
                // If there are ****** in front of the category...
                if (animalInfo.contains("*")) {
                    // Call warningBox method and pass habitatInfo string
                    warning.warningBox(animalInfo);
                }
                else {
                // prints health of animal
                System.out.println(animalInfo);
                }
                animalInfo = scanner.nextLine(); 
                //checks if there are ****** in front of the category
                if (animalInfo.contains("*")) {
                    // Call warningBox method and pass animalInfo string
                    warning.warningBox(animalInfo);
                }
                else {
                // prints feeding of animal
                System.out.println(animalInfo);                
                } // End if/else
            } // End else if
        } // End while loop
        // makes a new line and seperates 
        System.out.println("");
    } // End animalsInfoFile method
    
    // Prints type of habitats menu
    void habitatsFile() throws IOException {
        // Opens the file habitats
        File file = new File("D:\\Classes\\App Development\\Code\\MonitoringSystem\\textfiles", "habitats.txt");
        Scanner scanner = new Scanner(file);
        // This number will be printed infront of the menu selection
        int number = 1;
        // While the file has more lines to read
        while (scanner.hasNext()) {
            // Capture the habitat type menu...
            String menu = scanner.nextLine();
            // ...if the menu has ------ in it...
            if (menu.equals("------")) {
                // Exit the while statement
                break;
            } else {
                // ...else print out number and type of habitat
                System.out.print(number + ". ");
                System.out.println(menu);
                // Increments number for next iteration
                ++number;
            } // End if/else
        } // End while loop
    } // End habitatsFile
    
    // Prints the user's selection of habitats information
    void habitatsInfoFile() throws IOException {
        // Makes a scanner for user input
        Scanner habitatsSelection = new Scanner(System.in);
        // Opens the file habitats
        File file = new File("D:\\Classes\\App Development\\Code\\MonitoringSystem\\textfiles", "habitats.txt");
        // Initiates a new scanner for the file to be read
        Scanner scanner = new Scanner(file);
        // Initiates the warning box class
        WarningBox warning = new WarningBox();
        // Stores input number from user
        int number = habitatsSelection.nextInt();

        System.out.println("");
        // While the file has more lines to read
        while (scanner.hasNext()) {
            // Initiates habitatInfo to store the lines in the file
            String habitatInfo = scanner.nextLine();
            
            // If habitatInfo doesn't contain a "D" or "------" or "======"...
            if (habitatInfo.contains("D") || habitatInfo.contains("------") || habitatInfo.contains("======")) {
                // Continue out of the if statement and go back to the start of the loop
                continue;
            } // ...else if number = 1 and habitatInfo contains "Penguin"...
            else if (number == 1 && habitatInfo.contains("Penguin")) {
                // prints type of habitat
                System.out.println(habitatInfo);
                habitatInfo = scanner.nextLine();
                // prints temperature of habitat
                System.out.println(habitatInfo);
                habitatInfo = scanner.nextLine();
                // If there are ****** in front of the category...
                if (habitatInfo.contains("*")) {
                    // Call warningBox method and pass habitatInfo string
                    warning.warningBox(habitatInfo);
                } else {
                    // prints food source of habitat
                    System.out.println(habitatInfo);
                }
                habitatInfo = scanner.nextLine();
                // If there are ****** in front of the category...
                if (habitatInfo.contains("*")) {
                    // Call warningBox method and pass habitatInfo string
                    warning.warningBox(habitatInfo);
                } else {
                    // prints cleanliness of habitat
                    System.out.println(habitatInfo);
                } // End of if/else                    
            } // End else if
            
            // ...else if number = 1 and habitatInfo contains "Bird"...
            else if (number == 2 && habitatInfo.contains("Bird")) {
                // prints type of habitat
                System.out.println(habitatInfo);
                habitatInfo = scanner.nextLine();
                // prints temperature of habitat
                System.out.println(habitatInfo);
                habitatInfo = scanner.nextLine();
                // If there are ****** in front of the category...
                if (habitatInfo.contains("*")) {
                    // Call warningBox method and pass habitatInfo string
                    warning.warningBox(habitatInfo);
                } else {
                    // prints food source of habitat
                    System.out.println(habitatInfo);
                }
                habitatInfo = scanner.nextLine();
                // If there are ****** in front of the category...
                if (habitatInfo.contains("*")) {
                    // Call warningBox method and pass habitatInfo string
                    warning.warningBox(habitatInfo);
                } else {
                    // prints cleanliness of habitat
                    System.out.println(habitatInfo);               
                } // End if/else
            } // End else if
            
            // ...else if number = 1 and habitatInfo contains "Aquarium"...
            else if (number == 3 && habitatInfo.contains("Aquarium")) {
                // prints type of habitat
                System.out.println(habitatInfo);
                habitatInfo = scanner.nextLine();
                // prints temperature of habitat
                System.out.println(habitatInfo);
                habitatInfo = scanner.nextLine();
                // If there are ****** in front of the category...
                if (habitatInfo.contains("*")) {
                    // Call warningBox method and pass habitatInfo string
                    warning.warningBox(habitatInfo);
                } else {
                    // prints food source of habitat
                    System.out.println(habitatInfo);
                } // End if/else
                habitatInfo = scanner.nextLine();
                // If there are ****** in front of the category...
                if (habitatInfo.contains("*")) {
                    // Call warningBox method and pass habitatInfo string
                    warning.warningBox(habitatInfo);
                } else {
                    // prints cleanliness of habitat
                    System.out.println(habitatInfo);
                } // End if/else
            } // End else if
        } // End while loop
        // makes a new line and seperates 
        System.out.println("");
    } // End habitatsInfoFile method
} // End of class
