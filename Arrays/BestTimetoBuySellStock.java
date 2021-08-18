package Arrays;

public class BestTimetoBuySellStock {
//    You are given an array prices where prices[i] is the price of a given stock on the ith day.
//    You want to maximize your profit by choosing a single day to buy one stock 
//    and choosing a different day in the future to sell that stock.
//    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

    public static int maxProfit(int[] prices) {
//        Time complexity : O(n) Only a single pass is needed.
//        Space complexity : O(1) Only two variables are used.
        int n = prices.length;
        int minprice = Integer.MAX_VALUE;
        int maxprice = 0;

        for (int day = 0; day < n; day++) // n times
        {
            if (minprice > prices[day]) {
                minprice = prices[day];
            } else if (prices[day] - minprice > maxprice) {
                maxprice = prices[day] - minprice;
//                System.out.println(maxprice);
            }
        }
        return maxprice;

        // Brute force approach O(n^2) time complexity as loop runs n(n-1)/2
//        Space complexity : O(1) Only two variables maxprofit and profit are used.
//        int n = prices.length;
//        int maxprice = 0;
//        for (int i = 0; i < n - 1; i++) // n-1 times
//        {
//            for (int j = i + 1; j < n; j++) // n times
//            {
//                int maxprice1 = prices[j] - prices[i];
//                if (maxprice1 > maxprice) {
//                    maxprice = maxprice1;
//                }
//            }
//        }
//        return maxprice;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 9, 6, 7, 4 };
//        int arr[] = { 7, 6, 4, 3, 1 };
        System.out.println("max profit will be: " + maxProfit(arr));
    }

}