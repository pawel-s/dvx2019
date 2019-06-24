import java.math.BigInteger;

public class Solution3
{
    public static void main(String[] args)
    {
        int n = Integer.valueOf(args[0]);
        System.out.println(fib(n));
    }

    private static BigInteger fib(int n) {
        if (n == 0) {
            return BigInteger.ZERO;
        } else if (n == 1) {
            return BigInteger.ONE;
        } else {
            BigInteger f_n1 = BigInteger.ZERO;
            BigInteger f_n = BigInteger.ONE;
            for (int i = 2; i <= n; i++) {
                BigInteger f = f_n1.add(f_n);
                f_n1 = f_n;
                f_n = f;
            }
            return f_n;
        }
    }
}
