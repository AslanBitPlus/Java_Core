package L2_s1;

/*
Задание 2-1
Написать метод «Шифр Цезаря», с булевым параметром зашифрования/расшифрования,
и числовым ключом;
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 2-1");
        System.out.println(caesar("Трансформатор", 4, true));
        System.out.println(caesar("Цфдсхштфрдцтф", 4, false));
    }
    private static String caesar (String in, int key, boolean encript) {
        if (in == null || in.isEmpty())
            return null;

        final int len = in.length();
        char[] out = new char[len];
        for (int i = 0; i < len; i++) {
            out[i] = (char) (in.charAt(i) + ((encript) ? key : -key));
        }
        return new String(out);
    }

}
