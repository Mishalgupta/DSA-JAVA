package javapractice;

class A1 {
    int z = 2;

    public void f1() {
        System.out.println("This is super class method");
    }
}

class B1 extends A1 {
    int z = 10;

    public void f1() {
        super.f1();
    }

    public void f2() {
        int z = 2;
        System.out.println(z);
        System.out.println(this.z);
        System.out.println(super.z);
    }
}

public class This {

    public static void main(String[] args) {
        B1 obj = new B1();
        obj.f1();
        obj.f2();

    }

}
