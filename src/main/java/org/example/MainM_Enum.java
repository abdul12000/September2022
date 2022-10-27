package org.example;

public class MainM_Enum {
    enum PhoneType{
        SAMSUNG,
        IPHONE,
        HTC,
        NOKIA,
        AWAI,
        INFINIX,
        TECHNO;
    }
    public static void main(String[] args) {
        System.out.println(PhoneType.IPHONE);   //This will printout “IPHONE” }
        System.out.println(PhoneType.TECHNO);
    }

}
