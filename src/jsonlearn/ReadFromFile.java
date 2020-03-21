/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonlearn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author conta
 */
public class ReadFromFile implements IReader {

    String path = null;

    public ReadFromFile(String path) {
        this.path = path;
    }

    public List<String> read() {
        return readFromFile();
    }

    private List<String> readFromFile() {
        List<String> list = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(new java.io.File(path)));
            String line = reader.readLine();
            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}
