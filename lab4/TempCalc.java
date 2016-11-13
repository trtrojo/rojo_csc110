/* TempCalc -- Modified for lab#4
 * Last edited: 2016-10-22
 *  Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
 *  Converts centigrade to farenheit and reverse
 */

import java.util.Scanner;
import java.text.DecimalFormat; //able to truncate numbers to make look nicer
 
public class TempCalc {
 public static void main(String[] args) {
  DecimalFormat df = new DecimalFormat("###.##");
  int selector;
  double inputTemp;
  int c = 1;

  while (c == 1) {
  System.out.println("Temperature Calculator");
  System.out.println("Enter the number to convert FROM what type TO what type");
  System.out.println(" 1 - Celsius to Farenheit");
  System.out.println(" 2 - Celsius to Kelvin");
  System.out.println(" 3 - Farenheit to Celsius");
  System.out.println(" 4 - Farenheit to Kelvin");
  System.out.println(" 5 - Kelvin to Celsius");
  System.out.println(" 6 - Kelvin to Farenheit");
  selector = getIntInput("Option?");

 /* The below if statement is needed because
  *  we dont want to get the temperature after you made an invalid option
  */
 if (selector >= 1 && selector <= 6) {
 
  inputTemp = getDoubleInput("What is the temperature your converting from?");
   switch (selector) {
    case 1: //Celsius to Farenheit
     System.out.println(inputTemp + " Celsius is " + df.format(tempConverter(inputTemp,"CF")) + " Farenheit");
     break;
    case 2: //Celsius to Kelvin
     System.out.println(inputTemp + " Celsius is " + df.format(tempConverter(inputTemp,"CK")) + " Kelvin"); 
     break;
    case 3: //Farenheit to Celsius
     System.out.println(inputTemp + " Farenheit is " + df.format(tempConverter(inputTemp,"FC")) + " Celsius");
     break;
    case 4: //Farenheit to Kelvin
     System.out.println(inputTemp + " Farenheit is " + df.format(tempConverter(inputTemp,"FK")) + " Kelvin");
     break;
    case 5: //Kelvin to Celsius
     System.out.println(inputTemp + " Kelvin is " + df.format(tempConverter(inputTemp,"KC")) + " Celsius");
     break;
    case 6: //Kelvin to Farenheit
     System.out.println(inputTemp + " Kelvin is " + df.format(tempConverter(inputTemp,"KF")) + " Farenheit");
     break;
    default:
     System.out.println("ERROR: This should not happen.");
     System.out.println("ERROR: Default case selected in main() switch");
     break;
   }
 }
  else { System.out.println("Invalid option, please try again"); }

  c = getIntInput("Press 1 to continue, 2 to exit");
  
 }
}

 public static int getIntInput(String question) {
  Scanner KeyboardInput = new Scanner(System.in);
  System.out.print(question + " > ");
  int kInput = KeyboardInput.nextInt();
  return (kInput);
 }

 public static double getDoubleInput(String question) {
  Scanner KeyboardInput = new Scanner(System.in);
  System.out.print(question + " > ");
  double kInput = KeyboardInput.nextDouble();
  return (kInput);
 }

 /* Temperature converter function
  * double i -- input number (should be a double)
  * string cType -- how to convert said number
  *   Acceptable options for cType:
  *    CF - Centigrade to Farenheit
  *    CK - Centigrade to Kelvin
  *    FC - Farenheit to Centigrade
  *    FK - Farenheit to Kelvin
  *    KC - Kelvin to Centigrade
  *    KF - Kelvin to Farenheit
  */
 public static double tempConverter(double i, String cType) {
  if (cType.equals("CF")) {
   return (((9.0/5.0) * i) + 32.0);
  }
  else if (cType.equals("CK")) {
   return (i + 273.15);
  }
  else if (cType.equals("FC")) {
   return ((5.0/9.0)*(i - 32.0));
  }
  else if (cType.equals("FK")) {
   return (((5.0/9.0)*(i - 32.0))+273.15);
  }
  else if (cType.equals("KC")) {
   return (i - 273.15);
  }
  else if (cType.equals("KF")) {
   return (((9.0/5.0)*(i - 273.15))+32.0);
  }
  else {
   throw new IndexOutOfBoundsException();
  }
 }
}

