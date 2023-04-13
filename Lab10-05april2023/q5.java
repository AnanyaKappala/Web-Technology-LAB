/*Write a java program to capitalize first letter of every word in a file and save new content in another file. */
import java.io.*;
import java.util.*;

public class q5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name");
        String file = sc.nextLine();
        File f = new File(file);
        Scanner sc1 = new Scanner(f);
        String s = "";
        while (sc1.hasNextLine()) {
            s += sc1.nextLine();
        }
        String[] arr = s.split(" ");
        String s1 = "";
        for (int i = 0; i < arr.length; i++) {
            s1 += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1) + " ";
        }
        System.out.println(s1);
        FileWriter fw = new FileWriter("sample5b.txt");
        fw.write(s1);
        fw.close();
    }
}