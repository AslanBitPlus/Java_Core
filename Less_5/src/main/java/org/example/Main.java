package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Java Core! Lesson - 5 Задание - 1");
        System.out.println("Запись целочисленного массива в файл");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        arrayToFile(arr);

        stringToFile(writeZero(arr));

        System.out.println(Arrays.toString(fileToArray("src/main/resources/stringToFile.txt")));

    }
    // Метод записи массива целых чисел в файл
    // Определяем относительный путь к папке resources (ниже)
    // src/main/java/org/example/Main.java
    public static void arrayToFile(int[] arr) throws IOException {
        try (FileWriter fileWriter = new FileWriter("src/main/resources/arrayToFile.txt")) {
            fileWriter.write(Arrays.toString(arr));
        }
    }

    // Метод записи строки в файл
    public static void stringToFile(String str) throws IOException {
        try (FileWriter fileWriter = new FileWriter("src/main/resources/stringToFile.txt")) {
            fileWriter.write(str);
        }
    }


    // Метод составления строки из элементов массива с разделителем 0
    // [10203040506070809] - 0 вместо разделителя
    public static String writeZero(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i]).append("0");
        }
        sb.append(arr[arr.length - 1]);
        return sb.toString();
    }

    // Метод чтения массива целых чисел из файла
    public static int[] fileToArray(String path) throws IOException {
        ArrayList<Integer> array = new ArrayList<>();
        try (FileReader reader = new FileReader(path)) {
            int n;
            while ((n = reader.read()) != -1) {
                char temp = (char) n;
                if (temp != '0') {
                    try {
                        array.add(Integer.parseInt(String.valueOf(temp)));
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }

                }
                // return array;

            }
        }
        int[] result = new int[array.size()];
        int index = 0;
        for (Integer integer : array) {
            result[index++] = integer.intValue();
            
        }
        return result;

    }

}


