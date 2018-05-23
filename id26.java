import java.util.HashSet;

public class id26 {
    public static void main(String[] args) {
        int length = 0;
        int answer = 0;
        for (int i = 1; i < 1001; i++) {
            HashSet<Integer> check = new HashSet<>();
            boolean flag = false;
            int rem = 1;
            while (!flag) {
                rem = rem % i;
                rem = rem * 10;
                check.add(rem / 10);
                int count = check.size();
                int temp = rem;
                int compare = 0;
                if (!check.add(rem / 10))
                    for (int j = 0; j < check.size(); j++) {
                        temp = temp % i;
                        temp = temp * 10;
                        if (!check.add(temp / 10))
                            compare++;
                        else break;
                    }
                if (compare == count) {
                    flag = true;
                    if (count > length) {
                        length = count;
                        answer = i;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}