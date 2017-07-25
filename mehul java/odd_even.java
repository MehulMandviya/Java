// Program to check whether a number is odd or even
import java.util.Scanner;
class odd_even
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Check if number entered is odd or even: ");
        num = scan.nextInt();
        if (num % 2 == 0)
        {
            System.out.println("Even Number: " + num);
        }
        else
        System.out.println("Odd Number: " + num);
    }
}