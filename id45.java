//tests for triangle, pentagonal, hexagonal numbers referenced from wikipedia

public class id45 {
    public static void main(String[] args) {
        for (long i = 40756; i<10000000000L; i++) {
            if (triangle(i))
                if (pentagonal(i))
                    if(hexagonal(i)){
                        System.out.println(i);
                        return;
            }
        }
    }
    private static boolean triangle (long i) {
        double temp = (Math.sqrt((8*i)+1)-1)/2;
        if (Math.floor(temp) == temp)
            return true;
        return false;
    }

    private static boolean pentagonal (long i) {
        double temp = (Math.sqrt((24*i)+1)+1)/6;
        if (Math.floor(temp) == temp)
            return true;
        return false;
    }

    private static boolean hexagonal (long i) {
        double temp = (Math.sqrt((8*i)+1)+1)/4;
        if (Math.floor(temp) == temp)
            return true;
        return false;
    }
}