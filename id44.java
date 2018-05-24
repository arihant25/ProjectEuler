//Referenced from https://en.wikipedia.org/wiki/Pentagonal_number

public class id44 {
    public static void main(String[] args) {
        for (int i = 1; i < 100000; i++) {
            int iPen = i * (3 * i - 1) / 2;
            for (int j = 1; j < 100000; j++) {
                int jPen = j * (3 * j - 1) / 2;
                if (pentagonal(iPen + jPen))
                    if (pentagonal(Math.abs(iPen - jPen))) {
                        System.out.println(Math.abs(iPen - jPen));
                        return;
                    }
            }
        }
    }

    private static boolean pentagonal(long i) {
        double temp = (Math.sqrt((24 * i) + 1) + 1) / 6;
        if (Math.floor(temp) == temp)
            return true;
        return false;
    }
}