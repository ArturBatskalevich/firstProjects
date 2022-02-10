package ru.netology.Files.Task1;

import java.io.File;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {

        File scr = new File("D://Games//src");
        File res = new File("D://Games//res");
        File saveGames = new File("D://Games//saveGames");
        File temp = new File("D://Games//temp");

        File main = new File("D://Games//src//main");
        File test = new File("D://Games//src//test");

        File mainJava = new File("D://Games//src//main//Main.java");
        File utilsJava = new File("D://Games//src//main//Utils.java");

        File drawables = new File("D://Games//res//drawables");
        File vectors = new File("D://Games//res//vectors");
        File icons = new File("D://Games//res//icons");

        File tempTxt = new File("D://Games//temp//temp.txt");

        StringBuilder finishText = new StringBuilder("Бацкалевич Нина Ивановна");

        try {

            if (scr.mkdir() && res.mkdir() && saveGames.mkdir() && temp.mkdir()) {
                System.out.println("В папке Games созданы директорий: src, res, saveGames, temp");
            }

            if (main.mkdir() && test.mkdir()){
                System.out.println("В каталоге src созданы директорий: main, test");
            }

            if(mainJava.createNewFile() && utilsJava.createNewFile() ){
                System.out.println("Были созданы два файла: Main.java, Utils.java.");
            }

            if(drawables.mkdir() && vectors.mkdir() && icons.mkdir() ){
                System.out.println("В папке Games созданы директорий: drawables, vectors, icons");
            }

            if(tempTxt.createNewFile() ){
                System.out.println("Был создан файл: temp.txt");
            }

            FileWriter writer = new FileWriter(tempTxt,true);
            writer.write(String.valueOf(finishText));
            writer.close();

//            if (file.delete()) {
//                System.out.println("Файл удален");
//            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
