/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Simon Autran
 */
package ex45;
import java.io.*;
import java.nio.*;
public class Edit 
{
    public void createOutputFile(String Output, String output) 
    {
        File f = new File("src/main/java/ex45" + "/" +Output+ ".txt");
        try {
            FileWriter fileWriter = new FileWriter(f);
            fileWriter.write(output);
            fileWriter.close();
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    public String replaceWord() 
    {
        String input = getInput();
        String output;
        output = input.replaceAll("utilize", "use");
        return output;
    }
    private String getInput() 
    {
        String input = "";
        Path filename = Paths.get("src/main/java/ex45/exercise45_input.txt");
        try {
            input = Files.readString(filename);
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
        return input;
    }
}
