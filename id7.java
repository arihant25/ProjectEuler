public class id7 {
    public static void main(String[] args) {
        int count = 0;
        int i = 2;
        while (true) {
            if (isPrime(i)) {
                count++;
                if (count == 10001) {
                    System.out.println(i);
                    return;
                }
            }
            i++;
        }
    }

    private static boolean isPrime(long check) {
        for (long i = 2; i < check; i++)
            if (check % i == 0) return false;
        return true;
    }
}
