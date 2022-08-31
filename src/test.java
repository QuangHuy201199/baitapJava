import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {6, 5, 4, 3, 9};

        int aLen = a.length;
        int bLen = b.length;
        int[] arr = new int[aLen + bLen];

        System.arraycopy(a, 0, arr, 0, aLen);
        System.arraycopy(b, 0, arr, aLen, bLen);

        int count = 0;
        Set<Integer> ha = new HashSet<>();
        Set<Integer> lang = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (j < i) {
                        break;
                    }
                    count++;
                }
            }
            if(count == 1){
                ha.add(arr[i]);
                count = 0;
            }
            if(count >= 1){
                lang.add(arr[i]);
                count = 0;
            }
        }
        System.out.println("Distinct element: " + " "+ ha + "  " );
        System.out.println("Duplicate element: " + " "+ lang + "  ");
    }
}