package com.blockwit.learn1.chadovich1;
/*Задача 6
	У вас есть список имен:
Alice, Bob, John, Eugeny, Alex, Mira, Serg, Ilon, Zelda
 Вывести имя каждого третьего.


 */
public class Task6 {
    public static void main (String [] args) {      //        Точка входа
        String[] neme = {"Alice", "Bob", "John", "Eugeny", "Alex", "Mira", "Serg", "Ilon"};
        for (int i = 0; i < neme.length; i++) {
            if (i % 3 == 0) {

                System.out.println(neme[i]);

            }
        }
    }
}