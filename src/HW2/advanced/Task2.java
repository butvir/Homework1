package HW2.advanced;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 1, 1};

        for (int i = 0; i < array.length; i++) {
            if (i%2 == 0) {
                array[i] = 0;
            }

        }

        System.out.println(Arrays.toString(array));
    }
}
