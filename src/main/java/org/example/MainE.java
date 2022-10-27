package org.example;

public class MainE {
    public int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }
    public int additionMethod(int x, int y) {
        return (x + y);
    }
    private int subtractionMethod(int x, int y) {
        return (x - y);
    }
    private int divisonMethod(int x, int y) {
        return (x / y);
    }
    private int multiplicationMethod(int x, int y) {
        return (x * y);
    }

    public static void main(String[] args) {
        //Creating an Object
        MainE mainE = new MainE();
        System.out.println(mainE.max(100, 200));
        System.out.println(mainE.additionMethod(10, 20));
        System.out.println(mainE.subtractionMethod(10, 20));
        System.out.println(mainE.multiplicationMethod(10, 20));
        System.out.println(mainE.divisonMethod(100,10));
    }
}
