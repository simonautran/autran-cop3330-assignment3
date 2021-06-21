
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Simon Autran
 */
package ex44;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.*;
import java.util.ArrayList;
public class ObjectManager 
{
    private ArrayList<Item> itemArrayList=new ArrayList<Item>();
    public void readItems() throws FileNotFoundException 
    {
        File input=new File("src/main/java/ex44/exercise44_input.json");
        JsonElement fileElement=JsonParser.parseReader(new FileReader(input));
        JsonObject fileObject=fileElement.getAsJsonObject();
        JsonArray jArray=fileObject.get("products").getAsJsonArray();
        for(JsonElement productElement: jArray){
            Item newItem=new Item();
            JsonObject productJsonObject=productElement.getAsJsonObject();
            newItem.name=productJsonObject.get("name").getAsString();
            newItem.price=productJsonObject.get("price").getAsDouble();
            newItem.quantity=productJsonObject.get("quantity").getAsInt();
            itemArrayList.add(newItem);
        }
    }
    public boolean findItem(String name)
    {
        for(Item temp:itemArrayList){
            if(temp.name.equalsIgnoreCase(name)){
                System.out.println("Name: "+ temp.name);
                System.out.println("Price: "+ temp.price);
                System.out.println("Quantity: "+ temp.quantity);
                return true;
            }
        }
        return false;
    }
}
