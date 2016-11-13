import java.util.Scanner;
import java.text.DecimalFormat;

public class PennieForPay {
 public static void main(String[] args) {
 System.out.println("Pennies for Pay");
 int days;
 int pennies = 1;
 days = getIntInput("How many days did you work?");
  if (days < 1) {
   System.out.println("You must work at least one day");
  } else {
   for (int i = 0; i <= days; i++) {
    pennies = 1 * 2;
   }
   System.out.println("The total amount of pennies is" + 
  }
   
 

 }


 public static int getIntInput(String question) {
  Scanner KeyboardInput = new Scanner(System.in);
  System.out.print(question + " > ");
  int kInput = KeyboardInput.nextInt();
  return (kInput);
 }
}
