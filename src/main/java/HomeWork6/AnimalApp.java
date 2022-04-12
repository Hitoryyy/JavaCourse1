package HomeWork6;

import java.util.Arrays;

public class AnimalApp {
    public static void main(String[] args) {

        Dog dog = new Dog("GGG", 501, 14);
        dog.runInfo();
        dog.swimInfo();
        System.out.println();
        System.out.println();

        Cat cat = new Cat("Tom", 201, 3);
        cat.swimInfo();
        cat.runInfo();
        System.out.println();
        System.out.println();

        Animal[] animals = {cat, dog};
        for (Animal animal : animals){
            System.out.println(animal.getName());
        }


    }
}
