package Lesson4;

public class TaskApp {
    public static void main(String[] args) {
        int [] array = new int[]{1,0,0,1};
        reverseArray(array);
    }
    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
    }
}
