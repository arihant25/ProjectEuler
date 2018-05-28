public class id4 {
    public static void main(String[] args) {
        int max = 0;
        for (int first = 100; first < 1000; first++)
            for (int second = 100; second < 1000; second++) {
                int answer = first * second;
                if (reverse(answer) == answer)
                    if (answer > max)
                        max = answer;
            }
        System.out.println(max);
    }

    private static int reverse(int number) {
        String temp = Integer.toString(number);
        StringBuilder rev = new StringBuilder();
        rev.append(temp);
        rev = rev.reverse();
        temp = rev.toString();
        return Integer.parseInt(temp);
    }
}