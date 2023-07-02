package com.zephir0g;

import com.zephir0g.parse.ParseUrl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter url: ");  // Read user input
        String url = scanner.nextLine();  // Read user input

        ParseUrl parseUrl = new ParseUrl(); // Create a ParseUrl object
        try {
            parseUrl.parseUrl(url); // Parse url
        } catch (Exception e) {
            System.out.println("Error in parseUrl"); // Print the error
        }

    }

}