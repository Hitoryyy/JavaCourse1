package HomeWork6;

public class Dog extends Animal {

    public Dog(String name, int run, int swim) {
        super(name, run, swim);
    }

    @Override
    void runInfo() {
        //super.runInfo();
        if (getRun() > 500) {
            System.out.println("Собака " + getRun() + " м не пробежит!");
        } else {
            System.out.println("Собака пробежала " + getRun() + " м ");
        }
    }

    @Override
    void swimInfo() {
        //super.swimInfo();
        if (getSwim() > 10) {
            System.out.println("Собака " + getSwim() + " м не проплывёт!");
        } else {
            System.out.println("Собака проплыла " + getSwim() + " м ");
        }
    }

}
