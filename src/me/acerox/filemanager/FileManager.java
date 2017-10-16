package me.acerox.filemanager;

import me.acerox.filemanager.option.OptionReadSearch;
import me.acerox.filemanager.option.OptionWriteEnd;
import me.acerox.filemanager.option.OptionOverwrite;
import me.acerox.filemanager.option.OptionWriteStart;

import java.io.IOException;

public class FileManager {

    private Menu menu = new Menu();
    private SequentialFile sequentialFile;

    private FileManager(String fileLocation) {
        sequentialFile = new SequentialFile(fileLocation);

        menu.add(new OptionReadSearch(sequentialFile));
        menu.add(new OptionWriteEnd(sequentialFile));
        menu.add(new OptionOverwrite(sequentialFile));
        menu.add(new OptionWriteStart(sequentialFile));
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
