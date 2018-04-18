import java.math.BigInteger;

public class id15 {
    public static void main(String[] args) {
        BigInteger two = BigInteger.valueOf(2);
        BigInteger power = two.pow(1000);
        int[] result = toArray(power);
        long answer = 0;
        for (int i=0; i<result.length; i++) {
            answer = answer + result[i];
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
