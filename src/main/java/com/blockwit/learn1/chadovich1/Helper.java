package com.blockwit.learn1.chadovich1;

import java.util.Scanner;

public class Helper {
    public void printIntArray(int[] intArray ) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }


    public void printInList(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }

    }
}



//  объявление хелпера в коде. == * Объект или экземпляр класса*
//Helper helper = new Helper();

// helper.printIntArray( имя нужного масива);