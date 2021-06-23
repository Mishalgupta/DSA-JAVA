package Stack;

import java.util.Stack;

//A celebrity is a person who is known to all but does not know anyone at a party.
//If you go to a party of N people, find if there is a celebrity in the party or not.
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(1)
public class CelebrityProblem {
    static int getCelebrity(int arr[][], int n, int m) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() >= 2) {
            int i = st.pop();
            int j = st.pop();
            if (arr[i][j] == 1) {
                // if i knows j, so i is not celebrity.
                st.push(j);
            } else {
                // if i don't knows j so j is not celebrity.
                st.push(i);
            }
        }
        int celebrity = st.pop();
        for (int i = 0; i < n; i++) {
            if (i != celebrity) {
                if (arr[i][celebrity] == 0 || arr[celebrity][i] == 1) {
                    return -1;
                }
            }
        }
        return celebrity;
    }

    public static void main(String[] args) {
        int arr[][] = { { 0, 1, 1, 1, 1 }, { 1, 0, 0, 1, 0 }, { 1, 0, 0, 1, 0 }, { 0, 0, 0, 0, 0 }, { 0, 1, 0, 1, 0 } };
        int n = arr.length;
        int m = arr[0].length;
        int Clebrity = getCelebrity(arr, n, m);
        System.out.print("Celebrity is: " + Clebrity);

    }

}
