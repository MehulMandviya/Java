// Program to accept 5 numbers from user and find an average of it
import java.util.Scanner;
class average
{
 public static void main(String[] args)
  {
   Scanner scan = new Scanner(System.in);
   System.out.println(" Enter the numbers:");
   int num1 , num2 , num3 , num4 , num5 ;
   num1 = scan.nextInt();
   num2 = scan.nextInt();
   num3 = scan.nextInt();
   num4 = scan.nextInt();
   num5 = scan.nextInt();
   System.out.println("Find Average");
   int sum = num1 + num2 + num3 + num4 + num5 ;
   float avg = sum/5;
   System.out.println("Average is = " + avg);
}
}