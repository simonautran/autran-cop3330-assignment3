/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Simon Autran
 */
package ex43;
import java.util.*;
public class ex43Input {
    private final static Scanner in = new Scanner(System.in);
    String title;
    String author;
    boolean flag1;
    boolean flag2;
    public void storeValues() 
    {
        this.title = getSiteName();
        this.author = getAuthor();
        this.flag1 = isJavaScript(getInput1());
        this.flag2 = isCSS(getInput2());
    }
    public String getSiteName() 
    {
        System.out.print("Site name: ");
        String name = in.nextLine();
        return name;
    }
    public String getAuthor() 
    {
        System.out.print("Author: ");
        String author = in.nextLine();
        return author;
    }
    public boolean isJavaScript(String string) 
    {
        boolean bool = string.equalsIgnoreCase("y");
        return bool;
    }
    public boolean isCSS(String string) 
    {
        boolean bool = string.equalsIgnoreCase("y");
        return bool;
    }
    public String getInput1() 
    {
        System.out.print("Do you want a folder for JavaScript (y or n)? ");
        String response = in.next();
        return response;
    }
    public String getInput2() 
    {
        System.out.print("Do you want a folder for CSS (y or n)? ");
        String response = in.next();
        return response;
    }
}
