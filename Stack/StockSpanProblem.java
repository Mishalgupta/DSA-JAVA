package Stack;

import java.util.Stack;

public class StockSpanProblem {

//  Method-1:brute force using loop
//  Expected Time Complexity : O(N^2)
//  Expected Auxilliary Space : O(1)
//    static int[] stockSpan(int arr[], int n) {
//        int res[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            if (n > 0) {
//                res[i] = 1;
//                for (int j = i - 1; (j >= 0 && arr[i] >= arr[j]); j--) {
//                    res[i]++;
//                }
//            } else {
//                res[i] = 1;
//            }
//        }
//        return res;
//    }

//  Method-2: using stack- nearest greater to left question method is used here.
    // here we don't need value , we need index which can be found by subtracting
    // index of given array with the stack index
//  Expected Time Complexity : O(N)
//  Expected Auxilliary Space : O(N)
    static int[] stockSpan(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (st.isEmpty()) {
                res[i] = 1;
            } else {
                if (arr[st.peek()] > arr[i]) {
                    res[i] = i - st.peek();
                }
                while (arr[st.peek()] <= arr[i]) {
                    st.pop();
                    if (st.isEmpty()) {
                        res[i] = i + 1;
                        break;
                    } else {
                        res[i] = i - st.peek();
                    }
                }
            }
            st.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 80, 60, 70, 60, 75, 85 };
//        int arr[] = { 10, 4, 5, 90, 120, 80 };
        int n = arr.length;
//        stockSpan(arr, n);
        int ans[] = stockSpan(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

}
