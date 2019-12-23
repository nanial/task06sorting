package task06sorting.binarySearch.Controller;

//Выполнить сортировку элементов массива с помощью
// «сортировки вставками»

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int [] arr = new int[]{1,15,62,128,94};
        binarySearch.insertSort(arr, 19);
        System.out.println(Arrays.toString(arr));
    }
}
