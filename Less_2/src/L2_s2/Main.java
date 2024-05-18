package L2_s2;

/*
Задание 2-2
Написать метод, принимающий на вход массив чисел и параметр n.
Метод должен осуществить циклический (последний элемент при
сдвиге становится первым) сдвиг всех элементов массива на n позиций;
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 2-2");

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        shifter(arr, 2);
        System.out.println(Arrays.toString(arr));
        shifter(arr, -2);
        System.out.println(Arrays.toString(arr));
    }

    private static void shifter(int[] a, int n) {
        n %= a.length;
        int shift = a.length + n;
        shift %= a.length;

        for (int i = 0; i < shift; i++) {
            int temp = a[a.length - 1];
            System.arraycopy(a, 0, a, 1, a.length - 1);
            a[0] = temp;
        }
    }

}
