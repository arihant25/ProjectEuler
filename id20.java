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
        for (int i = 0; i < array.length; i++)
            answer = answer + array[i];
        System.out.println(answer);
    }

    private static int[] toArray(BigInteger num) {
        String[] temp = num.toString().split("");
        int[] answer = new int[temp.length];
        for (int i = 0; i < temp.length; i++)
            answer[i] = Integer.parseInt(temp[i]);
        return answer;
    }
}