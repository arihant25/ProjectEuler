public class id14 {
    public static void main(String[] args) {
        long number = 0;
        long answer = 0;
        for (int i = 999999; i > 1; i--) {
            long count = 1;
            long current = i;
            while (current != 1) {
                count++;
                if (current % 2 == 0)
                    current = current / 2;
                else
                    current = (3 * current) + 1;
            }
            if (count > number) {
                number = count;
                answer = i;
            }
        }
        System.out.println(answer);
    }
}