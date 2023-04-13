/*WAP to check whether the number is an armstrong number or not. 
 * Armstrong number: A positive number is called an Armstrong number if it is equal to the sum of cubes of its 
 * digits for example 153=1^3+5^3+3^3,370,371,407,etc.
*/
import java.util.Scanner;
public class q5
 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a num ");
            int num = sc.nextInt();
            int temp = num;
            int sum = 0;
            while (temp != 0) {
                int rem = temp % 10;
                sum += rem * rem * rem;
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num + " is an armstrong number.");
            } else {
                System.out.println(num + " is not an armstrong number.");
            }
        }
    }
}