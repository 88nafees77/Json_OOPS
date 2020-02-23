/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonlearn;

/**
 *
 * @author conta
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //File f = new File();
        String readFilePath = "C:\\Users\\conta\\OneDrive\\Desktop\\details.txt";
        String writeFilePath = "C:\\Users\\conta\\OneDrive\\Desktop\\serial.txt";
        //  f.readFile(read, write);
        ReaderUtility readerUtility = new ReaderUtility(new ReadFromFile(readFilePath));
        WritterUtility writterUtility = new WritterUtility(new WriteIntoFile(writeFilePath));
        writterUtility.writer(readerUtility.read());
        
    }
    
}
