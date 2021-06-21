/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Simon Autran
 */
package ex42;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class ex42 {
    public static void main(String[] args) throws IOException {
        Roster peopleList=new Roster();
        File ifp = new File("src/main/java/ex42/exercise42_input.txt");
        FileWriter ofp=new FileWriter("src/main/java/ex42/exercise42_output.txt");
        Scanner in=new Scanner(ifp);
        peopleList.readInPeople(in);
        ofp.write(peopleList.printList());
        ofp.close();
    }

}
