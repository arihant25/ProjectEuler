public class id92 {
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 1; i < 10000000; i++) {
            int find = i;
            int count = 0;
            do {
                int[] temp = toArray(find);
                if (find == 1 || find == 89) {
                    count++;
                    if (find == 89)
                        answer++;
                }
                find = 0;
                for (int j = 0; j < temp.length; j++)
                    find = find + temp[j] * temp[j];
            } while (count < 2);
        }
        System.out.println(answer / 2);
    }

    private static int[] toArray(long num) {
        String[] temp = Long.toString(num).split("");
        int[] answer = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            answer[i] = Integer.parseInt(temp[i]);
        }
        return answer;
    }
}