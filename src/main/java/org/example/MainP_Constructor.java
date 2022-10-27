package org.example;

public class MainP_Constructor {
    int  modelYear;
    String modelName;
    public MainP_Constructor(int year, String name){
        modelName = name;
        modelYear = year;
    }

    public static void main(String[] args) {
        MainP_Constructor mainP_constructor = new MainP_Constructor(2020,"Toyota");
        System.out.println(mainP_constructor.modelName);
        System.out.println(mainP_constructor.modelYear);
    }
}
