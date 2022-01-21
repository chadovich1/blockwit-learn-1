package com.blockwit.learn1.chadovich1;
/*Задача 7
	У вас есть список имен:
	 Alice, Bob, John, Eugeny, Alex, Mira, Serg, Ilon, Zelda
Вывести имя каждого второго.


 */
public class Task7 {
    public static void main (String [] args) {
        String[] neme = {"Alice", "Bob", "John", "Eugeny", "Alex", "Mira", "Serg", "Ilon","Zelda" };
        for (int i = 0; i < neme.length; i++) {
            if (i % 2 == 0) {
                System.out.println(neme[i]);

            }
        }
    }
}