package com.blockwit.learn1.chadovich1;
/*Задача 4
    У вас есть список имен: Alice, Bob, John.
Вывести его в обратном порядке.

*/
public class Task4 {
    public static void main(String[] args) {
            String[] neme = {"Alice", "Bob", "John"};

            for (int i = neme.length-1; i >=0; i--) {

                System.out.println(neme [i]);
            }
        }
    }


