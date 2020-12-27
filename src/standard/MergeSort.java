package standard;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = RandomArray.getArray(100_000);
//        PrintArray.print(array);
//        int[] array = new int[]{14, 12, 6, 8, 22, 10, 3};
        TimeCounter.start();
        sort(array, 0, array.length - 1);
        TimeCounter.finish();
//        PrintArray.print(array);
    }

    public static void sort(int[] array, int start, int finish) {
        if (finish > start) {
            int middlePoint = (finish + start) / 2;
            sort(array, start, middlePoint);
            sort(array, middlePoint + 1, finish);
            merge(array, start, middlePoint, finish);
        }
    }

    private static void merge(int[] array, int start, int middle, int finish) {
        int[] leftArr = new int[middle - start + 1];
        int[] rightArr = new int[finish - middle];
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = array[start + i];
        }
        for (int i = 0; i < rightArr.length; i++) {
            rightArr[i] = array[middle + 1 + i];
        }
        for (int i = start; i < finish + 1; i++) {
            if (leftIndex < leftArr.length && rightIndex < rightArr.length) {
                if (leftArr[leftIndex] < rightArr[rightIndex]){
                    array[i] = leftArr[leftIndex];
                    leftIndex++;
                }else {
                    array[i] = rightArr[rightIndex];
                    rightIndex++;
                }
            }else if(leftIndex < leftArr.length){
                array[i] = leftArr[leftIndex];
                leftIndex++;
            }else if(rightIndex < rightArr.length){
                array[i] = rightArr[rightIndex];
                rightIndex++;
            }
        }
    }
}