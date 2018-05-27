//Referenced from https://en.wikipedia.org/wiki/Continued_fraction

import java.math.BigInteger;

public class id57 {
    public static void main(String[] args) {
        BigInteger n0 = BigInteger.valueOf(3);
        BigInteger n1 = BigInteger.valueOf(7);
        BigInteger d0 = BigInteger.valueOf(2);
        BigInteger d1 = BigInteger.valueOf(5);
        BigInteger num, den;
        int answer = 0;
        for (int i = 3; i < 1001; i++) {
            num = BigInteger.valueOf(2).multiply(n1).add(n0);
            den = BigInteger.valueOf(2).multiply(d1).add(d0);
            n0 = n1;
            n1 = num;
            d0 = d1;
            d1 = den;
            if (num.toString().length() > den.toString().length())
                answer++;
        }
        System.out.println(answer);
    }
}