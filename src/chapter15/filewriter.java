package chapter15;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String[] args){
        String filename = "javafile.txt";
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, this is Java FileWriter!");


            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }


    }

}
