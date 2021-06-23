package Stack;

import java.util.Stack;

public class MaxAreaHistogram {
//    method-1; using NSR & NSL
//    Expected Time Complxity : O(N)
//    Expected Auxilliary Space : O(N)
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
        int maxarea = 1;
        for (int i = 0; i < n; i++) {
            int area = hist[i] * (right[i] - left[i] - 1);
//            System.out.println(area);
            maxarea = Math.max(area, maxarea);
        }
        return maxarea;

    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 5, 4, 5, 1, 6 };
        int n = arr.length;
        int ans[] = leftSmaller(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        int ans1[] = rightSmaller(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans1[i] + " ");
        }
        System.out.println();
        int ans3 = getMaxArea(arr, n);
        System.out.print("maximum area is: " + ans3);
    }
}
