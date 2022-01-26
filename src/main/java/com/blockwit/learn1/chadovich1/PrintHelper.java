package com.blockwit.learn1.chadovich1;

public class PrintHelper {
    public void swapFirstAndLastIntElement (int[] num){
        int ind = num[0];      //Перестановка местами первого  и последнего элемента
        num[0] = num[num.length - 1];
        num[num.length - 1] = ind;
    }


    public void swapFirstAndLastStringElement (String[] names) {
       String tempName = names[0];
       names [0] =names [names.length - 1];
       names[names.length - 1] = tempName ;
    }




    public void printArrayOfStrings(String[] arraiOfString) {
        for (int i = 0; i < arraiOfString.length; i++) {
            System.out.println(arraiOfString[i]);
        }
    }
    public void printArrayOfIntegers (int[] arrayOfIntegers){
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            System.out.println(arrayOfIntegers[i]);
        }
    }
}