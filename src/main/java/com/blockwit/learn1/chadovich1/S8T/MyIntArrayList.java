package com.blockwit.learn1.chadovich1.S8T;
/*TaskS8T1
1. Написать класс MyIntArrayList. Этот
класс будет представлять собой список. Этот класс
должен иметь методы:
add - добавляет элемент в конец списка. Возвращает
индекс, по которому элемент добавлен.
get - получает индекс и возвращает соответствующий
индексу элемент.
size - возращает длину списка.
clear - очищает список

Важно: мы проходили список и знаем что он отличается
от обычного массива тем, что у него нет фиксированой
заранее длины. Длина списка равна кол-ву элементов в
нем.
Именно так должен работать Ваш список.

Вы уже писали ProtoList1 на базе массива. Но там у
нас при очередном добавлении массив мог переполнится.
Ваша задача сделать так чтобы в новом списке такой
проблемы не было. На последнем семинаре я давал намек
как это сделать и вроде даже немного в коде показал.
Но по возможности додумайтесь сами.

 */
import java.util.Scanner;

public class MyIntArrayList {
    public int[] elements;   //Этот   класс будет представлять собой массив список.
    int count;

    public MyIntArrayList() {       //MyIntArrayList-конструктор объекта класса MyIntArrayList с начальными параметрами.
        elements = new int[0];
        count = 0;                   //count-'счетчик' проверяет сколько действительно занятых значений, по индексу
    }


    public int add(int newValue) {            //add - добавляет элемент в конец списка.
        if (count == elements.length) {
            int[] newElements = new int[elements.length + 1];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            newElements[newElements.length -1] = newValue;
            elements = newElements;
        } else {
           elements[count] = newValue;
        }
           count ++;
           return count-1 ;    // Возвращает индекс, по которому элемент добавлен.
    }

    public int get(int i) {     //get - получает индекс и возвращает соответствующий индексу элемент.
        return elements[i];
    }
    public int size(){           // size - возращает длину списка.
        return count;
    }
    public void clear() {          //   clear - очищает список
        count = 0;
    }
}
