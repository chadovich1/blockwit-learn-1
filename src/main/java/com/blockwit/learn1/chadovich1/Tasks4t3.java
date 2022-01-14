package com.blockwit.learn1.chadovich1;

import java.util.Scanner;

public class Tasks4t3 {
  /* s4t3
Написать программу, которая спрашивает температуру за последние три дня,
 вычисляет среднюю температуру и выводит ее.
  */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] tempr = new double[3];
        for (int i = 0; i < tempr.length; i++) {
            System.out.println("Введите температуру ");
            tempr[i] = in.nextInt();
          // in.nextLine();
        }
        double sum = 0;
        for (int i = 0; i < tempr.length; i++) {
            sum = tempr[i] + sum  ;
        }
        double midltempr = 0;
        midltempr  = sum/tempr.length;
        System.out.println("Средняя  температурa = " + midltempr );

        in.close();
    }
/*     Укороченное решение . Но е до конца понятное((
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countT = 3;    // Задает количество дней для перещета
        double sum = 0;
        for (int i = 0; i < countT ; i++) {
            System.out.println("Введите температуру ");
            sum = sum + in.nextInt();
            in.nextLine();
        }
        double midltempr = sum/countT ;

        System.out.println("Средняя  температурa = " + sum/midltempr );
        in.close();

    }    */

}