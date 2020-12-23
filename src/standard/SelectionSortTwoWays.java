package standard;

public class SelectionSortTwoWays {
    public static void main(String[] args) {
        /*
        * This is the same algorithm like SelectionSort but goes in two directions
        * From left to right a min value is searched. From right to left a max value.
        * */
        // O( log(n)*n/2 )
        int[] array = new int[]{44,64,23,53,87,55,34,24,43,28,68,90,75,654,15,3468,96,432,9,529,27}; //21
        PrintArray.print(array);
        TimeCounter.start();
        for (int step = 0; step < array.length / 2; step++) {
            int minIndex = minValue(array, step, (array.length - 1) - step);
            int maxIndex = maxValue(array, step, (array.length - 1) - step);
            int tmp = array[step];
            array[step] = array[minIndex];
            array[minIndex] = tmp;
            tmp = array[array.length-1-step];
            array[array.length-1-step] = array[maxIndex];
            array[maxIndex] = tmp;
            tmp = 0;
            PrintArray.print(array);
        }
        TimeCounter.finish();
    }
    private static int maxValue(int[] array, int start, int end){
        int maxValue = array[end];
        int maxIndex = end;
        for (int i = end; i > start; i--) {
            if (array[i] > maxValue){
                maxValue = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    private static int minValue(int[] array, int start, int end){
        int minValue = array[start];
        int minIndex = start;
        for (int i = start; i < end; i++) {
            if (array[i] < minValue){
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
