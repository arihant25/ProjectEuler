import java.util.Arrays;

public class id38 {
    public static void main(String[] args) {
        int max = 0;
        for (int i = 2; i < 9999; i++) {
            for (int j = 2; j < 5; j++) {
                String str = Integer.toString(i);
                while (str.length() < 9) {
                    str = str.concat(Integer.toString(i * j));
                }
                if (isPandigital(str))
                    if (max < Integer.parseInt(str))
                        max = Integer.parseInt(str);
            }
        }
        System.out.println(max);
    }

    private static boolean isPandigital(String check) {
        if (check.length() != 9)
            return false;
        char[] arr = check.toCharArray();
        Arrays.sort(arr);
        String temp = String.valueOf(arr);
        if (temp.equals("123456789"))
            return true;
        return false;
    }
}