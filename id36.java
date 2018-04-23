public class id36 {
    public static void main(String[] args) {
        long answer = 0;
        for (int i = 0; i < 1000000; i++) {
            if (isPalindrome(Integer.toBinaryString(i)) && isPalindrome(Integer.toString(i)))
                answer += i;
        }
        System.out.println(answer);
    }

    public static boolean isPalindrome(String string) {
        return string.equals(new StringBuilder(string).reverse().toString());
    }
}
