import java.util.Scanner;
import java.lang.Math;

public class q3a
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements");
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            int min = arr[0];
            int max = arr[0];
            int sum = 0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]<min)
                {
                    min = arr[i];
                }
                if(arr[i]>max)
                {
                    max = arr[i];
                }
                sum = sum + arr[i];
             }
            double avg = (double)sum/n;
            double sum1 = 0;
            for(int i=0;i<n;i++)
            {
                sum1 = sum1 + Math.pow((arr[i]-avg),2);
            }
            double sd = Math.sqrt(sum1/n);
            System.out.println("Minimum = "+min);
            System.out.println("Maximum = "+max);
            System.out.println("Average = "+avg);
            System.out.println("Standard Deviation = "+sd);
        }
    }
}