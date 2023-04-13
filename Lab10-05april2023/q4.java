/*Write a program in Java to copy the content of a given file to another user entered file using character stream. */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class q4 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file to be copied: ");
        String file1 = sc.nextLine();
        System.out.println("Enter the name of the file to be copied to: ");
        String file2 = sc.nextLine();
        FileReader fr = new FileReader(file1);
        FileWriter fw = new FileWriter(file2);
        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fr.close();
        fw.close();
        sc.close();
    }
}