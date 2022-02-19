package HomeWork3;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        System.out.println("Задание № 1");
        int[] arr1 = {1, 1, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arr1));
        System.out.println();
        ChangeArraysOneZero.changeZeroOne(arr1);
        System.out.println();

        System.out.println("Задание № 2");
        int[] arr2 = new int[100];
        FilingArray.filArray(arr2);
        System.out.println();

        System.out.println("Задание № 3");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        MultArray.multArray(arr3);
        System.out.println();

        System.out.println("Задание № 4");
        int[][] arr4 = new int[7][7];
        DimArray.dimArray(arr4);
        System.out.println();

        System.out.println("Задание № 5");
        CreateArray.createArr(11, 1);
        System.out.println();

        System.out.println("Задание № 6");
        int[] arr5 = {1, 6, 7, 8, 21, 45};
        System.out.println("минимальный элемент массива = " + ArrayMinMax.getMin(arr5));
        System.out.println("максимальный элемент массива = " + ArrayMinMax.getMax(arr5));
        System.out.println(ArrayMinMax.getMax(arr3));
        System.out.println();

        System.out.println("Задание № 7");
        int[] arr6 = {0, 1, 2, 4};
        System.out.println(CheckBalance.checkBalance(arr6));
        System.out.println();

        System.out.println("Задание № 8");
        int[] arr7 = {5, 6, 1, 2, 8, 3};
        DisplacemedArray.dispArr(arr7, 2);
    }
}
