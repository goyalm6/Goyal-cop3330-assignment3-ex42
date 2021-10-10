/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution, Exercise 42
 *  Copyright 2021 Mayank Goyal
 */

package ex42;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataParser {
    private static String inputFile = "src/main/resources/exercise42_input.txt";

    public static void main(String[] args) throws Exception {

        ParseData dParser = new ParseData();

        dParser.inputFile  = inputFile;

        try (BufferedReader br = Files.newBufferedReader(Paths.get(inputFile)))
        {
            String[] result = dParser.readFile(br);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}