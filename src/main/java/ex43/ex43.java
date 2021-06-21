/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Simon Autran
 */
package ex43;
public class ex43 
{
    public static void main(String[] args) 
    {
        Input input = new Input();
        input.storeValues();
        WebGen myGen = new WebGen(input.title, input.author, input.flag1, input.flag2);
    }
}
