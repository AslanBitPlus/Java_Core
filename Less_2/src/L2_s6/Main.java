package L2_s6;

/*
Задача: Написать метод, в который передается не пустой одномерный
целочисленный массив, метод должен вернуть true если в массиве есть
место, в котором сумма левой и правой части массива равны.
Примеры:
checkBalance([1, 1, 1, || 2, 1]) → true,
checkBalance([2, 1, 1, 2, 1]) → false,
checkBalance([10, || 1, 2, 3, 4]) → true.
Абстрактная граница показана символами ||,
эти символы в массив не входят.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 2-6");

        System.out.println(" ----- Метод 1 ------ ");
        int[] a = {1, 1, 1, 2, 1};
        System.out.print("Array a -> ");
        System.out.print(Arrays.toString(a));
        System.out.println(" -> " + checkBalance(a));

        int[] b = {2, 1, 1, 2, 1};
        System.out.print("Array b -> ");
        System.out.print(Arrays.toString(b));
        System.out.println(" -> " + checkBalance(b));

        int[] c = {10, 1, 2, 3, 4};
        System.out.print("Array c -> ");
        System.out.print(Arrays.toString(c));
        System.out.println(" -> " + checkBalance(c));

        System.out.println(" ----- Метод 2 ------ ");
        System.out.print("Array a -> ");
        System.out.print(Arrays.toString(a));
        System.out.println(" -> " + checkBalance(a));

        System.out.print("Array b -> ");
        System.out.print(Arrays.toString(b));
        System.out.println(" -> " + checkBalance(b));

        System.out.print("Array c -> ");
        System.out.print(Arrays.toString(c));
        System.out.println(" -> " + checkBalance(c));

    }

    private static boolean checkBalance(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        // Проверка на четность суммы. Если сумма не четна -> FALSE
        if (sum %2 != 0) return false;
        // Если сумма четная, то проверяем на существование такой границы
        int left = 0;
        for (int i = 0; i < a.length; i++) {
            left += a[i];
            sum -= a[i];
            if (left == sum) return true;
        }
        // Если такой границы нет, то FALSE
        return false;
    }

    private static boolean checkBalance2(int[] a) {

        int sum = Arrays.stream(a).sum();

        // Проверка на четность суммы. Если сумма не четна -> FALSE
        if (sum %2 != 0) return false;
        // Если сумма четная, то проверяем на существование такой границы
        int left = 0;
        for (int i = 0; i < a.length; i++) {
            left += a[i];
            sum -= a[i];
            if (left == sum) return true;
        }
        // Если такой границы нет, то FALSE
        return false;
    }

}
