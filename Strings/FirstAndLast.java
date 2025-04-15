package Strings;

import java.util.Scanner;

public class FirstAndLast {

    // Method using split() to find and print first and last words of a string
    public static void firstnlast1(String s) {
        // Check for empty input
        if (s.length() == 0) {
            System.out.println("Input is invalid");
            return;
        }

        // Split the input string using one or more spaces as delimiter
        String[] NameArray = s.split("\\s+");

        // First word is the first element of the array
        String firstName = NameArray[0];

        // Last word is the last element of the array
        String lastName = NameArray[NameArray.length - 1];

        // Print the first and last words
        System.out.println(firstName + " " + lastName);
    }

    // Method using indexOf() and lastIndexOf() to find and print first and last words
    public static void firstnlast2(String s) {
        // Check for empty input
        if (s.length() == 0) {
            System.out.println("Input is invalid");
            return;
        }

        // Find the position of the first and last spaces in the string
        int firstSpace = s.indexOf(' ');
        int lastSpace = s.lastIndexOf(' ');

        // Extract first name: substring from beginning to first space
        String firstName = s.substring(0, firstSpace);

        // Extract last name: substring from last space to end
        String lastName = s.substring(lastSpace + 1);

        // Print the first and last words
        System.out.println(firstName + " " + lastName);
    }

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter the string:");
        String input = scanner.nextLine();

        // Call the method to extract and print first and last names using index method
        firstnlast2(input);

        // You can also test the other method by uncommenting the line below
        // firstnlast1(input);
    }
}
