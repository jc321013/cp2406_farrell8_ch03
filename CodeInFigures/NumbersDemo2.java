/**
 * Created by jc321013 on 25/08/16.
 */
import java.util.Scanner;

public class NumbersDemo2 {

    public static void main(String args[]){

        double Number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        Number = in.nextInt();
        double twiceNumber = Number * 2;
        System.out.println(" Current number: " + Number + " After double: " + twiceNumber);
    }
    }


