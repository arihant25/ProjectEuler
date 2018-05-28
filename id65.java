//reference https://en.wikipedia.org/wiki/Continued_fraction#Infinite_continued_fractions_and_convergents

import java.math.BigInteger;

public class id65 {
    public static void main(String[] args) {
        BigInteger n1 = BigInteger.valueOf(2);
        BigInteger n2 = BigInteger.valueOf(3);
        BigInteger n3 = BigInteger.ZERO;
        int add = 0;
        int[] cFrac = new int[105];
        for (int i = 1; i < 101; i++) {
            cFrac[i] = 1;
            cFrac[i + 1] = add + 2;
            add = cFrac[i + 1];
            cFrac[i + 2] = 1;
            i = i + 2;
        }

        for (int i = 3; i < 101; i++) {
            n3 = n1.add(n2.multiply(BigInteger.valueOf(cFrac[i - 1])));
            n1 = n2;
            n2 = n3;
        }

        int[] resultArr = toArray(n3);
        int answer = 0;

        for (int i = 0; i < resultArr.length; i++)
            answer += resultArr[i];
        System.out.println(answer);
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
