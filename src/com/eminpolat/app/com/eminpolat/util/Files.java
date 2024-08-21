package com.eminpolat.app.com.eminpolat.util;

import java.io.*;
import java.util.Scanner;

public class Files {
    public static void createFile()
    {
        File file = new File("C:\\Users\\eminp\\IdeaProjects\\FileAutomationProject\\src\\db.txt");
        try {
            if (file.createNewFile())
                System.out.println("Dosya oluşturuldu");
            else
                System.out.println("Dosya zaten mevcut");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\Users\\eminp\\IdeaProjects\\FileAutomationProject\\src\\db.txt");
        if (file.exists()) {
            System.out.println("Dosya adı: " + file.getName());
        } else {
            System.out.println("DataBase'de bir problem oluştu");
            return;
        }
    }

    public static void readFile() {
        File file = new File("C:\\Users\\eminp\\IdeaProjects\\FileAutomationProject\\src\\db.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\eminp\\IdeaProjects\\FileAutomationProject\\src\\db.txt", true));
            Scanner kb = new Scanner(System.in);
            System.out.print("Dosyaya yazmak istediğiniz metni giriniz:");
            String val = kb.nextLine();
            writer.newLine();
            writer.write(val);
            System.out.println("Dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
