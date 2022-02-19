package com.blockwit.learn1.chadovich1.S8T;
//Найти как получить время в формате миллисекунд (unix timestamp). Написать класс ListsEvaluation , который содержит метод evalMyList.
// Который принимает на вход пустой список из задачи 1.
// Затем наполняет список миллионом произвольных элементов и замеряет время за которое он это сделать.
// Затем выводит это время.
import java.util.Random;
public class ListsEvaluation {


    public void evalMyList(MyIntArrayList MyIntArrayList) {
            long startTime = System.currentTimeMillis();
            Random rand = new Random();
            for(int i=0; i<1000000; i++) {
                MyIntArrayList.add(rand.nextInt());
            }
            long endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
        }



}