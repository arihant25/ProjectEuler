import java.util.Arrays;
import java.util.HashSet;

public class id32 {
    public static void main(String[] args) {
        int answer = 0;
        HashSet<Integer> check = new HashSet<>();
        for (int i = 0; i < 100; i++)
            for (int j = i; j < 100000; j++) {
                String temp = i + "" + j + "" + (i * j);
                if (temp.length() == 9)
                    if (isPandigital(Integer.parseInt(temp)))
                        if (check.add(i * j))
                            answer = answer + i * j;
            }
        System.out.println(answer);
    }

    private static boolean isPandigital(int check) {
        String number = Integer.toString(check);
        if (number.length() != 9)
            return false;
        char[] arr = number.toCharArray();
        Arrays.sort(arr);
        String temp = String.valueOf(arr);
        if (temp.equals("123456789"))
            return true;
        return false;
    }
}