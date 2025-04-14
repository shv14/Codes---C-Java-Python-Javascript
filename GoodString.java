import java.util.Scanner;

// **This question was asked in Redaptive placements**

// Problem Statement - 

// Find the length of the longest substring in a given input where the characters are
// lowercase letters (a-z) and 
// each consecutive character is either the same, adjacent alphabetically (e.g., a followed by b, or c followed by b), or 
// wraps around from z to a or a to z. Ignore non-lowercase characters.

public class GoodString {

    // Method to find the length of the longest "good" substring
    public static int goodString(String s) {
        int m = 0; // Holds the maximum length of a "good" substring
        int l = 0; // Holds the current length of a "good" substring

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i); // Current character

            // If character is not a lowercase letter, reset the current length
            if (cur < 'a' || cur > 'z') {
                l = 0;
                continue;
            }

            // If it's the first character, start a new "good" substring
            if (i == 0) {
                l = 1;
            } else {
                char prev = s.charAt(i - 1); // Previous character

                // Subsequence.Check if current character continues a "good" pattern
                if (
                    prev + 1 == cur ||        // Next alphabetical character (e.g., a -> b)
                    cur == prev - 1 ||        // Previous alphabetical character (e.g., b -> a)
                    prev == cur ||            // Same character repeated
                    (prev == 'a' && cur == 'z') || // Special wraparound case: a -> z
                    (prev == 'z' && cur == 'a')    // Special wraparound case: z -> a
                ) {
                    l++; // Extend the current "good" substring
                } else {
                    l = 1; // Reset the current length
                }

                // Update maximum length if current is greater
                m = Math.max(m, l);
            }
        }

        return m; // Return the length of the longest "good" substring
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text to check for good string: ");
        String str = sc.nextLine(); // Read user input
        sc.close();
        System.out.println(goodString(str)); // Output the result
    }
}
