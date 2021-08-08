package javapractice;

class Parent {
    static int y=4;
    public static void f1() {
        System.out.println("Hello super");
    }
}

class Child extends Parent {
    static {
        y=5;
    }
    public static void f1() {
        System.out.println("Hello Sub"); //function hiding
    }
}

public class StaticMemFun {

    public static void main(String[] args) {
//      Child.f1();
        System.out.println("Y="+Child.y);//static variable runs once only
      Child.f1();
    }

}
