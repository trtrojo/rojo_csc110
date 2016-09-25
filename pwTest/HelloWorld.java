//Application "HelloWorld"
import java.util.Scanner;
public class HelloWorld
{
/* There is the class header above */
 public static void main(String[] args)
  {
   String myStr; //professor told us to do it
   System.out.println("Please enter password:");
   Scanner keyboardInput = new Scanner(System.in);
   String kInput = keyboardInput.nextLine();
   System.out.println("Password is:" + kInput);
    if (checkPw(kInput)) {
     System.out.println("Success. Boobs.");
    }
     else {
     System.out.println("Invalid Password. Fuck off.");
    }
  }
 private static boolean checkPw(String userPassword) {
  String password = "fuckoff";
  System.out.println("pw is: " + password + " , userPw is: " + userPassword);
   if (password.equals(userPassword)) {
    System.out.println("DEBUG: Password Check success");
    return true;
   }
   else {
    System.out.println("DEBUG: password check failed");
    return false;
   }
 }
}
