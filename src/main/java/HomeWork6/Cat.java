package HomeWork6;

public class Cat extends Animal {

    public Cat(String name, int run, int swim) {
        super(name, run, swim);
    }

    @Override
    void runInfo() {
        //super.runInfo();
        if (getRun() > 200) {
            System.out.println("Кот " + getRun() + " не пробежит!");
        } else {
            System.out.println("Кот пробежал " + getRun() + " м ");
        }
    }

    @Override
    void swimInfo() {
        //super.swimInfo();
        System.out.println("Коты плавать не умеют!");
    }



}
