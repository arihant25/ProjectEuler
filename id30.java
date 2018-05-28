public class id30 {
    public static void main(String[] args) {
        long answer = 0;
        for (int i = 2; i < 5000000; i++) {
            String number = Integer.toString(i);
            int[] numArray = new int[number.length()];
            for (int j = 0; j < number.length(); j++)
                numArray[j] = Integer.parseInt(String.valueOf(number.charAt(j)));
            double sum = 0;
            for (int j = 0; j < numArray.length; j++)
                sum = sum + Math.pow(numArray[j], 5);
            if ((int) sum == i)
                answer = answer + i;
        }
        System.out.println(answer);
    }
}
