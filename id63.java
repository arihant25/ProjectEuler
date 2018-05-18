import java.math.BigInteger;

public class id63 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 50000; i++)
            for (int j = 1; j < 100; j++)
                if (BigInteger.valueOf(i).pow(j).toString().length() == j)
                    count++;

        System.out.println(count);
    }
}