package JavaBasicPrograms;

import java.util.Scanner;

public class SecondsToHrMinDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the seconds:");
        long s = sc.nextLong();
        long day = s / (3600 * 24);
        long sec = s % (3600 * 24);
        long hrs = sec / 3600;
        long mins = (s % 3600) / 60;
        long secs = s % 60;

        System.out.println("Time Day:Hrs:Min:sec = " + day + ":" + hrs + ":" + mins + ":" + secs);
        sc.close();
    }

}
