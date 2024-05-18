/**
 * Декоратор, он декорирует, т.е. накладывает на результат декорации
 * Внешний вид важен, потому этот класс существует
 **/
public class Decorator {
    /**
     * Функция декорирования числа для вывода в консоль
     * в виде строки с преамбулой 'Вот ваше число'
     *
     * @param a число, требующее декорацию
     * @return отформатированная строка
     **/
    public static String decorate(int a) {
        /**
         Метод декорирует число, добавляя к нему строку
         при помощи функции форматирования строк
         **/
        return String.format("Вот ваш результат: %d", a);
    }


}