package me.acerox.filemanager.option;

import me.acerox.filemanager.SequentialFile;

public class OptionWriteStart extends Option {

    public OptionWriteStart(SequentialFile sequentialFile) {
        super("Write text at start", sequentialFile);
    }

    @Override
    public void init() {

    }
}
