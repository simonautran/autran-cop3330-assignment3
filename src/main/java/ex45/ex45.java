/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Simon Autran
 */
package ex45;
import java.util.Scanner;
public class ex45 
{
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) 
    {
        Edit FE = new Edit();
        String out_FileName = getUser_OutputFile_Name();
        String output = FE.repWord();
        FE.createOutputFile(out_FileName, output);
        in.close();
    }
    private static String getUser_OutputFile_Name() 
    {
        System.out.println("What would you like to name the output file?");
        return in.nextLine();
    }
}
