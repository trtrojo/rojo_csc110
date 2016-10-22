import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MilesPerGallonGUI {
 public static void main(String[] args)
 {
  double miles; //miles driven
  double gallons; //gallons used
  double mpg; //miles per gallon

  //Prompt the user to enter the miles driven
  miles = requestInput("Enter the miles driven: ");

  //prompt the user to enter the gallons used.
  gallons = requestInput("Enter the gallons used: ");

  mpg = (miles/gallons);

  //calculate miles-per-gallon
  //System.out.println("The MPG is " + mpg);
  JOptionPane.showMessageDialog(null,"The MPG is: " + mpg, "THE ANSWER",1);
  System.exit(0);
 }

/* requestInput(message)
 * message - what to put in the dialog box
 */
 public static double requestInput(String message) {
  String rawInput;
  rawInput = JOptionPane.showInputDialog(message);
  return Double.parseDouble(rawInput);
 }
}
