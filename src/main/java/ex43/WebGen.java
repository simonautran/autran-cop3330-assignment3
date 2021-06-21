/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Simon Autran
 */
package ex43;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
public class WebGen {
    public String title;
    public String author;
    public boolean jsFlag;
    public boolean cssFlag;
    public String path = "src/main/java/ex43/";
    public WebGen(String title, String author, boolean flag1, boolean flag2)
    {
        this.title = title;
        this.author = author;
        this.jsFlag = flag1;
        this.cssFlag = flag2;
        createStructure();
    }
    public void createStructure() 
    {
        createWebsiteDir();
        createTitleDir();
        createIndexHTML();
        if(this.jsFlag) 
        {
            if(createJSDir())
            {
                System.out.println("Created ./website/" + this.title + "/js");
            }
        }
        if(this.cssFlag) 
        {
            if(createCSSDir())
            {
                System.out.println("Created ./website/" + this.title + "/css");
            }
        }
    }
    public void createWebsiteDir() {
        File f1 = new File(this.path + "website/");
        this.path += "website/";
        f1.mkdir();
    }
    public void createTitleDir() {
        File f2 = new File(this.path + this.title);
        this.path += this.title;
        System.out.printf("Created ./website/%s%n", this.title);
        f2.mkdir();
    }
    public boolean createJSDir() {
        File f3 = new File(this.path + "/js");
        boolean bool = f3.mkdir();
        return bool;
    }
    public boolean createCSSDir() {
        File f4 = new File(this.path + "/css");
        boolean bool = f4.mkdir();
        return bool;
    }
    public void createIndexHTML() {
        try(Formatter output = new Formatter(this.path + "/index.html")) {
            output.format("<!DOCTYPE html><html><head><meta name =\"author\" content =\"%s\"><title>%s</title></head><body></body></html>", this.author, this.title);
            System.out.println("Created ./website/" + this.title + "/index.html");
        }
        catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            e.printStackTrace();
        }
    }
}
