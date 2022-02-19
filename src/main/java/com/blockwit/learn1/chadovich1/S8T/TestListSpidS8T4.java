package com.blockwit.learn1.chadovich1.S8T;
//S8T4
// при изменении метода add в классе MyIntArrayList, то есть добавление по 100(new int[num.length + 100]) вместо [num.length + 1]
//время заполнения составило 2087 миллисек, процессор Ryzen 3700x

public class TestListSpidS8T4 {

    public static void main(String[] args){
        MyIntArrayList obiect = new MyIntArrayList();
        ListsEvaluation myListEval = new ListsEvaluation();
        myListEval.evalMyList(obiect);
    }


}
