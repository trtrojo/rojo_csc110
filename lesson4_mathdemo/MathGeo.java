import java.util.Scanner;

public class MathGeo {
 public static void main(String[] args) {
  double monday, tuesday, wednesday, average;
  
  monday = getDoubleInput("What is the average for Monday?");
  tuesday = getDoubleInput("What is the average for Tuesday?");
  wednesday = getDoubleInput("What is the average for Wednesday?");
  average = (monday + tuesday + wednesday) / 3;
  System.out.println("The average is " + average);
 }

 /* @input question - Prompts the user with a question for inptu
  * @output kInput -  ajkfbaerkjgbaejrgnarjekgnakjegrnkjan
  */
 public static double getDoubleInput(String question) {
  Scanner KeyboardInput = new Scanner(System.in);
  System.out.print(question + "> ");
  double kInput = KeyboardInput.nextDouble();
  return (kInput);
 }
}
