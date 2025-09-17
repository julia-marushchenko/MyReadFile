// Java program to read text from file

package com.files;
import java.io.*;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) throws FileNotFoundException {

        // Creating BufferedReader with input FileReader object
        try (BufferedReader br = new BufferedReader(new FileReader("fileToRead.txt"))) {

            // Creating String object to store text
            String text;
            while ((text = br.readLine()) != null) {
                // Printing text to console
                System.out.println(text);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}