package standard;

import java.util.Date;

public class BubbleLR {
    public static void main(String[] args) {
        int[] array = new int[]{44,64,23,53,87,55,34,24,43,28,68,90,75,654,3468,96,432,529,27};
        boolean isSorted = false;
        PrintArray.print(array);
        TimeCounter.start();
        while (!isSorted){
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i-1]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    isSorted = false;
                    temp = 0;
                }
                // Reverse sort
                if (array[(array.length - 1) - (i-1)] < array[(array.length - 1) - i]) {
                    int temp = array[(array.length - 1) - (i-1)];
                    array[(array.length - 1) - (i-1)] = array[(array.length - 1) - i];
                    array[(array.length - 1) - i] = temp;
                    isSorted = false;
                    temp = 0;
                }
            }
            PrintArray.print(array);
        }
        TimeCounter.finish();
    }
}
