import java.util.Arrays;

public class bai_3 {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 5, 4, 3, 9};
        int length = a.length + b.length;
        int[] arr = new int[length];
        for (int j = 0; j < a.length; j++) {
            arr[j]= a[j];
        }

        int brr = a.length;
        int k = 0;
        for (int g = brr; g < arr.length; g++) {
                arr[g]= b[k];
                k++;
        }
////        int i = 0;
//        for (int ARR : a) {
//            arr[i] = ARR;
//            i++;
//        }
//        for (int ARR : b) {
//            arr[i] = ARR;
//            i++;
//        }
        int L = 0;
        int C = 0;
        for (int f = 0; f < arr.length; f++) {
            if (arr[f] % 2 == 0) {
                C ++;
            } else {
                L++;
            }
        }
        int[] chan2 = new int[C];
        int[] le2 = new int[L];
        int c = 0;
        int l = 0;
        for (int f = 0; f < arr.length; f++) {
            if (arr[f] % 2 == 0) {
                chan2[l] = arr[f];
                l++;
            } else {
                le2[c] = arr[f];
                c++;
            }
        }
        System.out.println("Tổng 2 mảng" + Arrays.toString(arr));
        System.out.println("Số Chẵn" + Arrays.toString(chan2));
        System.out.println("Số Lẻ" + Arrays.toString(le2));

    }
}
