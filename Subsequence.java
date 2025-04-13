import java.util.Scanner;

public class Subsequence {
    // text is the string in which you want to search pattern
    public static void subsequence(String text, String pat) {
        int p = text.length() - 1;
        int t = pat.length() - 1;

        // stop if any of the strings are fully traversed
        while (t != 0 && p != 0) {

            //check if the last character of the pat is equal to the last character of text 
            
            if (text.charAt(p) == pat.charAt(t)) {
                //if yes then decrease the pointer by one from both the strings indicating the pattern matched for one character 
                p--;
                t--;
            } else {
                // else do not decrease the pointer for pattern as it is yet not found
                p--;
            }
        }

        // if pattern is fully traversed means the pattern was subsequence of text else not
        if (t == 0) {
            System.out.println("Subsequence present");
        } else {
            System.out.println("Subsequence not present");
        }

    }

    public static void main(String[] args) {
        String text, pat;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        text = sc.nextLine();
        System.out.println("Enter the pattern: ");
        pat = sc.nextLine();
        sc.close();
        subsequence(text, pat);
    }

}
