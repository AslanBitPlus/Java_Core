package DZ_3;

/*
Написать функцию, возвращающую истину, если в переданном массиве
есть два соседних элемента, с нулевым значением.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] a = {9, 3, 5, 34, 8, 9, 5, 0, 0, 67, 12, 56, 27, 41};
        System.out.println(Arrays.toString(a) + " -> " + twoZeroCount(a));
        int[] b = {9, 3, 5, 34, 8, 9, 5, 0, 97, 67, 12, 56, 27, 41};
        System.out.println(Arrays.toString(b) + " -> " + twoZeroCount(b));
        int[] c = {9, 3, 5, 34, 8, 9, 5, 0, 97, 0, 12, 56, 27, 41};
        System.out.println(Arrays.toString(c) + " -> " + twoZeroCount(c));
    }

    private static boolean twoZeroCount(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) return true;

        }
        return false;
    }
}
