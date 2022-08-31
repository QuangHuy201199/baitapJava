import java.util.Arrays;

public class bai_2 {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        int l = arr.length;
        int[] result = new int[l];
        for (int i = 0; i <arr.length; i++) {
               result[i] = arr[i] * arr[i];
        }
        System.out.println("ket qua" + Arrays.toString(result));
    }
}
