package JavaBasicPrograms;

public class ArmstronginOnetoThousand {

    public static void main(String[] args) {
        int res, r, x;
        for (int i = 1; i <= 1000; i++) {
            x = i;
            res = 0;
            while (x != 0) {
                r = x % 10;
                x = x / 10;
                res = res + (r * r * r);
            }
            if (res == i) {
                System.out.println("Armstrong no. between 1_1000: " + i);
            }
        }
    }

}