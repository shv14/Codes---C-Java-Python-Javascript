import java.util.Scanner;

public class MakePalindrome {

    // Method to make a string into a palindrome by adding characters at the end
    public static void makePalindrome(String str) {
        int i = str.length() - 1;
        String pal = "";

        // Start from the end of the string and move backward
        // Keep checking if the substring from 0 to i is a palindrome
        // If not, add characters in reverse to 'pal' to build the suffix
        while (i >= 0 && !isPalindrome(str, 0, i)) {
            pal = pal + str.charAt(i); // Append non-palindromic characters to 'pal'
            i--;
        }

        // Print the final result by appending the reverse suffix to the original string
        System.out.println("Palindrome string : " + pal + str);
    }

    // Utility method to check if a substring (from index i to j) is a palindrome
    public static boolean isPalindrome(String str, int i, int j) {
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false; // Not a palindrome
            }
            i++;
            j--;
        }
        return true; // It is a palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the input string
        System.out.println("Enter the text to make palindrome: ");
        String str = sc.nextLine();

        sc.close();

        // Call the method to process the input
        makePalindrome(str);
    }
}
