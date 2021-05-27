package Patterns;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();

//        1
//        22
//        333
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.print("\n");
//        }

//        1
//        12
//        123
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.print("\n");
//        }

//      1
//      23
//      456
//        int k = 1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(k);
//                k++;
//            }
//            System.out.print("\n");
//        }

//      12345
//       678
//        9
//        int k = 1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i - 1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * n - (2 * i - 1); j++) {
//                System.out.print(k);
//                k++;
//            }
//            System.out.print("\n");
//        }

//      12345
//       123
//        1
//        for (int i = 1; i <= n; i++) {
//            int k = 1;
//            for (int j = 1; j <= i - 1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * n - (2 * i - 1); j++) {
//                System.out.print(k);
//                k++;
//            }
//            System.out.print("\n");
//        }

//      1    1  
//      12  21
//      123321
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j);
//            }
//            System.out.print("\n");
//        }

//        1
//        11
//        121
//        1331
//        14641
//        int pow = 1, x = 11;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i-1; j++) {
//                pow = pow * x;
//            }
//            System.out.print(pow);
//            pow=1;
//            System.out.print("\n");
//        }

//          1
//          62
//          1073
//          131184
//          15141295
//        int k = 1, p;
//        for (int i = 1; i <= n; i++) {
//            p = k;
//            for (int j = 1; j <= i; j++) {
//                System.out.print(p);
//                p = p - (n - i + j);
//            }
//            k = k + 1 + n - i;
//            System.out.print("\n");
//        }

//      *
//     *1*
//    *2*2*
//        int ch = 0;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                if (j % 2 == 0) {
//                    System.out.print(ch);
//                } else {
//                    System.out.print("*");
//                }
//            }
//            ch++;
//            System.out.print("\n");
//        }

//      A
//      AB
//      ABC
//        for (int i = 1; i <= n; i++) {
//            char ch = 'A';
//            for (int j = 1; j <= i; j++) {
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.print("\n");
//        }

//    A
//    BB
//    CCC
//        char ch = 'A';
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(ch);
//            }
//            ch++;
//            System.out.print("\n");
//        }

//      A
//      BC
//      DEF
//        char ch = 'A';
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.print("\n");
//        }

