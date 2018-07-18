package com.example.ag67440.thebattlefield;

import com.example.ag67440.thebattlefield.constants.ChessPieceConstants;

import java.util.List;

public class KingAnalyzer extends AlphabetMapper implements PieceAnalyzer {

    private ChessTileView view1;
    private ChessTileView view2;
    private int position;
    private int rangeNumber;
    private String letter;
    private String color;
    private boolean foundPiece = false;

    public KingAnalyzer(List<ChessTileView> currentState , ChessTileView view1, ChessTileView view2) {
        super(currentState);

        this.view1 = view1;
        this.view2 = view2;

        if(view2.getTypeOfPiece().contains(ChessPieceConstants.WHITE)) {
            color = ChessPieceConstants.WHITE;
        }
        else {
            color = ChessPieceConstants.BLACK;
        }

        letter = view1.getPositionNumber().substring(1);
        position = Integer.valueOf(view1.getPositionNumber().substring(0,1));
        rangeNumber = alphabetMapping.get(letter);

    }

    @Override
    public boolean isThisALegalMove() {


        lookHorizontal(true);
        if(!foundPiece)
        lookHorizontal(false);
        if(!foundPiece)
        lookVertical(color ,  true);
        if(!foundPiece)
        lookVertical(color , false);
        if(!foundPiece)
        lookLeftDiagonals(true);
        if(!foundPiece)
        lookLeftDiagonals(false);

        lookRightDiagonals(true);
        lookRightDiagonals(false);
        return foundPiece;
    }

    private void lookRightDiagonals(boolean b) {

        try {
            int counter = position;

            if (b) {
                counter++;
            } else {
                counter--;
            }
            rangeNumber++;

            if (view2.getPositionNumber().equalsIgnoreCase(counter + alphabet.get(rangeNumber))) {
                foundPiece = true;
            }

        }
        catch(Exception e)  {

        }
    }

    private void lookLeftDiagonals(boolean b) {
        try {
            int counter = position;
            if (b) {
                counter++;
            } else {
                counter--;

            }
            rangeNumber--;

            if (view2.getPositionNumber().equalsIgnoreCase(counter + alphabet.get(rangeNumber))) {
                foundPiece = true;

            }

        }
        catch(Exception e) {

        }

    }

    private void lookVertical(String color , boolean up) {

        try {
            int counter = position;

            if (color.equalsIgnoreCase(ChessPieceConstants.WHITE)) {

                if (up)
                    counter++;
                else
                    counter--;

                checkView2ForMatch(counter);

            } else {
                if (up)
                    counter--;
                else
                    counter++;
                checkView2ForMatch(counter);
            }

        }
        catch(Exception e) {

        }

    }

    private void checkView2ForMatch(int counter) {
        if(view2.getPositionNumber().equalsIgnoreCase(counter + letter)) {
            foundPiece = true;
        }
    }



    private void lookHorizontal(boolean right) {
        if(right)
        rangeNumber++;
        else
            rangeNumber--;
        try {
            if(view2.getPositionNumber().equalsIgnoreCase(position +alphabet.get(rangeNumber) )) {
                foundPiece = true;
            }
        }
        catch(Exception e) {

        }
    }
}
