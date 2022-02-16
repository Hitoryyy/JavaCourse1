package Lesson3;

import java.util.Arrays;

public class ArrayApp {

    public static int variable = 100; //объявление и инициализация глобальной переменной

    public static void main(String[] args) {
        int[] array = new int[5];
        //int[] array2 = array; выделение памяти не произойдёт (массив не будет создан)
        array[2] = 199;
        array[array.length - 1] = 100;

        for (int i = 0; i < array.length; i++) {
            array[i] = 100 + i * 100;
        }

        int[] arr = {1, 2, 3, 4, 5, 6};

        printArray(array);
        printArray(arr);

        String[] strings = new String[10];

        Arrays.fill(strings, "a"); //метод заполнения массива значениями по умолчанию, что-бы не писать цикл

        //System.out.println(strings);

        System.out.println(Arrays.toString(strings)); // метод вывода массивов на экран

        boolean[] booleans = {}; //пустой массив, в котором нет ни одного элемента
        System.out.println(Arrays.toString(booleans)); //вывод

        int integer = 100;
        method1(integer);
        System.out.println("integer = " + integer);

        int[] integers = {1, 2, 3, 4, 5, 6};
        method2(integers);
        System.out.println(Arrays.toString(integers));


    }


    public static void method1(int a) {
        a = a + 10;
    }

    public static void method2(int[] a) {
        a[2] = 100500;
    }


    public static void printArray(int[] array) { // свой метода вывода массива на экран
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int getAvg(int[] array) { //нахождение среднего значения элементов массива
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
