import javax.swing.JOptionPane;

public class TestResults {
 public static void main(String[] args) {
  int testScore; //test score int
  String input; //holding user input?

  //get test score
  input = JOptionPane.showInputDialog("Enter your numeric " +
            "test score and I will tell you the grade: ");

  testScore = Integer.parseInt(input);

  //display grades.
  if (testScore <= 100 && testScore >= 0) {

  if (testScore < 60)
   JOptionPane.showMessageDialog(null, "Your grade is F.");
  else if (testScore < 70)
   JOptionPane.showMessageDialog(null, "Your grade is D.");
  else if (testScore < 80)
   JOptionPane.showMessageDialog(null, "Your grade is C.");
  else if (testScore < 90)
   JOptionPane.showMessageDialog(null, "Your grade is B.");
  else
   JOptionPane.showMessageDialog(null, "Your grade is A.");
  }
   else {
   JOptionPane.showMessageDialog(null, "You entered an invalid number, please try again");
   }
  System.exit(0);
 }
 
}
