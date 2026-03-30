package chapter15;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileReaderExample {
    String filename  =  "text.txt";

    try ( FileReader read = new FileReader(filename)){

    }catch (IOException e){

    }
}
