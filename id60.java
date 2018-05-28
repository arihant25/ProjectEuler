public class id60 {
    public static void main(String[] args) {
        int n = 100000000;
        boolean[] primeArr = new boolean[n + 1];

        for (int i = 2; i < n; i++)
            primeArr[i] = true;

        for (int i = 2; i < Math.sqrt(n); i++)
            if (primeArr[i])
                for (int j = i; j * i <= n; j++)
                    primeArr[i * j] = false;

        for (int i = 0; i < 10000; i++)
            if (primeArr[i])
                for (int j = 0; j < 10000; j++)
                    if (primeArr[j]) {
                        String temp = Integer.toString(i) + Integer.toString(j);
                        String temp2 = Integer.toString(j) + Integer.toString(i);
                        if (primeArr[Integer.parseInt(temp)])
                            if (primeArr[Integer.parseInt(temp2)])
                                for (int k = 0; k < 10000; k++)
                                    if (primeArr[k]) {
                                        String temp3 = Integer.toString(i) + Integer.toString(k);
                                        String temp4 = Integer.toString(k) + Integer.toString(i);
                                        String temp5 = Integer.toString(j) + Integer.toString(k);
                                        String temp6 = Integer.toString(k) + Integer.toString(j);
                                        if (primeArr[Integer.parseInt(temp3)])
                                            if (primeArr[Integer.parseInt(temp4)])
                                                if (primeArr[Integer.parseInt(temp5)])
                                                    if (primeArr[Integer.parseInt(temp6)])
                                                        for (int l = 0; l < 10000; l++)
                                                            if (primeArr[l]) {
                                                                String temp7 = Integer.toString(i) + Integer.toString(l);
                                                                String temp8 = Integer.toString(l) + Integer.toString(i);
                                                                String temp9 = Integer.toString(j) + Integer.toString(l);
                                                                String temp10 = Integer.toString(l) + Integer.toString(j);
                                                                String temp11 = Integer.toString(k) + Integer.toString(l);
                                                                String temp12 = Integer.toString(l) + Integer.toString(k);
                                                                if (primeArr[Integer.parseInt(temp7)])
                                                                    if (primeArr[Integer.parseInt(temp8)])
                                                                        if (primeArr[Integer.parseInt(temp9)])
                                                                            if (primeArr[Integer.parseInt(temp10)])
                                                                                if (primeArr[Integer.parseInt(temp11)])
                                                                                    if (primeArr[Integer.parseInt(temp12)])
                                                                                        for (int m = 0; m < 10000; m++)
                                                                                            if (primeArr[m]) {
                                                                                                String temp13 = Integer.toString(i) + Integer.toString(m);
                                                                                                String temp14 = Integer.toString(m) + Integer.toString(i);
                                                                                                String temp15 = Integer.toString(j) + Integer.toString(m);
                                                                                                String temp16 = Integer.toString(m) + Integer.toString(j);
                                                                                                String temp17 = Integer.toString(k) + Integer.toString(m);
                                                                                                String temp18 = Integer.toString(m) + Integer.toString(k);
                                                                                                String temp19 = Integer.toString(l) + Integer.toString(m);
                                                                                                String temp20 = Integer.toString(m) + Integer.toString(l);
                                                                                                if (primeArr[Integer.parseInt(temp13)])
                                                                                                    if (primeArr[Integer.parseInt(temp14)])
                                                                                                        if (primeArr[Integer.parseInt(temp15)])
                                                                                                            if (primeArr[Integer.parseInt(temp16)])
                                                                                                                if (primeArr[Integer.parseInt(temp17)])
                                                                                                                    if (primeArr[Integer.parseInt(temp18)])
                                                                                                                        if (primeArr[Integer.parseInt(temp19)])
                                                                                                                            if (primeArr[Integer.parseInt(temp20)]) {
                                                                                                                                System.out.println(i + j + k + l + m);
                                                                                                                                return;
                                                                                                                            }

                                                                                            }
                                                            }
                                    }
                    }
    }
}
