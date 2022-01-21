package com.blockwit.learn1.chadovich1;

    import java.util.Scanner;
/*Задача 2*
 Рассчитать и вывести среднюю зп в день за каждый месяц.
 Считаем что в месяце 30 дней. Исходные данные - из первой задачи.

 */
public class Task2 {
    public static void main (String [] args) {
        double[] AverageSalary1 = {100, 109, 108, 114, 101, 100, 120, 200, 103, 112, 107, 150};
        double AverSal = 0;
        for (int i = 0; i < AverageSalary1.length ; i++ ) {
            AverSal = AverageSalary1[i]/30;
            System.out.println(
                    "Средняя заработная плата вдень за каждый месяц   = " + AverSal );
        }
    }
}


