package HomeWork3;

import java.util.Arrays;

public class FilingArray {
    public static void filArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
            arr[i] += i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
