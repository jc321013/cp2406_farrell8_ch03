// This application gets a user's name and displays a greeting
import java.util.Scanner;
public class DebugThree3
{
   public static void main(String args[])
   {
      getName();
      displayGreeting(null);
   }
   private static int getName()
   {
      int name;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter name" );
      name = input.nextInt();
      return name;
   }
   private static void displayGreeting(String name)
   {
      System.out.println("Hello, " + name + "!");
   }
}
