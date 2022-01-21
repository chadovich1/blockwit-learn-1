package com.blockwit.learn1.chadovich1;
/*Задача 12
 Необходимо вывести десять раз числа от 50 до 100.
*/
public class Task12a {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 50; j <= 100; j = j + 10) {
                System.out.println(j);
            }
        }
    }
}