package com.blockwit.learn1.chadovich1;
/*Задача 9
	Вы турагенство.
У вас появились горящие путевки в рай.
И у вас есть список клиентов: Lucefer, Mamona, Asmodey, Wezewolf, Leviafan, Belfegor.
Часть этих клиентов отметили что  хотели бы получать оповещения о горящих путевках в рай.
 Отметки хранятся в виде boolean массива соответствующего порядку имен клиентов:
false, true, true, false, true, true
Необходимо вывести имена тех клиентов,
 которым нужно прислать письмо с предложением о горящей путевке в рай.
*/
public class Task9 {
    public static void main(String[] args) {
        String[] neme = {"Lucefer", "Mamona", "Asmodey", "Wezewolf", "Leviafan", "Belfegor"};
       boolean [] bools = {false, true, true, false, true, true};
        for (int i = 0; i < neme.length; i++) {
            if (bools[i] == true) {
                System.out.println(neme [i]);
            }
        }
    }
}

