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
public class WritterUtility {

    Writter writter = null;

    public WritterUtility(Writter writter) {
        this.writter = writter;
    }
    public void writer(List<String> list){
        writter.writer(list);
    } 
}
