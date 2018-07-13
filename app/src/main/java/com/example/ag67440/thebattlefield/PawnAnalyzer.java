package com.example.ag67440.thebattlefield;

import com.example.ag67440.thebattlefield.constants.ChessPieceConstants;

import java.util.List;

/**
 * This class will determine if a white pawn move is legal
 */
public class PawnAnalyzer extends AlphabetMapper  implements PieceAnalyzer  {


    private ChessTileView view1;
    private ChessTileView view2;

    public PawnAnalyzer(ChessTileView view1, ChessTileView view2) {

        this.view1 = view1;
        this.view2 = view2;

    }


    @Override
    public boolean isThisALegalMove() {

        return determineIfAttackingPawnIsWhiteOrBlack(view1, view2);

    }

    /**
     * Based on the color return the Correct Pawn Analayzer
     * @param view1
     * @param view2
     * @return
     */
    private boolean determineIfAttackingPawnIsWhiteOrBlack(ChessTileView view1, ChessTileView view2) {
        int positionNumber = Integer.valueOf(view1.getPositionNumber().substring(0, 1));

        if (view1.getTypeOfPiece().contains(ChessPieceConstants.WHITE)) {
            return whitePawnAnalyzer(view1, view2, positionNumber);
        } else {
            return blackPawnAnalyzer(view1, view2, positionNumber);
        }
    }

    private boolean whitePawnAnalyzer(ChessTileView view1, ChessTileView view2, int positionNumber) {
        // Pawn is able to move two moves
        if (positionNumber == 2) {

            if (initalPawnPossibleTwoMoves(view1, view2)) return true;

        } else {

            if (normalPawnMove(view1, view2)) return true;

        }
        return false;
    }

    private boolean normalPawnMove(ChessTileView view1, ChessTileView view2) {
        boolean pawnAttackSuc = pawnAttack(ChessPieceConstants.BLACK, view1, view2);
        if(pawnAttackSuc) {
            return true;
        }

        // Vertical Movement should only contain empty piece in second view
        String pos = view1.getPositionNumber().substring(1);
        int numLetter = Integer.valueOf(view1.getPositionNumber().substring(0, 1));

        String validPiecePosition = "" + (numLetter + 1) + pos;

        if (view2.getPositionNumber().equalsIgnoreCase(validPiecePosition) && view2.getTypeOfPiece().contains(ChessPieceConstants.EMPTY_PIECE)) {


            return true;


        }
        return false;
    }

    private boolean initalPawnPossibleTwoMoves(ChessTileView view1, ChessTileView view2) {
        String pos = view1.getPositionNumber();
        String posLetter = view1.getPositionNumber().substring(1);


        // This is a pawn Attack so therefore no need to move further
        boolean pawnAttackSuccess = pawnAttack(ChessPieceConstants.BLACK, view1, view2);
        if(pawnAttackSuccess) {
            return true;
        }
        // VERTICAL MOVEMENT UP SHOULD ONLY BE TO AN EMPTY PIECE
        String validPiecePosition = "4" + posLetter;

        String secondValidPiecePosition = "3" + posLetter;

        if (view2.getPositionNumber().equalsIgnoreCase(validPiecePosition) || view2.getPositionNumber().equalsIgnoreCase(secondValidPiecePosition)) {
            if(view2.getTypeOfPiece().contains(ChessPieceConstants.EMPTY_PIECE)) {
                return true;
            }
        }
        return false;
    }

    private boolean pawnAttack(String color, ChessTileView view1, ChessTileView view2) {
        // iF ATTACK LETTER TO LEFT AND RIGHT
        return checkOppositeColorForAttack(color, view1, view2);
    }

    private boolean checkOppositeColorForAttack(String color, ChessTileView view1, ChessTileView view2) {
        if (view2.getTypeOfPiece().contains(color)) {
            return determineIfPawnsAreAtTheEnd(color, view1, view2);


        }
        else {
            return false;
        }
    }

