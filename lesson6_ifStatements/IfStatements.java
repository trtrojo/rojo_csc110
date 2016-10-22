import java.util.Scanner;

 public class IfStatements {
  public static void main(String[] args)
   {
    double x, y;
    x = getDoubleInput("Value for x");
    y = getDoubleInput("Value for y");
  
     if (x > y) { System.out.println("x is greater than y"); }
     if (x == y) { System.out.println("x is equal to y"); }
     if (x != y) { 
      System.out.println("x is not equal to y");
      x = y;
      System.out.println("However, now it is");
     }
    

   }

   public static double getDoubleInput(String question) {
   Scanner KeyboardInput = new Scanner(System.in);
   System.out.print(question + "> ");
   double kInput = KeyboardInput.nextDouble();
   return (kInput);
   }
 }

