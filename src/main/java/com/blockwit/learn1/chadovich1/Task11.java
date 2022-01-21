package com.blockwit.learn1.chadovich1;
/*Задача 11
	Необходимо вывести на экран числа от -100 до -20.
	 В порядке убывания (от большего к меньшему).
	  Массивом пользоваться нельзя.
*/

public class Task11 {
    public static void main(String[] args) {

        for (int i =-20; i >-100; i=i-10)  {   //i=i-10 сознательно сокрашено для облегчения проверки
            System.out.println("Строка №" + i);
        }
    }
}


