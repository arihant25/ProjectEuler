public class id28 {
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 2; i < 1002; i++)
            if (i % 2 != 0)
                answer = answer + i * i + i * i - (i - 1) + i * i - (2 * (i - 1)) + i * i - (3 * (i - 1));
        System.out.println(answer + 1);
    }
}