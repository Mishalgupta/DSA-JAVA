package javapractice;

//*****USING RUNNABLE INTERFACE*****
//class M implements Runnable {
//    public void run() {
//        int i;
//        for (i = 0; i < 10; i++) {
//            System.out.println("Thread A:" + i);
//        }
//    }
//}
//
//class N implements Runnable {
//    public void run() {
//        int i;
//        for (i = 0; i < 10; i++) {
//            System.out.println("Thread B:" + i);
//        }
//    }
//}
//
//public class Threads {
//
//    public static void main(String[] args) {
//        M m1 = new M();
//        N n1 = new N();
//        Thread t1 = new Thread(m1);
//        Thread t2 = new Thread(n1);
//        t1.start();
//        t2.start();
//    }
//
//}

//****USING THREAD CLASS******

class M extends Thread {
    public void run() {
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("Thread A:" + i);
        }
    }
}

class N extends Thread {
    public void run() {
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("Thread B:" + i);
        }
    }
}

public class Threads {

    public static void main(String[] args) {
        M m1 = new M();
        N n1 = new N();
        m1.start();
        n1.start();
    }

}