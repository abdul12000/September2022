package org.example;

public class MainN_Constructor {
    int x;

    public MainN_Constructor(int y) {
        x = y;
    }

    public static void main(String[] args) {
        MainN_Constructor myObj = new MainN_Constructor(10);
        System.out.println(myObj.x);
    }
}
