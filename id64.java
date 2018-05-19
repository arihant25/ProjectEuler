//Referenced from https://en.wikipedia.org/wiki/Methods_of_computing_square_roots#Continued_fraction_expansion

public class id64 {
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 0; i < 10000; i++) {
            if (Math.pow((int) Math.sqrt(i), 2) != i) {
                int m0 = 0;
                int d0 = 1;
                int a0 = (int) Math.sqrt(i);
                int a1 = a0;
                int m1, d1;
                int count = 0;
                while (true) {
                    m1 = d0 * a1 - m0;
                    d1 = (i - m1 * m1) / d0;
                    a1 = (a0 + m1) / d1;
                    m0 = m1;
                    d0 = d1;
                    count++;
                    if (a1 == 2 * a0)
                        break;
                }
                if (count % 2 != 0)
                    answer++;
            }
        }
        System.out.println(answer);
    }
}