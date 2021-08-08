package javapractice;

abstract class Person {
    String name;
    int age;

    abstract public void set(String n);

    abstract public void set(int a);

    abstract public void show();
}

class Per extends Person {
    public void set(String n) {
        this.name = n;
    }

    public void set(int a) {
        this.age = a;
    }

    public void show() {
        System.out.println("Name=" + name + "\n" + "age=" + age);
    }
}

class Abstract {

    public static void main(String[] args) {
        Person p = new Per();
        p.set("mishal");
        p.set(12);
        p.show();

    }

}
