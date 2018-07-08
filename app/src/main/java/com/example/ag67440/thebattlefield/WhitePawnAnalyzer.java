package com.example.ag67440.thebattlefield;

public class WhitePawnAnalyzer implements PieceAnalyzer {
    public WhitePawnAnalyzer(SmartTileView view1, SmartTileView view2) {
    }

    @Override
    public boolean isThisALegalMove(SmartTileView view1, SmartTileView view2) {

        int positionNumber =  Integer.valueOf(view1.getPositionNumber().substring(0,1));

        // Pawn is able to move two moves
        if(positionNumber == 2) {

                String pos = view1.getPositionNumber();


        }
        return false;
    }
}
