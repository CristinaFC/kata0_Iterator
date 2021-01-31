
package kata0_iterator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Kata0_Iterator {


    public static void main(String[] args) {
        String fileName =  "archive.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            IteratorReader iterator = new IteratorReader(reader);
            for (String line : iterator) {
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR Kata0_Iterator::main (File not found)" + ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Kata0_Iterator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
