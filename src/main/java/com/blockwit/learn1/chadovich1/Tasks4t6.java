package com.blockwit.learn1.chadovich1;

//import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Tasks4t6 {
  /* s4t6
Написать программу, которая спрашивает у пользователя четыре числа.
 А затем меняет местами первое и последнее число только если последнее больше первого.
  Затем выводит числа.
  */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите четыре числа ");
        int[] num = new int[4];
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
            if (num[0] < num[num.length - 1]) {

                int ind = num[0];
                num[0] = num[num.length - 1];
                num[num.length - 1] = ind;


            }
            else
            {                 };
            in.close();


        }


    }

}

/*  for (int i = 0; i < num.length ; i++){
           // for (int i = num .length-1; i >= 0; i--){
            System.out.println(num[i]);

        }*/