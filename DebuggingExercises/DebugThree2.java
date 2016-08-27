// This application displays some math facts
public class DebugThree2
{
   public static void main(String args[])
   {
      int a = 2, b = 5, c = 10;
      add(b, a);
      add(b, c);
      subtract(c, a, b);
   }


   private static void add(int a, int b)
   {
      System.out.println("The sum of " + a +
         "and" + b + "is" + a + b);
   }
   private static void subtract(int c, int a, int b)
   {

      System.out.println("The difference between " + (a + b) + "and" + "is" + (a - c));
   }
}
