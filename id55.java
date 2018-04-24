import java.math.BigInteger;

public class id55 {
    public static void main(String[] args) {

        int answer = 0;
        for (int i = 0; i < 10000; i++) {
            BigInteger temp = BigInteger.valueOf(i);
            boolean flag = true;
            for (int j = 0; j < 50; j++) {
                temp = temp.add(reverse(temp));
                if (isPalindrome(temp)) {
                    flag = false;
                }
            }
            if (flag)
                answer++;
        }
        System.out.println(answer);
    }

    private static BigInteger reverse(BigInteger number) {
        String temp = number.toString();
        StringBuilder rev = new StringBuilder();
        rev.append(temp);
        rev = rev.reverse();
        temp = rev.toString();
        return new BigInteger(temp);
    }

    private static boolean isPalindrome(BigInteger number) {
        String temp = number.toString();
        StringBuilder rev = new StringBuilder();
        rev.append(temp);
        rev = rev.reverse();
        String compare = rev.toString();
        if (compare.equals(temp))
            return true;
        return false;
    }

}
