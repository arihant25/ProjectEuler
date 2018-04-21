public class id21 {
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 1; i < 10000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            int compareSum = 0;
            for (int x = 1; x < sum; x++) {
                if (sum % x == 0) {
                    compareSum = compareSum + x;
                }
            }
            if (compareSum == i && sum != i) {
                answer = answer + i;
            }
        }
        System.out.println(answer);
    }
}