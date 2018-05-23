public class id31 {
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 0; i < 201; i = i + 200)
            for (int j = 0; j < 201; j = j + 100)
                for (int k = 0; k < 201; k = k + 50)
                    for (int l = 0; l < 201; l = l + 20)
                        for (int m = 0; m < 201; m = m + 10)
                            for (int n = 0; n < 201; n = n + 5)
                                for (int o = 0; o < 201; o = o + 2)
                                    for (int p = 0; p < 201; p = p + 1)
                                        if (i + j + k + l + m + n + o + p == 200)
                                            answer++;
        System.out.println(answer);
    }
}