package com.blockwit.learn1.chadovich1;

import java.util.Scanner;

public class Tasks4t2 {
  /* s4t2
 Написать программу, которая спрашивает у пользователя 5 имен.
 А затем выводит все эти имена.
  */

    public static void main (String[]  args )   {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое из  пяти имен ");
        String name1 = in.nextLine();
        String name2 = in.nextLine();
        String name3 = in.nextLine();
        String name4 = in.nextLine();
        System.out.println("Введите пятое имя ");
        String name5 = in.nextLine();

        System.out.println( "Выводим список имен - "+ name1 + " " + name2 + " " + name3 + " " + name4 + " " + name5 );

        in.close();

    }
    public static void uourAge ( ) {


    }


}
