package Lesson3;

public class StringApp {
    public static void main(String[] args) {
        String str = "new string";
        String str2 = new String("new string");

        boolean eq = str == str2;
        str.equals(str2);
    }
}
