/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Simon Autran
 */
package ex42;
import java.util.*;
public class Roster 
{
    private ArrayList<Person> peopleArrayList=new ArrayList<Person>();
    public void readInPeople(Scanner in) throws FileNotFoundException 
    {
        while(in.hasNextLine()){
            Person person=new PersonEx42();
            person.readPerson(in);
            peopleArrayList.add(person);
        }
    }
    public String printList()
    {
        String str=String.format("%-15s %-15s %-15s\n","Last","First","Salary");
        str+="-------------------------------------\n";
        for(Person person: peopleArrayList){
            str+=person+"\n";
        }
        return str;
    }
}
