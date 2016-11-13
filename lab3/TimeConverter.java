/* TimeConverter -- Lab 3
 * Last edited: 2016-10-22
 * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
 * Converts the number of seconds to a more readable
 *  time, eg 1220 seconds is 4 hours
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class TimeConverter {
 public static void main(String[] args) {
  DecimalFormat df = new DecimalFormat("######");
  final double SECONDS_MINUTE = 60.0;
  final double SECONDS_HOUR = 3600.0;
  final double SECONDS_DAY = 86400.0;

  double seconds;
  double i; //
  double runningTotal;

  System.out.println("Time Converter");
  System.out.println("Enter the number of seconds to convert to time");
  seconds = getDoubleInput("");
  String output = (df.format(seconds) + " seconds is");
  runningTotal = seconds;

   if (runningTotal >= SECONDS_DAY) {
    i = Math.floor((runningTotal / SECONDS_DAY));
    output = output + " " + df.format(i) + " days";
    runningTotal = (runningTotal - (i * SECONDS_DAY)); //update to remove the number of days
   }
   if (runningTotal >= SECONDS_HOUR) {
    i = Math.floor((runningTotal / SECONDS_HOUR));
    output = output + " " + df.format(i) + " hours";
    runningTotal = (runningTotal - (SECONDS_HOUR * i));
   }
   if (runningTotal >= SECONDS_MINUTE) {
    i = Math.floor((runningTotal / SECONDS_MINUTE));
    output = output + " " + df.format(i) + " minutes";
    runningTotal = (runningTotal - (SECONDS_MINUTE * i));
   }
   if (runningTotal > 0) {
    output = output + " " + df.format(runningTotal) + " seconds in total.";
   }
  System.out.println(output);
 
 }

 public static double getDoubleInput(String question) {
  Scanner KeyboardInput = new Scanner(System.in);
  System.out.print(question + " > ");
  double kInput = KeyboardInput.nextDouble();
  return (kInput);
 }

}
