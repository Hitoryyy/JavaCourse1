package HomeWork2;

public class LeapOrNotLeap {
    public static boolean leapOrNotLeap(int year) {
        if (year % 4 == 0) {
            return true;
        } else if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

