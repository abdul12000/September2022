package org.example;

public class MainQ_Constructor {
    String  firstName;
    String middleName;
    String lastName;
    int age;
    public MainQ_Constructor(String firstName, String middleName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
    }

    public static void main(String[] args) {
        MainQ_Constructor mainQ_constructor = new MainQ_Constructor("Lateef","Ola", "Abdul", 25);
        System.out.println(mainQ_constructor.firstName);
        System.out.println(mainQ_constructor.age);
        System.out.println(mainQ_constructor.middleName);
    }
}
