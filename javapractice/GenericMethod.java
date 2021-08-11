package javapractice;

class Genericc {
//    public void printArray(String[] s) {
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(s[i]);
//        }
//    }
//
//    public void printArray(Integer[] in) {
//        for (int j = 0; j < in.length; j++) {
//            System.out.println(in[j]);
//        }
//    }

    public <T> void printArray(T[] s) {
        // Normal loop
//        for (int i = 0; i < s.length; i++) {
//            System.out.print(s[i]);
//        }

        // for each loop
        for (T i : s) {
            System.out.println(i);
        }
    }

}

public class GenericMethod {

    public static void main(String[] args) {
        Genericc g1 = new Genericc();
        String countries[] = new String[] { "India", "Pakisthan", "Nepal", "Bhutan" };
        Integer Numbers[] = { 1, 2, 3, 4 };
        g1.printArray(Numbers);
        g1.printArray(countries);
    }
}