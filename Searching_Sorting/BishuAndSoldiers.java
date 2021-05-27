package Searching_Sorting;

public class BishuAndSoldiers {
    public static void power(int[] soldeirs, int[] powerbishu, int numbersoldeirs, int rounds) {
        // Method-1 Brute force
//       Time complexity O(n^2)
//       Space complexity O(1);
        for (int i = 0; i < rounds; i++) {
            int count = 0, sum = 0;
            for (int j = 0; j < numbersoldeirs; j++) {
                if (soldeirs[j] <= powerbishu[i]) {
                    count++;
                    sum = sum + soldeirs[j];
                }
            }
            System.out.print(count + " ");
            System.out.print(sum);
            System.out.print("\n");
        }
        
        //Method-2 Binary search 
        //
    }

    public static void main(String[] args) {
        int[] soldeirs = { 1, 2, 3, 4, 5, 6, 7 };
        int[] powerbishu = { 3, 10, 2 };
        int numbersoldeirs = soldeirs.length;
        int rounds = powerbishu.length;
        power(soldeirs, powerbishu, numbersoldeirs, rounds);
    }
}