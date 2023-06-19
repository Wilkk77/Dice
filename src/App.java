import java.util.Scanner;
import java.util.Random;

public class App 
{
    public static void main(String args[]) 
    {
      System.out.print("Enter the number of Dice to be rolled: ");
      Scanner scan = new Scanner(System.in);
      
      int numberOfDice = scan.nextInt();

      Random randomNumber = new Random();
      for(int i=0;i < numberOfDice; i++)
      {
        System.out.print(randomNumber.nextInt(6)+1);
        System.out.print(" ");
      }
    }
}