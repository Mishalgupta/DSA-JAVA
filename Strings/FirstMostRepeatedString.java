package Strings;

import java.util.*;

public class FirstMostRepeatedString {

    // returns first repeated word
    static String findFirstRepeated(String s) {
        // break string into tokens and then store each string into set
        // if a word appeared before appears again, return the word and break

        String token[] = s.split(" ");

        // hashmap for storing word and its count in sentence
        HashMap<String, Integer> setOfWords = new HashMap<String, Integer>();

        // store all the words of string and the count of word in hashmap

        for (int i = 0; i < token.length; i++) {
            if (setOfWords.containsKey(token[i]))
                setOfWords.put(token[i], setOfWords.get(token[i]) + 1); // word exists
            else
                // insert new word to set
                setOfWords.put(token[i], 1);
        }

        // traverse again from first word of string s
        // to check if count of word is greater than 1

        // either take a new stream or store the words
        // in vector of strings in previous loop
        for (int i = 0; i < token.length; i++) {
            int count = setOfWords.get(token[i]);
            if (count > 1) {
                return token[i];
            }
        }

        return "NoRepetition";
    }

    // driver program
    public static void main(String args[]) {
        String s = "Ravi had been saying that he had been there";
        String firstWord = findFirstRepeated(s);
        if (!firstWord.equals("NoRepetition"))
            System.out.println("First repeated word :: " + firstWord);
        else
            System.out.println("No Repetitionn");
    }

}