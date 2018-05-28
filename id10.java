//Referenced from https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes

public class id10 {
    public static void main(String[] args) {
        int n = 2000000;
        boolean[] primeArr = new boolean[n + 1];

        for (int i = 2; i < n; i++)
            primeArr[i] = true;

        for (int i = 2; i < Math.sqrt(n); i++)
            if (primeArr[i])
                for (int j = i; j * i <= n; j++)
                    primeArr[i * j] = false;

        long number = 2;
        long answer = 0;
        while (number < 2000000) {
            if (primeArr[(int) number])
                answer = answer + number;
            number++;
        }
        System.out.println(answer);
    }
}