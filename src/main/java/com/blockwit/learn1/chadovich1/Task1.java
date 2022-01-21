package com.blockwit.learn1.chadovich1;

public class Task1 {
    public static void main (String [] args) {      //        Точка входа

       /* Задача 1
        Задан массив заработных плат сотрудника за последние 12 месяцев:
        100,109,108,114,101,100,120,200,103,112,107,150
        Сотрудник уходит в отпуск на месяц. Необходимо рассчитать отпускные.
                Отпускные - за месяц - это средняя заработная плата за последние 12 месяцев.
                При решении использовать цикл.  Задачу сдать до конца завтрашнего дня.*/

        double[] AverageSalary1 = {100, 109, 108, 114, 101, 100, 120, 200, 103, 112, 107, 150};
        System.out.println("Задача 1. Средняя заработная плата за последние 12 месяцев. ");
            double sam = 0;
            for (int i = 0; i < AverageSalary1.length ; i++ ) {
            sam = sam + AverageSalary1[i];
        }
        System.out.println("Ответ :  Средняя заработная плата за последние 12 месяцев. = " +  sam/12 );
    }

    /* Задача 3
        У вас есть список имен: Alice, Bob, John.
        Вывести его в прямом порядке.
        */
    public static class Task3 {
        public static void main(String[] args) {
            String[] neme = {"Alice", "Bob", "John"};

           for (int i = 0; i < neme.length; i++) {

                    System.out.println(neme [i]);
           }
        }
    }
}
