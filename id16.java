import java.math.BigInteger;

public class id16 {
    public static void main(String[] args) {
        BigInteger two = BigInteger.valueOf(2);
        BigInteger power = two.pow(1000);
        int[] result = toArray(power);
        long answer = 0;
        for (int i = 0; i < result.length; i++) {
            answer = answer + result[i];
        }
        System.out.println(answer);
    }

    private static int[] toArray(BigInteger num) {
        String[] temp = num.toString().split("");
        int[] answer = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            answer[i] = Integer.parseInt(temp[i]);
        }
        return answer;
    }
}