package com.fo4ik;

import com.fo4ik.parse.ParseUrl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter url: ");
        String url = scanner.nextLine();

        ParseUrl parseUrl = new ParseUrl();
        try {
            parseUrl.parseUrl(url);
        } catch (Exception e) {
            System.out.println("Error in parseUrl");
        }

    }

}