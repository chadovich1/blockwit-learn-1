package com.blockwit.learn1.chadovich1.S7T;


import com.blockwit.learn1.chadovich1.Helper;

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
                int[] array1 = {9, 1, 5, 6, 8};
                int[] array2 = { 7, 3, 1};
            System.out.println("array1");
                helper.printIntArray(array1);
            System.out.println("array2");
                helper.printIntArray(array2);

                int[] array3 = new int[array1.length + array2.length];

            int count=0;
            for(int i=0;i<array1.length;i++){
                array3[i]=array1[i];
                count++;
            }
            for(int i=0;i< array2.length;i++){
                array3 [count++]=array2[i];
            }
            System.out.println("array3");
            helper.printIntArray(array3);
        }

}








