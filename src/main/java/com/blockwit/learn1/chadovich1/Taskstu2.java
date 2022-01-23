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
                Helper helper = new Helper();
                int[] array = {12, 7, 89, -4, 8, 9};
                helper.printIntArray(array);
                Utils sort = new Utils();
                sort.sort(array);                      // Отсортировать его в порядке возрастания.
                helper.printIntArray(array);




        }

}






