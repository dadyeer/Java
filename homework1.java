/**
 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
 public class Main {
 public static void main(String[] args) {
 }
 */


/**
 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
 byte a = -120;
 short b = 32000;
 int c = 1000000000;
 long d = 1111111111111L;
 float i = 22.22F;
 double f =  20.987;
 char  e = uffff;
 boulean j = true;
 */

/**3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
 где a, b, c, d – аргументы этого метода, имеющие тип float.
 public class Main {

 public static void main(String[] args) {
 float metod = multiplyMetod(2f, 3f, 4f, 6f);
 System.out.println(metod);
 }

 static float multiplyMetod(float a, float b, float c, float d) {
 return a * (b + (c / d));
 }
 }
 */

/** 4. Написать метод, принимающий на вход два целых числа и проверяющий,
 что их сумма лежит в пределах от 10 до 20 (включительно),
 если да – вернуть true, в противном случае – false.

public static void main(String[] args) {
        boolean metod4 =newMetod4(5,15);
        System.out.println(metod4);
        }
static boolean newMetod4 (int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 100) {
        return true;
        } else {
        return false;
        }
        }
        */

/**
 * 5. Написать метод, которому в качестве параметра передается целое число,
 * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
 * Замечание: ноль считаем положительным числом.

public static void main(String[] args) {
        int number3 = number(-7);
        }
static int number(int a) {
        if (a >= 0) {
        System.out.println("Число положительное");
        } else {
        System.out.println("Число отрицательное");
        }
        return a;
        }
        }
 */
/**
 6. Написать метод, которому в качестве параметра передается целое число.
 Метод должен вернуть true, если число отрицательное,
 и вернуть false если положительное.

 public class Main {

 public static void main(String[] args) {
 boolean number = trueOrFalseNumber(5);
 System.out.println(number);
 }

 static boolean trueOrFalseNumber (int a) {
 if (a < 0) {
 return true;
 }
 return false;
 }
 }
 */
/**
 7. Написать метод, которому в качестве параметра передается строка,
 обозначающая имя. Метод должен вывести в консоль
 сообщение «Привет, указанное_имя!».

 public class Main {
 public static void main(String[] args) {
 String name = sayYouName();
 }
 static String sayYouName() {
 String name = "Паша";
 System.out.println("ПРивет, "+ name + "!");
 return name;
 }
 }
*/
/**
 8. * Написать метод, который определяет, является ли год високосным,
 и выводит сообщение в консоль. Каждый 4-й год является високосным,
 кроме каждого 100-го, при этом каждый 400-й – високосный.
 
public static void main(String[] args) {
        boolean theYearIS = whatTheYear(2001);
        System.out.println("Високосный");
        }

static boolean whatTheYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        }

        }
 */
