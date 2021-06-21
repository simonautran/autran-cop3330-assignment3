/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Simon Autran
 */
package ex42;
import java.util.*;
public class Person {
    private String firstName;
    private String lastName;
    private String salary;
    public void readPerson(Scanner in) throws FileNotFoundException {
        String str=in.nextLine();
        List<String> infoList = Arrays.asList(str.split(","));
        lastName=infoList.get(0);
        firstName= infoList.get(1);
        salary=infoList.get(2);
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String toString(){
        return String.format("%-15s %-15s %-15s", lastName, firstName,salary);
    }
}
