// Jonathan Sonnek
// February 3rd, 2026
// Binary Calculator

import java.util.Scanner;

public class Main {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {
//      Define variables and request input for them.
        String x, y;
        System.out.print("Enter a number in binary: ");
        x = userinput.nextLine();
        System.out.print("Enter a second number in binary: ");
        y = userinput.nextLine();

//      Get User input for operation
        System.out.println("Select operation (1-6)\n" +
                "1:Addition, 2:Subtraction, 3:Multiplication, 4:Division, 5:All operations:");
        int operation = userinput.nextInt();
//      Perform operation based on user input
        if (operation == 1) {
            System.out.println("Sum is : " + Integer.toBinaryString(Integer.parseInt(x,2) + Integer.parseInt(y,2)));
        }
        else if (operation == 2) {
            System.out.println("Difference is : " + Integer.toBinaryString(Integer.parseInt(x,2) - Integer.parseInt(y,2)));
        }
        else if (operation == 3) {
            System.out.println("Product is : " + Integer.toBinaryString(Integer.parseInt(x,2) * Integer.parseInt(y,2)));
        }
        else if (operation == 4) {
            System.out.println("Quotient is : " + Integer.toBinaryString(Integer.parseInt(x,2) / Integer.parseInt(y,2)));
        }
        else if (operation == 5) {
            System.out.println("Sum is : " + Integer.toBinaryString(Integer.parseInt(x,2) + Integer.parseInt(y,2)));
            System.out.println("Difference is : " + Integer.toBinaryString(Integer.parseInt(x,2) - Integer.parseInt(y,2)));
            System.out.println("Product is : " + Integer.toBinaryString(Integer.parseInt(x,2) * Integer.parseInt(y,2)));
            System.out.println("Quotient is : " + Integer.toBinaryString(Integer.parseInt(x,2) / Integer.parseInt(y,2)));
        }
        else {
            System.out.println("Invalid operation selected.");
        }
    }
}