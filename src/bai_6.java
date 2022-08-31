//tính tổng của mảng
//        input = [ 1, -4, 12, 0, -3, 29, -150]
//        Result -115
public class bai_6 {
    public static void main(String args[]){
        int a[]={1, -4, 12, 0, -3, 29, -150};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
