package Stack;

import java.util.Stack;

public class NextSmallerElement {
//  Method-1: Brute force using loop
//  Expected Time Complexity : O(N^2)
//  Expected Auxilliary Space : O(1)
//    static void smaller(int arr[], int n) {
//        int res = 0;
//        for (int i = 0; i < n; i++) {
//            if (i < n - 1) {
//                for (int j = i + 1; j < n; j++) {
//                    if (arr[i] > arr[j]) {
//                        res = arr[j];
//                        break;
//                    } else {
//                        res = -1;
//                    }
//                }
//            } else {
//                res = -1;
//            }
//            System.out.print(res + " ");
//        }
//    }

//  Method-2: using stack
//  Expected Time Complexity : O(N)
//  Expected Auxilliary Space : O(N)
    static int[] smaller(int arr[], int n) {
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                if (st.peek() < arr[i]) {
                    res[i] = st.peek();
                } else {
                    while (st.peek() >= arr[i]) {
                        st.pop();
                        if (st.isEmpty()) {
                            res[i] = -1;
                            break;
                        } else {
                            res[i] = st.peek();
                        }
                    }
                }
            }
            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
//        int arr[] = { 4, 2, 1, 5, 3 };
        int arr[] = { 5, 6, 2, 3, 1, 7 };
        int n = arr.length;
//        smaller(arr, n);
        int ans[] = smaller(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
