package com.blockwit.learn1.chadovich1;

//import java.util.Arrays;

public class TaskS7T3 {
  /* TaskS7T3
 Есть два массива. Первый 7,4,2,8,6,7 и второй 6,2,9.
 Вывести их на экран. А затем создать такой массив, который вмещал бы первые два.
 И скопировать в новый массив элементы первых двух массивов.
 При этом элементы из первого и второго массивов должны чередоваться в новом массиве.
 Если в какой-то момент из-за нехватки элементов в одном из массивов чередовать будет нельзя,
 то копировать элементы из оставшегося массива.
  */

        public static void main(String[] args) {
                int[]  array1 = {7, 4, 2, 8, 6, 7};
                int[]  array2 = {6, 2, 9};

                Helper helper = new Helper();

                System.out.println("array1");
                helper.printIntArray(array1);
                System.out.println("array2");
                helper.printIntArray(array2);

                int[] array3 = new int[array1.length + array2.length];

                int count = 0;
                for (int i = 0; i < array2.length; i++) {
                        array3 [count++] = array1 [i];
                        array3 [count++] = array2 [i];
                }

                if (array1.length > array2.length) {
                        int [] array4 = new int [array1.length - array2.length];
                        for (int i = array4.length; i < array1.length; i++) {
                                array3 [count++] = array1 [i];
                        }
                } else {
                        int[] array4 = new int[array2.length - array1 .length];
                        for (int i = array4.length; i < array2.length; i++) {
                                array3 [count++] = array2[i];
                        }
                }
                System.out.println("array3");
                     helper.printIntArray(array3);
        }
}








