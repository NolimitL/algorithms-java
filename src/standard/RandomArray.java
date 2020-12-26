package standard;

public class RandomArray {
    public static int[] getArray(int count){
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = (int)(Math.random() * 1000);
        }
        return arr;
    }
    public static int[] getGrowingArray(int count){
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = i;
        }
        return arr;
    }
    public static int[] getDecreasingArray(int count){
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
