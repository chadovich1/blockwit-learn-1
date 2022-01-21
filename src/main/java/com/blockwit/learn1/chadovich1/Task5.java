package com.blockwit.learn1.chadovich1;
   /*	Задача 5
 У вас есть список имен:
 Alice, Bob, John, Eugeny, Alex, Mira, Serg, Ilon
   Вывести имя каждого второго.
 */

public class Task5 {
    public static void main(String[] args) {      //        Точка входа

        String[] neme = {"Alice", "Bob", "John", "Eugeny", "Alex", "Mira", "Serg", "Ilon"};
        for (int i = 0; i < neme.length; i++) {
            if (i % 2 == 0) {

                System.out.println(neme[i]);
            }
        }
    }
}