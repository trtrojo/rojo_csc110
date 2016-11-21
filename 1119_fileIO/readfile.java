import java.io.*;
import java.util.Scanner;

public class readfile {
 public static void main(String[] args) throws IOException {
  String inputLoc = "/tmp/test.log";
  File iFileObj = new File(inputLoc);
  Scanner inputFile = new Scanner(iFileObj);
  String s;
  System.out.println("Now reading from file " + inputLoc);
  while(inputFile.hasNext())
   {
    s = inputFile.nextLine();
    System.out.println(s);
   }
 }
}
