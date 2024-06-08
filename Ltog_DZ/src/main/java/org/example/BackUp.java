package org.example;

// Компиляция

import java.io.*;
import java.nio.file.*;

public class BackUp {
    public static void main(String[] args) throws IOException {

        // Определяем рабочую папку и папку backup
        Path wpath = Paths.get(".");
        Path npath = Paths.get("./backup");

        // Копирование
        copyToBackupDir(wpath, npath);
    }

    public static void copyToBackupDir(Path wpath, Path npath) throws IOException {
        // Создание папки
        try {
            File backup = new File(npath.toString());
            System.out.println(backup);

            //
            if (!Files.exists(npath)) {
                Files.createDirectories(npath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Копирование всех файлов папки
        System.out.println("Копирование файлов ...");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(wpath)) {
            for (Path f : stream) {
                if (Files.isRegularFile(f)) {
                    copyFile(f, npath.resolve(f.getFileName()));
                    System.out.println(f.toString());
                }
            }
        }

    }

    private static void copyFile(Path fromDir, Path toDir) throws IOException {
        Files.copy(fromDir, toDir, StandardCopyOption.REPLACE_EXISTING);
    }
}

