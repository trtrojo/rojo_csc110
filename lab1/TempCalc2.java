//TempCalc

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
 
public class TempCalc {
 public static void main(String[] args) {
  System.out.println("Temperature Calculator");
  System.out.println("Enter the temperature you are converting from");
  System.out.println("Eg: 32.0F or 21C");
  String userInput = getStringInput("Temperature?"); //get String of temperature (interprete as double eg: 32.0F)
  //System.out.println(userInput);
  parseAndConvert(userInput);


 }

 public static String getStringInput(String question) {
  Scanner KeyboardInput = new Scanner(System.in);
  System.out.print(question + " > ");
  String kInput = KeyboardInput.nextLine();
  return (kInput);
 }

 public static double convertCtoF(double centigrade) {
  return 0;
  
 }

 public static double convertFtoC(double farenheight) {
  return 0;

 }

 public static void parseAndConvert(String userInput) {
  //WARNING: really bad regex incoming
  if (userInput.matches("([0-9]F)$")) {
   System.out.println("Regex matches!");
  }
 }

}

