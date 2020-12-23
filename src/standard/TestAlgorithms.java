package standard;

public class TestAlgorithms {
    public static void main(String[] args) {
//        System.out.println("Initial array:");
//        PrintArray.print(array);

        int[] array = new RandomArray().getArray(100000);
        System.out.println("Bubble: ");
        TimeCounter.start();
        BubbleSort.bubbleSort(array);
        TimeCounter.finish();

        array = new RandomArray().getArray(100000);
        System.out.println("Bubble bidirectional:");
        TimeCounter.start();
        BubbleSortReverse.bubbleSortReverse(array);
        TimeCounter.finish();

        array = new RandomArray().getArray(100000);
        System.out.println("Selection algorithm:");
        TimeCounter.start();
        SelectionSort.selectionSort(array);
        TimeCounter.finish();

        array = new RandomArray().getArray(100000);
        System.out.println("Selection algorithm bidirectional:");
        TimeCounter.start();
        SelectionSortTwoWays.selectionSortBidirectional(array);
        TimeCounter.finish();

        array = new RandomArray().getArray(100000);
        System.out.println("Quick algorithm:");
        TimeCounter.start();
        QuickSort.quickSort(array, 0, array.length-1);
        TimeCounter.finish();

    }
}
