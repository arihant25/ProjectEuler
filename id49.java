import java.util.Arrays;

public class id49 {
    public static void main(String[] args) {
        int n = 10000;
        boolean[] primeArr = new boolean[n + 1];

        for (int i = 2; i < n; i++)
            primeArr[i] = true;

        for (int i = 2; i < Math.sqrt(n); i++)
            if (primeArr[i])
                for (int j = i; j * i <= n; j++)
                    primeArr[i * j] = false;

        for (int i = 1000; i < n; i++)
            for (int j = i; j < n; j++)
                for (int k = j; k < n; k++)
                    if (i != j && j != k)
                        if (primeArr[i])
                            if (primeArr[j])
                                if (primeArr[k])
                                    if (j - i == k - j)
                                        if (isPerm(i, j) && isPerm(j, k))
                                            if (i != 1487) {
                                                System.out.println(i + "" + j + "" + k);
                                                return;
                                            }
    }

    private static boolean isPerm(int i, int j) {
        char[] temp1 = Integer.toString(i).toCharArray();
        char[] temp2 = Integer.toString(j).toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        if (new String(temp1).equals(new String(temp2)))
            return true;
        return false;
    }
}
