package comp249_ww;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        int x = 3;

        int z = 0;

        try {
            int y = getNumber();
            int b = getNumber();
            int c = getNumber();
            int d = getNumber();
            z = x / (x - y); // Division by Zero
            System.out.println("Another line of code");
            System.out.println("Another line of code");
            System.out.println("Another line of code");
            System.out.println("Another line of code");
            System.out.println("Another line of code");
            System.out.println("Another line of code");
            System.out.println("Another line of code");
            System.out.println("Another line of code");

        } catch (ArithmeticException ae) {
            System.out.println("Division by zero.");
        } catch (InputMismatchException ime) {
            System.out.println("The input must be an int.");
        } catch (Exception ex) {
            System.out.println("There was a problem with your program." + ex.getMessage());
            System.exit(0);
        } finally {
            System.out.println("This is finally.");
        }

        System.out.println("The result is " + z);

    }

    public static int getNumber() throws InputMismatchException {
        System.out.print("Please input a number: ");
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt(); // InputMismatch
        return y;
    }

}
