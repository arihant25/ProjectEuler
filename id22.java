import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class id22 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\ArihantLab\\Desktop\\p022_names.txt");
        Scanner sc = new Scanner(file);
        String temp = "";
        BigInteger answer = BigInteger.ZERO;

        while (sc.hasNextLine())
            temp = (sc.nextLine());
        temp = temp.replaceAll("\"", "");
        String[] strArr = temp.split("\\,");

        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr.length - 1; j++) {
                if (strArr[j].compareTo(strArr[j + 1]) > 0) {
                    String swap = strArr[j];
                    strArr[j] = strArr[j + 1];
                    strArr[j + 1] = swap;
                }
            }
        }

        for (int i = 0; i < strArr.length; i++) {
            int sum = 0;
            int product = 1;
            char[] chArr = strArr[i].toCharArray();
            for (int x = 0; x < chArr.length; x++)
                sum = sum + numLetter(chArr[x]);

            product = sum*(i+1);
            answer = answer.add(BigInteger.valueOf(product));
            //System.out.println(strArr[i] + " " +sum + " " + (i+1));
        }
        System.out.println(answer);
    }

    private static int numLetter(char a) {

        char[] chArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i = 0; i < chArray.length; i++)
            if (chArray[i] == a) return i + 1;
        return 0;
    }
}