package standard;

public class SelectionSortTwoWays {
    public static void main(String[] args) {
        /*
         * This is the same algorithm like SelectionSort but goes in two directions
         * From left to right a min value is searched. From right to left a max value.
         * */
        // O( log(n)*n/2 )
        int[] array = new int[]{44, 64, 23, 53, 87, 55, 34, 24, 43, 28, 68, 90, 75, 654, 15, 3468, 96, 432, 9, 529, 27}; //21
        PrintArray.print(array);
        TimeCounter.start();
        selectionSortBidirectional(array);
        TimeCounter.finish();
        PrintArray.print(array);
    }
    public static void selectionSortBidirectional(int[] array) {
        boolean isSorted = true;
        int step = 0;
        while (isSorted){
            isSorted = replacement(array, step, (array.length - 1) - step);
            step++;
        }
    }
    private static boolean replacement(int[] array, int start, int end) {
        boolean sorted = false;
        int minValue = array[start];
        int maxValue = array[end];
        int minIndex = start;
        int maxIndex = end;
        for (int i = start; i < end; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
                sorted = true;
            }
            if (array[end - i] > maxValue) {
                maxValue = array[end - i];
                maxIndex = end - i;
                sorted = true;
            }
        }
        change(array, start, minIndex);
        change(array, end, maxIndex);
        return sorted;
    }
    private static void change(int[] array, int fromIndex, int toIndex) {
        int temp = array[fromIndex];
        array[fromIndex] = array[toIndex];
        array[toIndex] = temp;
        temp = 0;
    }
}