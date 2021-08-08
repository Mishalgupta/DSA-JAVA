package javapractice;

class A2 {
    int a;

    public A2() {
        System.out.println("A");
    }

    public A2(int x) {
//        a = x;
        System.out.println("A");
    }
}

class B2 extends A2 {
    int b;

    public B2() {
        super(4);
//        this(5); // constructor can't have both super & this at same time.
        System.out.println("B");
    }

    public B2(int x) {
        a = x;
        System.out.println("A");
    }
}

public class ConstChain {

    public static void main(String[] args) {
        // constructor calls implicitly as soon as new object created
        // & memory is allocated to it
        new B2();
    }

}