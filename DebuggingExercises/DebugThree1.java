// This class calculates a waitperson's tip as 15% of the bill
public class DebugThree1
{
   public static void main(String args[])
   {
      double myCheck = 50.00;
      double yourCheck = 19.95;
      System.out.println("Tips are");
      calcTip((int) myCheck);
      calcTip((int) yourCheck);
    }
    private static void calcTip(int bill) {
        final double RATE = 0.15;
        double tip = bill + RATE;
        System.out.println("The tip should be at least " + tip);
    }

}
