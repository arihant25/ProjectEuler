public class id34 {
    public static void main(String[] args) {
        int i = 3;
        int answer = 0;
        while (i < 500000) {
            int[] checkArr = toArray(i);
            int sum = factorialSum(checkArr);
            if (sum == i) {
                answer += i;
            }
            i++;
        }
        System.out.println(answer);
    }

    private static int factorialSum(int[] check) {
        int sum = 0;
        for (int i = 0; i < check.length; i++) {
            int product = 1;
            for (int j = 1; j <= check[i]; j++) {
                product *= j;
            }
            sum += product;
        }
        return sum;
    }

    private static int[] toArray(double num) {
        String[] temp = Integer.toString((int) num).split("");
        int[] answer = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            answer[i] = Integer.parseInt(temp[i]);
        }
        return answer;
    }
}