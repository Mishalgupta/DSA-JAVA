package Greedy;

import java.util.*;

class Item {
    int value, weight;

    public Item(int val, int wt) {
        val = value;
        weight = wt;
    }
}

//Expected Time Complexity : O(NlogN)
//Expected Auxiliary Space: O(1)
class myComp implements Comparator<Item> {
    public int compare(Item a, Item b) {
        // finding value/weight for per unit fraction
        // since while dividing result may be in decimal so we took double
        double r1 = (double) (a.value) / (double) (a.weight);
        double r2 = (double) (b.value) / (double) (b.weight);
        // 1 means in order
        if (r1 < r2) {
            return 1;
        }
        // -1 means not in order
        else if (r1 > r2) {
            return -1;
        }
        return 0;
    }
}

public class FractionalKnapsack {
    // Function to get the maximum total value in the knapsack.
    static double fractionalKnapsack(int W, Item arr[], int n) {
        myComp mc = new myComp();
        // sort them in descending order
        Arrays.sort(arr, mc);
        int curWt = 0;
        double res = 0.0;
        for (int i = 0; i < n; i++) {
            if (curWt + arr[i].weight <= W) {
                curWt += arr[i].weight;
                res += arr[i].value;
            } else {
                int remain = W - curWt;
                res += ((double) arr[i].value / (double) arr[i].weight) * (double) remain;
                // here knapsack is completely filled so we creaked it
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Item it = new Item();
        int capacity = 50;
        int n = wt.length;
        double maxValue = fractionalKnapsack(capacity, val, n);
        // Function call
        System.out.println("Maximum value we can obtain = " + maxValue);
    }

}