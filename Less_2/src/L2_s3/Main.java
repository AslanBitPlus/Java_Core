package L2_s3;

/*
Задание 2-3
Написать метод, которому можно передать в качестве аргумента массив,
состоящий строго из единиц и нулей (целые числа типа int).
Метод должен заменить единицы в массиве на нули, а нули на единицы и
не содержать ветвлений. Написать как можно больше вариантов метода
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] arr = {1, 0, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] a) {
        for (int i = 0; i < a.length; i++) {
            // a[i] = 1 - a[i];
            a[i] = (a[i] - 1) * -1;
            // a[i] = (a[i] + 1) % 2;
        }
    }

}
