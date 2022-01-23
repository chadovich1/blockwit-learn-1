package com.blockwit.learn1.chadovich1;

//import java.util.Arrays;

public class Taskstu1 {
    /* tu1
  Сделать класс Helper.
   Внутри него метод printIntArray, который принимает массив чисел и распечатывает их.
   Переписать предыдущую задачу, так чтобы она использовала метод printIntArray.
    */
    public static void main(String[] args) {
        Helper helper = new Helper();
        int[] array = {12, 7, 89, -4, 8, 9};

        helper.printIntArray(array);

        for(int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {                    // Отсортировать его в порядке возрастания.
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        helper.printIntArray(array);
    }
}