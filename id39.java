public class id39 {
    public static void main(String[] args) {
        int max = 0;
        int answer = 0;
        for (int i = 1; i < 1000; i++) {
            int count = 0;
            for (int k = 1; k < 1000; k++)
                for (int j = 1; j < 1000; j++)
                    if (Math.pow(j, 2) + Math.pow(k, 2) == Math.pow(i - j - k, 2))
                        if (k < i)
                            count++;

            if (count > max) {
                max = count;
                answer = i;
            }
        }
        System.out.println(answer);
    }
}