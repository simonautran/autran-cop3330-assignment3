/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Simon Autran
 */
package ex41;
import java.util.*;

public class Roster 
{
    private ArrayList<Person> peopleArrayList=new ArrayList<Person>();

    public void readInPeople(Scanner in) throws FileNotFoundException {
        while(in.hasNextLine()){
            Person person=new Person();
            person.readPerson(in);
            peopleArrayList.add(person);
        }
    }
    public void sortList()
    {
        Collections.sort(peopleArrayList,Person.COMPARE_BY_NAME);
    }
    public String printList()
    {
        String str="Total of "+peopleArrayList.size()+" names\n"+"--------------------------------------\n";
        for(Person person: peopleArrayList){
            str+=person+"\n";
        }
        return str;
    }
}
