package com.blockwit.learn1.chadovich1;

import java.util.Arrays;

import java.util.Scanner;

public class Taskstu0 {
  /* tu0
Задан массив чисел 12,7,89,-4,8,9. Необходимо:
1. Распечатать его.
2. Отсортировать его в порядке возрастания.
3. Распечатать еще раз.
  */

        public static void main(String[] args){
                int[] myArray = {12,7,89,-4,8,9};
                System.out.println("Выводим не сортированный массив:");
                for(int i = 0; i < myArray.length ; i++)
                        System.out.println( myArray[i]);
                System.out.println("Выводим сортированный массив:   " );
                        for(int i = 0; i < 6; i++) {
                                for (int j = i+1; j<myArray.length; j++) {
                                        if(myArray[i] > myArray[j]) {
                                           int temp = myArray[i];
                                         myArray[i] = myArray[j];
                                         myArray[j] = temp;
                                        }
                                }
                                System.out.println( myArray[i]);
                        }
        }

}






