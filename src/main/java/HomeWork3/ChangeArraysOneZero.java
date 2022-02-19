package HomeWork3;

import java.util.Arrays;

public class ChangeArraysOneZero {
    public static void changeZeroOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            //System.out.println(Arrays.toString(arr)); - вышло заполнение нижней части единицами
        }
        System.out.println(Arrays.toString(arr));
    }
}
