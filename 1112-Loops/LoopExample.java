public class LoopExample {
 public static void main(String[] args) {
  int runningCount = 0;
  for (int counter = 0; counter <= 5; counter++) {
   System.out.println("In the loop");
   runningCount++;
  }
  System.out.println("Out of the loop");
  System.out.println("BTW, the runningCount var is: " + runningCount);
 }
}
