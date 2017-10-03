package me.acerox.filemanager.option;

import me.acerox.filemanager.ReadWrite;

public class OptionWriteOverwrite extends Option {

    public OptionWriteOverwrite(ReadWrite readWrite) {
        super("Write text and overwrite", readWrite);
    }

    @Override
    public void init() {

    }
}
