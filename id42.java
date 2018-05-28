import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class id42 {
    public static void main(String[] args) throws FileNotFoundException {
        boolean[] triangleArr = new boolean[100000000];
        int answer = 0;
        for (int i = 0; i < 100000000; i++)
            triangleArr[i] = false;
        for (int i = 1; i <= 2000; i++)
            triangleArr[(i * (i + 1)) / 2] = true;

        File file = new File("C:\\Users\\ArihantLab\\Desktop\\words.txt");
        Scanner sc = new Scanner(file);
        String temp = "";
        String[] compare = {"", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        while (sc.hasNextLine())
            temp = (sc.nextLine());
        temp = temp.replaceAll("\"", "");
        String[] strArr = temp.split("\\,");


        for (int i = 0; i < strArr.length; i++) {
            int sum = 0;
            String[] tempArr = strArr[i].split("");
            for (int j = 0; j < tempArr.length; j++)
                for (int k = 0; k < compare.length; k++)
                    if (compare[k].equals(tempArr[j]))
                        sum = sum + k;
            if (triangleArr[sum])
                answer++;
        }
        System.out.println(answer);
    }
}