package javapractice;

import java.util.Collections;
import java.util.Vector;

public class CollectionsClass {

    public static void main(String[] args) {
        Vector vc = new Vector();
        vc.add(10);
        vc.add(30);
        vc.add(20);
        vc.add(50);
        System.out.println(vc);
        Collections.sort(vc);
        System.out.println(vc);
        Collections.swap(vc, 1, 2);
        System.out.println(vc);
        int x = Collections.binarySearch(vc, 30);
        System.out.println(x);
        Collections.reverse(vc);
        System.out.println(vc);
        Collections.shuffle(vc);
        System.out.println(vc);
    }

}
