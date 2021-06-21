/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Simon Autran
 */
package ex41;
import java.util.*;
public class Person {
    private String firstName;
    private String lastName;
    public void readPerson(Scanner in) throws FileNotFoundException {
        String line=in.nextLine();
        int commaIndex=line.indexOf(",");
        lastName=line.substring(0,commaIndex);
        firstName=line.substring(commaIndex+2,line.length());
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String toString(){
        return lastName+", "+firstName;
    }
    public static Comparator<Person> COMPARE_BY_NAME = new Comparator<Person>() {
        public int compare(Person one, Person other) {
            return (one.getLastName()+one.getFirstName()+one).compareTo(other.getLastName()+other.getFirstName());
        }
    }
}
