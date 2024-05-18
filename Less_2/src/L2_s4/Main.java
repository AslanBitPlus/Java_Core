package L2_s4;

import java.util.Arrays;

/*
Задача:
Задать одномерный массив.
Написать методы поиска в нём минимального
и максимального элемента;

Задача:
Привести функции к корректному виду и дополнительно написать
ещё две функции так, чтобы получились (четыре) функции поиска
 минимального и максимального как значения, так и индекса.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание L2_s4");

        int[] arr = {1, 2, -1, 7, 1};
        System.out.println(Arrays.toString(arr));
        int min = findMinOfArray(arr);
        System.out.println("min: " + min);
        System.out.println("minIndex: " + findMinIndex(arr, min));
        int max = findMaxOfArray(arr);
        System.out.println("max: " + max);
        System.out.println("minIndex: " + findMaxIndex(arr, max));
    }

    private static int findMinOfArray(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }

        }
        return min;
    }

    private static int findMaxOfArray(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        return max;
    }

    // Поиск индекса минимального элемента
    private static int findMinIndex(int[] a, int min) {
        int minIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (min == a[i]) {
                minIndex = i;
            }

        }
        return minIndex;
    }

    // Поиск индекса максимального элемента
    private static int findMaxIndex(int[] a, int max) {
        int maxIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (max == a[i]) {
                maxIndex = i;
            }

        }
        return maxIndex;
    }

}
