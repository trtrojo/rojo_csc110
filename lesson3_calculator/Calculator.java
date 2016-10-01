import java.util.Scanner;
public class Calculator {
 public static void main(String[] args)
  {
    double a, b, c;
    System.out.print("Enter first number: ");
    a = getNum();
    System.out.print("Enter second number: ");
    b = getNum();
    //a = 3;
    //b = 5;
    addNum(a,b);
    subNum(a,b);
    multNum(a,b);
    divNum(a,b);
    modNum(a,b);

  }

 public static void addNum(double x, double y) {
  System.out.println("Result of addition :" + (x+y));
 }
 public static void subNum(double x, double y) {
  System.out.println("Result of subtraction: " + (x-y));
 }
 public static void divNum(double x, double y) {
  System.out.println("Result of division: " + (x/y));
 }
 public static void modNum(double x, double y) {
  System.out.println("Result of Modulus: " + (x%y));
 }
 public static void multNum(double x, double y) {
  System.out.println("Result of Multiplication: " + (x*y));
 }
 public static double getNum() {
  Scanner keyboardInput = new Scanner(System.in);
  double kInput = keyboardInput.nextDouble();
  return (kInput);
 }
}
