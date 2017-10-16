package me.acerox.filemanager;

import me.acerox.filemanager.option.Exit;
import me.acerox.filemanager.option.Option;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    private Option[] options = new Option[8];
    private Exit exit = new Exit();
    private int number = 0;

    public void add(Option option) {
        options[number] = option;
        number++;
    }

    public void exit() {
        add(exit);
    }

    public void display() {
        for (int i = 0; i < number; i++) {
            options[i].display(i);
        }
    }

    public Option getOption() throws IOException {
        int number = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        number = Integer.parseInt(reader.readLine());

        return options[number];
    }

    public boolean close() {
        return exit.isExited();
    }
}
