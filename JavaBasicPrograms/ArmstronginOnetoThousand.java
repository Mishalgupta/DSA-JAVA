package JavaBasicPrograms;

public class ArmstronginOnetoThousand {

    public static void main(String[] args) {
        int i, rem, r, x;
        for (i = 1; i <= 1000; i++) {
            x = i;
            rem = 0;
            while (x != 0) {
                r = x % 10;
                x = x / 10;
                rem = rem + (r * r * r);
            }
            if (rem == i) {
                System.out.println("Armstrong no. between 1_1000: " + i);
            }
        }
    }

}
