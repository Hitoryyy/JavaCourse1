package Lesson2;


public class MethodApp {

    public static final String TEMPLATE = "int = %d string = %s";

    public static void main(String[] args) {

        //int tp = 100;
        //int totalPrice = 100;

        int v1 = multiplication(4, 6);
        int v2 = multiplication(5, 6.0);


        PrintUtil.printFormatted("v1 = " + v1 + " v2 = " + v2 + " v3 = " + multiplication(v1, v2));

        PrintUtil.printFormatted("String to format");

        System.out.println(PrintUtil.getFormatted("test"));

        System.out.printf(TEMPLATE, 20, "str");
        System.out.println();
        System.out.printf(TEMPLATE, 122, "assafsaf");
    }


    public static int multiplication(int n1, int n2) {
        //return n1 * n2; возможная короткая запись.
        int result = n1 * n2;
        return result;
    }

    public static int multiplication(int n1, double n2) {
        //return (int)(n1 * n2); возможная короткая запись.
        int result = (int) (n1 * n2);
        return result;
    }

    public static int multiplication(double n1, int n2) {
        //return (int)(n1 * n2); возможная короткая запись.
        int result = (int) (n1 * n2);
        return result;
    }


    //модификатор доступа + тип значения + имя + набор параметров


    //naming - ClassName MyClassName
    //methods, variables - loaerCaseUperCase methodName variableName

    //CONSTANTS - UPPER_CASE (snake_case)_

    //тип возвращаемого значения
    //type - void / real type

    //модификаторы доступа
    //public - protected - (no modifier) defualt - private


}
