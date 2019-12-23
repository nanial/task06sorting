package task06sorting.binarySearch.Controller;

public class BinarySearch {

    public int binarySearch(int [] arr, int value){

        int begin = 0;
        int end = arr.length - 1;

        while (begin < end){

            int middle = begin + (end - begin) / 2;//each time find middle

            if(arr[middle] < value){
                begin = middle + 1;//
            }
            else if (arr[middle] > value){
                end = middle - 1;
            }
            else{
                return  middle;
            }
        }
        return -1;
    }
    public void insertSort(int[] arr, int insertElement){

        int temInsert = insertElement;
        int [] arrWithInsert = new int[arr.length + 1];//increase new array

        while (this.binarySearch(arr, insertElement) == -1){
            insertElement--;
        }

        int temp = binarySearch(arr, insertElement);
        for (int i = 0; i < arrWithInsert.length; i++) {

            if (i <= temp){
                arrWithInsert[i] = arr[i];
            }
            else if (i > temp){

                arrWithInsert[i] = arr[i - 1];
            }
            else {
                arrWithInsert[temp + 1] = temInsert;
            }
        }
    }
}
