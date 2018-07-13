package com.example.ag67440.thebattlefield;

import java.util.ArrayList;
import java.util.HashMap;

public class AlphabetMapper {

    private static AlphabetMapper instance = null;


    public ArrayList<String> getAlphabet() {
        return alphabet;
    }

    public  ArrayList<String> alphabet = new ArrayList<String>();


    public HashMap<String, Integer> getAlphabetMapping() {
        return alphabetMapping;
    }

    public   HashMap<String, Integer> alphabetMapping = new HashMap<String, Integer>();

    public AlphabetMapper() {
        alphabetMapping.put("A", 0);
        alphabetMapping.put("B", 1);
        alphabetMapping.put("C", 2);
        alphabetMapping.put("D", 3);
        alphabetMapping.put("E", 4);
        alphabetMapping.put("F", 5);
        alphabetMapping.put("G", 6);
        alphabetMapping.put("H", 7);


        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("C");
        alphabet.add("D");
        alphabet.add("E");
        alphabet.add("F");
        alphabet.add("G");
        alphabet.add("H");
    }


    public  AlphabetMapper getAlphabetMapper() {
        if( instance == null) {
            instance = new AlphabetMapper();

        }
       return instance;
    }

}
