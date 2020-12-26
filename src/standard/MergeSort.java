package standard;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = RandomArray.getArray(1_000_000);
//        PrintArray.print(array);
//        int[] array = new int[]{14, 12, 6, 8, 22, 10};
        TimeCounter.start();
        mergeSort(array);
        TimeCounter.finish();
//        PrintArray.print(array);
    }

    public static void mergeSort(int[] array) {
        int size = 1;
        while (size < array.length){
            for (int step = 0; step < array.length; step += size * 2) {
                sort(array, step, step+size, size);
            }
            size *= 2;
        }
    }
    private static void sort(int[] array, int elemL, int elemR, int size){
        int firstP = elemL;
        int secondP = elemR;
        int[] temp = new int[size * 2];
        for (int step = 0; step < temp.length; step++) {
            if (elemR < array.length){
                if (elemL >= firstP + size && elemR < secondP + size){
                    temp[step] = array[elemR];
                    elemR++;
                } else if (elemR >= secondP + size && elemL < firstP + size) {
                    temp[step] = array[elemL];
                    elemL++;
                } else {
                    if (array[elemL] < array[elemR]){
                        temp[step] = array[elemL];
                        elemL++;
                    }else {
                        temp[step] = array[elemR];
                        elemR++;
                    }
                }
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (firstP >= array.length){
                break;
            }
            array[firstP] = temp[i];
            firstP++;
        }
    }
}