    private boolean determineIfPawnsAreAtTheEnd(String color, ChessTileView view1, ChessTileView view2) {
        // Determine if distance is correct

        // End Pawn can only have one attack
        if (view1.getPositionNumber().contains("A") || view1.getPositionNumber().contains("H")) {

            if (view1.getPositionNumber().contains("A")) {
                return pawnAPosAttack(color, view1, view2);


            } else {
                return pawnGPosAttack(color , view1, view2);


            }

        } else {
            return normalPawnAttackBothSides(color, view1, view2);
        }
    }

    private boolean normalPawnAttackBothSides(String color, ChessTileView view1, ChessTileView view2) {
        int positionNumber = Integer.valueOf(view1.getPositionNumber().substring(0, 1));

        int key = alphabetMapping.get(view1.getPositionNumber().substring(1));
        int leftPos = positionNumber - 1;
        int rightPos = positionNumber + 1;
        String leftLetter = alphabet.get(key-1);
        String rightLetter = alphabet.get(key+1);

        if(color.equalsIgnoreCase(ChessPieceConstants.BLACK)) {
            leftLetter = rightPos + leftLetter ;
            rightLetter = rightPos + rightLetter  ;
        }
        else {
            leftLetter = leftPos + leftLetter  ;
            rightLetter = leftPos +rightLetter  ;
        }
        if (view2.getPositionNumber().equalsIgnoreCase(leftLetter) || view2.getPositionNumber().equalsIgnoreCase(rightLetter)) {
            return true;
        }

        return false;
    }

    private boolean pawnGPosAttack(String color , ChessTileView view1, ChessTileView view2) {
        // Only valid Pawn attack move would be to G and one ahead of its current position number
        int positionNumber = Integer.valueOf(view1.getPositionNumber().substring(0, 1));

        String validAttackLoc = null;
        if(color.equalsIgnoreCase("black"))   validAttackLoc = (positionNumber + 1) + "G";

        else
            validAttackLoc = (positionNumber - 1) + "G";

        if (view2.getPositionNumber().equalsIgnoreCase(validAttackLoc)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean pawnAPosAttack(String color, ChessTileView view1, ChessTileView view2) {
        // Only valid Pawn attac k move would be to B and one ahead of its current position number
        int positionNumber = Integer.valueOf(view1.getPositionNumber().substring(0, 1));

        String validAttackLoc = null;

        if(color.equalsIgnoreCase("black"))   validAttackLoc = (positionNumber + 1) + "B";
        else validAttackLoc = (positionNumber - 1) + "B";

        if (view2.getPositionNumber().equalsIgnoreCase(validAttackLoc)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean blackPawnAnalyzer(ChessTileView view1, ChessTileView view2, int positionNumber) {
        // Pawn is able to move two moves
        if (positionNumber == 7) {

            if (blackDoubleMovePossible(view1, view2)) return true;

        } else {

            if (normalBlackMove(view1, view2)) return true;

        }
        return false;
    }

    private boolean normalBlackMove(ChessTileView view1, ChessTileView view2) {
        boolean pawnAttackSuc = pawnAttack(ChessPieceConstants.WHITE, view1, view2);
        if(pawnAttackSuc) {
            return true;
        }
        String pos = view1.getPositionNumber().substring(1);
        int numLetter = Integer.valueOf(view1.getPositionNumber().substring(0, 1));

        String validPiecePosition = "" + (numLetter - 1) + pos;

        if (view2.getPositionNumber().equalsIgnoreCase(validPiecePosition)  && view2.getTypeOfPiece().contains(ChessPieceConstants.EMPTY_PIECE)) {


            return true;


        }
        return false;
    }

    private boolean blackDoubleMovePossible(ChessTileView view1, ChessTileView view2) {
        boolean pawnAttackSuc = pawnAttack(ChessPieceConstants.WHITE, view1, view2);
        if(pawnAttackSuc) {
            return true;
        }

        String pos = view1.getPositionNumber();
        String posLetter = view1.getPositionNumber().substring(1);

        String validPiecePosition = "6" + posLetter;

        String secondValidPiecePosition = "5" + posLetter;

        if (view2.getPositionNumber().equalsIgnoreCase(validPiecePosition) || view2.getPositionNumber().equalsIgnoreCase(secondValidPiecePosition)) {
            return true;
        }
        return false;
    }
}
