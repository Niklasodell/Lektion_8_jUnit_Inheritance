package com.niklas.jUnit_Inheritence;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Student benny = new Student("Benny", 15, true);
        School sti = new School("STI", 10);

        sti.introduceStudent(benny);


    /*
        System.out.println(benny);

        String name = "Teresa";
        int age = 15;
    */
/*
        for (int i = 0; i < 1; i++) {
            Random r = new Random();
            System.out.println(r.nextInt(6));
        }

        if (age == 16 && name.equals("Teresa")) {
            System.out.println("You really are Teresa");

        }

*/
    }
}
