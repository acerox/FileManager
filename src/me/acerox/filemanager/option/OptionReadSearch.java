package me.acerox.filemanager.option;

import me.acerox.filemanager.SequentialFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OptionReadSearch extends Option {

    public OptionReadSearch(SequentialFile sequentialFile) {
        super("Search word in the file", sequentialFile);
    }

    @Override
    public void init() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();

        System.out.println(sequentialFile.getValue(word) + " word found!!");
    }
}
