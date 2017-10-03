package me.acerox.filemanager;

import me.acerox.filemanager.option.Exit;
import me.acerox.filemanager.option.Option;

public class Menu {

    private Option[] options = new Option[7];
    private Exit exit = new Exit();
    private int number = 0;

    public Menu() {
        add(exit);
    }

/*
    private String[] options = {
            "Open file",
            "Read file",
            "Read registry line",
            "Search",
            "Write on start",
            "Write to end",
            "Overwrite"
    };
*/

    public void add(Option option) {
        options[number] = option;
        number++;
    }

    public void display() {
        for (int i = 0; i < options.length; i++) {
            options[i].display(i);
        }
    }

    public Option selectOption() {
        //TO DO
        return null;
    }

    public boolean close() {
        return exit.isExited();
    }
}
