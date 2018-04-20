import java.util.Calendar;

public class id19 {
    public static void main(String[] args) {
        int sum = 0;
        Calendar c = Calendar.getInstance();
        for (int i = 1901; i < 2001; i++) {
            for (int j = 0; j <= 11; j++) {
                c.set(i, j, 1);
                int day_of_week = c.get(Calendar.DAY_OF_WEEK);
                if (day_of_week == 1)
                    sum++;
            }
        }
        System.out.println(sum);
    }
}