package ru.netology.Files.Task2;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {

    public static void main(String[] args) {

        GameProgress game1 = new GameProgress(89, 2, 10, 2.5);
        GameProgress game2 = new GameProgress(100, 5, 5, 3.8);
        GameProgress game3 = new GameProgress(14, 7, 25, 45.9);

        saveGame("D://Games//saveGames//game1.dat", game1);
        saveGame("D://Games//saveGames//game2.dat", game2);
        saveGame("D://Games//saveGames//game3.dat", game3);

        zipFiles("D://Games//saveGames//game.zip", "D://Games//saveGames");

    }

    public static void saveGame(String address, GameProgress gameProgress) {

        try (FileOutputStream fos = new FileOutputStream(address);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(gameProgress);
            System.out.println("Сохраниение успешно произведено");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void zipFiles(String addressZip, String addressDat) {

        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(addressZip))) {

            File dir = new File(addressDat);

            if (dir.isDirectory()) {
                for (File item : dir.listFiles()) {
                    if (!item.getName().contains("zip")) {
                        try (FileInputStream fis = new FileInputStream(item)) {

                            ZipEntry entry = new ZipEntry(item.getName());
                            zout.putNextEntry(entry);

                            byte[] buffer = new byte[fis.available()];

                            fis.read(buffer);
                            zout.write(buffer);
                            System.out.println("Запаковано " + item.getName());

                        }
                        item.delete();
                        System.out.println("файл удален - " + item.getName());
                    }
                }
            }
            zout.closeEntry();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

