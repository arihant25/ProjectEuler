import java.util.Arrays;

public class id35 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 1000000; i++) {
            if (Integer.toString(i).length() > 1) {
                int[] tempArr = toArray(i);
                if (isPrime(i))
                    if (rotateAndCheckPrime(tempArr))
                        count++;
            } else if (isPrime(i)) count++;
        }
        System.out.println(count);
    }

    private static int[] toArray(double num) {
        String[] temp = Long.toString((int) num).split("");
        int[] answer = new int[temp.length];
        for (int i = 0; i < temp.length; i++)
            answer[i] = Integer.parseInt(temp[i]);
        return answer;
    }

    private static boolean rotateAndCheckPrime(int[] array) {
        int[] tempArray = array;
        for (int i = 0; i < array.length; i++) {
            rotateByOne(tempArray);
            String check = Arrays.toString(tempArray);
            check = check.replaceAll("[^0-9]", "");
            int number = Integer.parseInt(check);
            if (!isPrime(number))
                return false;
        }
        return true;
    }

    private static void rotateByOne(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++)
            array[i] = array[i + 1];
        array[array.length - 1] = temp;
    }

    private static boolean isPrime(long check) {
        for (long i = 2; i < check; i++)
            if (check % i == 0) return false;
        return true;
    }
}