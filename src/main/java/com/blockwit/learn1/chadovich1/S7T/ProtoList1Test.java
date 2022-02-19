package com.blockwit.learn1.chadovich1.S7T;
/* TaskS7T4
  1. Написать класс ProtoList1 в котором будет поле array типа массив целых чисел.
  2. Написать метод create который принимает размер
и создает и присваивает полю array пустой массив целых чисел указанного размера.
  3. Написать метод getSize который возращает длину массива в поле array.
  4. Написать метод get, который принимает индекс
public class ProtoList1test {  // 1. Написать класс ProtoList1


  */


public class ProtoList1Test {
    public static void main(String[] args) {

        ProtoList1 test = new ProtoList1();  // создается экземпляр класса ProtoList1 для работы с его методами


        test.create(3);       //вызываю метод create: создается массив интовый с длиной три, но незаполненый, значения равны нулю
        int[] arr = {56, 33, 8};

        System.out.print("возращает длину массива ");
        System.out.println(test.getSize(arr));     //вывести метод getSize, возращает длину массива в поле array
        System.out.print("выводит элемент массива под указанным индексом  ");
        System.out.print(test.get(arr, 0));    // вывести метод get, значение(56) под указанным индексом (0)

    }
}