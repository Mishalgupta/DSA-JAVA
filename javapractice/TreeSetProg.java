package javapractice;

import java.util.*;

public class TreeSetProg {

    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add('A');
        ts.add('B');
        ts.add('C');
        ts.add('D');
//        ts.add(null); //not valid after jdk6
//        ts.add("Mishal"); //duplicates not allowed in treeset
        Iterator i1 = ts.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }

        TreeSet ts1 = new TreeSet();
        ts1.add(new StringBuffer("B"));
        ts1.add(new StringBuffer("A"));
        ts1.add(new StringBuffer("C"));
        System.out.println(ts1);// before jdk12 it gave exception becoz AtringBuffer Doesn't implements
                                // comparable
        Iterator i2 = ts1.iterator();
        while (i2.hasNext()) {
            System.out.print(i2.next());
        }

    }

}
