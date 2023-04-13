/*Implement Program 3 using Dynamic Method Dispatch. */
import java.util.Scanner;

class Shape {
    private double dimension1;
    private double dimension2;
    
    public Shape(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
    
    public double getDimension1() {
        return dimension1;
    }
    
    public double getDimension2() {
        return dimension2;
    }
    
    public double area() {
        return dimension1 * dimension2;
    }
}

class Rectangle extends Shape {
    public Rectangle(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }
    
    @Override
     public double area() {
        return getDimension1() * getDimension2();
    }
}

class Triangle extends Shape {
    public Triangle(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }
    
    @Override
    public double area() {
        return 0.5 * getDimension1() * getDimension2();
    }
}

public class q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of the shape: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the shape: ");
        double width = sc.nextDouble();
        
        Shape shape = new Shape(length, width);
        Rectangle rectangle = new Rectangle(length, width);
        Triangle triangle = new Triangle(length, width);
        
        System.out.println("Area of shape: " + shape.area());
        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Area of triangle: " + triangle.area());
    }
}