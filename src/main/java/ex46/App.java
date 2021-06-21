/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Simon Autran
 */
package ex46;
import java.io.*;
import java.nio.*;
public class ex46 
{
    public static void main(String[] args) 
    {
        ex46 app = new ex46();
        String input = app.readFile();
        WordCount wordCount = new WordCount();
        wordCount.countWord(input);
        wordCount.printWordCount();
    }
    public String readFile() 
    {
        String input = "";
        Path filename = Paths.get("src/main/java/ex46/exercise46_input.txt");
        try {
            input = Files.readString(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
}
