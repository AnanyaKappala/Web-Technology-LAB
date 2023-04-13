/*WAP to design a “MyString” class that perform string operations (compute string length, reverse a string, change 
cases, compare two strings) using your own methods. Create a package “MyPackage” for “MyString” class and define 
all methods in that package. */
import MyPackage.MyString;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        MyString obj = new MyString(str);
        System.out.println("Length of string: " + obj.length());
        System.out.println("Reverse of string: " + obj.reverse());
        System.out.println("Upper case of string: " + obj.upperCase());
        System.out.println("Lower case of string: " + obj.lowerCase());
        System.out.println("Enter another string: ");
        String str2 = sc.nextLine();
        System.out.println("Compare to: " + obj.compareTo(str2));
        sc.close();
    }
}