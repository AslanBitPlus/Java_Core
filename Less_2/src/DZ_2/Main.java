package DZ_2;

/*
Написать функцию, возвращающую разницу между самым большим
и самым маленьким элементами переданного не пустого массива.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] a = {9, 3, 5, 34, 8, 9, 5, 97, 23, 67, 12, 56, 27, 41};
        System.out.println(Arrays.toString(a) + " -> " + difMaxMin(a));
    }

    private static int difMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        return max - min;
    }
}
