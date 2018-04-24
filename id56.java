import java.math.BigInteger;

public class id56 {
    public static void main(String[] args) {
        BigInteger answer = BigInteger.ZERO;
        for (int i = 1; i < 101; i++) {
            BigInteger sum;
            for (int j = 1; j < 101; j++) {
                BigInteger num = BigInteger.valueOf(i).pow(j);
                sum = sum(num);
                if (sum.compareTo(answer) > 0)
                    answer = sum;
            }
        }
        System.out.println(answer);
    }

    private static BigInteger sum(BigInteger number) {
        String temp = number.toString();
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < temp.length(); i++) {
            sum = sum.add(BigInteger.valueOf(temp.charAt(i)));
            sum = sum.subtract(BigInteger.valueOf(48));
        }
        return sum;
    }
}