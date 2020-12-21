package standard;

public class BubbleSort {
    public static void main(String[] args) {
        /*
        * Bubble algorithm. It goes through the array and compares both nearby elements with each other.
        * If left element is bigger than right element so rearrange them.
        * */
        int[] array = new int[]{44,64,23,53,87,55,34,24,43,28,68,90,75,654,3468,96,432,529,27};
        boolean isSorted = false;
        int iter = 0;
        TimeCounter.start();
        PrintArray.print(array);
        while (!isSorted){
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i-1] > array[i]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    temp = 0;
                    isSorted = false;
                }
            }
            PrintArray.print(array);
            iter++;
        }
        TimeCounter.finish();
        System.out.println("Min value: " + array[0]);
        System.out.println("Min index: 0");
        System.out.println("Iteration: " + iter);
    }
}
