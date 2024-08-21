package com.eminpolat.app;

import com.eminpolat.app.com.eminpolat.util.Files;

public class App {
    public static void main(String[] args)
    {
        System.out.println("DB programı başladı");
        Files.createFile();
        Files.readFile();
        Files.writeFile();

        Files.createFile();
        Files.writeFile();
        Files.readFile();

        System.out.println("DB programı sonlanıyor");
    }
}
