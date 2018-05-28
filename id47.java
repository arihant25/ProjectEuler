//referenced from https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes

public class id47 {
    public static void main(String[] args) {
        int n = 10000000;
        boolean[] primeArr = new boolean[n + 1];

        for (int i = 2; i < n; i++)
            primeArr[i] = true;

        for (int i = 2; i < Math.sqrt(n); i++)
            if (primeArr[i])
                for (int j = i; j * i <= n; j++)
                    primeArr[i * j] = false;

        for (int i = 2; i < 1000000; i++) {
            if (hasFourPrimes(i, primeArr) && hasFourPrimes(i + 1, primeArr) && hasFourPrimes(i + 2, primeArr) && hasFourPrimes(i + 3, primeArr)) {
                System.out.println(i);
                return;
            }
        }
    }

    private static boolean hasFourPrimes(int number, boolean[] primeArr) {
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                if (primeArr[i])
                    count++;
        }
        if (count == 4)
            return true;
        return false;
    }
}