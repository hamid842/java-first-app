package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
//        My First App in Java on 2022/04/06
        System.out.println("Hello World!");

        short age = 30;
        System.out.println("Age:" + age);

        Date now = new Date();
        System.out.println(now);

//        Primitive types are copied by value
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);  // should print 1, because Primitive types have own location in memory

//        Reference types are copied by reference of memory
        Point point1 = new Point(1, 1);
        point1.x = 2;
        System.out.println(point1); // should print x=2,y=1 : because Reference Types copied by reference

//        String
        String message1 = "Hello Hamid";
        String message2 = "Hello \"Hamid\"";
        String message3 = "Hello \t\"Hamid\"";
        String message4 = "Hello \nHamid";
        String message5 = "Hello\\Hamid";
        System.out.println(message1);
        System.out.println(message2);
        System.out.println(message3);
        System.out.println(message4);
        System.out.println(message5);

//        Arrays
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers); //should print ridiculous thing,
        // because java returns a calculated base of address of this object

        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {1, 2, 3, 4, 5};
        System.out.println(numbers2);

//        multi-dimensional Arrays
        int[][] numbers3 = new int[5][2];
        numbers3[0][0] = 1;
        numbers3[1][0] = 2;
//        int[][] numbers3 = {{1,2,3},{4,5,6}}
        System.out.println(Arrays.deepToString(numbers3)); //because of multi arrays we use deepToString() method
    }
}
