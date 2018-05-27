import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class id54 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\ArihantLab\\Desktop\\p054_poker.txt");
        Scanner sc = new Scanner(file);
        String[] plays = new String[1000];
        int count = 0;
        while (sc.hasNextLine()) {
            plays[count] = (sc.nextLine());
            count++;
        }
        int answer = 0;
        for (int i = 0; i < 1000; i++) {
            if (wins(plays[i]))
                answer++;
        }
        System.out.println(answer);
    }

    private static boolean wins(String play) {
        String[] hand = play.split("\\s");
        String[] firstNum = new String[5];
        String[] firstType = new String[5];
        String[] secondNum = new String[5];
        String[] secondType = new String[5];
        for (int j = 0; j < 10; j++) {
            String[] temp = hand[j].split("");
            if (j < 5) {
                firstNum[j] = temp[0];
                firstType[j] = temp[1];
            } else {
                secondNum[j - 5] = temp[0];
                secondType[j - 5] = temp[1];
            }
        }
        if (checkIf1Wins(firstNum, firstType, secondNum, secondType))
            return true;
        else return false;
    }

    private static boolean checkIf1Wins(String[] firstNum, String[] firstType, String[] secondNum, String[] secondType) {
        if (royalFlush(firstNum, firstType) && !royalFlush(secondNum, secondType))
            return true;
        if (!royalFlush(firstNum, firstType) && royalFlush(secondNum, secondType))
            return false;
        return checkSF(firstNum, firstType, secondNum, secondType);
    }

    private static boolean checkSF(String[] firstNum, String[] firstType, String[] secondNum, String[] secondType) {
        if (straightFlush(firstNum, firstType) && !straightFlush(secondNum, secondType))
            return true;
        if (!straightFlush(firstNum, firstType) && straightFlush(secondNum, secondType))
            return false;
        if (straightFlush(firstNum, firstType) && straightFlush(secondNum, secondType)) {
            if (highCard(firstNum) > highCard(secondNum))
                return true;
            if (highCard(firstNum) < highCard(secondNum))
                return false;
            if (highCard(firstNum) == highCard(secondNum))
                return checkNextHigh(firstNum, secondNum);
        }
        return check4Kind(firstNum, secondNum, firstType, secondType);
    }

    private static boolean check4Kind(String[] firstNum, String[] secondNum, String[] firstType, String[] secondType) {
        if (fourKind(firstNum) && !fourKind(secondNum))
            return true;
        if (!fourKind(firstNum) && fourKind(secondNum))
            return false;
        if (fourKind(firstNum) && fourKind(secondNum)) {
            if (highFour(firstNum) > highFour(secondNum))
                return true;
            if (highFour(firstNum) < highFour(secondNum))
                return false;
        }
        return checkFullHouse(firstNum, secondNum, firstType, secondType);
    }

    private static boolean checkFullHouse(String[] firstNum, String[] secondNum, String[] firstType, String[] secondType) {
        if (fullHouse(firstNum) && !fullHouse(secondNum))
            return true;
        if (!fullHouse(firstNum) && fullHouse(secondNum))
            return false;
        if (fullHouse(firstNum) && fullHouse(secondNum)) {
            if (highThree(firstNum) > highThree(secondNum))
                return true;
            else return false;
        }
        return checkFlush(firstNum, secondNum, firstType, secondType);
    }

    private static boolean checkFlush(String[] firstNum, String[] secondNum, String[] firstType, String[] secondType) {
        if (flush(firstType) && !flush(secondType))
            return true;
        if (!flush(firstType) && flush(secondType))
            return false;
        return checkStraight(firstNum, secondNum);
    }

    private static boolean checkStraight(String[] firstNum, String[] secondNum) {
        if (straight(firstNum) && !straight(secondNum))
            return true;
        if (!straight(firstNum) && straight(secondNum))
            return false;
        if (straight(firstNum) && straight(secondNum)) {
            if (highCard(firstNum) > highCard(secondNum))
                return true;
            if (highCard(firstNum) < highCard(secondNum))
                return false;
        }
        return checkThreeKind(firstNum, secondNum);
    }

    private static boolean checkThreeKind(String[] firstNum, String[] secondNum) {
        if (threeKind(firstNum) && !threeKind(secondNum))
            return true;
        if (!threeKind(firstNum) && threeKind(secondNum))
            return false;
        if (threeKind(firstNum) && threeKind(secondNum)) {
            if (highThree(firstNum) > highThree(secondNum))
                return true;
            if (highThree(firstNum) < highThree(secondNum))
                return false;
        }
        return checkTwoPairs(firstNum, secondNum);
    }

    private static boolean checkTwoPairs(String[] firstNum, String[] secondNum) {
        if (twoPairs(firstNum) && !twoPairs(secondNum))
            return true;
        if (!twoPairs(firstNum) && twoPairs(secondNum))
            return false;
        return checkOnePair(firstNum, secondNum);
    }

    private static boolean checkOnePair(String[] firstNum, String[] secondNum) {
        if (onePair(firstNum) && !onePair(secondNum))
            return true;
        if (!onePair(firstNum) && onePair(secondNum))
            return false;
        if (onePair(firstNum) && onePair(secondNum)) {
            if (higherPair(firstNum) > higherPair(secondNum))
                return true;
            if (higherPair(firstNum) < higherPair(secondNum))
                return false;
        }
        return checkHigh(firstNum, secondNum);
    }

    private static boolean checkHigh(String[] firstNum, String[] secondNum) {
        if (highCard(firstNum) > highCard(secondNum))
            return true;
        if (highCard(firstNum) < highCard(secondNum))
            return false;
        return checkNextHigh(firstNum, secondNum);
    }

    private static boolean checkNextHigh(String[] firstNum, String[] secondNum) {
        String[] numbered = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        int[] first = new int[5];
        int[] second = new int[5];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < numbered.length; j++) {
                if (firstNum[i].equals(numbered[j]))
                    first[i] = j;
            }
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < numbered.length; j++) {
                if (secondNum[i].equals(numbered[j]))
                    second[i] = j;
            }

        Arrays.sort(first);
        Arrays.sort(second);
        int count = 4;
        int temp1 = first[count];
        int temp2 = second[count];
        while (temp1 == temp2) {
            count--;
            temp1 = first[count];
            temp2 = second[count];
        }
        if (temp1 > temp2)
            return true;
        else return false;
    }

    private static int higherPair(String[] testNum) {
        int count = 0;
        String answer = "";
        for (int i = 0; i < 5; i++) {
            String temp = testNum[i];
            for (int j = 0; j < 5; j++)
                if (temp.equals(testNum[j]) && i != j)
                    count++;
            if (count == 1)
                answer = testNum[i];
            count = 0;
        }
        String[] numbered = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        for (int i = 0; i < numbered.length; i++)
            if (numbered[i].equals(answer))
                return i;
        return -1;
    }

    private static int highThree(String[] testNum) {
        String temp = testNum[0];
        int count = 0;
        for (int i = 0; i < 5; i++)
            if (temp.equals(testNum[i]))
                count++;
        if (count != 3) {
            if (!temp.equals(testNum[1]))
                temp = testNum[1];
            else temp = testNum[2];
        }
        String[] numbered = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        for (int i = 0; i < numbered.length; i++)
            if (numbered[i].equals(temp))
                return i;
        return 0;
    }

    private static int highFour(String[] testNum) {
        String temp = testNum[0];
        int count = 0;
        for (int i = 0; i < 5; i++)
            if (temp.equals(testNum[i]))
                count++;
        if (count != 4)
            temp = testNum[1];
        String[] numbered = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        for (int i = 0; i < numbered.length; i++)
            if (numbered[i].equals(temp))
                return i;
        return 0;
    }

    private static int highCard(String[] testNum) {
        String[] numbered = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        int answer = 0;
        for (int i = 0; i < testNum.length; i++) {
            for (int j = 0; j < numbered.length; j++) {
                if (testNum[i].equals(numbered[j]))
                    if (j > answer) {
                        answer = j;
                        break;
                    }
            }
        }
        return answer;
    }

    private static boolean onePair(String[] testNum) {
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                if (testNum[i].equals(testNum[j]) && i != j) {
                    return true;
                }
            }
        return false;
    }

    private static boolean twoPairs(String[] testNum) {
        int count = 0;
        String check = "0";
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                if (testNum[i].equals(testNum[j]) && i != j && !testNum[i].equals(check)) {
                    count++;
                    check = testNum[i];
                }
            }
        if (count >= 2)
            return true;
        return false;
    }

    private static boolean threeKind(String[] testNum) {
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                for (int k = 0; k < 5; k++)
                    if (testNum[i].equals(testNum[j]) && testNum[i].equals(testNum[k]) && i != j && j != k && k != i)
                        return true;
        return false;
    }

    private static boolean straight(String[] testNum) {
        String[] numbered = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        int start = 20;
        for (int i = 0; i < testNum.length; i++) {
            for (int j = 0; j < numbered.length; j++) {
                if (testNum[i].equals(numbered[j]))
                    if (j < start) {
                        start = j;
                        break;
                    }
            }
        }
        int[] first = new int[5];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < numbered.length; j++) {
                if (testNum[i].equals(numbered[j]))
                    first[i] = j;
            }
        Arrays.sort(first);
        int temp = first[0];
        for (int i = 0; i < first.length; i++) {
            if (first[i] != temp++)
                return false;
        }
        return true;
    }

    private static boolean flush(String[] testTypes) {
        if (testTypes[0].equals(testTypes[1]))
            if (testTypes[1].equals(testTypes[2]))
                if (testTypes[2].equals(testTypes[3]))
                    if (testTypes[3].equals(testTypes[4]))
                        return true;
        return false;
    }

    private static boolean fullHouse(String[] testNum) {
        String first = testNum[0];
        String second = "";
        int count = 0;
        for (int i = 1; i < 5; i++) {
            if (!testNum[i].equals(first))
                second = testNum[i];
        }
        for (int i = 0; i < 5; i++)
            if (testNum[i].equals(first) || testNum[i].equals(second))
                count++;
        if (count == 5)
            if (twoPairs(testNum))
                return true;
        return false;
    }

    private static boolean fourKind(String[] testNum) {
        String first = testNum[0];
        String second = "";
        int count = 0;
        int check = 0;
        for (int i = 1; i < 5; i++) {
            if (!testNum[i].equals(first))
                second = testNum[i];
        }
        for (int i = 0; i < 5; i++)
            if (testNum[i].equals(first) || testNum[i].equals(second))
                count++;
        if (count == 5)
            for (int i = 0; i < 5; i++)
                if (testNum[i].equals(first))
                    check++;
        if (check == 1 || check == 4)
            return true;
        return false;
    }

    private static boolean straightFlush(String[] testNum, String[] testType) {
        if (flush(testType))
            if (straight(testNum))
                return true;
        return false;
    }

    private static boolean royalFlush(String[] testNum, String[] testType) {
        String[] numbered = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        int answer = 0;
        for (int i = 0; i < testNum.length; i++) {
            for (int j = 0; j < numbered.length; j++) {
                if (testNum[i].equals(numbered[j]))
                    if (j > answer) {
                        answer = j;
                        break;
                    }
            }
        }
        if (answer == 12)
            if (flush(testType))
                if (straight(testNum))
                    return true;
        return false;

    }
}