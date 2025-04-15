package Strings;

import java.util.Scanner;

// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock
// and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction.
public class Best_Time_to_Buy_and_Sell_Stock {

    // Method to calculate the maximum profit
    public static int maxProfit(int[] prices) {
        // Two pointers: i = buy day, j = sell day
        int i = 0, j = 1;

        // Variable to store the maximum profit found
        int maximum = 0;

        // Loop through the array while j is within bounds
        while (j < prices.length) {
            // If selling price is greater than buying price, calculate profit
            if (prices[i] < prices[j]) {
                int currentPrice = prices[j] - prices[i]; // profit for current pair
                maximum = Math.max(maximum, currentPrice); // update max profit if current is greater
            } else {
                // If the current price is lower or equal to buying price, update i to j
                // This means we're choosing a new (lower) buy day
                i = j;
            }
            j++; // move to the next day
        }

        // Return the maximum profit calculated
        return maximum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the size of the array
        System.out.println("Enter the size of the array:");
        int Size = scanner.nextInt();

        // Create and fill the array with stock prices
        int[] inputArray = new int[Size];
        System.out.println("Enter " + Size + " stock prices:");
        for (int i = 0; i < Size; i++) {
            inputArray[i] = scanner.nextInt();
        }

        // Call maxProfit method and print the result
        int max = maxProfit(inputArray);
        System.out.println("Maximum profit: " + max);
    }
}
