package com.zephir0g.saveToFile;

import com.zephir0g.parse.ParseFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile {

    public void saveToFile(String html) throws IOException { // Save html to file
        File file = new File("index.html");
        FileWriter fileWriter = new FileWriter(file);

        System.out.println("SaveToFile start ...");

        if(file.exists()){ // If file exist delete it
            System.out.println("File exist");
            file.delete();
            System.out.println("File deleted");
           // file.createNewFile();
        } else {
            file.createNewFile();
        }

        fileWriter.write(html);
        fileWriter.flush();
        fileWriter.close();


        System.out.println("File saved \n");

        ParseFile parseFile = new ParseFile();
        parseFile.parseFileOfSite("index.html");
    }

}
