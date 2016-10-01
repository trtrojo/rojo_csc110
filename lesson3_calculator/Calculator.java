import java.util.Scanner;
public class Calculator {
 public static void main(String[] args)
  {
    int a, b, c;
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

 public static void addNum(int x, int y) {
  System.out.println("Result of addition :" + (x+y));
 }
 public static void subNum(int x, int y) {
  System.out.println("Result of subtraction: " + (x-y));
 }
 public static void divNum(int x, int y) {
  System.out.println("Result of division: " + (x/y));
 }
 public static void modNum(int x, int y) {
  System.out.println("Result of Modulus: " + (x%y));
 }
 public static void multNum(int x, int y) {
  System.out.println("Result of Multiplication: " + (x*y));
 }
 public static int getNum() {
  Scanner keyboardInput = new Scanner(System.in);
  int kInput = keyboardInput.nextInt();
  return (kInput);
 }
}
