package com.blockwit.learn1.chadovich1;

import java.util.Scanner;

public class Tasks4t2 {
  /* s4t2
 Написать программу, которая спрашивает у пользователя 5 имен.
 А затем выводит все эти имена.
  */

    public static void main (String[]  args ) {
        Scanner in = new Scanner(System.in);
        String[] name = new String[3];
        for (int i = 0; i < name.length; i++) {
            System.out.println("Введитe " + (i + 1) + " имя");
            name[i] = in.nextLine();
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println(name [i]);
        }

        in.close();
    }


}
