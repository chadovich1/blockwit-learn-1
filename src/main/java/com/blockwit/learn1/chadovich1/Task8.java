package com.blockwit.learn1.chadovich1;
/*Задача 8
	У вас есть список имен:
	Alice, Bob, John, Eugeny, Alex, Mira, Serg, Ilon, Zelda, Gora, Seve
Вывести имя каждого второго и пятого в одном цикле.
*/
public class Task8 {
    public static void main(String[] args) {
        String[] neme = {
                "Alice", "Bob", "John", "Eugeny", "Alex",
                "Mira", "Serg", "Ilon", "Zelda", "Gora", "Seve"};
        for (int i = 0; i < neme.length; i++) {
            if (i % 2 == 0) {
                System.out.println(neme[i] + "  /2");
            }
            if (i % 5 == 0) {
                System.out.println(neme[i]+ "   /5");
            }
        }
    }
}

