package JavaBasicPrograms;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value/character");
//        int i = sc.nextInt();
        char i = sc.next().charAt(0);
        switch (i) {

//Switch case Basic format
//        case 1:
//        System.out.println("Hello");
//        break;
//        case 2:
//            System.out.println("Hi");
//            break;
//        case 3:
//            System.out.println("Welcome");
//            break;
//        default:
//            System.out.println("By");
//        }

        // I/P month and tell no. of days in that month
//        case 1:
//        case 3:
//        case 5:
//        case 7:
//        case 8:
//        case 10:
//        case 12:
//            System.out.println("31 Days");
//            break;
//        case 4:
//        case 6:
//        case 9:
//        case 11:
//            System.out.println("30 Days");
//            break;
//        case 2:
//            System.out.println("28/29 Days");
//            break;
//        default:
//            System.out.println("Invalid Month no.");
//            break;

        // I/P Character & check it's vowel or not
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            System.out.println("Vowels");
            break;
        default:
            System.out.println("Invalid entry");
            break;
        }
        sc.close();
    }

}
