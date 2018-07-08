package com.example.ag67440.thebattlefield;

import java.util.List;

class ChessAnalyzer {


    /**
     * Analyze moves based on the current state of the game and the two pieces
     * @param currentState
     * @param view1
     * @param view2
     */
    public static void takeInMovesAndDetermineLegality(List<SmartTileView> currentState, SmartTileView view1, SmartTileView view2) {


        // If two pieces type start with the same letter stop the engine
        String typeofpiecemoveone = view1.getTypeOfPiece();
        String typeofpiecemovetwo = view2.getTypeOfPiece();

        // Empty Pieces
        if(typeofpiecemoveone.length() <= 0  && typeofpiecemovetwo.length() <= 0) {
        }



        else {

            String col1 = typeofpiecemoveone.substring(0,1);
            String col2 = typeofpiecemovetwo.substring(0,1);

            if(col1.equalsIgnoreCase(col2)) {
                // Do Nothing


            }

            else {

                // Based on Type of Piece determine what it can do
                PieceAnalyzer pa = PieceAnalyzerFactory.createPieceAnalyzer( view1 ,  view2);

                view2.setPieceImage(view1.getPieceImage());
                view2.setTypeOfPiece(view1.getTypeOfPiece());
                view2.invalidate();
                view1.setPieceImage(null);
                view1.setTypeOfPiece(ChessPieceConstants.EMPTY_PIECE);
                view1.invalidate();
            }


            // TODO
            // Determine the Type of piece

            // Determine what kind of moves it can make and which direction it can move in legally

            //


        }

    }
}
