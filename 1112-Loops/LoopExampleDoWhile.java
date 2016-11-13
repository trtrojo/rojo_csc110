public class LoopExampleDoWhile {
 public static void main(String[] args) {
  int counter = 0;
  int runningCount = 0;
  do {
   System.out.println("In the loop");
   runningCount++;
   counter++;
  } while(counter <= 5);
  System.out.println("Out of the loop");
  System.out.println("BTW, the runningCount var is: " + runningCount);
 }
}
