public class id3 {
    public static void main(String[] args) {
        long number = 600851475143L;
        long prime = 0;
        long check;
        for (long i=2; i<Math.sqrt(number); i++) {
            if (number%i == 0) {
                check = i;
                if (isPrime(check)) {
                    prime = check;

                }
            }
        }
        System.out.println(prime);
    }

    private static boolean isPrime(long check) {
        for (long i=2; i<check; i++) {
            if (check%i == 0) return false;
        }
        return true;
    }
}