//       A
//      ABC
//     ABCDE
//        for (int i = 1; i <= n; i++) {
//            char ch = 'A';
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 *i - 1; j++) {
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.print("\n");
//        }

//          ABCCBA
//          AB  BA
//          A    A
//        for (int i = 1; i <= n; i++) {
//            char ch = 'A';
//            for (int j = 1; j <= (n - i) + 1; j++) {
//                System.out.print(ch);
//                ch++;
//            }
//            for (int j = 1; j <= 2 * (i - 1); j++) {
//                System.out.print(" ");
//            }
//            char c = 'A';
//            for (int j = n - i; j >= 0; j--) {
//                if (j != n)
//                    System.out.print((char) (c + j));
//                      
//            }
//            System.out.print("\n");
//        }

//     *A*B*
//      *A*
//       *
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i - 1; j++) {
//                System.out.print(" ");
//            }
//            char ch = 'A';
//            for (int j = 1; j <= 2 * n - (2 * i - 1); j++) {
//                if (j % 2 == 0) {
//                    System.out.print(ch);
//                    ch++;
//                } else {
//                    System.out.print("*");
//                }
//            }
//            System.out.print("\n");
//        }

//     *A*A*
//      *B*
//       *
//        char ch = 'A';
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i - 1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * n - (2 * i - 1); j++) {
//                if (j % 2 == 0) {
//                    System.out.print(ch);
//                } else {
//                    System.out.print("*");
//                }
//            }
//            ch++;
//            System.out.print("\n");
//        }

//      *
//     *A*
//    *B*B*
//        NOT WORKING!!!!!

//        char ch = 'A';
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                if (j % 2 == 0) {
//                    System.out.print(ch);
//                } else {
//                    System.out.print("*");
//                }
//            }
//            ch++;
//            System.out.print("\n");
//        }

//        A
//       ABA
//      ABCBA
//     ABCDCBA
//        for (int i = 1; i <= n; i++) {
//            char ch = 'A';
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print(ch);
//                if (j < n) {
//                    ch++;
//                } else {
//                    ch--;
//                }
//
//            }
//            System.out.print("\n");
//        }

//      A1
//     AB12
//    ABC123
//   ABCD1234
//        for (int i = 1; i <= n; i++) {
//            char ch = 'A';
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(ch);
//                ch++;
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.print("\n");
//        }

//        1
//       12
//      123
//     1234
//    12345
//     1234
//      123
//       12
//        1
//        int k = 0, x;
//        for (int i = 1; i <= 9; i++) {
//            x = 1;
//            if (i < 6) {
//                k++;
//            } else {
//                k--;
//            }
//            for (int j = 1; j <= 5; j++) {
//                if (j >= 6 - k) {
//                    System.out.print(x);
//                    x++;
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("\n");
//        }

//        6543210
//        543210
//        43210
//        3210
//        210
//        10
//        0
//        for (int i = 0; i < 7; i++) {
//            for (int j = (6 - i); j >= 0; j--) {
//                System.out.print(j);
//            }
//            System.out.print("\n");
//        }

//        A
//        BA
//        CBA
//        DCBA
//        char ch;
//        for (int i = 1; i <= n; i++) {
//            ch = (char) (64 + i);
//            for (int j = 1; j <= i; j++) {
//                System.out.print(ch--);
//            }
//            System.out.print("\n");
//        }

//        1
//        2*3
//        4*5*6
//        7*8*9*10
//        11*12*13*14*15
//        int c = 1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                if (j % 2 == 0) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(c);
//                    c++;
//                }
//            }
//            System.out.print("\n");
//        }

//         *
//        **
//       ***
//       |**
//     * | *
//     **|  
//     ***  
//     **   
//     *   
//        for (int i = 1; i <= 3 * n; i++) {
//            for (int j = 1; j <= (2 * n - 1); j++) {
//                if (i <= n) {
//                    if (j >= 2 * n - i) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                } else if (i <= 2 * n) {
//                    int k = 0;
//                    if (j == n) {
//                        k = 1;
//                        System.out.print("|");
//                    }
//                    if (j <= (i - n - 1)) {
//                        k = 1;
//                        System.out.print("*");
//                    }
//                    if (j >= (i)) {
//                        k = 1;
//                        System.out.print("*");
//                    }
//                    if (k == 0) {
//                        System.out.print(" ");
//                    }
//                } else if (i <= 3 * n) {
//                    if (j <= (3 * n + 1) - i) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//
//                }
//            }
//            System.out.print("\n");
//        }

//        1
//       A B
//      1 2 3
//     A B C D
//        for (int i = 1; i <= n; i++) {
//            char ch = 'A';
//            int c = 1;
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                if (j % 2 != 0) {
//                    if (i % 2 != 0) {
//                        System.out.print(c);
//                        c++;
//                    } else {
//                        System.out.print(ch);
//                        ch++;
//                    }
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("\n");
//        }

//      ABCDE
//      AB DE
//      A   E
//        for (int i = 1; i <= n; i++) {
//            char ch = 'A';
//            for (int j = 1; j <= 2 * n - 1; j++) {
//                if (j <= (n + 1) - i || j >= (n - 1) + i) {
//                    System.out.print(ch);
//                } else {
//                    System.out.print(" ");
//                }
//                ch++;
//            }
//            System.out.print("\n");
//        }

//        0
//        01
//        024
//        0369
//        0481216
//        for (int i = 1; i <= n; i++) {
//            int c = 0;
//            for (int j = 1; j <= i; j++) {
//                System.out.print(c);
//                c = c + i - 1;
//            }
//            System.out.print("\n");
//        }
        sc.close();

    }

}
