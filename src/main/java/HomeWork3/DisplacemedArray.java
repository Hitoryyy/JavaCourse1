package HomeWork3;

import java.util.Arrays;

public class DisplacemedArray {
    public static void dispArr(int[] arr, int n) {
        int temp;
        int len = arr.length - 1;
        System.out.println(Arrays.toString(arr));
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                temp = arr[len];
                System.arraycopy(arr, 0, arr, 1, len);
                arr[0] = temp;
            }
        } else {
            for (int i = 0; i < -n; i++) {
                temp = arr[0];
                System.arraycopy(arr, 1, arr, 0, len);
                arr[len] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
