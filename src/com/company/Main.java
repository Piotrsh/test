package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj wiek psa w latach");
        Scanner entry = new Scanner(System.in);
        double firstAgeDog = entry.nextInt();
        int firstMonthDog = entry.nextInt();

        double secondAgeDog = 0;

        secondAgeDog =  16*Math.log(firstAgeDog)+31;
        System.out.format("%.0f%n", secondAgeDog );
    }
}
