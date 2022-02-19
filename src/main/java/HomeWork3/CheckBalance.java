package HomeWork3;

import java.util.Arrays;

public class CheckBalance {
    public static boolean checkBalance(int[] array) {
        boolean arrBalance = false;
        int arrSum = 0;
        int rightSum = 0;
        for (int i : array) {
            arrSum += i;
        }
        System.out.println("Сумма всех элементов в массиве: " + arrSum);
        for (int i = 0; i < array.length; i++) {
            rightSum += array[i];
            if (rightSum == arrSum - rightSum) {
                arrBalance = true;
            }
        }
        System.out.println("Сумма элементов массива в левой части: " + rightSum);
        return arrBalance;
    }
}
