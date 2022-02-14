package Lesson2;

public class PrintUtil {
    /**
     * Форматирует строку тремя * до и после
     *
     * @param str строка для форматирования
     */
    public static void printFormatted(String str) {
        System.out.println("***" + str + "***");
    }

    /*public static void printFormatted(String str) {
        System.out.printf("***%s***", str);
    }*/

    /**
     * Форматирует строку тремя * до и после
     *
     * @param str строка для форматирования
     */
    public static String getFormatted(String str) {
        return "***" + str + "***";
    }

    public static void doSmth() {

    }
}
