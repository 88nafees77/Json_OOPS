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

    public List<DataAccessObject> setDao(List<String[]> line) {
        ParserLine parserLine = new ParserLine();
        List<DataAccessObject> list = new ArrayList<>();
        for (String[] csv : line) {
            DataAccessObject accessObject = new DataAccessObject();
            accessObject.setName(csv[0]);
            accessObject.setAge(csv[1]);
            accessObject.setQualification(csv[2]);
            list.add(accessObject);

        }
        return list;
    }
}
