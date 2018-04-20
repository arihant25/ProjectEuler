public class id17 {
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 1; i <= 1000; i++) {
            answer = answer + numWords(i).length();
            //System.out.println(numWords(i));
        }
        System.out.println(answer);
    }

    private static String numWords(int i) {

        String[] single = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        String[] doubleDigits = {"Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety", "Hundred"};

        if (String.valueOf(i).length() == 1) {
            return single[i];
        }

        if (String.valueOf(i).length() == 2 && i > 20 && (i % 10) != 0) {
            int a = i / 10;
            int b = i % 10;
            return (doubleDigits[a] + "" + single[b]);
        }

        if (String.valueOf(i).length() == 2 && i > 9 && i < 20 && (i % 10) != 0) {
            return (single[i]);
        }

        if (String.valueOf(i).length() == 2 && i > 9 && (i % 10) == 0) {
            int a = i / 10;
            return (doubleDigits[a]);
        }

        if (String.valueOf(i).length() == 3 && (i % 100) != 0) {
            int a = i / 100;
            int b = i % 100;
            return (single[a] + "HundredAnd" + numWords(b));
        }

        if (String.valueOf(i).length() == 3 && (i % 100) == 0) {

            return (numWords(i / 100) + "Hundred");
        }

        if (String.valueOf(i).length() == 4) {
            return ("OneThousand");
        }
        return "";
    }
}