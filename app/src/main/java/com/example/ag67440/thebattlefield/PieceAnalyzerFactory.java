package com.example.ag67440.thebattlefield;

class PieceAnalyzerFactory {


    public static PieceAnalyzer createPieceAnalyzer(SmartTileView view1, SmartTileView view2) {


        if (view1.getTypeOfPiece().contains(ChessPieceConstants.PAWN)) {
            return new PawnAnalyzer(view1, view2);
        }

        return null;
    }


}
