public class id2 {
    public static void main(String[] args) {
        int first = 1;
        int second = 2;
        int next = 2;
        int sum = 0;
        for (int i=0; first<4000000; i++) {
            if (next%2 == 0 ) {
                sum = sum + next;
            }
            next = first+second;
            first = second;
            second = next;
        }
        System.out.println(sum);
    }
}