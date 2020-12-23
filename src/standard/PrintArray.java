package standard;

import java.util.Arrays;

public class PrintArray {
    public static void print(int[] array){
        String str = "[ ";
        for (int elem: array) {
            if (elem == array[array.length - 1]){
                str += elem + " ";
            }else{
                str += elem + ", ";
            }
        }
        str += "]";
        System.out.println(str);
    }
    public static void print(int[] array, int from, int to){
        String str = "[ ";
        for (int i = from; i < to; i++) {
            if (i == to - 1) {
                str += array[i] + " ";
            }else{
                str += array[i] + ", ";
            }
        }
        str += "]";
        System.out.println(str);
    }
}
