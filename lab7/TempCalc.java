/* TempCalc -- Modified for lab#6
 * Last edited: 2016-12-11
 *  Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
 *  Converts centigrade to farenheit and reverse
 *
 *  Lab 7 -- Okay, so I am not sure whats going on here, so i will try to figure
 *    it out.
 *    
 *   Each option in the if statements below should be called from an object.
 *    - Create a new object TempConverter(<first operand>,<second operand>);
 *    - Pull out the operands from the object you just put in
 *    - In the main file (this one), preform the operation 
 *       * convertedTemp = <first operand> * srcTemp + <second operand>
 *       * place converted temp into a file?.....I still dont understand
 *          this assignment
 *    
 */

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat; //able to truncate numbers to make look nicer

public class TempCalc {
 public static void main(String[] args) throws IOException {

  /*DecimalFormat is for truncating numbers
   *
   * eg: 21.99999999 becomes 21.99
   */
  DecimalFormat df = new DecimalFormat("###.##"); 

  int selector; //this selects what temperature conversion to use
  
  /* The next two objects are to keep the main loop from closing
   *  By default, set c(ontinue) = to 1, then place the entire program
   *  in a while loop (while c == 1). Before the loop ends, ask the user
   *  whether they want to continue. If yes, keep c = 1,
   *  if no, set c = anything else
   */
  int c = 1;
  while (c == 1) {

   /* 
    * Print the welcome message
    *
    */
  System.out.println("Temperature Calculator");
  System.out.println("Enter the number to convert FROM what type TO what type");
  System.out.println("This has been modified for lab #6, input is only accepted from a file.");
  System.out.println("But....For lab 7, it requries you to do the math in an external object...or something");
  System.out.println(" 1 - Celsius to Farenheit");
  System.out.println(" 2 - Celsius to Kelvin");
  System.out.println(" 3 - Farenheit to Celsius");
  System.out.println(" 4 - Farenheit to Kelvin");
  System.out.println(" 5 - Kelvin to Celsius");
  System.out.println(" 6 - Kelvin to Farenheit");

  selector = getIntInput("Option?"); //this sets what conversion to use

  /* srcFile and dstFile are for the file handling functions.
   *  srcFile (source file) is the path of the file to read from
   *   eg: /tmp/temperatures.log
   *
   *  dstFile (Destination file) is the path where to write the converted
   *   temperatures.
   *   eg: /tmp/convertedTemperatures.log
   */

  String srcFile = getStringInput("Where is the source file?");
  String dstFile = getStringInput("Please specify the destination file.");

 /* The below if statement is needed because
  *  we dont want to get the temperature after you made an invalid option
  */
 if (selector >= 1 && selector <= 6) {

 /* This is the main part where we separate out all of the conversion features
  *  Read the comments after the if statement to see where they corrospond
  *  to what the menu displays
  */

  if (selector == 1) { //Centigrade to Farenheit
   TempConverter TC = new TempConverter((9.0/5.0),(32.0));
   double a = TC.getA(); //function to pull the "a" variable from TempConverter.java
   double b = TC.getB(); //function to pull the "b" vairable from TempConverter.java

   
   double inVal; //this format required by the constraints of the
   double outVal;                              // assignment

   File iFileObj = new File(srcFile); //Creates a file object to read from
   PrintWriter outputFile = new PrintWriter(dstFile); //Another file object 
                                                      // to write to a file
   
   Scanner inputFile = new Scanner(iFileObj); //Creates a scanner class, but 
                      //accept input from file object instead of the console

   while (inputFile.hasNext()) {
    inVal = inputFile.nextDouble();
    outVal = a * inVal + b; //this format required by the constraints of the
    outputFile.println(df.format(outVal));
    System.out.println("Celsius Temperature: " + inVal + " Farenheit Temperature is: " + df.format(outVal));
   }
   outputFile.close();

   
   
  
  } //ends the first option.

  else if (selector == 2) { //Celsius to Kelvin

   TempConverter TC = new TempConverter((1.0),(273.0));
   double a = TC.getA(); //function to pull the "a" variable from TempConverter.java
   double b = TC.getB(); //function to pull the "b" vairable from TempConverter.java


   double inVal; //this format required by the constraints of the
   double outVal;                              // assignment

   File iFileObj = new File(srcFile); //Creates a file object to read from
   PrintWriter outputFile = new PrintWriter(dstFile); //Another file object 
                                                      // to write to a file

   Scanner inputFile = new Scanner(iFileObj); //Creates a scanner class, but 
                      //accept input from file object instead of the console

   while (inputFile.hasNext()) {
    inVal = inputFile.nextDouble();
    outVal = a * inVal + b; //this format required by the constraints of the
    outputFile.println(df.format(outVal));
    System.out.println("Celsius Temperature: " + inVal + " Kelvin Temperature is: " + df.format(outVal));
   }
   outputFile.close();
 
  }
  else if (selector == 3) { //Farenheit to Celsius

   TempConverter TC = new TempConverter(((5.0/9.0)),((-5.0/9.0)*32.0));
   double a = TC.getA(); //function to pull the "a" variable from TempConverter.java
   double b = TC.getB(); //function to pull the "b" vairable from TempConverter.java


   double inVal; //this format required by the constraints of the
   double outVal;                              // assignment

   File iFileObj = new File(srcFile); //Creates a file object to read from
   PrintWriter outputFile = new PrintWriter(dstFile); //Another file object 
                                                      // to write to a file

   Scanner inputFile = new Scanner(iFileObj); //Creates a scanner class, but 
                      //accept input from file object instead of the console

   while (inputFile.hasNext()) {
    inVal = inputFile.nextDouble();
    outVal = a * inVal + b; //this format required by the constraints of the
    outputFile.println(df.format(outVal));
    System.out.println("Farenheit Temperature: " + inVal + " Celsius Temperature is: " + df.format(outVal));
   }
   outputFile.close();
  

  }
  else if (selector == 4) { //Farenheit to Kelvin
   
   TempConverter TC = new TempConverter((5.0/9.0),(273.0-32.0*5.0/9.0));
   double a = TC.getA(); //function to pull the "a" variable from TempConverter.java
   double b = TC.getB(); //function to pull the "b" vairable from TempConverter.java


   double inVal; //this format required by the constraints of the
   double outVal;                              // assignment

   File iFileObj = new File(srcFile); //Creates a file object to read from
   PrintWriter outputFile = new PrintWriter(dstFile); //Another file object 
                                                      // to write to a file

   Scanner inputFile = new Scanner(iFileObj); //Creates a scanner class, but 
                      //accept input from file object instead of the console

   while (inputFile.hasNext()) {
    inVal = inputFile.nextDouble();
    outVal = a * inVal + b; //this format required by the constraints of the
    outputFile.println(df.format(outVal));
    System.out.println("Farenheit Temperature: " + inVal + " Kelvin Temperature is: " + df.format(outVal));
   }
   outputFile.close();


  }
  else if (selector == 5) { //Kelvin to Celsius

   TempConverter TC = new TempConverter((1.0),(-273.0));
   double a = TC.getA(); //function to pull the "a" variable from TempConverter.java
   double b = TC.getB(); //function to pull the "b" vairable from TempConverter.java


   double inVal; //this format required by the constraints of the
   double outVal;                              // assignment

   File iFileObj = new File(srcFile); //Creates a file object to read from
   PrintWriter outputFile = new PrintWriter(dstFile); //Another file object 
                                                      // to write to a file

   Scanner inputFile = new Scanner(iFileObj); //Creates a scanner class, but 
                      //accept input from file object instead of the console

   while (inputFile.hasNext()) {
    inVal = inputFile.nextDouble();
    outVal = a * inVal + b; //this format required by the constraints of the
    outputFile.println(df.format(outVal));
    System.out.println("Kelvin Temperature: " + inVal + " Celsius Temperature is: " + df.format(outVal));
   }
   outputFile.close();


  }
  else if (selector == 6) { //Kelvin to Farenheit

   TempConverter TC = new TempConverter((9.0/5.0),(32.0-(9.0/5.0)*273.0));
   double a = TC.getA(); //function to pull the "a" variable from TempConverter.java
   double b = TC.getB(); //function to pull the "b" vairable from TempConverter.java


   double inVal; //this format required by the constraints of the
   double outVal;                              // assignment

   File iFileObj = new File(srcFile); //Creates a file object to read from
   PrintWriter outputFile = new PrintWriter(dstFile); //Another file object 
                                                      // to write to a file

   Scanner inputFile = new Scanner(iFileObj); //Creates a scanner class, but 
                      //accept input from file object instead of the console

   while (inputFile.hasNext()) {
    inVal = inputFile.nextDouble();
    outVal = a * inVal + b; //this format required by the constraints of the
    outputFile.println(df.format(outVal));
    System.out.println("Kelvin Temperature: " + inVal + " Farernheit Temperature is: " + df.format(outVal));
   }
   outputFile.close();

  
  }
 
 }
  else { System.out.println("Invalid option, please try again"); }

  c = getIntInput("Press 1 to continue, 2 to exit");
  
 }
}

