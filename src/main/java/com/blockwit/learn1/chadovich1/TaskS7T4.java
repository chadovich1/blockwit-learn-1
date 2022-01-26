package com.blockwit.learn1.chadovich1;

//import java.util.Arrays;

public class TaskS7T4 {
  /* TaskS7T4
  1. Написать класс ProtoList1 в котором будет поле array типа массив целых чисел.
  2. Написать метод create который принимает размер
и создает и присваивает полю array пустой массив целых чисел указанного размера.
  3. Написать метод getSize который возращает длину массива в поле array.
  4. Написать метод get, который принимает индекс

  */
  public class ProtoList1{    // 1. Написать класс ProtoList1

          int[] array;        // в котором будет поле array типа массив целых чисел.

          public void create(int arraySize) {  //2. Написать метод create который принимает размер
                  int[] tempArray = new int[arraySize];
                  this.array = tempArray;    //и создает и присваивает полю array пустой массив целых чисел указанного размера.
          }

          public int getSize() {   //Написать метод getSize который возращает длину массива в поле array.
                  return array.length;
          }
          public int get(int i) {   // Написать метод get, который принимает индекс
                  return array[i];  //  и возращает элемент из массива array по указанному индексу.
          }

  }


}






