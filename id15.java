//Referenced from https://en.wikipedia.org/wiki/Binomial_coefficient

public class id15 {
    public static void main(String[] args) {
        long answer = 1;
        for (int i = 0; i < 20; i++)
            answer = answer * (2 * 20 - i) / (i + 1);
        System.out.println(answer);
    }
}