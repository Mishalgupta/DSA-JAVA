package javapractice;

import java.util.*;

//******1-D ARRAY Program *******
//class ScannerClass {
//    public static void main(String[] args) {
//        int arr[]= new int[5];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter elements");
//        for (int i = 0; i < 5; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println("arr["+i+"]=" + arr[i]);
//        }
//        sc.close();
//    }
//}

//*********2-D ARRAY Program ********
class ScannerClass {
    public static void main(String[] args) {
        int arr[][] = new int[5][];
        arr[0] = new int[5];
        arr[1] = new int[2];
//         System.out.println("arr[0][0]="+arr[0][0]);
//         System.out.println("arr[0]="+arr[0]);
        System.out.println("arr[0]=" + arr[0][0]);
//         System.out.println("Length="+arr[0].length);
        System.out.println("Length=" + arr.length);
        System.out.println("Length=" + arr[0].length);
        System.out.println("Length=" + arr[1].length);
    }
}

//******hasNext() program **********
//public class ScannerClass {

//    public static void main(String[] args) {
//        Scanner var = new Scanner(System.in);
//        System.out.println("Input your age:");
//Printing the delimiter used  
//System.out.println("Delimiter:" + var.delimiter());  
//        while (!var.hasNextInt()) {
////           sc.Int();
//            System.out.println("Only integer are allowed:try again");
//            break;
//        }
//        int age = var.nextInt();
//        System.out.println("You are of :" + age);
//     var.close();
//    }
//
//}
