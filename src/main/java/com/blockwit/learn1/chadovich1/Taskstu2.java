package com.blockwit.learn1.chadovich1;

//import java.util.Arrays;

import java.util.Scanner;

public class Taskstu2 {
  /* tu1
Написать класс Utils.
  Внутри него метод sort.
  Метод sort должен принимать на вход массив чисел.
  Метод сортирует числа внутри массива в порядке возрастания.
  */

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите четыре числа ");
                int[] num = new int[4];
                for (int i = 0; i < num.length; i++) {
                        num[i] = in.nextInt();
                }
                if (num[0] < num[num.length - 1]) {
                        int ind = num[0];
                        num[0] = num[num.length - 1];
                        num[num.length - 1] = ind;
                }
                for (int i = 0; i < num.length; i++){
                                System.out.println(num[i]);


                }
                in.close();
        }
}





