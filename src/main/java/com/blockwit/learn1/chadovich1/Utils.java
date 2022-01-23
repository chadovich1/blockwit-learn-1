package com.blockwit.learn1.chadovich1;

public class Utils {
    public void sort (int[] intsort) {
        for (int i = 0; i < intsort.length; i++) {
            for (int j = i + 1; j < intsort.length; j++) {
                if (intsort[i] > intsort[j]) {                    // Отсортировать его в порядке возрастания.
                    int temp = intsort[i];
                    intsort[i] = intsort[j];
                    intsort[j] = temp;
                }
            }

        }
    }
}


