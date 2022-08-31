import java.util.*;

public class bai_5 {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 5, 4, 3, 9};
        int[] c = {5, 2, 3, 6, 8, 5, 9};

        int length = a.length + b.length + c.length;
        int lengthAB = a.length + b.length;
        int[] arr = new int[length];

        System.arraycopy(a, 0, arr, 0, a.length);
        System.arraycopy(b, 0, arr, a.length, b.length);
        System.arraycopy(c, 0, arr,lengthAB,c.length);

        List<Integer> Ktrung = new ArrayList<>();
        Set<Integer> trung = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (count>2){
                trung.add(arr[i]);
            }
            else  if(count<=2) {
                Ktrung.add(arr[i]);
            }
        }

        System.out.println("tong"+ Arrays.toString(arr));
        System.out.println("tong"+ Arrays.toString(arr));
        System.out.println("trung"+trung);
        System.out.println("Khong trung"+Ktrung);





    }
}
