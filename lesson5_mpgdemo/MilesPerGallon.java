import  java.util.Scanner;

public class MilesPerGallon {
 public static void main(String[] args)
 {
  double miles; //miles driven
  double gallons; //gallons used
  double mpg; //miles per gallon


  //create a scanner object for keyboard input
  Scanner keyboard = new Scanner(System.in);

  //Prompt the user to enter the miles driven
  System.out.print("Enter the miles driven: ");
  miles = keyboard.nextDouble();

  //prompt the user to enter the gallons used.
  System.out.print("Enter the gallons used: ");
  gallons = keyboard.nextDouble();

  mpg = (miles/gallons);

  //calculate miles-per-gallon
  System.out.printf("The MPG value is %12.2f as it calculated by this method\n",mpg);
 }
}
