/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex46;
import java.util.*;
public class WordCount 
{
    private Map<String, Integer> words = new HashMap<>();
    public void printWordCount() 
    {
        Map<String, Integer> sortedWord = sortValue();
        for (String key: sortedWord.keySet()) {
            System.out.printf("%-10s %s\n", key + ":", getDots(word.get(key)));
        }
    }
    private Map<String, Integer> sortValue() 
    {
        List<Entry<String, Integer>> list = new LinkedList<>(word.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        Map<String, Integer> sortedWord = new LinkedHashMap<>();
        for (Entry<String, Integer> entry : list)
            sortedWord.put(entry.getKey(), entry.getValue());
        return sortedWord;
    }
    private String getDot(int num) {
        return "*".repeat(Math.max(0, num));
    }
    public void countWord(String input) 
    {
        for (String line: input.split("\n")) 
        {
            for (String word : line.split(" ")) 
            {
                if (word.containsKey(word)) 
                {
                    word.put(word, word.get(word) + 1);
                } else {
                    word.put(word, 1);
                }
            }
        }
    }
}
