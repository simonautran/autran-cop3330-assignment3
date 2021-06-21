/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Simon Autran
 */
package ex44;
import java.io.FileNotFoundException;
import java.util.*;
public class ex44 {
    public static void main(String[] args) throws FileNotFoundException {
        ObjectManager objectManager=new ObjectManager();
        objectManager.readObjects();
        Scanner in=new Scanner(System.in);
        System.out.print("What is the product name? ");
        while(!objectManager.findObject(in.nextLine())){
            System.out.println("Sorry, that product was not found in our inventory.");
            System.out.print("What is the product name? ");
        }
    }
}
