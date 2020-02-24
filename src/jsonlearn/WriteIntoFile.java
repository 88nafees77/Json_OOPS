/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonlearn;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author conta
 */
public class WriteIntoFile implements Writter {

    String writerPath = null;
    SerializationLine sl = new SerializationLine();

    public WriteIntoFile(String writerPath) {
        this.writerPath = writerPath;
    }

    @Override
    public void writer(List<String> list) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(writerPath));

            for (String str : list) {
                writer.append(str + "\n");

            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(WriteIntoFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
