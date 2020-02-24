/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonlearn;

import java.util.List;

/**
 *
 * @author conta
 */
public class ReaderUtility {

    Reader read = null;

    public ReaderUtility(Reader reader) {
        this.read = reader;
    }
     public List<String> read(){
         return read.read();
     }
    
}
