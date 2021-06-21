/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Simon Autran
 */

package ex41;
import java.util.*;
public class ex41 
{
    public static void main(String[] args) throws IOException 
    {
        Roster peopleList=new Roster();
        File ifp = new File("C:\\Users\\simonautran\\IdeaProjects\\autran-cop3330-assignment3\\src\\main\\java\\ex41\\exercise41_input.txt");
        FileWriter ofp=new FileWriter("C:\\Users\\simonautran\\IdeaProjects\\autran-cop3330-assignment3\\src\\main\\java\\ex41\\exercise41_output.txt");
        Scanner in=new Scanner(ifp);
        peopleList.readInPeople(in);
        peopleList.sortList();
        ofp.write(peopleList.printList());
        ofp.close();
    }
}
