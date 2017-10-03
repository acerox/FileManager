package me.acerox.filemanager.option;

import me.acerox.filemanager.ReadWrite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Option {

    protected final String title;
    protected ReadWrite readWrite;

    protected Option(String title, ReadWrite readWrite) {
        this.title = title;
        this.readWrite = readWrite;
    }

    public void display(int position) {
        System.out.print("\n" + position + ". " + title);
    }

    protected int askOption() throws IOException {
        int number = 0;

        System.out.println("Select option:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        number = Integer.parseInt(reader.readLine());

        return number;
    }

    public abstract void init() throws IOException;
}
