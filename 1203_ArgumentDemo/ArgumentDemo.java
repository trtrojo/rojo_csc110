import java.io.*;

public class ArgumentDemo {
 public static void main(String[] args) throws IOException {
  String outputLoc = "/tmp/argDemo.log";
  PrintWriter outputFile = new PrintWriter(outputLoc);

  System.out.println("Writing output to " + outputLoc);

  for (int x = 1; x <= 1000; x++) {
   System.out.println(showKilometers(x)); //write to console
   outputFile.println(showKilometers(x)); //write to file
  }
  System.out.println("Done. Check " + outputLoc + " for table");

 }
 public static String showKilometers(double miles) {
  double kilometers = miles * 1.609;
  if (miles == 1) {
   return(miles + " mile is equal to " + 
    kilometers + " kilometers.");
  }
   else {
    return(miles + " miles are equal to " + 
      kilometers + " kilometers.");
  }
 }
}
