package standard;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new RandomArray().getArray(50);
        quickSort(array, 0, array.length-1);
    }
    private static void quickSort(int[] array, int start, int end){
        if (start < end){
            int divider = partition(array, start, end);
        };
    }
    private static int partition(int[] array, int start, int end){
        int comparator = array[end - (end - start)/ 2];
        while (start < end) {
            while(array[start] < comparator){
                start++;
            }
            while(array[end] > comparator){
                end--;
            }
            if (array[start] < array[end]){
                int tmp = array[start];
                array[start] = array[end];
                array[end] = tmp;
            }
        }
    }
}
