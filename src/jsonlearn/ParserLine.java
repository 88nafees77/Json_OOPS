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
public class ParserLine {

    public List<String[]> splitter(String splitt, List<String> line) {
        List<String[]> list = new ArrayList<>();
        for (String str : line) {
            list.add(str.split(splitt));
        }
        return list;
    }
}
