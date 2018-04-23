//referenced from https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes

import java.util.Arrays;

public class id41 {
    public static void main(String[] args) {
        int n = 999999999;
        boolean[] primeArr = new boolean[n + 1];
        for (int i = 2; i <= n; i++)
            primeArr[i] = true;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (primeArr[i])
                for (int j = i; j * i <= n; j++)
                    primeArr[i * j] = false;

        int count = 0;
        int max = 0;
        for (int i = 2; i <= n; i++) {
            if (primeArr[i])
                if (isPandigital(i)) {
                    max = i;
                    count++;
                }
        }
        System.out.println(max);
    }

    private static boolean isPandigital(int check) {
        String number = Integer.toString(check);
        if (number.length() > 9)
            return false;
        if (number.length() == 9) {
            char[] arr = number.toCharArray();
            Arrays.sort(arr);
            String temp = String.valueOf(arr);
            if (temp.equals("123456789"))
                return true;
        }
        if (number.length() == 8) {
            char[] arr = number.toCharArray();
            Arrays.sort(arr);
            String temp = String.valueOf(arr);
            if (temp.equals("12345678"))
                return true;
        }
        if (number.length() == 7) {
            char[] arr = number.toCharArray();
            Arrays.sort(arr);
            String temp = String.valueOf(arr);
            if (temp.equals("1234567"))
                return true;
        }
        if (number.length() == 6) {
            char[] arr = number.toCharArray();
            Arrays.sort(arr);
            String temp = String.valueOf(arr);
            if (temp.equals("123456"))
                return true;
        }
        if (number.length() == 5) {
            char[] arr = number.toCharArray();
            Arrays.sort(arr);
            String temp = String.valueOf(arr);
            if (temp.equals("12345"))
                return true;
        }
        if (number.length() == 4) {
            char[] arr = number.toCharArray();
            Arrays.sort(arr);
            String temp = String.valueOf(arr);
            if (temp.equals("1234"))
                return true;
        }
        return false;
    }

}