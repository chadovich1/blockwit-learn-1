package com.blockwit.learn1.chadovich1.S8T;

import com.blockwit.learn1.chadovich1.Helper;

import java.util.Random;

public class MyIntArrayListTest {

    public static void main(String[] args) {
        Random rand = new Random();
        MyIntArrayList testList = new MyIntArrayList();
        Helper testHelper = new Helper();
        for (int i = 0; i < 9; i++) {
            testList.add(i);                                //формирую первоначальный список из 9 элементов(значения от 0 до 8)
        }
        testHelper.printInList(testList.elements);
        System.out.println();

        for (int k = 1; k < 10; k++) {
            int randomValue = rand.nextInt(40);  //добавляю 20 штук случайных чисел от 1 до 20, но  максимальное значение не больше 40
           System.out.println(randomValue);
            testList.add(randomValue);      // добавил рандомные числа в уже имеющийся список(из 9 элементов)
        }
        testHelper.printInList(testList.elements);            //распечатка полного списка, включая новые рандомные числа и старые
        System.out.println("*** 12 по счету число: "+ testList.get(11));    //получить по индексу число, тест get
        System.out.println("Количество заполненных ячеек -  " + testList.size());    //размер списка, то есть сколько ячеек реально заполнено, тест size

    }

}
