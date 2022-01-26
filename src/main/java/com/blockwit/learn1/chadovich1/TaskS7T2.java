package com.blockwit.learn1.chadovich1;

//import java.util.Arrays;

public class TaskS7T2 {
  /* TaskS7T2
   Есть два массива.
    Первый 6,3,8,9 и второй 0,3,1,5.
    Вывести их на экран.
    А затем создать такой массив, который вмещал бы первые два.
     И скопировть в новый массив элементы первых двух массивов.
     При этом элементы из первого и второго массивов
      должны чередоваться в новом массиве.
  */

        public static void main(String[] args) {

                int[] array1 = {6, 3, 8, 9};
                int[] array2 = {0, 3, 1, 5};

                Helper helper = new Helper();

                System.out.println("array1");
                helper.printIntArray(array1);
                System.out.println("array2");
                helper.printIntArray(array2);

                int[] array3 = new int[array1.length + array2.length];
                int count = 0;
                for (int i = 0; i <array1 .length; i++) {
                        array3 [count++] = array1 [i];
                        array3 [count++] = array2 [i];
                }
                System.out.println("array3");
                helper.printIntArray(array3);
        }
}








