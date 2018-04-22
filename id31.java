//resolve with dynamic programming
public class id31 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i < 201; i++) {
            for (int j = 0; j < 101; j++) {
                for (int k = 0; k < 41; k++) {
                    for (int l = 0; l < 21; l++) {
                        for (int m = 0; m < 11; m++) {
                            for (int n = 0; n < 5; n++) {
                                for (int o = 0; o < 3; o++) {
                                    int sum = (i) + (j * 2) + (k * 5) + (l * 10) + (m * 20) + (n * 50) + (o * 100);
                                    if (sum == 200)
                                        count++;
                                    System.out.println(count + "    " + i);
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}