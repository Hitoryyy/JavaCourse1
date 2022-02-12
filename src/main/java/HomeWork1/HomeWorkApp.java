package HomeWork1;

public class HomeWorkApp {
    //Задание № 1
    public static void main(String[] args) {
        System.out.println("Задание № 1");
        printThreeWords();
        System.out.println();
        System.out.println("Задание № 2");
        checkSumSign();
        System.out.println();
        System.out.println("Задание № 3");
        System.out.println();
        System.out.println("Задание № 4");
        printColor();
        System.out.println();
        System.out.println("Задание № 5");
        compareNumbers();
    }

    //Задание №2
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //Задание № 3
    public static void checkSumSign() {
        int a = 5;
        int b = 7;
        int c = a + b;
        /*if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
            System.out.println(c);
        } else {
            System.out.println("Сумма отрицательная");
            System.out.println(c);
        }*/

        if (c >= 0) {
            System.out.println("Сумма: " + c);
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма: " + c);
            System.out.println("Сумма отрицательная");
        }
    }

    //Задание № 4
    public static void printColor() {
        int value = 10;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    //Задание № 5
    public static void compareNumbers() {
        int a = 9;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
