public class ArgumentDemo {
 public static void main(String[] args) {
  showKilometers(10);
  showKilometers(100);
  showKilometers(1000);
 }
 public static void showKilometers(double miles) {
  double kilometers = miles * 1.609;
  System.out.println(miles + " miles is equal to " + 
   kilometers + " kilometers.");
 }
}