 /*
  * getIntInput("Enter double Here");
  * Parameters: String
  * Returns: int
  *  Provides an easy way to ask a question and return an interger
  *  Usage: int a = getIntInput("Enter Interger number");
  *  Display: Enter Interger number > 
  *  Returns: variable a will become an int
  */

 public static int getIntInput(String question) {
  Scanner KeyboardInput = new Scanner(System.in);
  System.out.print(question + " > ");
  int kInput = KeyboardInput.nextInt();
  return (kInput);
 }
 /*
  * getDoubleInput("Enter Question Here");
  * Parameters: String
  * Returns: double
  *  Provides an easy way to ask a question and return an double
  *  Usage: double a = getDoubleInput("Enter Interger number");
  *  Display: Enter Double number > 
  *  Returns: variable a will become an double
  */

 public static double getDoubleInput(String question) {
  Scanner KeyboardInput = new Scanner(System.in);
  System.out.print(question + " > ");
  double kInput = KeyboardInput.nextDouble();
  return (kInput);
 }

/*
  * getStringInput("Enter String");
  * Parameters: String
  * Returns: String
  *  Provides an easy way to ask a question and return an double
  *  Usage: String a = getStringInput("Enter String");
  *  Display: Enter String > 
  *  Returns: Variable a will become an String
  */

 public static String getStringInput(String question) {
  Scanner KeyboardInput = new Scanner(System.in);
  System.out.print(question + " > ");
  String kInput = KeyboardInput.nextLine();
  return (kInput);
 }

 /* Temperature converter function (fancy way for doing file IO)
  *  TODO: Make sure to add an option on whether to print to screen instead of hardcoding it as true.
  *
  * Usage: fileConvertTemp(<source file path>,<Destination file path>,<Conversion Type>);
  *
  * Example: fileConvertTemp("/tmp/a.log","/tmp/b.log","CF") (CF = Centigrade to Farenheit)
  *
  *  Outputs a boolean value on whether successful. Will print to console if not
  */
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
    //temp = df.format(tempConverter(srcTemp,cType));
    
    //System.out.println("Celsius Temperature: " + srcTemp  +  " Farenheit Temperature is: " + temp);
    //outputFile.println(temp);
   }
   outputFile.close();
   return true;
 }


}

