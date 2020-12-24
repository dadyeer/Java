public class Main {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("/////////  1  /////////");
        firstChallenge();
        System.out.println("");
        System.out.println("/////////  2  /////////");
        secondChallenge();
        System.out.println("");
        System.out.println("/////////  3  /////////");
        thirdChallenge();
        System.out.println("");
        System.out.println("/////////  4  /////////");
        fourthChallenge();
         }

    /**
     * задача 1
     */
    static void firstChallenge() {
        int[] aNumber = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0};

        for (int i = 0; i < aNumber.length; i++) {
            System.out.print(i + "-" + aNumber[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < aNumber.length; i++)
            if (aNumber[i] == 1) aNumber[i] = 0;
            else aNumber[i] = 1;
        for (int i = 0; i < aNumber.length; i++) {
            System.out.print(i + "-" + aNumber[i] + " ");
        }
    }
    /**
     * задача 2
     */
    static void secondChallenge() {
        int iKnowNumber = 8;
        int j = 0;
        int[] anewNumber = new int[iKnowNumber];

        for (int i = 0; i < anewNumber.length; i++, j = j + 3) {
            anewNumber[i] = j;
            System.out.print(i + "-" + anewNumber[i] + " ");
        }
    }
    /**
     * задача 3
     */
    static void thirdChallenge() {
        int[] notASix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < notASix.length; i++) {
            if (notASix[i] < 6) notASix[i] = notASix[i] * 2;
        }

        for (int i = 0; i < notASix.length; i++) {
            System.out.println(i + "-" + notASix[i] + " ");
        }

    }
    /**
     * задача 4
     */
    static void fourthChallenge() {
        int[][] bigMassive = new int[4][4];
        for (int i = 0; i < bigMassive.length; i++) {
            for (int j = 0, x = bigMassive.length - 1; j < bigMassive[i].length; j++, x--) {
                if (i == j || i == x) bigMassive[i][j] = 1;
                else bigMassive[i][j] = 0;
                System.out.println(bigMassive[i][j] + "");
            }
            System.out.println();

        }

    }
}