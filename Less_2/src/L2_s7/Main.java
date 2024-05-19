package L2_s7;

/*
Задача: Написать функцию добавления элемента в конец массива таким
образом, чтобы она расширяла массив при необходимости.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 2-7");

        int[] array = {1, 2};
        int size = 2;

        System.out.println(size + " = " + Arrays.toString(array));
        array = add(array, size++, 6);
        System.out.println(size + " = " + Arrays.toString(array));
        array = add(array, size++, 6);
        System.out.println(size + " = " + Arrays.toString(array));
        array = add(array, size++, 6);
        System.out.println(size + " = " + Arrays.toString(array));
        array = add(array, size++, 6);
        System.out.println(size + " = " + Arrays.toString(array));


    }

    public static int[] add(int[] arr, int current, int value) {
        if (current == arr.length) {
            int[] temp = new int[arr.length * 2];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }
        arr[current++] = value;
        return arr;
    }


}
