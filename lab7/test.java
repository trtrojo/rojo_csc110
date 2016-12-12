public class test {
 public static void main(String[] args) {
  TempConverter TC = new TempConverter((5.0/9.0),(-5.0/9.0*32.0));
  System.out.println("A is " + TC.getA());
  System.out.println("B is " + TC.getB());
  double a = TC.getA();
  double b = TC.getB();
  double inVal = 20;
 
  System.out.println("We are converting 20 from farenheit to centigrade...");
  System.out.println(a + inVal * b); 
 }
}
