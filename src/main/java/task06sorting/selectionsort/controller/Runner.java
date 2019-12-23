package task06sorting.selectionsort.controller;

import java.util.Arrays;
import java.util.Random;

//sorting array
public class Runner {
    public static void main(String[] args) {

        int iMin;
        int temp;
        int n = new Random().nextInt(12);
        int [] arrToSort = new int[n];

        for (int i = 0; i < arrToSort.length; i++) {
            arrToSort[i] = new Random().nextInt(18);
        }
        System.out.println(Arrays.toString(arrToSort));

        for (int i = 0; i < arrToSort.length - 1; i++) {
            iMin = i;
            for (int j = i + 1; j < arrToSort.length; j++) {

                if (arrToSort[j] < arrToSort[iMin]) {
                    iMin = j;
                }
            }
                temp = arrToSort[i];
                arrToSort[i] = arrToSort[iMin];
                arrToSort[iMin] = temp;
        }
        System.out.println(Arrays.toString(arrToSort));
    }
}
