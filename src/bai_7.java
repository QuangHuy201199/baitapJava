
//7>
//        Tính trung bình và giá trị trung bình của mảng
//        input :  arr= [12, 46, 32, 64];
//        Result :   { mean: 38.5, median: 32 }


public class bai_7 {
    public static void main(String args[]) {
        int a[] = {12, 46, 32, 64};
        float sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        float mean = sum / a.length;
//        System.out.println("{" + "mean :" + mean + ", " + " median "+ sum+" }");

        int middle = a.length/2;
        System.out.println(middle);

        // dev_huy
}
}
