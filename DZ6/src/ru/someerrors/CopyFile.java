package ru.someerrors;
import java.io.*;

public class CopyFile {

    public void copyfile() {
        System.out.println();
        System.out.println(" === Блок Демо5. Использование try-with-resource. Копирование файла");

        try (FileOutputStream fos
                     = new FileOutputStream("outputfile.txt");
             BufferedReader br = new BufferedReader(
                     new FileReader("inputfile.txt"))) {
            String text;
            while ((text = br.readLine()) != null) {
                byte arr[] = text.getBytes();
                fos.write(arr);
            }
            System.out.println(
                    "Копирование завершено");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Завершение работы");
    }
}

