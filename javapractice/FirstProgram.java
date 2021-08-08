package javapractice;

import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter the first no.\n");
		a=sc.nextInt();
		System.out.print("enter 2nd no.");
		b=sc.nextInt();
		c=a+b;
		System.out.print("sum is:"+c);
		sc.close();

	}

}
