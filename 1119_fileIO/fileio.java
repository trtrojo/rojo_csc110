import java.io.*;

public class fileio {
 public static void main(String[] args) throws IOException {
  String outputLoc = "/tmp/test.log";
  PrintWriter outputFile = new PrintWriter(outputLoc);

  for (int i = 0; i <= 1000; i++) {
   outputFile.println(i);
  }
  outputFile.close(); //close the file, or your wife will leave you
  System.out.println("Done. Check " + outputLoc + " for log");
 }
}
