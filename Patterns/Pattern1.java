package Patterns;

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int n = sc.nextInt();
//          *
//         **
//        ***
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++)
//
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//    ***
//    **
//    *
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= (n - i) + 1; j++)
//
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//      *
//      ***
//      *****
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= 2 * i - 1; j++)
//
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//      ******
//      ***
//      *
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= 2 * n - (2 * i - 1); j++)
//
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//       *
//      ***
//     *****
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * i - 1; j++)
//
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//      ******
//       ***
//        *
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i - 1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * n - (2 * i - 1); j++)
//
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//      ***
//       **
//        *
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i - 1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= (n - i) + 1; j++)
//
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//      *****
//        ***
//          *
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= 2 * (i - 1); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * n - (2 * i - 1); j++)
//
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//          *
//        ***
//      *****
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * i - 1; j++)
//
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//  *    *
//  **  **
//  ******
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++)
//
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

// ******
// **  **
// *    *
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= (n - i) + 1; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <= 2 * (i - 1); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= (n - i) + 1; j++)
//
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

// ******
// **  **
// *    *
// *    *
// **  **
// ******
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= (n - i) + 1; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <= 2 * (i - 1); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= (n - i) + 1; j++)
//
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++)
//
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        *
//       * *
//      * * *
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                if (j % 2 == 0) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print("*");
//                }
//            }
//            System.out.print("\n");
//        }
//       

//        \*****/
//        *\***/*
//        **\*/**
//        ***/***
//        **/*\**
//        */***\*
//        /*****\

//        for (int i = 1; i <= 7; i++) {
//            for (int j = 1; j <= 7; j++) {
//                if (j == i || j == 8 - i) {
//                    if (i == j) {
//                        System.out.print("\\");
////                        System.out.print(" ");
//                    } else {
//                        System.out.print("/");
////                        System.out.print(" ");
//                    }
//                } else {
//                    System.out.print("*");
//                }
//            }
//            System.out.print("\n");
//        }

//        *********
//        **** ****
//        ***   ***
//        **     **
//        *       *
//        **     **
//        ***   ***
//        **** ****
//        *********
//        int k = 0;
//        for (int i = 1; i <= n; i++) {
//            if (i <= 5) {
//                k++;
//            } else {
//                k--;
//            }
//            for (int j = 1; j <= n; j++) {
//                if (j <= 6 - k || j >= 4 + k) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("\n");
//        }

//        *******
//        *     *
//        * *** *
//        * * * *
//        * *** *
//        *     *
//        *******
//        for (int i = 1; i <= 7; i++) {
//            for (int j = 1; j <= 7; j++) {
//                if ((i == 1 || i == 7 || j == 1 || j == 7)
//                        || (i >= 3 && i <= 5 && j >= 3 && j <= 5) && (i == 3 || i == 5 || j == 3 || j == 5)) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("\n");
//        }

//          0          
//         121         
//        23432        
//       3456543       
//      456787654      
//     56789098765     
//    6789012109876    
//   789012343210987   
//  89012345654321098  
// 9012345678765432109 
//012345678909876543210
// 9012345678765432109 
//  89012345654321098  
//   789012343210987   
//    6789012109876    
//     56789098765     
//      456787654      
//       3456543       
//        23432        
//         121         
//          0    
//        int m = 0, n = 11, k = 1;
//        for (int i = 1; i <= 21; i++) {
//            if (i <= n) {
//                m++;
//            } else {
//                m--;
//            }
//            k = m - 1;
//            for (int j = 1; j <= 21; j++) {
//                if (j >= n + 1 - m && j <= n - 1 + m) {
//                    System.out.print(k % 10);
//                    if (j < n)
//                        k++;
//                    else
//                        k--;
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("\n");
//        }

//        *   *
//         * *
//          *
//         * *
//        *   *
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i == j || j == n + 1 - i) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("\n");
//        }
        sc.close();
    }

}
