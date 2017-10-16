package me.acerox.filemanager.option;

import me.acerox.filemanager.SequentialFile;

public class OptionOverwrite extends Option {

    public OptionOverwrite(SequentialFile sequentialFile) {
        super("Write text and overwrite", sequentialFile);
    }

    @Override
    public void init() {

    }
}
