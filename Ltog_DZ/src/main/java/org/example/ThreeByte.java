package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ThreeByte {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        // Начальные данные
        String file = "ThreeByte.txt";
        int[] arr = {0,1,2,3,0,1,2,3,0};

        // Печать массива чисел (крестики нолики)
        System.out.println("Массив чисел =====================");
        System.out.println(Arrays.toString(arr));

        //Запись в файл
        System.out.println("Запись в файл " + file);
        saveThreeByte(arr, "ThreeByte.txt");

        // Чтение из файла
        System.out.println("Чтение из файла " + file);
        System.out.println(Arrays.toString(loadThreeByte(file)));
        //

    }

    public static byte saveThreeByte(int[] arr, String file) throws IOException {
        byte result = 0;

        FileOutputStream fileOutputStream = new FileOutputStream(file); // "ThreeByte.txt"
        for (int b = 0; b < 3; b++) { // write to 3 bytes
            result = 0;
            for (int v = 0; v < 3; v++) { // write by 3 values in each
                result += (byte) (arr[3 * b + v] << (v * 2));
            }
            fileOutputStream.write(result);
        }
        fileOutputStream.flush();
        fileOutputStream.close();

        return result;
    }

    public static int[] loadThreeByte(String file) throws IOException {
        int[] result = new int[9];
        FileInputStream fileInputStream = new FileInputStream(file); // "ThreeByte.txt"
        int b;
        int i = 0;
        while ((b = fileInputStream.read()) != -1) {
            for (int v = 0; v < 3; ++v) { // 3 values of four possible
                result[i++] = b >> (v * 2) & 0x3;
            }
        }
        fileInputStream.close();
        return result;

    }
}
