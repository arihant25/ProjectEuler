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

        int max = 0;
        int answer = 0;
        for (int i = -1000; i < 1001; i++)
            for (int j = -1000; j < 1001; j++) {
                for (int cons = 0; ; cons++) {
                    int temp = cons * cons + cons * i + j;
                    if (!primeArr[Math.abs(temp)])
                        break;
                    if (cons > max) {
                        max = cons;
                        answer = i * j;
                    }
                }
            }
        System.out.println(answer);
    }
}