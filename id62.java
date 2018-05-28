import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;

public class id62 {
    public static void main(String[] args) {
        HashSet<String> check1 = new HashSet<>();
        HashSet<String> check2 = new HashSet<>();
        HashSet<String> check3 = new HashSet<>();
        HashSet<String> check4 = new HashSet<>();
        int answer = 0;
        for (int i = 1000000; i > 0; i--) {
            int[] temp = toArray(BigInteger.valueOf(i).pow(3));
            Arrays.sort(temp);
            if (!check1.add(Arrays.toString(temp)))
                if (!check2.add(Arrays.toString(temp)))
                    if (!check3.add(Arrays.toString(temp)))
                        if (!check4.add(Arrays.toString(temp)))
                            answer = i;
        }
        System.out.println(BigInteger.valueOf(answer).pow(3));
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