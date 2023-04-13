/*WAP to find the perimeter and area of a circle given a value of radius. */
import java.io.*;
public class q2
{           
    public static void main(String args[])
    {
        int radius;
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            System.out.println("Enter the radius of a Circle: "); 
            String str = br.readLine();
            radius = Integer.parseInt(str);
            double area, perimeter; 
            area = 3.14 * radius * radius;     
            perimeter=2 * 3.14 * radius;
            System.out.println("Area of Circle: " + area);
            System.out.println("Perimeter of Circle: " + perimeter);
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e);                       
        }   
    }
}