import java.math.BigInteger;
import java.util.HashSet;

public class id29 {
    public static void main(String[] args) {
        HashSet<BigInteger> hashSet = new HashSet<>();
        for (int i = 2; i <= 100; i++) {
            BigInteger product;
            for (int j = 2; j <= 100; j++) {
                product = BigInteger.valueOf(i).pow(j);
                hashSet.add(product);
            }
        }
        System.out.println(hashSet.size());
    }
}
