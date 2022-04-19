package HomeWork7;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
       /* Cat cat = new Cat("Tom", 10);
        Cat cat1 = new Cat("Барсик", 15);
        Cat cat2 = new Cat("Teodor", 699);
        Plate plate = new Plate(100);

        plate.info();

        cat.eat(plate);
        cat.catInfo();

        cat1.eat(plate);
        cat1.catInfo();

        cat2.eat(plate);
        cat2.catInfo();

        plate.info();*/

        Plate plate = new Plate(200);
        plate.info();

        Cat[] cats = {new Cat("Tom", 10), new Cat("Jerry", 15),
                new Cat("Felix", 235)};

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.catInfo();
        }

        plate.info();
        plate.addFood(100);
        plate.info();




    }
}
