/* TempCalc -- Modified for lab#5
 * Last edited: 2016-11-21
 *  Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
 *  Converts centigrade to farenheit and reverse
 */

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat; //able to truncate numbers to make look nicer

public class TempCalc {
 public static void main(String[] args) throws IOException {
  int selector;
  int c = 1;

  while (c == 1) {
  System.out.println("Temperature Calculator");
  System.out.println("Enter the number to convert FROM what type TO what type");
  System.out.println("This has been modified for lab #5, input is only accepted from a file.");
  System.out.println(" 1 - Celsius to Farenheit");
  System.out.println(" 2 - Celsius to Kelvin");
  System.out.println(" 3 - Farenheit to Celsius");
  System.out.println(" 4 - Farenheit to Kelvin");
  System.out.println(" 5 - Kelvin to Celsius");
  System.out.println(" 6 - Kelvin to Farenheit");
  selector = getIntInput("Option?");
  String srcFile = getStringInput("Where is the source file?");
  String dstFile = getStringInput("Please specify the destination file.");

 /* The below if statement is needed because
  *  we dont want to get the temperature after you made an invalid option
  */
 if (selector >= 1 && selector <= 6) {
  if (selector == 1) {

   fileConvertTemp(srcFile,dstFile,"CF");
  
  } //ends the first option.

  else if (selector == 2) { //Celsius to Kelvin

   fileConvertTemp(srcFile,dstFile,"CK");
  
  }
  else if (selector == 3) { //Farenheit to Celsius
  
   fileConvertTemp(srcFile,dstFile,"FC");

  }
  else if (selector == 4) { //Farenheit to Kelvin
   
   fileConvertTemp(srcFile,dstFile,"FK");

  }
  else if (selector == 5) { //Kelvin to Celsius

   fileConvertTemp(srcFile,dstFile,"KC");

  }
  else if (selector == 6) { //Kelvin to Farenheit

   fileConvertTemp(srcFile,dstFile,"KF"); 
  
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
 public static String getStringInput(String question) {
  Scanner KeyboardInput = new Scanner(System.in);
  System.out.print(question + " > ");
  String kInput = KeyboardInput.nextLine();
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

 public static boolean fileConvertTemp(String srcFile, String dstFile, String cType) throws IOException {
   File iFileObj = new File(srcFile);
   Scanner inputFile = new Scanner(iFileObj);
   PrintWriter outputFile = new PrintWriter(dstFile);
   double inputTemp;
   double srcTemp;
   DecimalFormat df = new DecimalFormat("###.##");

   String temp;
   System.out.println("Now reading from file: " + srcFile);
   while(inputFile.hasNext())
   {
    srcTemp = inputFile.nextDouble();
    temp = df.format(tempConverter(srcTemp,cType));
    
    System.out.println("Celsius Temperature: " + srcTemp  +  " Farenheit Temperature is: " + temp);
    outputFile.println(temp);
   }
   outputFile.close();
   return true;
 }


}

