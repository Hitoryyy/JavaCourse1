package HomeWork3;

import java.util.Arrays;

public class CreateArray {
    public static int[] createArr(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        System.out.println(Arrays.toString(arr));
        return (arr);
    }
}
