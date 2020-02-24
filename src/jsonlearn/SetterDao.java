/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonlearn;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nafees Abdullah
 */
public class SetterDao {

    public List<DataAccessObject> setDao(List<String> line) {
        List<DataAccessObject> list = new ArrayList<>();
        for (String csv : line) {
            DataAccessObject accessObject = new DataAccessObject();
            String string[] = csv.split(",");
            accessObject.setName(string[0]);
            accessObject.setAge(string[1]);
            accessObject.setQualification(string[2]);
            list.add(accessObject);

        }
        return list;
    }
}
