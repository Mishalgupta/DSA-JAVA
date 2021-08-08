package javapractice;

import java.util.*;

public class CollectionInterface {

    public static void main(String[] args) {
        ArrayList<Character> l = new ArrayList<Character>(4);
        ArrayList<Character> l1 = new ArrayList<Character>(l);
//       ******List Interface*****
        l.add('a');
        l.add('e');
        l.add('d');
        l.add(1, 'b');
        l.set(1, 'c');
        l.get(0);
//        l.remove(1);
        l.removeAll(l);
        l.add('A');
        l.add('B');
        l.add('C');
        l.add('D');
        System.out.println(l.indexOf('C'));
        System.out.println(l.subList(1, 3));
        l1.add('a');
        l1.add('e');
        l1.add('i');
        l1.add('o');
        l1.add('a');
        System.out.println(l.retainAll(l1));
        System.out.println(l1.contains('a'));
//      l1.clear();
        System.out.println(l1.isEmpty());
        System.out.println(l1.indexOf('a'));
        System.out.println(l1.lastIndexOf('a'));
        System.out.println(l1.subList(1, 3));

        // ---------------------------
        Iterator it1 = l1.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        Iterator it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        ******LinkedList********
        LinkedList<Character> list = new LinkedList<Character>();
        list.addFirst('M');
        list.add(1, 'o');
        list.addLast('N');
        System.out.println(list.getFirst());
        System.out.println(list.get(1));
        System.out.println(list.getLast());
        list.removeFirst();
        list.removeLast();

//    *****Vector****
        Stack<Character> stk = new Stack<Character>();
        stk.add('1');
        stk.add('2');
        stk.add('3');
        stk.add('4');
        System.out.println(stk.capacity());
        System.out.println(stk.firstElement());
        System.out.println(stk.indexOf('3'));
        System.out.println(stk.clone());
        stk.insertElementAt('Z', 4);
        System.out.println(stk.get(4));
        stk.addElement('X');
        System.out.println(stk.get(5));
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        // System.out.println(stk.get(2));//array out of bound as we popped out elements
        stk.push('3');
        stk.push('4');
        System.out.println(stk.peek());// return top most elements copy but not delete it
        System.out.println(stk.isEmpty());
        System.out.println(stk.search('1'));
        System.out.println(stk.search('2'));
        System.out.println(stk.search('3'));
        System.out.println(stk.search('4'));

    }

}
