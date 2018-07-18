package com.example.ag67440.thebattlefield;

import com.example.ag67440.thebattlefield.constants.ChessPieceConstants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AlphabetMapper {



    public List<ChessTileView> currentState;

    public  ArrayList<String> alphabet = new ArrayList<String>();
    public ArrayList<Integer> validMoves = new ArrayList<Integer>();

    public HashMap<String, Integer> getAlphabetMapping() {
        return alphabetMapping;
    }

    public   HashMap<String, Integer> alphabetMapping = new HashMap<String, Integer>();

    public AlphabetMapper(List<ChessTileView> currentState) {
        alphabetMapping.put("A", 0);
        alphabetMapping.put("B", 1);
        alphabetMapping.put("C", 2);
        alphabetMapping.put("D", 3);
        alphabetMapping.put("E", 4);
        alphabetMapping.put("F", 5);
        alphabetMapping.put("G", 6);
        alphabetMapping.put("H", 7);

        validMoves.add(1);
        validMoves.add(2);
        validMoves.add(3);
        validMoves.add(4);
        validMoves.add(5);
        validMoves.add(6);
        validMoves.add(7);
        validMoves.add(8);

        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("C");
        alphabet.add("D");
        alphabet.add("E");
        alphabet.add("F");
        alphabet.add("G");
        alphabet.add("H");

        this.currentState = currentState;
    }


    public boolean checkCurrentState(int counter , String letter) {
        for (ChessTileView tileView : currentState) {

            if (tileView.getPositionNumber().equalsIgnoreCase(counter + letter)) {

                if (tileView.getTypeOfPiece().equalsIgnoreCase(ChessPieceConstants.EMPTY_PIECE)) {
                    return true;

                } else {
                    return false;
                }
            }


        }

        return false;
    }



}
