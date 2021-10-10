/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution, Exercise 42
 *  Copyright 2021 Mayank Goyal
 */

package ex42;

import java.io.BufferedReader;
import java.io.IOException;

public class ParseData {
    public String inputFile;

    public ParseData() {}

    public String[] readFile(BufferedReader br)
    {
        String[] columns = new String[0];
        try {
            printHeader();
            String DELIMITER = ",";

            // read the file line by line
            String line;

            while ((line = br.readLine()) != null) {
                // convert line into columns
                columns = line.split(DELIMITER);
                printData(columns);
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return columns;
    }

    private void printHeader()
    {
        System.out.printf("%-10s %-10s %-10s", "Last", "First", "Salary");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
    }

    private void printData(String[] columns)
    {
        System.out.format("%-10s %-10s %-10s", columns[0], columns[1], columns[2]);
        System.out.println();
    }
}