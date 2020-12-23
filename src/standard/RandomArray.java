package standard;

public class RandomArray {
    public int[] getArray(int count){
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = (int)(Math.random() * 1000);
        }
        return arr;
    }
}
