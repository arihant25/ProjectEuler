import java.math.BigInteger;

public class id20 {
    public static void main(String[] args) {
        BigInteger product = BigInteger.ONE;
        for (long i = 100; i > 0; i--) {
            BigInteger mul = BigInteger.valueOf(i);
            product = product.multiply(mul);
        }
        int[] array = toArray(product);
        int answer = 0;
        for (int i=0; i<array.length; i++) {
            answer = answer + array[i];
        }
        System.out.println(answer);
    }

    //Referenced from stack overflow
    private static int[] toArray(BigInteger x) {
        String s = x.toString();
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return result;
    }
}
