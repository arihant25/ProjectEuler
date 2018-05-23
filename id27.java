//Referenced form https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes

public class id27 {
    public static void main(String[] args) {
        int n = 1000000;
        boolean[] primeArr = new boolean[n + 1];

        for (int i = 2; i < n; i++)
            primeArr[i] = true;

        for (int i = 2; i < Math.sqrt(n); i++)
            if (primeArr[i])
                for (int j = i; j * i <= n; j++)
                    primeArr[i * j] = false;

        int consecutive = 0;
        int max = 0;
        int answer = 0;
        for (int i = -1000; i < 1001; i++)
            for (int j = -1000; j < 1001; j++) {
                while (primeArr[Math.abs(consecutive * consecutive + consecutive * i + j)])
                    consecutive++;
                if (consecutive > max) {
                    max = consecutive;
                    answer = i * j;
                }
                consecutive = 0;
            }
        System.out.println(answer);
    }
}