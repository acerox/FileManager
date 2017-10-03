package me.acerox.filemanager;

import me.acerox.filemanager.option.OptionReadSearch;
import me.acerox.filemanager.option.OptionWriteEnd;
import me.acerox.filemanager.option.OptionWriteOverwrite;
import me.acerox.filemanager.option.OptionWriteStart;

import java.io.IOException;

public class FileManager {

    private Menu menu = new Menu();
    private ReadWrite readWrite;

    private FileManager(String fileLocation) {
        readWrite = new ReadWrite(fileLocation);

        menu.add(new OptionReadSearch(readWrite));
        menu.add(new OptionWriteEnd(readWrite));
        menu.add(new OptionWriteOverwrite(readWrite));
        menu.add(new OptionWriteStart(readWrite));
        menu.exit();
    }

    public void init() throws IOException {
        menu.display();
        menu.getOption().init();
    }

    public static void main(String[] args) throws IOException {
        new FileManager("").init();
    }
}
