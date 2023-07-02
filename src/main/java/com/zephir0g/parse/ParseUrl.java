package com.zephir0g.parse;

import com.zephir0g.saveToFile.SaveToFile;
import org.jsoup.Jsoup;

import java.io.IOException;

public class ParseUrl {

    public void parseUrl(String url) throws IOException {
        System.out.println("ParseUrl start ...");
        String html = Jsoup.connect(url).get().html(); // Get html from url
        System.out.println("ParseUrl success \n");

        SaveToFile saveToFile = new SaveToFile();
        saveToFile.saveToFile(html);
    }

}
