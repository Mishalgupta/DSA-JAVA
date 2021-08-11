package javapractice;

//****Normal Class*****
//class Gc {
//    String i;
//
//    public void show(String i1) {
//        this.i = i1;
//    }
//
//    public String set() {
//        return (i);
//    }
//}
//
//public class GenericClass {
//
//    public static void main(String[] args) {
//        Gc g1 = new Gc();
//        g1.show("A");
//        g1.set();
//        System.out.println("g1=" + g1.set());
//
//    }
//
//}

//*****Generic Class******
class Gc<T> {
    T i;

    public void set(T i1) {
        this.i = i1;
    }

    public T show() {
        return (i);
    }
}

public class GenericClass {

    public static void main(String[] args) {
        Gc<String> g1 = new Gc<String>();
//        Gc<Double> g2 = new Gc<Double>();
        String i2 = new String("A");
//        Double i2 = new Double("A");
        g1.set(i2);
//        g2.show(i3);
        System.out.println("g1=" + g1.show());
//        System.out.println("g2="+g2.set());

    }

}