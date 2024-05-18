/**
 * Математические функции
 * (сложение, вычитание, умножение и деление)
 **/
public class MathClass {
    public static int add(int a, int b) {
        return a + b;
        /**
         Функция суммирования двух целых чисел
         @param a первое слагаемое
         @param b второе слагаемое
         @returm сумма a и b
         **/
    }

    public static int sub(int a, int b) {
        /**
         Функция вычитания двух целых чисел
         @param a уменьшаемое
         @param b вычитаемое
         @returm разность a и b
         **/
        return a - b;
    }

    public static int mul(int a, int b) {
        /**
         Функция умножения двух целых чисел
         @param a первый множитель
         @param b второй множитель
         @returm произведение a и b
         **/
        return a * b;
    }

    public static int div(int a, int b) {
        /**
         Функция деления двух целых чисел
         @param a делимое
         @param b делитель
         @returm частное a и b
         **/
        return a / b;
    }
}
