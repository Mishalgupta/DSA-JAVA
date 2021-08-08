package javapractice;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorCursor {

    public static void main(String[] args) {
        // <<<<<<<<<-List-Iterator->>>>>>>>>
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Java");
        ll.add("Os");
        ll.add("Dbms");
        ll.add("MERN");
        System.out.println(ll);
        ListIterator lt = ll.listIterator();

//        System.out.println(lt.previous());
        System.out.println(lt.hasPrevious());
        System.out.println(lt.previousIndex());
        System.out.println(lt.nextIndex());
        while (lt.hasNext()) {
            String str = (String) lt.next();
            if (str.equals("Java")) {
                lt.add("Java SE");
            } else if (str.equals("Dbms")) {
                lt.set("Maths");
            } else if (str.equals("Os")) {
                lt.remove();
            }
//           System.out.println(lt.previous());
//           System.out.println(lt.hasPrevious());
//           System.out.println(lt.previousIndex());
//            System.out.println(lt.nextIndex());
        }
        System.out.println(ll);

//        System.out.println(lt.previous());
//        System.out.println(lt.hasPrevious());
//        System.out.println(lt.previousIndex());
//        System.out.println(lt.nextIndex());
    }
}
