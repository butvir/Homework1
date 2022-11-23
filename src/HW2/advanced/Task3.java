package HW2.advanced;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 5, 7, 10};
        int[] a2 = {2, 3, 2, 17, 15};

        int[] a3 = new int[a1.length*3];

        for (int i = 0; i < a3.length; i++) {
            if (i < 5){
                a3[i] = a1[i];
            } else if (i > 4 && i < 10) {
                a3[i] = a2[i- a1.length];
            }else {
                int j = (a1.length + a2.length);
                a3[i] = a1[i - j] * a2[i - j];
            }

        }
        System.out.println(Arrays.toString(a3));
    }
}
