package JavaBasicPrograms;

import java.util.Scanner;

public class FourSubMarksPassFail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        if (m1 >= 40) {
            if (m2 >= 40) {
                if (m3 >= 40) {
                    if (m4 >= 40) {
                        System.out.println("Pass");
                    } else {
                        System.out.println("Supp");
                    }
                } else {
                    if (m4 >= 40) {
                        System.out.println("Supp");
                    } else {
                        System.out.println("Supp");
                    }
                }
            } else {
                if (m3 >= 40) {
                    if (m4 >= 40) {
                        System.out.println("supp");
                    } else {
                        System.out.println("supp");
                    }
                } else {
                    if (m2 >= 40) {
                        if (m3 >= 40) {
                            if (m4 >= 40) {
                                System.out.println("Supp");
                            } else {
                                System.out.println("Supp");
                            }
                        } else {
                            if (m4 >= 40) {
                                System.out.println("Supp");
                            } else {
                                System.out.println("Fail");
                            }
                        }
                    } else {
                        if (m3 >= 0) {
                            if (m4 >= 0) {
                                System.out.println("Supp");
                            } else {
                                System.out.println("Fail");
                            }
                        } else {
                            if (m4 >= 0) {
                                System.out.println("Fail");
                            } else {
                                System.out.println("Fail");
                            }
                        }
                    }
                }
            }
        }
        sc.close();
    }
}
