public class id4 {
    public static void main(String[] args) {
        int max = 0;
        for (int first = 100; first < 1000; first++) {
            for (int second = 100; second < 1000; second++) {
                int answer = first*second;
                if (reverse(answer) == answer) {
                    if (answer > max) {
                        max = answer;
                    }
                }
            }
        }
        System.out.println(max);
    }

    //Referenced from geeksforgeeks
    private static int reverse(int number) {
        int reverse = 0;
        while (number > 0)
        {
            reverse = reverse*10 + number%10;
            number = number/10;
        }
        return reverse;
    }
}