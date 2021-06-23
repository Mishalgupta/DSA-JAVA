package Stack;

import java.util.Stack;

public class MaxHistogramInBinaryMatrix {
//  method-1; using NSR & NSL
//  Expected Time Complxity : O(N)
//  Expected Auxilliary Space : O(N)
    static int[] leftSmaller(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        int left[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (st.isEmpty()) {
                left[i] = -1;
            } else {
                if (arr[st.peek()] < arr[i]) {
                    left[i] = st.peek();
                }
                while (arr[st.peek()] >= arr[i]) {
                    st.pop();
                    if (st.isEmpty()) {
                        left[i] = -1;
                        break;
                    } else {
                        left[i] = st.peek();
                    }
                }
            }
            st.push(i);
        }
        return left;
    }

    static int[] rightSmaller(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        int right[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                right[i] = n;
            } else {
                if (arr[st.peek()] < arr[i]) {
                    right[i] = st.peek();
                }
                while (arr[st.peek()] >= arr[i]) {
                    st.pop();
                    if (st.isEmpty()) {
                        right[i] = n;
                        break;
                    } else {
                        right[i] = st.peek();
                    }
                }
            }
            st.push(i);
        }
        return right;
    }

    public static int getMaxArea(int hist[], int n) {
        int left[] = leftSmaller(hist, n);
        int right[] = rightSmaller(hist, n);
        int maxarea = 0;
        for (int i = 0; i < n; i++) {
            int area = hist[i] * (right[i] - left[i] - 1);
//            System.out.println(area);
            maxarea = Math.max(area, maxarea);
        }
        return maxarea;

    }

    static int getMaxRectangle(int arr[][], int n, int m) {
        int res[] = new int[n];
        int result = 0;
        for (int i = 1; i < n; i++) {
            res[i] = arr[0][i];
            result = getMaxArea(res, n);
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    res[j] = 0;
                } else {
                    res[j] = res[j] + arr[i][j];
                }
            }
            result = Math.max(result, getMaxArea(res, n));
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[][] = { { 0, 1, 1, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 0, 0 } };
        int n = arr.length;
        int m = arr[0].length;
        int ans3 = getMaxRectangle(arr, n, m);
        System.out.print("maximum area is: " + ans3);
    }
}