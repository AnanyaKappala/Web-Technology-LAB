/*WAP to enter 'n' numbers from command line and find minimum, maximum, average, and standard deviation of these 
list of numbers.*/
import java.util.*;
public class q3 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int i, n, small;

            System.out.println("Enter the number of elements:");
            n = sc.nextInt();
            int[] a = new int[n];

            System.out.println("Enter the elements");
            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            small = a[0];
            for (i = 1; i < n; i++) {
                if (a[i] < small) {
                    small = a[i];
                }
            }
            System.out.println("Smallest of " + n + " elements in an array = " + small);
        }
        {
            try (Scanner sc = new Scanner(System.in)) {
                int i, n, large;

                System.out.println("Enter the number of elements:");
                n = sc.nextInt();
                int[] a = new int[n];

                System.out.println("Enter the elements");
                for (i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                large = a[0];
                for (i = 1; i < n; i++) {
                    if (large < a[i]) {
                        large = a[i];
                    }
                }
                System.out.println("Largest of " + n + " elements in an array = " + large);
            }
        }
        //average
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Total count of number to find the average of: ");
            int n = sc.nextInt();
            
            int sum = 0;
            
            System.out.println("Enter the numbers: ");
            
            for(int i=0;i<n;i++){
                sum += sc.nextInt();
            }
            
            double average = sum/(double)n; // typecasting n from int to double for decimal division
            
            System.out.println("Average of n given numbers is "+average);
        }
        //standard deviation
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter N:");
            int n = in.nextInt();
            
            double a[] = new double[n];
            
            System.out.println("Enter the numbers:");
            for (int i = 0; i < n; i++) {
                a[i] = in.nextDouble();
            }
            
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i];
            }
            
            double avg = sum / n;
            double z = 0;
            for (int i = 0; i < n; i++) {
                z += Math.pow(a[i] - avg, 2);
            }
            
            double s = Math.sqrt(z / n);
            
            System.out.println("Standard Deviation(s) = " + s);
        }
    }
}