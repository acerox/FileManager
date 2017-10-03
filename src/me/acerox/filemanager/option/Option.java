package me.acerox.filemanager.option;

public abstract class Option {

    protected final String title;

    protected Option(String title) {
        this.title = title;
    }

    public void display(int position) {

    }

    public abstract void init();
}
