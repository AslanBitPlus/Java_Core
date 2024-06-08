package org.example.Ls5_DZ;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.*;

public class Backup {
    public static void main(String[] args) throws IOException {
        String folder = "./backup";

        System.out.println("Hello World!");
        copyToBackup();
    }

    public static void copyToBackup() throws IOException {
        // Определим каталог для копирования

        Path path = Paths.get("backup");
        try {
            // Удаление папки, если существует
            File backup = new File("./backup");
            FileUtils.deleteDirectory(backup);
            System.out.println("Старый каталог " + path + " Удален!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Если каталог не существует, создаем его
            Files.createDirectory(Path.of("./backup"));
            System.out.println("Каталог " + path + " создан!");
        }


        DirectoryStream<Path> dir = Files.newDirectoryStream(Path.of("."));
        for (Path file : dir) {
            if (Files.isDirectory(file)) continue;
            Files.copy(file, Path.of("./backup/" + file.toString()));
            System.out.println("Копирование: " + file.toString());
        }
    }
}
