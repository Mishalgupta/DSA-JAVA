package ArrayStringProgram;

public class ArrayPallindrome {
    public static int palinArray(int[] a, int n) {
        int ret = 1;
//        for (int i = 0; i < n; i++) {
//            int a1 = a[i];
//            int rem, c = 0;
//            while (a1 != 0) {
//                rem = a1 % 10;
//                c = c * 10 + rem;
//                a1 = a1 / 10;
//            }
//            if (a[i] == c) {
//                ret = 1;
//                // break;
//            } else {
//                ret = 0;
//                break;
//            }
//        }
//        return ret;

        // Method-2
        for (int i = 0; i < n; i++) {
            StringBuilder sbs = new StringBuilder(String.valueOf(a[i]));
            System.out.println(sbs);
            sbs.reverse();
            System.out.println(sbs);
            
            String temp1 = new String(sbs.toString());
            String temp2 = new String(String.valueOf(a[i]));
            if (!temp1.equals(temp2))
                return 0;
        }
        return 1;

    }

    public static void main(String[] args) {
        int a[] = { 12221, 111, 000, 121 };
        int n = a.length;
        System.out.println(palinArray(a, n));

    }

}
