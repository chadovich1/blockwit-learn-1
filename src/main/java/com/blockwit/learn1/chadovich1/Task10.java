package com.blockwit.learn1.chadovich1;
/*Задача 10
	Необходимо вывести на экран числа от -100 до -20.
	 Массивом пользоваться нельзя.
*/
public class Task10 {
    public static void main(String[] args) {

       for (int i = -100; i <= 20; i=i+10) {     //i=i+10 сознательно сокрашено для облегчения проверки
           System.out.println("Строка №" + i);
       }
    }
}


