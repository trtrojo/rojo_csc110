public class LoopExampleWhile {
 public static void main(String[] args) {
  int counter = 0;
  int runningCount = 0;
  while (counter <= 5) {
   System.out.println("In the loop");
   runningCount++;
   counter++;
  }
  System.out.println("Out of the loop");
  System.out.println("BTW, the running count var is: " + runningCount);
 }
}
