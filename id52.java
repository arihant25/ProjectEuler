import java.util.Arrays;

public class id52 {
    public static void main(String[] args) {
        for (int i = 2; ; i++) {
            String number = Integer.toString(i);
            int count = 0;
            for (int j = 2; j < 7; j++)
                if (sortString(Integer.toString(i * j)).equals(sortString(number)))
                    count++;

            if (count == 5) {
                System.out.println(i);
                return;
            }
        }
    }

    private static String sortString(String number) {
        char[] arr = number.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}