/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Simon Autran
 */
package ex43;
import java.io.IOException;
public class ex43 
{
    public static void main(String[] args) throws IOException 
    {
        WebsiteGenerator websiteGenerator=new WebsiteGenerator();
        websiteGenerator.scanInfo();
        websiteGenerator.generateWebsite();
    }
}
