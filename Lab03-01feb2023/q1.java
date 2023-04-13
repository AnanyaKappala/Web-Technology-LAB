/*WAP to find the largest among 3 numbers user entered nos. at the command prompt using java. */
import java.util.Scanner;
public class q1 
{
    public static void main(String[] args) 
    {
        int x, y, z;
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the first number:");
            x = s.nextInt();
            System.out.print("Enter the second number:");
            y = s.nextInt();
            System.out.print("Enter the third number:");
            z = s.nextInt();
        }
        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }
 
    }
}