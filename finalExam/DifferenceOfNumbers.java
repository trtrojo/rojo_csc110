/*
 * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
 * Csc110, Final Exam Fall 2016
 * Question 3: Write a simple method that, given two numbers, returns the lesser
 *  of them. Write a program (using main method), calling the afresaid method
 *  multiple times to determine the lesser number out of any set of numbers
 *  entered by a user.
 * 
 */

import java.util.Scanner;

public class DifferenceOfNumbers {
 public static void main(String args[]) {
  Scanner KeyboardInput = new Scanner(System.in);
  int firstNumber;
  int secondNumber;

  System.out.println("CSC110 Problem #3");
  System.out.println("Prompt: Given a set of two numers, write a method to " + 
   "find said numbers, then get user input from main method.");
  
  int cont = 1; //continue with the loop below?
  while (cont == 1) {
   System.out.print("Enter first number > ");
    firstNumber = KeyboardInput.nextInt();
   System.out.print("Enter second number > ");
    secondNumber = KeyboardInput.nextInt();
   System.out.println("The lesser number is " + lesserNumber(firstNumber,secondNumber));
   System.out.print("Thanks for playing! Enter 1 to try again, 0 to exit! > ");
    cont = KeyboardInput.nextInt();
  } 
 }

  public static int lesserNumber(int firstNum, int secondNum) { 
   if (firstNum < secondNum) {
    return firstNum;
   } else {
    return secondNum;
   }
  }
}

