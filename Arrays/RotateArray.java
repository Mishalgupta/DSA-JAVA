package Arrays;

public class RotateArray {
    static void rotate(int a[], int n) {
        // O(n) time complexity
        // O(1) space complexity
        int temp = a[n - 1];
        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = temp;
    }

//    method-2
    // Time-O(n)
    // Space-O(n)
//    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
//        
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//
//        for (int i = 0; i < arr.size(); i++) {
//            if (i < d) {
//                list1.add(arr.get(i));
//            } else if (i >= d) {
//                list2.add(arr.get(i));
//            }
//        }
//        
//        list1.addAll(0, list2);
//        return list1;
//    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int n = a.length;
        rotate(a, n);
        // StringBuider makes the string mutable
        // (can change/update in same reference object)

        // string creating using new keyword
//        StringBuilder str = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            str.append(a[i] + " ");
//        }
//        System.out.println(str);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
