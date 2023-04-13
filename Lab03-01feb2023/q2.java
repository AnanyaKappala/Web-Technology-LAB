/*WAP to accept 10 numbers from command line and check how many of them are even and how many odd.*/
import java.util.*;
public class q2 {
    public static void main(String[] args)
    {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            int[]arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            int count_odd =0;
            int count_even = 0;
            for(int i = 0; i < n; i++)
            {
                if(arr[i] % 2 == 1)
                count_odd++;
                else
                count_even++;
            }
            System.out.println("Odd: " + count_odd);
            System.out.println("Even: " + count_even);
        }
    }
}