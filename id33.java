//theory to solve referenced from 'https://www.mathblog.dk/project-euler-33-fractions-unorthodox-cancelling-method/'
public class id33 {
    public static void main(String[] args) {
        int num = 1;
        int deno = 1;
        for (double i = 10; i < 100; i++) {
            for (double j = 10; j < 100; j++) {
                double fraction = i / j;
                if (fraction < 1) {
                    int[] arrNum = toArray(i);
                    int[] arrDen = toArray(j);
                    if (arrNum[0] == arrDen[1] && (arrNum[1] * j) == (arrDen[0] * i) || arrNum[1] == arrDen[0] && arrNum[0] * j == arrDen[1] * i) { //optimized condition, to sort trivial
                        num = num * ((int) i);
                        deno = deno * ((int) j);
                    }
                }
            }
        }
        int tempDeno = deno;
        while (num != 0 && deno != 0) {
            int temp = deno;
            deno = num % deno;
            num = temp;
        }
        System.out.println(tempDeno / (num + deno));
    }

    private static int[] toArray(double num) {
        String[] temp = Long.toString((int)num).split("");
        int[] answer = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            answer[i] = Integer.parseInt(temp[i]);
        }
        return answer;
    }
}