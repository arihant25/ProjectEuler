//Referenced from //https://en.wikipedia.org/wiki/Heap%27s_algorithm

import java.util.Arrays;
import java.util.HashSet;

public class id45 {
    public static void main(String[] args) {
        long answer = 0;
        int[] temp = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        HashSet<String> hs = allPerm(temp);
        for (String s : hs) {
            String[] test = s.split("");
            if (Integer.parseInt(test[1] + test[2] + test[3]) % 2 == 0)
                if (Integer.parseInt(test[2] + test[3] + test[4]) % 3 == 0)
                    if (Integer.parseInt(test[3] + test[4] + test[5]) % 5 == 0)
                        if (Integer.parseInt(test[4] + test[5] + test[6]) % 7 == 0)
                            if (Integer.parseInt(test[5] + test[6] + test[7]) % 11 == 0)
                                if (Integer.parseInt(test[6] + test[7] + test[8]) % 13 == 0)
                                    if (Integer.parseInt(test[7] + test[8] + test[9]) % 17 == 0)
                                        answer = answer + Long.parseLong(s);
        }
        System.out.println(answer);
    }

    private static HashSet<String> allPerm(int array[]) {
        HashSet<String> hs = new HashSet<>();
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++)
            temp[i] = 0;
        hs.add(Arrays.toString(array).replaceAll("[\\[\\]]|\\s|,", ""));
        int count = 0;
        while (count < array.length)
            if (temp[count] < count) {
                if (count % 2 == 0)
                    swap(array, 0, count);
                else
                    swap(array, temp[count], count);
                hs.add(Arrays.toString(array).replaceAll("[\\[\\]]|\\s|,", ""));
                temp[count] += 1;
                count = 0;
            } else {
                temp[count] = 0;
                count += 1;
            }
        return hs;
    }

    private static void swap(int[] array, int i, int j) {
        int c = array[i];
        array[i] = array[j];
        array[j] = c;
    }
}