//referenced from https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes

public class id46 {
    public static void main(String[] args) {
        int n = 999999999;
        boolean[] primeArr = new boolean[n + 1];
        for (int i = 2; i <= n; i++)
            primeArr[i] = true;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (primeArr[i])
                for (int j = i; j * i <= n; j++)
                    primeArr[i * j] = false;

        for (int i = 2; ; i++) {
            if (!(i % 2 == 0))
                if (!primeArr[i])
                    if (!otherConjecture(i, primeArr)) {
                        System.out.println(i);
                        return;
                    }
        }
    }

    private static boolean otherConjecture(long check, boolean[] primeArr) {
        for (long i = 2; i < check; i++) {
            for (long j = 0; j < check; j++) {
                if (primeArr[(int) i])
                    if (i + 2 * j * j == check)
                        return true;
            }
        }
        return false;
    }
}