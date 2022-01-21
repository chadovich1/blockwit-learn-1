package com.blockwit.learn1.chadovich1;

//import java.util.Arrays;
import java.util.Scanner;

public class Tasks4t4 {
  /* s4t4
Написать программу,
которая спрашивает,сколько у Вас друзей.
 А потом спрашивает имена этих друзей.
  Затем выводит имена друзей в обратном порядке.
  */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько у вас друзей? ");
          int numOfFriends  = in.nextInt();
        String[] names = new String[numOfFriends];
        for (int i = 0; i < names.length ; i++) {
            System.out.println("  Введите их имена " );
            Scanner inn = new Scanner(System.in);
            names [i] = inn.nextLine();
        }
        System.out.println(" Список друзей в обратном порядке " );
        for (int i = names.length -1; i >=0 ; i--) {

            System.out.println( names [i]);
        }
        in.close();
    }
}