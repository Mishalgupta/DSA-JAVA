package javapractice;

import java.util.*;

public class Cursors {

    public static void main(String[] args) {
//      <<<<<<<<<<<- Enumeration ->>>>>>>>>
//        ****STRING based*****
        Vector vec = new Vector();
        vec.addElement("ro");
        vec.addElement("Dog");
        vec.addElement("Og");
        vec.addElement("Mg");
        System.out.println(vec);
        Enumeration e = vec.elements();
        while (e.hasMoreElements()) {
            String s = (String) e.nextElement();
            System.out.println(s + "=" + s.length());
        }

//        *******Charcter based*****
        Vector vec1 = new Vector();
        vec1.addElement('a');
        vec1.addElement('b');
        vec1.addElement('c');
        vec1.addElement('d');
        System.out.println(vec1);
        Enumeration e1 = vec1.elements();
//        vec1 is a object which implements the enum interface &
//        generates a series of elements(stored in e1) one at a time.
        while (e1.hasMoreElements()) {
            char s = (char) e1.nextElement();
            System.out.println(s);

        }

//      <<<<<<<<<-Iterator->>>>>>>>>
        ArrayList a1 = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            a1.add(i);
        }
        System.out.println(a1);
        Iterator it = a1.iterator();
        while (it.hasNext()) {
            Integer I = (Integer) it.next();
            if (I > 3 && I < 9) {
                it.remove();
            }

        }

        System.out.println(a1);
    }

}
