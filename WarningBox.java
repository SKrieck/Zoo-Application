/*
 * Suzanne Krieck
 * Foundation in App Development IT-145
 * Final Project - Warning Box
 */
package monitoring.system;

public class WarningBox {
    // This method creates a box around the problem category
    void warningBox(String problem) {
        System.out.println("*----------------------------------------------------*");
        System.out.println("||>>     " + problem.replace("*", "") + "     <<||");
        System.out.println("*----------------------------------------------------*");    }
}
