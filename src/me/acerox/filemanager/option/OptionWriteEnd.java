package me.acerox.filemanager.option;

import me.acerox.filemanager.SequentialFile;

public class OptionWriteEnd extends Option {

    public OptionWriteEnd(SequentialFile sequentialFile) {
        super("Append file to text", sequentialFile);
    }

    @Override
    public void init() {

    }
}
