package Arrays;

//Find a starting point where the truck can start to get through the complete circle without exhausting its petrol in between.
//Note :  Assume for 1 litre petrol, the truck can go 1 unit of distance.
public class CircularTourProblem {
    // Method-1:
//    Expected Time Complexity: O(N)
//    Expected Auxiliary Space : O(1)
    static int tour(int petrol[], int distance[]) {
        // as we need to take circular tour so we also take
        // difference so that we can check it further weather it's +ve or -ve
        int sum = 0, diff = 0, start = 0;
        for (int i = 0; i < petrol.length; i++) {
            sum = sum + petrol[i] - distance[i];
            if (sum < 0) {
                start = i + 1;
                diff = diff + sum;
                sum = 0;
            }
        }
        if (sum + diff >= 0) {
            return start;
        }
        return -1;
    }

    public static void main(String[] args) {
        int Petrol[] = { 4, 6, 7, 4 };
        int[] Distance = { 6, 5, 3, 5, };
        int res = tour(Petrol, Distance);
        System.out.println("Cicular tour starting point is: " + res);
    }

}