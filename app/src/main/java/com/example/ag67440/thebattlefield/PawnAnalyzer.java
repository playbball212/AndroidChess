package com.example.ag67440.thebattlefield;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class will determine if a white pawn move is legal
 */
public class PawnAnalyzer implements PieceAnalyzer {

    public ArrayList<String> alphabet = new ArrayList<String>();
    public HashMap<String, Integer> alphabetMapping = new HashMap<String, Integer>();


    public PawnAnalyzer(SmartTileView view1, SmartTileView view2) {


        alphabetMapping.put("A", 0);
        alphabetMapping.put("B", 1);
        alphabetMapping.put("C", 2);
        alphabetMapping.put("D", 3);
        alphabetMapping.put("E", 4);
        alphabetMapping.put("F", 5);
        alphabetMapping.put("G", 6);
        alphabetMapping.put("H", 7);


        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("C");
        alphabet.add("D");
        alphabet.add("E");
        alphabet.add("F");
        alphabet.add("G");
        alphabet.add("H");

    }

    @Override
    public boolean isThisALegalMove(SmartTileView view1, SmartTileView view2) {

        int positionNumber = Integer.valueOf(view1.getPositionNumber().substring(0, 1));

        if (view1.getTypeOfPiece().contains(ChessPieceConstants.WHITE)) {
            return whitePawnAnalyzer(view1, view2, positionNumber);
        } else {
            return blackPawnAnalyzer(view1, view2, positionNumber);
        }

    }

    private boolean whitePawnAnalyzer(SmartTileView view1, SmartTileView view2, int positionNumber) {
        // Pawn is able to move two moves
        if (positionNumber == 2) {

            String pos = view1.getPositionNumber();
            String posLetter = view1.getPositionNumber().substring(1);


            // This is a pawn Attack so therefore no need to move further
            boolean pawnAttackSuccess = pawnAttack(ChessPieceConstants.BLACK, view1, view2);
            if(pawnAttackSuccess) {
                return true;
            }

            String validPiecePosition = "4" + posLetter;

            String secondValidPiecePosition = "3" + posLetter;

            if (view2.getPositionNumber().equalsIgnoreCase(validPiecePosition) || view2.getPositionNumber().equalsIgnoreCase(secondValidPiecePosition)) {
                return true;
            }

        } else {

            boolean pawnAttackSuc = pawnAttack(ChessPieceConstants.BLACK, view1, view2);
            if(pawnAttackSuc) {
                return true;
            }


            String pos = view1.getPositionNumber().substring(1);
            int numLetter = Integer.valueOf(view1.getPositionNumber().substring(0, 1));

            String validPiecePosition = "" + (numLetter + 1) + pos;

            if (view2.getPositionNumber().equalsIgnoreCase(validPiecePosition)) {


                return true;


            }

        }
        return false;
    }

    private boolean pawnAttack(String color, SmartTileView view1, SmartTileView view2) {
        // iF ATTACK LETTER TO LEFT AND RIGHT
        if (view2.getTypeOfPiece().contains(color)) {

            // Determine if distance is correct

            // End Pawn can only have one attack
            if (view1.getPositionNumber().contains("A") || view1.getPositionNumber().contains("H")) {

                if (view1.getPositionNumber().contains("A")) {

                    // Only valid Pawn attac k move would be to B and one ahead of its current position number
                    int positionNumber = Integer.valueOf(view1.getPositionNumber().substring(0, 1));

                    String validAttackLoc = (positionNumber + 1) + "B";

                    if (view2.getPositionNumber().equalsIgnoreCase(validAttackLoc)) {
                        return true;
                    } else {
                        return false;
                    }


                } else {

                    // Only valid Pawn attac k move would be to B and one ahead of its current position number
                    int positionNumber = Integer.valueOf(view1.getPositionNumber().substring(0, 1));

                    String validAttackLoc = (positionNumber + 1) + "G";

                    if (view2.getPositionNumber().equalsIgnoreCase(validAttackLoc)) {
                        return true;
                    } else {
                        return false;
                    }
                }

            } else {
                int positionNumber = Integer.valueOf(view1.getPositionNumber().substring(0, 1));

                int key = alphabetMapping.get(view1.getPositionNumber().substring(1));
                int leftPos = positionNumber - 1;
                int rightPos = positionNumber + 1;
                String leftLetter = alphabet.get(leftPos);
                String rightLetter = alphabet.get(rightPos);

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


        }
        else {
            return false;
        }
    }

    private boolean blackPawnAnalyzer(SmartTileView view1, SmartTileView view2, int positionNumber) {
        // Pawn is able to move two moves
        if (positionNumber == 7) {

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

        } else {

            boolean pawnAttackSuc = pawnAttack(ChessPieceConstants.WHITE, view1, view2);
            if(pawnAttackSuc) {
                return true;
            }
            String pos = view1.getPositionNumber().substring(1);
            int numLetter = Integer.valueOf(view1.getPositionNumber().substring(0, 1));

            String validPiecePosition = "" + (numLetter - 1) + pos;

            if (view2.getPositionNumber().equalsIgnoreCase(validPiecePosition)) {


                return true;


            }

        }
        return false;
    }
}
