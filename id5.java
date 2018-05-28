public class id5 {
    public static void main(String[] args) {
        int i = 21;
        int count = 0;
        while (true) {
            for (int j = 1; j < 21; j++)
                if (i % j == 0)
                    count++;
            if (count == 20) {
                System.out.println(i);
                return;
            }
            count = 0;
            i++;
        }
    }
}