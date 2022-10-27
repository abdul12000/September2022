package org.example;

import org.junit.jupiter.api.Test;

public class MainS_UsingTestTag {
    //Logical operators
    @Test
    public void runTest() {
    int a = 5;
    int b = 6;
    int c = 7;
    int d = 5;

        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a!=d);
    }

}
