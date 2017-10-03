package me.acerox.filemanager.option;

import me.acerox.filemanager.ReadWrite;

public class OptionWriteStart extends Option {

    public OptionWriteStart(ReadWrite readWrite) {
        super("Write text at start", readWrite);
    }

    @Override
    public void init() {

    }
}
