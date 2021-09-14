package JavaBasicPrograms;

public class HCF_LCM {
//    Expected Time Complexity: O(log(min(A, B))
//    Expected Auxiliary Space: O(1)
    static Long gcd(Long a, Long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static Long lcm(Long a, Long b) {
        return (a * b) / gcd(a, b);
    }

    static Long[] lcmAndGcd(Long a, Long b) {
        Long res[] = { lcm(a, b), gcd(a, b) };
        return res;
    }

    public static void main(String[] args) {
        long a = 5, b = 10;
        Long res[] = lcmAndGcd(a, b);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }

}