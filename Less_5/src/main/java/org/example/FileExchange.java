package org.example;

import java.io.*;


public class FileExchange {
    //
    public static String makeString(String path) throws IOException {
        String string;
        try (BufferedInputStream stream = new BufferedInputStream(new FileInputStream(path))) {
            return new String(stream.readAllBytes());

        }

    }

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        System.out.println(makeString("src/main/java/org/example/s.txt"));

        writeFile("src/main/java/org/example/s.txt", 'a');


    }

    public static void writeFile(String path, char exchangeChar) throws IOException {
        String string = makeString(path);
        string = string.replaceAll(String.valueOf(exchangeChar), " ");
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(string);
        }
    }
}