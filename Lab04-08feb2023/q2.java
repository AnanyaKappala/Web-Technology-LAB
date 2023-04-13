/*Write a program in Java to define a class Rectangle having data member: lenght and breadth; to calculate the area 
and perimeter of the rectangle. Use member functions to read, calculate and display. */
import java.util.Scanner;

class Rectangle{
    int length , breadth;
    void read(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length and breadth");
            length = sc.nextInt();
            breadth = sc.nextInt();
        }
    }
    void calculate(){
        System.out.println("Area of rectangle is "+(length*breadth));
        System.out.println("Perimeter of rectangle is "+(2*(length+breadth)));
    }

}
public class q2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.read();
        r.calculate();
    }
}