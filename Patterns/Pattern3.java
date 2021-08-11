package Patterns;

import java.util.Scanner;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
//        char[] ch = str.toCharArray();
        int n = str.length();
//        I
//         N
//          D
//           I
//            A
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            System.out.print(str.charAt(i) + "\n");
//        }

//      I
//     N
//    D
//   I
//  A
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                System.out.print(" ");
//            }
//            System.out.print(str.charAt(i) + "\n");
//
//        }

//        S
//        SO
//        SOF
//        SOFT
//        SOFTW
//        SOFTWA
//        SOFTWAR
//        SOFTWARE
//        for (int i = 0; i < n; i++) {
//            System.out.println(str.substring(0, i + 1));
//        }

//      S              S
//      SO            OS
//      SOF          FOS
//      SOFT        TFOS
//      SOFTW      WTFOS
//      SOFTWA    AWTFOS
//      SOFTWAR  RAWTFOS
//      SOFTWAREERAWTFOS
        // nahi hua
//        for (int i = 0; i < n; i++) {
//            System.out.print(str.substring(0, i + 1));
//            for (int j = 0; j < (2 * (n - i)) - 2; j++) {
//                System.out.print(" ");
//            }
//            for (int j = N; j <= i; j++) {
//
//                System.out.print(str.charAt(j));
//            }
//            System.out.print("\n");
//        }

//  I
//   N
//    D
//   I  
//  A
//        for (int i = 0; i < n; i++) {
//            if (i < 3) {
//                for (int j = 0; j < i; j++) {
//                    System.out.print(" ");
//                }
//            } else if (i > 2) {
//                for (int j = 0; j < n - i - 1; j++) {
//                    System.out.print(" ");
//                }
//            }
//            System.out.print(str.charAt(i) + "\n");
//
//        }

//  I   A
//   N I
//    D
//nahi hua
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == j || j == (4 - i)) {
//                    System.out.print(str.charAt(i));
//                } else {
//                    System.out.print(" ");
//                }
//            }
//
//            System.out.print("\n");
//
//        }

//     I   
//    N 
//   D
//    I     
//     A 
//        for (int i = 0; i < n; i++) {
//            if (i < 3) {
//                for (int j = 0; j < n - i - 3; j++) {
//                    System.out.print(" ");
//                }
//            } else if (i > 2) {
//                for (int j = 0; j < i - 2; j++) {
//                    System.out.print(" ");
//                }
//            }
//            System.out.print(str.charAt(i) + "\n");
//
//        }

// I   I   
//  N N 
//   D
//  I I     
// A   A 

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (j == i || j == (n - 1) - i) {
//                    System.out.print(str.charAt(i));
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("\n");
//        }
        sc.close();
    }

}
