package homework3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        qestion();
        /**
         * Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
         * При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
         * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
         */
    }

    static void qestion() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        do {


            int newRandom = random.nextInt(10);
            int newScanner;


            for (int i = 0; i < 3; i++) {
                System.out.println("ВВедите число от 0 до 9");
                newScanner = scanner.nextInt();

                if (newScanner == newRandom) {
                    System.out.println("Вы угадали");
                    break;
                } else if (newScanner > newRandom) {
                    System.out.println("Ваше число больше");
                } else {
                    System.out.println("Ваше число меньше");

                }
            }
            System.out.println("Правильное число " + newRandom);

            System.out.println("Будем еще? 1- да, 0 - нет");
            int newGame = scanner.nextInt();
            if (newGame == 0) {
                System.out.println("До встречи!");
                break;
            }
        } while (true);
    }
}