public class ArgsTest
{
 public static void main(String[] args)
  {
   System.out.println("Argument tester...");
   String name = "user"; //default name is user
   //System.out.println(args.toString(array));

   if (args.length != 0) {
    System.out.println("DEBUG: It works");
    name = args[0];
   }
  System.out.println(printHello(name));
  }
  private static String printHello(String name) {
   return ("Programming is fun, " + name + "!!!");
  }
}
