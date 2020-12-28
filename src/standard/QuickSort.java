package standard;

public class QuickSort {
    public static void main(String[] args) {
        /*
        * One element is taken and defined as a comparator. Then each array element is compared with a comparator and
        * if it's bigger then we looking for element on left side that smaller then comparator and change them.
        * */
        // O(n*log(n)) ~ O(n*n)
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

