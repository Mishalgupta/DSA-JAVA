package Arrays;

import java.util.*;

public class ArrayIntersaction {

    // Method-1 For unsorted arrays O(n) Time & O(n) Space
//        Set<Integer> hs = new HashSet<Integer>();
////        Set<Integer> hs1 = new HashSet<Integer>();
//
//        for (int i = 0; i < a.length; i++)
//            hs.add(a[i]);
//
//        for (int j = 0; j < b.length; j++)
//            if (hs.contains(b[j]))
//                System.out.print(b[j] + " ");
//    }
//}

    // Method-2 For unsorted arrays O(n) Time & O(n) Space
    public static void intersection(int[] a, int[] b) {
        // in the HashSet duplicates are not allowed.
        Set<Integer> st1 = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();
        for (int x : a)
            st1.add(x);
        System.out.println(st1);
        for (int x : b)
            st2.add(x);
        System.out.println(st2);
        // retainAll() is a method of collection interface which returns True/False
        // retainAll will remove all elements,
        // which are given in the st1 but not in the st2.
        System.out.println(st1.retainAll(st2));

//      size() (method of collection interface)array ka size nahi uske ander kitne elements hai vo batata hai.
        System.out.println(st1.size());

        int[] ans = new int[st1.size()];
        int i = 0;
        Iterator<Integer> it = st1.iterator();
//        The hasNext() is a method of Java Scanner class which returns true if this scanner has another token in its input.
//        The next() is a method of Java Scanner class which finds and returns the next complete token from the scanner which is in using.
        while (it.hasNext()) {
            ans[i] = it.next();
            System.out.print(ans[i] + " ");
            i++;
        }
    }

    public static void main(String[] args) {
//        int a[] = { 1, 2, 3, 4, 5 };
//        int b[] = { 1, 2, 3 };
        int a[] = { 1, 1, 2, 2, 3, 3, 3, 5 };
        int b[] = { 1, 2, 1, 3, 2, 2, 3 };
        intersection(a, b);

    }

}
