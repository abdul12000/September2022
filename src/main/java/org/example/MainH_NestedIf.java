package org.example;

public class MainH_NestedIf {

    public String DisplayDayOfTheWeek(int x) {
        if (x == 1) {
            return ("Sunday");
        } else if (x == 2) {
            return ("Monday");
        } else if (x == 3) {
            return ("Tuesday");
        } else if (x == 4) {
            return ("Wednesday");
        } else if (x == 5) {
            return ("Thursday");
        } else if (x == 6) {
            return ("Friday");
        } else if (x == 7) {
            return ("Saturday");
        } else {
            return ("Please enter value between 1 and 7 only");
        }
    }

    public static void main(String[] args) {
        MainH_NestedIf mainH_nestedIf = new MainH_NestedIf();
        System.out.println(mainH_nestedIf.DisplayDayOfTheWeek(1));
    }

}
