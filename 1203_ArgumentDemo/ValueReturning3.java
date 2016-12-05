public class ValueReturning3
{
 public static void main(String[] args)
  {
   int height = 2;
   int volume = rectangleArea(10,5) * height;
   System.out.pirntln("The volume is " + volume);
  }

 public static int rectangleArea(int width, int length) 
  {
   int area = width * length;
   return area;
  }
 
 public static int rectanglePerimeter(int width, int length)
 {
  return ((width * 2) + (length * 2));
 }
}
