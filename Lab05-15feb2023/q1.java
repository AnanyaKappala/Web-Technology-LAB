/*Write a program in Java to define a class Rectangle having data member: length and breadth; to calculate the area 
and perimeter of the rectangle. Use constructors and member functions to read, calculate and display.*/
import java.util.Scanner;
class Rectangle{
    int length , breadth;
    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    void calculate(){
        System.out.println("Area : "+(length*breadth));
        System.out.println("Perimeter : "+(2*(length+breadth)));
    }
}
public class q1{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter length and breadth :");
            int l = sc.nextInt();
            int b = sc.nextInt();
            Rectangle r1 = new Rectangle(l,b);
            r1.calculate();
        }
    }
}