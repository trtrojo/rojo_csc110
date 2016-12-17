/*
 * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
 * Csc110, Final Exam Fall 2016
 * Question 2: Write code that will print the cube of all intergers between 1
 *  and 500 (ie: 1, 8, 27, 64). Declare any variables you need.
 * 
 */

public class Cubes {
 public static void main(String args[]) {
  for (int cubePosition = 1; cubePosition <= 500; cubePosition++) {
   System.out.println("The cube of " + cubePosition + " is " + (cubePosition*cubePosition*cubePosition));
  }
 }
}
