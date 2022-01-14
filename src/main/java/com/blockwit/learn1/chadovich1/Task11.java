package com.blockwit.learn1.chadovich1;

import java.util.Scanner;

public class Task11 {
    /*
    Написать программу ,
    1. Спрашивает имена и год рождения 4 людей.
    2. Выводит имена и количество лет.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 2;
        String[] names = new String[count];
        int[] birthdays = new int[count];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Введите имя");
            names[i] = in.nextLine();
            System.out.println("Введите год рождения");
            birthdays[i] = in.nextInt();
            in.nextLine();

        }
        for (int i = 0; i < names.length; i++) {

            System.out.println(names[i] + "  вам   " + (2022 - birthdays[i]) + " лет.");

            in.close();
        }

    }

}