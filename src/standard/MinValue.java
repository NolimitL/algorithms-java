package standard;

public class MinValue {
    public static void main(String[] args) {
        /*
        * Standard sort algorithm to search a min value from array
        * it goes through each element of the array and compares each element with already found min element
        * */
        int[] array = new int[]{44,64,23,53,87,9,34,523,12,42,21,97,45,34,11,432};
        int minValue = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue){
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("Min value: " + minValue);
        System.out.println("Min index: " + minIndex);
    }
}
