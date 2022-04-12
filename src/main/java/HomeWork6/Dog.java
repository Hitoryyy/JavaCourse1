package HomeWork6;

public class Dog extends Animal {

    public Dog(String name, int run, int swim) {
        super(name, run, swim);
    }

    @Override
    void runInfo() {
        if (run > 500) {
            System.out.println("Собака " + name + " не пробежит: " + run + " м ");
        } else {
            System.out.println("Собака " + name + " пробежала: " + run + " м ");
        }
    }

    @Override
    void swimInfo() {
        if (swim > 10) {
            System.out.println("Собака " + name + " не проплывёт: " + swim + " м ");
        } else {
            System.out.println("Собака " + name + " проплыла: " + swim + " м ");
        }
    }
}
