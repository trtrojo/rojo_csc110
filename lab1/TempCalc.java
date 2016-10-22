//TempCalc

import java.util.Scanner;
 
public class TempCalc {
 public static void main(String[] args) {
  System.out.println("Temperature Calculator");
  System.out.print("Enter 1 If converting from Fahrenheit\nEnter 2 if Converting from Celsius\n");
  int selector = getIntInput(""); //get String of temperature (interpret as double eg: 32.0F)

   switch (selector) {
    case 1:
     convertFtoC();
     break;
    case 2:
     convertCtoF();
     break;
    default:
     System.out.println("Not a valid option, try again");
     break;
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

 public static void convertCtoF() {
  double ans;
  double c = getDoubleInput("Celsius Temperature?");
  ans = (((9.0/5.0) * c) + 32.0);
  System.out.println(c + " Celsius is " + ans + " Fahrenheit");  
 }

 public static void convertFtoC() {
  double ans;
  double f = getDoubleInput("Fahrenheit Temperature?");
  ans = ((5.0/9.0)*(f - 32.0));
  System.out.println(f + " Fahrenheit is " + ans + " Celsius.");
 }

}

