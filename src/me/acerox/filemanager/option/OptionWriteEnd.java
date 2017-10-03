package me.acerox.filemanager.option;

import me.acerox.filemanager.ReadWrite;

public class OptionWriteEnd extends Option {

    public OptionWriteEnd(ReadWrite readWrite) {
        super("Append file to text", readWrite);
    }

    @Override
    public void init() {

    }
}
