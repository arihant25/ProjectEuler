//can be resolved iterating over primes rather than over all numbers
//referenced from https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes

public class id50 {
    public static void main(String[] args) {
        int n = 1000000;
        boolean[] primeArr = new boolean[n + 1];

        for (int i = 2; i < n; i++)
            primeArr[i] = true;

        for (int i = 2; i < Math.sqrt(n); i++)
            if (primeArr[i])
                for (int j = i; j * i <= n; j++)
                    primeArr[i * j] = false;

        int answer = 0;
        int compare = 0;
        for (int i = 2; i < n / 100; i++) {
            int sum = 0;
            int count = 0;
            for (int j = i; j < n; j++) {
                if (primeArr[j] && sum + j < n) {
                    count++;
                    sum = sum + j;
                    if (primeArr[sum])
                        if (count > compare) {
                            compare = count;
                            answer = sum;
                        }
                }
            }
        }
        System.out.println(answer);
    }
}