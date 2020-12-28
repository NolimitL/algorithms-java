package standard;

public class MergeSort {
    public static void main(String[] args) {
        /*
        * "Divide and conquer"
        * This algorithm goes through all array and divide it to many small parts.
        * Usually there're small array only with one element. Then each array is merged with the next array to another
        * array that is doubly bigger than previous. The elements in arrays are compared during the merge.
        * */
        // O(n*log(n))
//        int[] array = RandomArray.getArray(100_000);
        int[] array = new int[]{12,5,29,94,20,84,22,15,7,51};
        System.out.println("Initial array:");
        PrintArray.print(array);
        TimeCounter.start();
        sort(array, 0, array.length - 1);
        TimeCounter.finish();
        PrintArray.print(array);
    }

    public static void sort(int[] array, int start, int finish) {
        if (finish > start) {
            int middlePoint = (finish + start) / 2;
            sort(array, start, middlePoint);
            sort(array, middlePoint + 1, finish);
            merge(array, start, middlePoint, finish);
        }
    }
    private static void merge(int[] array, int start, int middle, int finish) {
        int[] leftArr = new int[middle - start + 1];
        int[] rightArr = new int[finish - middle];
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = array[start + i];
        }
        for (int i = 0; i < rightArr.length; i++) {
            rightArr[i] = array[middle + 1 + i];
        }
        for (int i = start; i < finish + 1; i++) {
            if (leftIndex < leftArr.length && rightIndex < rightArr.length) {
                if (leftArr[leftIndex] < rightArr[rightIndex]){
                    array[i] = leftArr[leftIndex];
                    leftIndex++;
                }else {
                    array[i] = rightArr[rightIndex];
                    rightIndex++;
                }
            }else if(leftIndex < leftArr.length){
                array[i] = leftArr[leftIndex];
                leftIndex++;
            }else if(rightIndex < rightArr.length){
                array[i] = rightArr[rightIndex];
                rightIndex++;
            }
        }
    }
}