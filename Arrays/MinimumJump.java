package Arrays;

//Given an array of integers where each element represents the max number of steps that can be made forward from that element. 
//Find the minimum number of jumps to reach the end of the array (starting from the first element).
//If an element is 0, then you cannot move through that element.
public class MinimumJump {
    static int minJumps(int[] arr) {
//        Expected Time Complexity: O(N)
//        Expected Space Complexity: O(1)

        int n = arr.length;
        int maxR = arr[0];
        int step = arr[0];
        int jump = 1;
        if (n == 1) {
            return 0;
        } else if (arr[0] == 0) {
            return -1;
        } else {
            for (int i = 1; i < n; i++) {
                // Check if we have reached the end of the array
                if (i == n - 1) {
                    return jump;
                }
                // here arr[i]+i "+i" is used because we need to use the next index on every
                // iteration we can't start from previous one.
                maxR = Math.max(maxR, arr[i] + i);
//                We used up a step to get to the current index, so steps has to be decreased.
//                step--;
//                If no more steps are remaining (i.e. steps=0, then we must have used a jump. Therefore increase jump. 
//                Since we know that it is possible to reach max range, we again initialize the steps to the number of steps to reach 
//                maxReach from position i. But before re-initializing step, we also check whether a step is becoming zero or negative.
//                In this case, It is not possible to reach further.
//                if (step == 0) {
//                    jump++;
//                    if(i>=maxReach)
//                       return -1;
//                    step = maxReach - i;
//                }
                step--;
                if (step == 0) {
                    jump++;
                    if (i >= maxR) {
                        return -1;
                    }
                    step = maxR - i;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
//      int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        int arr[] = { 1, 4, 3, 2, 6, 7 };
        int n = minJumps(arr);
        System.out.println(n);
    }
}
