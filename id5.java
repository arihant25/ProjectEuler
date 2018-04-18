public class id5 {
    public static void main(String[] args) {
        boolean next = false;
        int i = 21;
        int count =0;
        while (next == false) {
            for (int j=1; j<21; j++) {
               if (i%j == 0) {
                   count++;
               }
            }
            if (count == 20) {
                System.out.println(i);
                return;
            }
            count = 0;
            i++;
        }
    }
}
