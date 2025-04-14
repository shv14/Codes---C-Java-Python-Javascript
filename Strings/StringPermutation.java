package Strings;
import java.util.HashMap;
import java.util.Scanner;

public class StringPermutation {

    // Method to check if two strings are permutations of each other
    public static void isStringPermutation(String str, String txt) {

        // If lengths are different, they cannot be permutations
        if (str.length() != txt.length()) {
            System.out.println("false");
        } else {

            // Create two HashMaps to store character frequencies for both strings
            HashMap<Character, Integer> strmp = new HashMap<>();
            HashMap<Character, Integer> txtmp = new HashMap<>();

            // Count frequency of each character in the first string
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                // If character is already present, increment count; else initialize to 1
                strmp.put(ch, strmp.getOrDefault(ch, 0) + 1);
            }

            // Count frequency of each character in the second string
            for (int i = 0; i < txt.length(); i++) {
                char ch = txt.charAt(i);
                txtmp.put(ch, txtmp.getOrDefault(ch, 0) + 1);
            }

            // Compare the two maps; if equal, strings are permutations of each other
            System.out.println(txtmp.equals(strmp));
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt user for first string
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();

        // Prompt user for second string
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        // Close the scanner
        sc.close();

        // Call the method to check if the strings are permutations
        isStringPermutation(str1, str2);
    }
}
