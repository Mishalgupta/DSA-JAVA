package javapractice;

class Greeting {
    public void show() {
        System.out.println("Hello");
    }
}

class India {
    Greeting g1 = new Greeting() {
        public void show() {
            System.out.println("Namaste");
        }
    };
}

public class Anonymous {

    public static void main(String[] args) {
        India g2 = new India();
        g2.g1.show();
    }
}