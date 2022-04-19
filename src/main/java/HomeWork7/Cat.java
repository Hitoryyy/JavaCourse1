package HomeWork7;

import java.util.Arrays;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety = false;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.getFood() < appetite) {
            System.out.println("В миске недостаточно еды");
        } else {
            p.decreaseFood(appetite);
            System.out.println("Кот поел");
            satiety = true;
        }
    }

    @Override
    public String toString() {
        return "Кот {" +
                "Имя: " + name + '\'' +
                ", аппетит: " + appetite +
                ", сытость: " + satiety +
                '}';
    }

    public void catInfo() {
        System.out.println(this);
    }


}
