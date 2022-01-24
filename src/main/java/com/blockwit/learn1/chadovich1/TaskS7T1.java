package com.blockwit.learn1.chadovich1;

//import java.util.Arrays;

public class TaskS7T1 {
  /* TaskS7T1
   Есть два массива чисел.
    Первый - 9,1,5,6,8. И второй 7,3,1.
    Вывести их на экран.
    Затем создать такой массив, который бы умещал первые два.
     И скопировать туда элементы первых двух массивов.
     Вывести получный массив на экран.
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






