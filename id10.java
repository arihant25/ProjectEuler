public class id10 {
    public static void main(String[] args) {
        long number = 2;
        long answer = 0;
        while (number<2000000) {
            if (isPrime(number)) {
                answer = answer+number;
            }
            number++;
        }
        System.out.println(answer);
    }
    private static boolean isPrime(long check) {
        for (long i=2; i<check; i++) {
            if (check%i == 0) return false;
        }
        return true;
    }
}
