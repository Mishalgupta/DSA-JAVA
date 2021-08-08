package javapractice;

interface Person1 {
    void somefunction();
}

class Employee implements Person1 {
    public void somefunction() {
        System.out.println("Hi there");
    }
}

class ScienceTeacher extends Employee {
    public void somefunction1() {
        System.out.println("Hi there");
    }
}

public class Interface {

    public static void main(String[] args) {
        Employee e = new Employee();
        ScienceTeacher s = new ScienceTeacher();
        System.out.println(e instanceof Person1);
        System.out.println(e instanceof Employee);
        System.out.println(e instanceof ScienceTeacher);
        System.out.println(s instanceof ScienceTeacher);
        System.out.println(s instanceof Person1);
        System.out.println(s instanceof Employee);
    }

}