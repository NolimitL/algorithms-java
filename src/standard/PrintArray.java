package standard;

public class PrintArray {
    static void print(int[] array){
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
}
