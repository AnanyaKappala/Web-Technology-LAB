/*WAP to calculate sum of all the numbers divisible by 3 from 0 to n. Print the sum.*/
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
            {
               if(i%3==0)
               {
                sum=sum+i;
               }
            }
           }
           System.out.print(""+sum);
    }
    }
}