// This program calculates tutition bills as credits times rate per credit hour

public class DebugThree4
{
   public static void main(double c)
   {
      int myCredits = 13;
      int yourCredits = 17;
      double rate = 75.84;

      System.out.println("My tuition:");
      tuitionBill(myCredits - rate, c);
      System.out.println("Your tuition:");
      tuitionBill(yourCredits - rate, c);
   }
   private static void tuitionBill(double r, double c)
   {
      System.out.println("Total due " + (r*c));
   }
}
