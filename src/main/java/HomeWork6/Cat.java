package HomeWork6;

public class Cat extends Animal {

    public Cat(String name, int run, int swim) {
        super(name, run, swim);
    }



    @Override
    void runInfo(){
        if (run > 200) {
            System.out.println("Кот " + name + " не пробежит " + run + " м ");
        } else {
            System.out.println("Кот " + name + " пробежал " + run + " м ");
        }
    }

    @Override
    void swimInfo(){
        System.out.println("Коты не умеют плавать!");
    }
}
