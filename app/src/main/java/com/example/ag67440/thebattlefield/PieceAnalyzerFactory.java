package com.example.ag67440.thebattlefield;

import com.example.ag67440.thebattlefield.constants.ChessPieceConstants;

import java.util.List;

class PieceAnalyzerFactory {

    /**
     * Based on the First Piece
     * @param currentState
     * @param view1
     * @param view2
     * @return
     */
    public static PieceAnalyzer createPieceAnalyzer(List<ChessTileView> currentState ,  ChessTileView view1, ChessTileView view2) {


        if (view1.getTypeOfPiece().contains(ChessPieceConstants.PAWN)) {
            return new PawnAnalyzer(view1, view2);
        }
        else if(view1.getTypeOfPiece().contains(ChessPieceConstants.BISHOP)) {
            return new BishopAnalyzer(currentState , view1 , view2);
        }

        else if(view1.getTypeOfPiece().contains(ChessPieceConstants.KNIGHT)) {
            return new KnightAnalyzer( view1 , view2);
        }

        return null;
    }


}
