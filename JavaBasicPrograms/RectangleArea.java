package JavaBasicPrograms;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of rectangle");
        int Length = sc.nextInt();
        int Bredth = sc.nextInt();
        int area=Length*Bredth;
        System.out.println("Area of rectangle is: "+area);
        sc.close();
    }

}
