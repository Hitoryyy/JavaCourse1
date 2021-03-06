package HomeWork6;

import jdk.jfr.SettingControl;

public class Animal {

   private String name;
   private int run;
   private int swim;


    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }


    void runInfo() {
        System.out.println("Животное пробежало: " + getRun() + " м ");
    }

    void swimInfo() {
        System.out.println("Животное проплыло: " + getSwim() + " м ");
    }

}
