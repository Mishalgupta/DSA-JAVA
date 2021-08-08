package javapractice;

class Boxx {
    int x;
    static int y = 5;

    public void fun1() {
        System.out.println("Instance member function");
    }

    public static void fun2() {
        System.out.println("static member function");
        System.out.println("static member=" + y);
//		System.out.println("instance member="+x);
    }

    static class Test {
        public static String country = "INDIA";
    }
}

public class StaticMembers {
    public static void main(String[] args) {
        Boxx b1 = new Boxx();
//	Box b2=new Box();
        System.out.println(Boxx.Test.country);
        System.out.println(Boxx.y);
        b1.fun1();
        Boxx.fun2();
    }

}