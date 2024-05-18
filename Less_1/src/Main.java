/**
 * Точка входа в программу
 **/
public class Main {
    /**
     * Точка входа в программу
     **/
    public static void main(String[] args) {
        System.out.println("Hello world from Java!");

        // Сложение двух чисел
        int result = MathClass.add(2, 2);
        System.out.println(Decorator.decorate(result));

        // Вычитание двух чисел
        result = MathClass.sub(2, 2);
        System.out.println(Decorator.decorate(result));

        // Умножение двух чисел
        result = MathClass.mul(2, 2);
        System.out.println(Decorator.decorate(result));

        // Деление двух чисел
        result = MathClass.div(2, 2);
        System.out.println(Decorator.decorate(result));

    }

}