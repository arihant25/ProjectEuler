import java.math.BigInteger;

public class id97 {
    public static void main(String[] args) {
        BigInteger answer = BigInteger.valueOf(28433).multiply(BigInteger.valueOf(2).pow(7830457)).add(BigInteger.ONE);
        int[] aTemp = toArray(answer);
        for (int i = aTemp.length - 10; i<aTemp.length; i++)
            System.out.print(aTemp[i]);
    }

    private static int[] toArray(BigInteger num) {
        String[] temp = num.toString().split("");
        int[] answer = new int[temp.length];
        for (int i = 0; i< temp.length; i++){
            answer[i] = Integer.parseInt(temp[i]);
        }
        return answer;
    }
}