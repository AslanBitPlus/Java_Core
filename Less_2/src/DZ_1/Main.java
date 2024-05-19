package DZ_1;

/*
Написать метод, возвращающий количество чётных элементов массива.
countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] a = {2, 1, 2, 3, 4};
        int[] b = {2, 2, 0};
        int[] c = {1, 3, 5};
        int[] d = {1, 3, 5, 34, 8, 9, 5, 97, 23, 67, 0, 56, 27, 41};

        System.out.println(Arrays.toString(a) + " -> " + countEvent(a));
        System.out.println(Arrays.toString(b) + " -> " + countEvent(b));
        System.out.println(Arrays.toString(c) + " -> " + countEvent(c));
        System.out.println(Arrays.toString(d) + " -> " + countEvent(d));
    }

    private static int countEvent(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %2 == 0) result ++;
        }
        return result;
    }
}
