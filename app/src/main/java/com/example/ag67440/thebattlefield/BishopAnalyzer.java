package com.example.ag67440.thebattlefield;

import java.util.ArrayList;
import java.util.List;

public class BishopAnalyzer extends AlphabetMapper implements PieceAnalyzer {


    private List<String> validMoves = new ArrayList<String>();
    private ChessTileView view1;
    private ChessTileView view2;
    private List<ChessTileView> currentState;

    public BishopAnalyzer(List<ChessTileView> chessTileViews, ChessTileView view1, ChessTileView view2) {
        this.view1 = view1;
        this.view2 = view2;
        this.currentState = chessTileViews;
    }

    @Override
    public boolean isThisALegalMove() {

        // Determine Valid left Moves
        if (view1.getTypeOfPiece().contains("white")) {
            return analyzeWhiteBishop();

        }

        else {
            return false;
        }


    }

    private boolean analyzeWhiteBishop() {

        int positionNumber = Integer.valueOf(view1.getPositionNumber().substring(0,1));


        int rangeNumber = alphabetMapping.get(view1.getPositionNumber().substring(1));

        // If bishop is on A no valid left moves so no need to build

        if(!(view1.getPositionNumber().substring(1).equalsIgnoreCase("A"))) {

            while(!(view1.getPositionNumber().substring(1)).equalsIgnoreCase("A")) {

                // Build out
                try {
                    rangeNumber += 1;
                    String validMove = rangeNumber + alphabet.get(rangeNumber);
                    validMoves.add(validMove);
                }

                catch(Exception e) {

                }


            }
        }

    }


}
