/*Write a program in java using inheritance to show how to call the base class parameterized constructors from the derived class using 
super. */
import java.util.Scanner;

class Base {
    int x, y;

    public Base(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Base class constructor called with x = " + x + " and y = " + y);
    }
}

class Derived extends Base {
    int z;

    public Derived(int x, int y, int z) {
        super(x, y); // Call the constructor of the Base class
        this.z = z;
        System.out.println("Derived class constructor called with z = " + z);
    }
}

public class q5a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter values for x, y, and z
        System.out.print("Enter a value for x: ");
        int x = sc.nextInt();
        System.out.print("Enter a value for y: ");
        int y = sc.nextInt();
        System.out.print("Enter a value for z: ");
        int z = sc.nextInt();

        // Create an object of the Derived class with the user input values
        Derived derived = new Derived(x, y, z);
    }
}
