package standard;

public class QuickSort {
    public static void main(String[] args) {
        /*
        *
        * */
        // O(log(n))
        int[] array = new RandomArray().getArray(100);
        System.out.println("Initial array:");
        PrintArray.print(array);
        TimeCounter.start();
        quickSort(array, 0, array.length-1);
        TimeCounter.finish();
        PrintArray.print(array);
    }

    public static int[] quickSort(int[] array, int from, int to){
        if (from < to){
            int dividerIndex = division(array, from, to);
            quickSort(array, from, dividerIndex-1);
            quickSort(array, dividerIndex, to);
        }
        return array;
    }
    private static int division(int[] array, int start, int end){
        int leftStep = start;
        int rightStep = end;
        int comparator = array[start + (end - start)/2];
//        int comparator = array[start];
        while (leftStep <= rightStep){

            while (array[leftStep] < comparator) {
                leftStep++;
            }
            while (array[rightStep] > comparator){
                rightStep--;
            }
            if (leftStep <= rightStep){
                if(array[leftStep] > array[rightStep]){
                    int tmp = array[rightStep];
                    array[rightStep] = array[leftStep];
                    array[leftStep] = tmp;
                }
                leftStep++;
                rightStep--;
            }

        }
        return leftStep;
    }
}


class QSort{
//    public static void main(String[] args) {
//        int[] array = new RandomArray().getArray(20);
////        int[] array = new int[]{16,8,4,2};
//        PrintArray.print(array);
//        qAL(array, 0 , array.length - 1);
//        PrintArray.print(array);
//    }
//
//    private static void qAL(int[] array, int initial, int ending){
//        if (initial < ending){
//            int indexDivider = partition(array, initial, ending);
//            qAL(array, initial, indexDivider - 1);
//            PrintArray.print(array);
//            qAL(array, indexDivider, ending);
//        }
//    }
//    private static int partition(int[] array, int leftIndex, int rightIndex){
//        int comparator = array[leftIndex];
//        while (leftIndex <= rightIndex) {
//            while (array[leftIndex] < comparator) {
//                leftIndex++;
//            }
//            while (array[rightIndex] > comparator){
//                rightIndex--;
//            }
//            if (leftIndex <= rightIndex){
//                if (array[leftIndex] > array[rightIndex]){
//                    int tmp = array[leftIndex];
//                    array[leftIndex] = array[rightIndex];
//                    array[rightIndex] = tmp;
//                }
//                leftIndex++;
//                rightIndex--;
//            }
//        }
//        return leftIndex;
//    }

}