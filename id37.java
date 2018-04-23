public class id37 {
    public static void main(String[] args) {
        int number = 10;
        int count = 0;
        int answer = 0;
        while (count < 11) {
            if (isPrime(number)) {
                if (isTruncatablePrime(number)) {
                    answer = answer + number;
                    count++;
                }
            }
            number++;
        }
        System.out.println(answer);
    }

    private static boolean isPrime(long check) {
        if (check == 1) return false;
        for (long i = 2; i < check; i++) {
            if (check % i == 0) return false;
        }
        return true;
    }

    private static boolean isTruncatablePrime(int number) {
        int[] numArr = toArray(number);
        for (int i = 0; i < numArr.length; i++) {
            String check = Integer.toString(numArr[i]);
            for (int j = i + 1; j < numArr.length; j++) {
                check = check.concat(Integer.toString(numArr[j]));
            }
            if (!isPrime(Integer.parseInt(check)))
                return false;

            check = Integer.toString(numArr[0]);
            for (int j = 1; j < numArr.length-i; j++) {
                check = check.concat(Integer.toString(numArr[j]));
            }
            if (!isPrime(Integer.parseInt(check)))
                return false;
        }
        return true;
    }

    //Referenced from stack overflow
    private static int[] toArray(int x) {
        String s = Integer.toString(x);
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return result;
    }
}
