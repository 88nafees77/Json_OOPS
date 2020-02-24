/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonlearn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author conta
 */
public class SerializationLine {

    public List<String> serialLine(List<DataAccessObject> object) {
        List<String> list = new ArrayList<>();
        try {
            for (DataAccessObject obj : object) {
                ObjectMapper mapper = new ObjectMapper();
                list.add(mapper.writeValueAsString(obj));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return list;
    }

}
