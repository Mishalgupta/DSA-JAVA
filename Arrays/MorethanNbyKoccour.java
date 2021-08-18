package Arrays;

import java.util.*;

public class MorethanNbyKoccour {
    static int occour(int arr[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int occour = 0;
        int num = arr.length / k;
//        System.out.println(num);
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                // this will count the no. of element occours at each key.
                int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
//                System.out.println(map.get(arr[i]));
//                System.out.println(count);
            } else {
                // if element comes first time then set it's count to 1
                map.put(arr[i], 1);
//                System.out.println(map.put(arr[i], 1));
            }
        }
        // Map.Entry(keys:values) will store/traverse all keys & values store in map
        // hashmap.
        for (Map.Entry<Integer, Integer> map1 : map.entrySet()) {
            // here we can't use int in objects so we have to use Integer
            Integer temp = map1.getValue();
            if (temp > num) {
                occour = occour + 1;
            }
        }
        return occour;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 2, 1, 2, 3, 3 };
//        int arr[] = { 2, 3, 3, 2 };
//        int arr[] = { 1, 2, 2, 2, 3, 3 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.:");
        int k = sc.nextInt();
        int n = arr.length;
        System.out.println("Occorance is: " + occour(arr, n, k));
        sc.close();
    }

}