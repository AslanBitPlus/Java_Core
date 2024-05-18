package L2_s5;

/*
Задача: Создать квадратный целочисленный массив (количество строк и
столбцов одинаковое), заполнить его диагональные элементы единицами,
используя цикл(ы)
*/

import java.util.Arrays;

/*
Задача: Создать квадратный целочисленный массив (количество строк и
столбцов одинаковое), заполнить его диагональные элементы единицами,
используя цикл(ы)

*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[][] arr = new int[6][6];
        printArray(arr);
        m1(arr, 1);
        System.out.println("Записываем в диагонали массива единицы");
        printArray(arr);
    }

    // Заполнение диагоналей единицами
    private static int[][] m1(int[][] a, int n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0, x = a[i].length; j < a[i].length; j++, x--) {
                if (i == j || i == x - 1) a[i][j] = n;
            }
        }
        return a;
    }

    // Печать массива
    private static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0, x = a[i].length; j < a[i].length; j++, x--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }

    }


}
