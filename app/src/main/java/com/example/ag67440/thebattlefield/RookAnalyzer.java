package com.example.ag67440.thebattlefield;

import com.example.ag67440.thebattlefield.constants.ChessPieceConstants;

import java.util.ArrayList;
import java.util.List;

public class RookAnalyzer extends AlphabetMapper implements PieceAnalyzer {


    private ChessTileView view1;
    private ChessTileView view2;
    private int position;
    private int rangeNumber;
    private String color;
    private boolean foundPiece = false;
    private String letter;

    public RookAnalyzer(List<ChessTileView> currentState, ChessTileView view1, ChessTileView view2) {
        super(currentState);
        this.view1 = view1;
        this.view2 = view2;

        if (view1.getTypeOfPiece().contains(ChessPieceConstants.WHITE)) {
            color = ChessPieceConstants.WHITE;
        } else {
            color = ChessPieceConstants.BLACK;
        }
        letter = view1.getPositionNumber().substring(1);
        position = Integer.valueOf(view1.getPositionNumber().substring(0, 1));
        rangeNumber = alphabetMapping.get(view1.getPositionNumber().substring(1));


    }

    @Override
    public boolean isThisALegalMove() {


        analyzeVerticalFile(true);
        return false;
    }



    private void analyzeVerticalFile(boolean upwards) {
        int counter = position;
        boolean keepSearching = true;
        while (keepSearching) {

            try {
                if(upwards) {

                    if(color.equalsIgnoreCase(ChessPieceConstants.WHITE))
                    counter++;

                    else
                        counter--;

                }
                else {

                    if(color.equalsIgnoreCase(ChessPieceConstants.WHITE))
                        counter--;
                    else
                        counter++;


                }
                if (view2.getPositionNumber().equalsIgnoreCase(counter + letter)) {
                    foundPiece = true;
                    keepSearching = false;
                }
                else {
                    checkCurrentState(counter , letter );
                }


            } catch (Exception e) {

            }
        }
    }
}
