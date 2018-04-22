public class id28 {
    public static void main(String[] args) {
        int sum = 0;
        int oneThousand[][] = new int[1001][1001];
        //to build the array
        for (int i = 0; i < 1002; i++) {

        }
        int[][] twoD = {
                {21, 22, 23, 24, 25},
                {20, 7, 8, 9, 10},
                {19, 6, 1, 2, 11},
                {18, 5, 4, 3, 12},
                {17, 16, 15, 14, 13}};
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                if (i == j) {
                    sum = sum + twoD[i][j];
                }
            }

            for (int j = 0; j < twoD[i].length; j++) {
                if (j == twoD[i].length - i - 1 && twoD[i].length - i - 1 != i) {
                    sum = sum + twoD[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}