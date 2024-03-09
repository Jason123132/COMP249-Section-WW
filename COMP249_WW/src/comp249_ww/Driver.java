package comp249_ww;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        // Open the file
        Scanner myScanner = null;
        try {
            myScanner = new Scanner(new FileInputStream("file.txt"));
        } catch (FileNotFoundException fnfe) {
            System.out.println("Cannot open the file for input.");
            System.exit(0);
        }
        // Read from the file
        while (myScanner.hasNextLine()) {
            String s = myScanner.nextLine();
            System.out.println(s);
        }

        // Close the file
        myScanner.close();
        /*
        // Open the file
        PrintWriter myWriter = null;
        try {
            myWriter = new PrintWriter(new FileOutputStream("file.txt", true));
        } catch (FileNotFoundException fnfe) {
            System.out.println("Cannot open the file.");
            System.exit(0);
        }
        // Write to the file
        myWriter.println("Hello COMP249, Friday Night!");

        // Close the file
        myWriter.close();

         */
    }

}
