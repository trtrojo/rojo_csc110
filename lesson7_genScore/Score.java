//enter passing grade first

import java.util.Scanner;

public class Score {
 public static void main(String[] args) {
  int testScore, passScore;
  testScore = getIntInput("Enter your test score");
  passScore = getIntInput("What is the passing grade?");

  if (testScore > passScore) {
   System.out.println("Congratulations!");
   System.out.println("You passed the exam.");
  }
  else {
   System.out.println("Sorry. You failed the exam.");
   System.out.println("Study and try again.");
  }
 }

 public static int getIntInput(String question) {
   Scanner KeyboardInput = new Scanner(System.in);
   System.out.print(question + "> ");
   int kInput = KeyboardInput.nextInt();
   return (kInput);
  }
}

