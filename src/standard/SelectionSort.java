package standard;

public class SelectionSort {
    public static void main(String[] args) {
        /*
        * It's goes through array and after find a min/max element array decreases by 1 element.
        * Then a new array goes through this iteration.
        * */
        // O( n*log(n) )
        int[] array = new int[]{44,64,23,53,87,55,34,24,43,28,68,90,75,654,15,3468,96,432,9,529,27};
        PrintArray.print(array);
        TimeCounter.start();
        for (int step = 0; step < array.length; step++) {
            int indexMin = minValue(array, step);
            int temp = array[step];
            array[step] = array[indexMin];
            array[indexMin] = temp;
            temp = 0;
            PrintArray.print(array);
        }
        TimeCounter.finish();
    }
    private static int minValue(int[] array, int start){
        int minValue = array[start];
        int minIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < minValue){
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
