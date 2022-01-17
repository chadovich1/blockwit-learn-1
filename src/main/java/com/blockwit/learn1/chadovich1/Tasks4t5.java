package com.blockwit.learn1.chadovich1;
import java.util.Scanner;
public class Tasks4t5 {
  /* s4t5
Написать программу, которая спрашивает у пользователя четыре числа.
 А затем меняет местами первое и последнее число и выводит все числа.
  */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите четыре числа");
        int[] num = new int[4];
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        int ind = num[0];
        num[0] = num[num.length - 1];
        num[num.length - 1] = ind;

        for (int i = 0; i < num.length ; i++) {
            System.out.println(num[i]);
            in.close();
        }
    }
}






