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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String readFilePath = "C:\\Users\\Nafees Abdullah\\Desktop\\details.txt";
        String writeFilePath = "C:\\Users\\Nafees Abdullah\\Desktop\\serial.txt";
        ReaderUtility readerUtility = new ReaderUtility(new ReadFromFile(readFilePath));
        WritterUtility writterUtility = new WritterUtility(new WriteIntoFile(writeFilePath));
        List<String> list = readerUtility.read();
        ParserLine line = new ParserLine();
        List<String[]> splitstring = line.splitter(",", list);
        SetterDao dao = new SetterDao();
        List<DataAccessObject> daos = dao.setDao(splitstring);
        SerializationLine serializationLine = new SerializationLine();
        List<String> ll = serializationLine.serialLine(daos);
        writterUtility.writer(ll);

    }

}
