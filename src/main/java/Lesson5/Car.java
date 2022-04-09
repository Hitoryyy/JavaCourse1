package Lesson5;

public class Car {

    public static int wheelsNumber = 0;

    //fields
    private String model;
    private int year;
    private boolean wasCrashed;
    public String[] properties;


    //Constructor
    public Car(String model, int year, boolean wasCrashed) {
        this.model = model;
        this.year = year;
        this.wasCrashed = wasCrashed;
    }

    public Car(String model, int year) {
        this(model, year, false);
        /*this.model = model;
        this.year = year;
        wasCrashed = false;*/
    }

    public Car(String model){
        this(model, 2020);
    }


    /**
     * Выводит на экран информацию о машине
     */
    public void info() {
        System.out.println("Model = " + model + " year = " + year + " wasCrashed = " + wasCrashed);
    }

    public void printModel() {
        System.out.println(model);
    }


    //---------------------------- методы чтения свойств объекта ---------------------------------/ get - получи - запись
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isWasCrashed() {
        return wasCrashed;
    }


    //------------------------------------------- методы модифицирования свойст объекта---------------------------------------------/ set - установи - вывод
    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Error");
        }
    }

    public void setWasCrashed(boolean wasCrashed) {
        this.wasCrashed = wasCrashed;
    }


    /**
     * Попал в аварию
     */
    public void crash() {
        System.out.println("car was crashed");
        wasCrashed = true;
    }

    public void repair() {
        if (wasCrashed) {
            wasCrashed = false;
            System.out.println("was repair");
        } else {
            System.out.println("Nothing to repair");
        }
    }

    public void printModelNTimes(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(model);
        }
    }


    public static void staticInfo() {

    }
}
