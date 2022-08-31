import java.util.Arrays;

public class bài_4 {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {6, 5, 4, 3, 9};

///////////// tinh so phan tu trung va khong trung //////////////////////////////////
        int D =0;
        int E=0;
        for (int j = 0; j < a.length; j++) {
            int count = 1;
            for (int k = 0; k < b.length; k++) {
                if (a[j] != 0 && a[j] == b[k]) {
                    count++;
                    D++;
                }
            }
            if (count == 1) {
                E++;
            }
        }
        int l = D +1;
        int u = E ;
        int t =0;
        int y =0;
        for (int j = 0; j < b.length; j++) {
            int count = 1;
            for (int k = 0; k < a.length; k++) {
                if (b[j] != 0 && b[j] == a[k]) {
                    count++;
                    l++;
                    t++;
                }
            }
            if (count == 1) {
                u++;
                y++;
            }

        }


/////////them phan tu trung va khong trung vao mang////////////////////
        int [] trung = new int [t];
        int [] Ktrung = new int [u];
        int z = 0;
        int x = 0;
        for (int j = 0; j < a.length; j++) {
            int count = 1;
            for (int k = 0; k < b.length; k++) {
                if ( a[j] == b[k]) {
                    count++;
                    trung[z] = a[j];
                    z++;
                }
            }
            if (count == 1) {
                Ktrung[x] = a[j];
                x++;
            }
        }
        int n = x;
        for (int j = 0; j < b.length; j++) {
            int count = 1;
            for (int k = 0; k < a.length; k++) {
                if (b[j] != 0 && b[j] == a[k]) {
                    count++;
                }
            }
            if (count == 1) {
                Ktrung[n] = b[j];
                n++;
            }
        }
        System.out.println("Trùng " + Arrays.toString(trung));
        System.out.println("Khong Trùng " + Arrays.toString(Ktrung));
    }
}
