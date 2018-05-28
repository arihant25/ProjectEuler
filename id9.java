public class id9 {
    public static void main(String[] args) {
        while (true)
            for (int i = 1; i < 1000; i++)
                for (int j = 1; j < 1000; j++) {
                    int sum = (i * i) + (j * j);
                    if (isPerfectSquare(sum))
                        if (i + j + Math.sqrt(sum) == 1000) {
                            long answer = i * j * (int) Math.sqrt(sum);
                            System.out.println(answer);
                            return;
                        }
                }
    }

    private static boolean isPerfectSquare(int number) {
        double test = Math.sqrt(number);
        if (test == Math.floor(test)) {
            return true;
        }
        return false;
    }
}