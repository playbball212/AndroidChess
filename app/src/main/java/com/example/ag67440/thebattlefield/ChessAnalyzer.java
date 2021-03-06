package com.example.ag67440.thebattlefield;

import com.example.ag67440.thebattlefield.constants.ChessPieceConstants;

import java.util.List;

class ChessAnalyzer {


    /**
     * Analyze moves based on the current state of the game and the two pieces
     *
     * @param currentState
     * @param view1
     * @param view2
     */
    public static boolean takeInMovesAndDetermineLegality(List<ChessTileView> currentState, ChessTileView view1, ChessTileView view2) {


        // If two pieces type start with the same letter stop the engine
        String typeofpiecemoveone = view1.getTypeOfPiece();
        String typeofpiecemovetwo = view2.getTypeOfPiece();

        // Empty Pieces
        if (typeofpiecemoveone.length() <= 0 && typeofpiecemovetwo.length() <= 0) {
            return false;
        } else {

            String col1 = typeofpiecemoveone.substring(0, 1);
            String col2 = typeofpiecemovetwo.substring(0, 1);


            // Same Color
            if (col1.equalsIgnoreCase(col2)) {
                // Do Nothing
                return false;

            } else {

                // Based on Type of Piece determine what it can do
                PieceAnalyzer pa = PieceAnalyzerFactory.createPieceAnalyzer(currentState , view1, view2);

                if (pa.isThisALegalMove()) {
                    view2.setPieceImage(view1.getPieceImage());
                    view2.setTypeOfPiece(view1.getTypeOfPiece());
                    view2.invalidate();
                    view1.setPieceImage(null);
                    view1.setTypeOfPiece(ChessPieceConstants.EMPTY_PIECE);
                    view1.invalidate();
                    return true;
                }

                return false;
            }


        }

    }
}
