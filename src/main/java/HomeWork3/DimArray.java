package HomeWork3;

import java.util.Arrays;

public class DimArray {
    public static void dimArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 0;
                if (i == j) {
                    arr[j][i] += 1;
                }
                if (i + j == (arr.length - 1) && i != j){
                    arr[j][i] += 1;
                }
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
