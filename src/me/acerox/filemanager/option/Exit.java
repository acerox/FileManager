package me.acerox.filemanager.option;

public class Exit extends Option {

    private boolean exit = false;

    public Exit() {
        super("Exit", null);
    }

    @Override
    public void init() {
        exit = true;
    }

    public boolean isExited() {
        return exit;
    }
}
