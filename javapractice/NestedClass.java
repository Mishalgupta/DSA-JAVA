package javapractice;

//****STATIC INNER CLASS******
//class Outer {
//    static int x = 10;
//    int y = 190;
//
//    static class Inner {
//        void f1() {
//            System.out.println("f1()=" + x);
//        }
//    }
//}
//
//public class NestedClass {
//
//    public static void main(String[] args) {
//        Outer.Inner i1 = new Outer.Inner();
//        i1.f1();
//
//    }
//}

//****INNER CLASS******
class Outer {
    static int x = 10;
    int y = 100;

    class Inner {
        void f1() {
            System.out.println("x= " + x + " y= " + y);
        }
    }
}

public class NestedClass {

    public static void main(String[] args) {
        Outer o1 = new Outer();
        Outer.Inner i1 = o1.new Inner();
        i1.f1();

    }

}