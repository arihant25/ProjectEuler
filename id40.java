public class id40 {
    public static void main(String[] args) {
        String decimal = "1";
        for (int i = 2; i < 200000; i++) {
            decimal = decimal.concat(Integer.toString(i));
        }
        String[] array = decimal.split("");
        System.out.println(Integer.parseInt(array[0]) * Integer.parseInt(array[10 - 1]) *
                Integer.parseInt(array[100 - 1]) * Integer.parseInt(array[1000 - 1]) *
                Integer.parseInt(array[10000 - 1]) * Integer.parseInt(array[100000 - 1]) *
                Integer.parseInt(array[1000000 - 1]));
    }
}