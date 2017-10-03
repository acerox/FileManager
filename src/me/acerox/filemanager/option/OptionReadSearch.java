package me.acerox.filemanager.option;

import me.acerox.filemanager.ReadWrite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OptionReadSearch extends Option {

    public OptionReadSearch(ReadWrite readWrite) {
        super("Search word in the file", readWrite);
    }

    @Override
    public void init() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();

        System.out.println(readWrite.getValue(word) + " word found!!");
    }
}
