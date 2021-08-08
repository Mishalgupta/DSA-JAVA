package javapractice;

import java.math.BigInteger;

public class StringMethod {

    public static void main(String[] args) {
        String s1 = "Computer";
        String s2 = "Computer";
        String s3 = new String("Computer");
        System.out.println("Result:" + (s1 == s2));
        System.out.println("Result:" + (s1.equals(s2)));
        System.out.println("Result:" + s1 == s3);
        System.out.println("Result:" + s1.equals(s3));
        System.out.println("Result:" + s2.equals(s3));

        String s4 = s1.toUpperCase();
        System.out.println(s4);
        String s5 = s1.toLowerCase();
        System.out.println(s5);

        int i = s1.indexOf("m");
        int i1 = s1.indexOf("m", 3);
        System.out.println(i);
        System.out.println(i1);
        int i3 = s1.indexOf("uter");
        System.out.println(i3);
        int i4 = s1.indexOf("uter", 4);
        System.out.println(i4);
        int i5 = s1.lastIndexOf("u");
        System.out.println(i5);
        int i6 = s1.lastIndexOf("u", 3);
        System.out.println(i6);
        int i7 = s1.lastIndexOf("uter");
        System.out.println(i7);
        int i8 = s1.lastIndexOf("uter", 1);
        System.out.println(i8);

//        *****STRING COMPAIRING*****
        if (s1.equals(s4)) {
            System.out.println("Strings are equal");

        } else {
            System.out.println("Strings are not equal");
        }

        if (s1.equalsIgnoreCase(s4)) {
            System.out.println("Strings are equal");

        } else {
            System.out.println("Strings are not equal");
        }
        int i9 = s1.compareTo(s4);
        if (i9 == 0) {
            System.out.println("Strings are equal");

        } else if (i9 < 0) {
            System.out.println("Strings are in dictionary order");
        } else {
            System.out.println("Strings are not in dictionary order");
        }

//        *****SUBSTRINGS******
        String s6 = new String("ComputerClass");
        String s7 = s6.substring(7);
        System.out.println(s7);

        String s8 = s6.substring(7, 10);
        System.out.println(s8);

        char i10 = s6.charAt(7);
        System.out.println(i10);

        boolean i11 = s6.contains("e");
        System.out.println(i11);

        String s9 = "";
        boolean i12 = s9.isEmpty();
        System.out.println(i12);

        String i13 = s1.concat(s6);
        String s10 = s1 + s6 + "Cool";
        System.out.println(s10);
        System.out.println(i13);

        String i14 = s10.replace('C', 'k');
        System.out.println(i14);

        String s11 = "   Mishal Gupta   ";
        System.out.println(s11);

        System.out.println(s11.trim()); // left & right spaces will remove

        String s12 = "MISHAL,GUPTA,IT,BRANCH,SKIT";
        String[] s13 = s12.split(",");
        for (String Var : s13) {
            System.out.println(Var);
        }

        String[] s14 = s12.split("A");
        for (String Var : s14) {
            System.out.println(Var);
        }

        String s15 = "TATA";
        char ch[] = s15.toCharArray();
        for (char c : ch) {
            System.out.println(c);
        }

        BigInteger b1, b2;
        b1 = new BigInteger("11");
        b2 = new BigInteger("33");
        boolean b3, b4;
        b3 = b1.isProbablePrime(1);
        b4 = b2.isProbablePrime(1);
        String str1 = b3 + " is probable prime with certinty 1 is " + b1;
        String str2 = b4 + " is probable prime with certinty 1 is " + b2;
        System.out.println(str1);
        System.out.println(str2);

        Object obj = new String("java program");
//        System.out.println(obj);
        Class a = obj.getClass();
        System.out.println("class:" + a.getName());

        String s16 = obj.toString();
        System.out.println(s16);

    }

}