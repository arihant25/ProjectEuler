import java.math.BigInteger;

public class id53 {
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 1; i < 101; i++) {
            for (int j = 1; j < 101; j++) {
                if (factorial(i).divide(factorial(j).multiply(factorial(i - j))).toString().length() > 6)
                    answer++;
            }
        }
        System.out.println(answer);
    }

    private static BigInteger factorial(int check) {
        if (check == 0)
            return BigInteger.ONE;
        BigInteger product = BigInteger.ONE;
        for (int j = 1; j <= check; j++) {
            product = product.multiply(BigInteger.valueOf(j));
        }
        return product;
    }
}