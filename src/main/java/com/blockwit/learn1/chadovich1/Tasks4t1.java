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
        double yearbirth = in.nextDouble();
        System.out.println("Введите ваше имя");
        String uourName = in.nextLine();

        int  uourAge ;
        yearbirth = in.nextDouble();

        String Name = uourName;
        int Year = 2021;

        int uourAge = (Year - yearbirth );



        in.close();
    }
    public static void uourAge ( ) {


    }


}
