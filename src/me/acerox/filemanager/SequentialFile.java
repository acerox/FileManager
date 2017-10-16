package me.acerox.filemanager;

import java.io.*;
import java.util.StringTokenizer;

public class SequentialFile {

    private String fileLocation;

    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;

    public SequentialFile(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public String readFile() throws IOException {
        openReader();
        String line = bufferedReader.readLine();
        String str = "";

        while (line != null) {
            str += line;
            line = bufferedReader.readLine();
        }

        closeReader();
        return str;
    }

    public void write(String str, boolean append) throws IOException {
        openWriter(append);
        bufferedWriter.write(str);
        closeWriter();
    }

    private void openReader() throws IOException {
        bufferedReader = new BufferedReader(new FileReader(fileLocation));
    }

    private void closeReader() throws IOException {
        bufferedReader.close();
    }

    private void openWriter(boolean append) throws IOException {
        bufferedWriter = new BufferedWriter(new FileWriter(fileLocation, append));
    }

    private void closeWriter() throws IOException {
        bufferedWriter.close();
    }

    public String getValue(String value) throws IOException {
        openReader();
        StringTokenizer stringTokenizer;
        String line = bufferedReader.readLine();
        String str;

        while (line != null) {
            stringTokenizer = new StringTokenizer(line, ";");
            while (stringTokenizer.hasMoreTokens()) {
                str = stringTokenizer.nextToken();
                if (str.equals(value))
                    return str;
            }
            line = bufferedReader.readLine();
        }

        closeReader();
        return "";
    }

    public String getRecord(int id) throws IOException {
        openReader();
        String str = "";

        for (int i = 0; i < id; i++) {
             str = bufferedReader.readLine();
        }
        closeReader();
        return str;
    }
}
