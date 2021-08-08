package javapractice;

import java.util.*;

public class Hashset {

    public static void main(String[] args) {
//        *******HashSet*******
        HashSet<String> h = new HashSet<>();
        h.add("Aaa");
        h.add("Baam");
        h.add("Caam");
        h.add("Daam");
        h.add("Faam");
        Iterator<String> i1 = h.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }

        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

//        ******LinkedHashSet*******
        LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
        lhs.add('1');
        lhs.add('2');
        lhs.add('3');
        lhs.add('4');
        lhs.add('5');
        Iterator<Character> i3 = lhs.iterator();
        while (i3.hasNext()) {
            System.out.println(i3.next());
        }
        if (lhs.add('1') == false) {
            System.out.println("Duplicates are not allowed");
        }
    }

}