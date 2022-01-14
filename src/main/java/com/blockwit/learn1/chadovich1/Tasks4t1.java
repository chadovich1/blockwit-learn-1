package com.blockwit.learn1.chadovich1;

import java.util.Scanner;

public class Tasks4t1 {
  /* s4t1
Написать программу, которая спрашивает у пользователя его год рождения и имя.
 Затем вычисляет сколько ему лет и выводит в формате: "<имя>, вам <кол-во_лет> лет"
  */

    public static void main (String[]  args )   {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш год рождения");
        int yearbirth = in.nextInt();
        int year = 2020;
        int yourAge = year - yearbirth;
        System.out.println("Введите ваше имя");
        Scanner str = new Scanner(System.in);
        String name  = str.nextLine();
        System.out.println("Вас зовут  " + name + "  Вам  " + yourAge + "  лет." );

        in.close();

    }



   /* public static void uourAge ( ) {  }*/


}
