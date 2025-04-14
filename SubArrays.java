import java.util.ArrayList;
import java.util.List;

public class SubArrays {

    // Method to find all starting indices where the subarray 'sub' appears in array 'arr'
    public static void subArrays(int arr[], int sub[]) {
        List<Integer> res = new ArrayList<>(); // List to store starting indices of matches

        int n = arr.length; // Length of the main array
        int m = sub.length; // Length of the subarray to match

        // Loop through 'arr' from index 0 to n - m (inclusive)
        // Because a subarray of size m can't start beyond this point
        for (int i = 0; i <= n - m; i++) {
            boolean istrue = true; // Flag to check if subarray matches

            // Compare each element of 'sub' with the corresponding element in 'arr' starting at index i
            for (int j = 0; j < m; j++) {
                if (arr[i + j] != sub[j]) {
                    istrue = false; // Mismatch found
                    break;          // Exit inner loop early
                }
            }

            // If all elements matched, store the starting index
            if (istrue) {
                res.add(i);
            }
        }

        // Print all starting indices where subarray 'sub' was found
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }

    public static void main(String[] args) {
        // Example input: main array and subarray to search for
        int[] a = {2, 3, 0, 3, 0, 3, 0};
        int[] b = {3, 0, 3, 0};

        // Call the method with inputs
        subArrays(a, b);
    }
}
