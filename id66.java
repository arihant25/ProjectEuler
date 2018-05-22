//reference from https://en.wikipedia.org/wiki/Continued_fraction
//reference from https://en.wikipedia.org/wiki/Pell%27s_equation

import java.math.BigInteger;

public class id66 {
    public static void main(String[] args) {
        BigInteger max = BigInteger.ZERO;
        int answer = 0;
        for (int i = 1; i < 1001; i++) {
            if (Math.pow((int) Math.sqrt(i), 2) != i) {
                BigInteger m0 = BigInteger.ZERO;
                BigInteger d0 = BigInteger.ONE;
                BigInteger a0 = BigInteger.valueOf((long)Math.sqrt(i));
                BigInteger a1 = a0;
                BigInteger m1, d1;
                BigInteger h0 = a0;
                BigInteger k0 = BigInteger.ONE;
                BigInteger h1 = BigInteger.ONE;
                BigInteger k1 = BigInteger.ZERO;
                BigInteger h2, k2;
                while (!h0.multiply(h0).subtract(BigInteger.valueOf(i).multiply(k0).multiply(k0)).equals(BigInteger.ONE)) {
                    m1 = (d0.multiply(a1)).subtract(m0);
                    d1 = ((BigInteger.valueOf(i).subtract(m1.multiply(m1)))).divide(d0);
                    a1 = (a0.add(m1)).divide(d1);
                    m0 = m1;
                    d0 = d1;
                    h2 = h1;
                    k2 = k1;
                    h1 = h0;
                    k1 = k0;
                    h0 = (a1.multiply(h1)).add(h2);
                    k0 = (a1.multiply(k1)).add(k2);
                }
                if (h0.compareTo(max) > 0) {
                    max = h0;
                    answer = i;
                }
            }
        }
        System.out.println(answer);
    }
}