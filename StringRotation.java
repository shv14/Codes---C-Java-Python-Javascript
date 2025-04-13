import java.util.Scanner;

public class StringRotation {
    // function to rotate string to left
    public static void rotateLeft(String s, int k) {
        String first = s.substring(0, k);  // store the first set of characters that will be gone after rotation
        System.out.println(first);
        String str = s.substring(k, s.length()) + first;  // append the stored set of characters to form rotated string
        System.out.println("Left Rotation : " + str);
    }

    public static void rotateRight(String s, int k) {
        String last = s.substring(s.length() - k, s.length()); // store the last set of characters that will be gone after rotation
        System.out.println(last);
        String str = last + s.substring(0, s.length() - k); // prepend the stored characters to form rotated string
        System.out.println("Right Rotation : " + str);
    }

    public static void main(String[] args) {
        String str;
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        str = sc.nextLine();
        System.out.println("Enter the number of rotations: ");
        k = sc.nextInt();
        sc.close();
        rotateLeft(str, k);
        rotateRight(str, k);
    }

}