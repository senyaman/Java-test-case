package application;

import java.util.Scanner;

public class Converter {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        menuOptions();
        selectOption();
    }

    public static void menuOptions() {
        System.out.println("========================================================================\n" +
                "Please select an option to perform(by entering a number in the console):\n" +
                "========================================================================\n" +
                "(1) Convert decimal number to hexadecimal.\n" +
                "(2) Convert base 10 decimal to base 2 decimal.\n" +
                "(3) Convert base 2 decimal to base 10 decimal.\n" +
                "(4) To terminate the application.\n" +
                "========================================================================\n");
    }

    public static boolean selectOption() {
        System.out.println("Enter option number from the above menu:");
        while(true) {
            int option = input.nextInt();
            if (option == 1) {
                decimalToHex();
                menuOptions();
                selectOption();
                return true;
            } else if (option == 2) {
                decimalToBinary();
                menuOptions();
                selectOption();
                return true;
            } else if (option == 3) {
                binaryToDecimal();
                menuOptions();
                selectOption();
                return true;
            } else if(option == 4) {
                System.exit(0);
            } else {
                System.out.println("You entered an invalid option.Try again:");
            }
        }
    }

    public static boolean decimalToHex() {
        System.out.println("Enter a decimal number you wish to convert to hexadecimal:");
        while (true) {
            int decimal = input.nextInt();
            if (decimal >= 0 && decimal <= 10000) {
                System.out.println("From Decimal: " + decimal + "\n" + "To Hexadecimal: " + Integer.toHexString(decimal));
                return true;
            } else {
                System.out.println("Out of range. Try again and enter numbers(0-10000):");
            }
        }

    }

    public static boolean decimalToBinary() {
        System.out.println("Enter the decimal number you wish to convert to binary:");
        while(true) {
            int decimal = input.nextInt();
            if (decimal >= 0 && decimal <= 10000) {
                System.out.println("From Decimal: " + decimal + "\n" + "To Binary: " + Integer.toBinaryString(decimal));
                return true;
            } else {
                System.out.println("Out of range. Try again and enter numbers(0-10000):");
            }
        }

    }

    public static boolean binaryToDecimal() {
        System.out.println("Enter the binary number you wish to convert to decimal:");
        while(true) {
            String binary = input.next();
            int decimal = Integer.parseInt(binary, 2);
            if (decimal >= 0 && decimal <= 10000) {
                System.out.println("From Binary: " + binary + "\n" + "To Decimal: " + decimal);
                return true;
            } else {
                System.out.println("Out of range. Accepts(0-10000), try again:");
            }
        }
    }

}
