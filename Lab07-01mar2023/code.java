/*A file named "iris.csv" is given, which contains 150 rows and five columns of real data.Out of five columns real 
values four are double types and last column is of String type.Define a class "Iris" which has five instance 
variables, out of which four instance variables are private, final and double data types and last one is private, 
final and String data types. Also, that class contains five public methods, from which four methods return double 
values and one method returns String data. Then, create a package to keep that Class inside the package. Write a 
Java program to read "iris.csv" file rowwise (line by line) and create an array of 150 Iris class objects. Find out 
minimum, maximum, average, and standard deviation of each four columns individually. Average and Standard deviation 
are vectors of four coordinates. */

// import pack.Iris;
import java.io.*;
import java.util.*;

import java.lang.Math;

public class code{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("iris.csv"));
        String line = br.readLine();
        Iris[] iris = new Iris[150];
        int i = 0;
        while(line != null)
        {
            String[] values = line.split(",");
            iris[i] = new Iris(Double.parseDouble(values[0]), Double.parseDouble(values[1]), Double.parseDouble(values[2]), Double.parseDouble(values[3]), values[4]);
            line = br.readLine();
            i++;
        }
        br.close();

        double[] A = new double[150];
        double[] B = new double[150];
        double[] C = new double[150];
        double[] D = new double[150];
        String[] Name = new String[150];
        for(i = 0; i < 150; i++)
        {
            A[i] = iris[i].getA();
            B[i] = iris[i].getB();
            C[i] = iris[i].getC();
            D[i] = iris[i].getD();
            Name[i] = iris[i].getName();
        }

        double[] min = new double[4];
        double[] max = new double[4];
        double[] avg = new double[4]; 
        double[] std = new double[4];

        min[0] = A[0];
        min[1] = B[0];
        min[2] = C[0];
        min[3] = D[0];

        max[0] = A[0];
        max[1] = B[0];
        max[2] = C[0];
        max[3] = D[0];
        for(i = 0; i < 150; i++)
        {
            if(A[i] < min[0])
                min[0] = A[i];
            if(B[i] < min[1])
                min[1] = B[i];
            if(C[i] < min[2])
                min[2] = C[i];
            if(D[i] < min[3])
                min[3] = D[i];
            
            if(A[i] > max[0])
                max[0] = A[i];
            if(B[i] > max[1])
                max[1] = B[i];
            if(C[i] > max[2])
                max[2] = C[i];
            if(D[i] > max[3])
                max[3] = D[i];
        }

        for(i = 0; i < 150; i++)
        {
            avg[0] += A[i];
            avg[1] += B[i];
            avg[2] += C[i];
            avg[3] += D[i];
        }
        avg[0] /= 150;
        avg[1] /= 150;
        avg[2] /= 150;
        avg[3] /= 150;

        for(i = 0; i < 150; i++)
        {
            std[0] += Math.pow(A[i] - avg[0], 2);
            std[1] += Math.pow(B[i] - avg[1], 2);
            std[2] += Math.pow(C[i] - avg[2], 2);
            std[3] += Math.pow(D[i] - avg[3], 2);
        }

        std[0] = Math.sqrt(std[0] / 150);
        std[1] = Math.sqrt(std[1] / 150);
        std[2] = Math.sqrt(std[2] / 150);
        std[3] = Math.sqrt(std[3] / 150);

        System.out.println("Minimum : " + min[0] + "   " + min[1] + "   " + min[2] + "   " + min[3]);
        System.out.println("Maximum : " + max[0] + "   " + max[1] + "   " + max[2] + "   " + max[3]);
        System.out.println("Average : " + avg[0] + "   " + avg[1] + "   " + avg[2] + "   " + avg[3]);
        System.out.println("Standard Deviation : " + std[0] + "   " + std[1] + "   " + std[2] + "   " + std[3]);
       }
}