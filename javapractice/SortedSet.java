package javapractice;

import java.util.*;

public class SortedSet {

    public static void main(String[] args) {
        TreeSet ss = new TreeSet();
        ss.add("Manu");
        ss.add("Kanu");
        ss.add("Lanu");
        ss.add("Tanu");
        ss.add("zanu");
        Iterator i1 = ss.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }

//        ****SortedSet******
        System.out.println(ss.first());
        System.out.println(ss.last());
        System.out.println(ss.headSet("Manu"));// returns elements which are strictly less than the given element.
        System.out.println(ss.tailSet("Manu"));// returns elements which are greater than & equals the given element.
        System.out.println(ss.subSet("Manu", "zanu"));// return elements in inclusively & exclusively.
        System.out.println(ss.comparator());

//     ******NavigableSet*****
        System.out.println(ss.ceiling("Tanu"));
        System.out.println(ss.ceiling("Uanu"));
        System.out.println(ss.floor("Manu"));
        System.out.println(ss.floor("Nanu"));
        System.out.println(ss.higher("Manu"));
        System.out.println(ss.lower("Manu"));
        System.out.println(ss.pollFirst());
        System.out.println(ss.pollLast());// retreives & removes last elements in treeset.
        System.out.println(ss.pollLast());
    }

}
