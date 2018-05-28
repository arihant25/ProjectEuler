public class id12 {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;
        while (true) {
            sum = sum + number;
            number++;
            int count = 0;
            for (int i = 1; i < sum; i++) {
                if (sum % i == 0) {
                    count++;
                    if (count == 500) {
                        System.out.println(sum);
                        return;
                    }
                }
            }
        }
    }
}
