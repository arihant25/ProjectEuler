import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class id99 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\Arihant Jain\\Desktop\\p099_base_exp.txt");
        Scanner sc = new Scanner(file);
        double greatest = 0;
        int line = 0;
        int i = 1;
        while (sc.hasNextLine()) {
            String temp = sc.nextLine();
            double compare = Integer.parseInt(temp.split(",")[1]) * (Math.log(Integer.parseInt(temp.split(",")[0])));
            if (greatest < compare) {
                greatest = compare;
                line = i;
            }
            i++;
        }
        System.out.println(line);
    }
}