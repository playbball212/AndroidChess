package com.example.ag67440.thebattlefield;

import com.example.ag67440.thebattlefield.constants.ChessPieceConstants;

import java.util.ArrayList;
import java.util.List;

public class BishopAnalyzer extends AlphabetMapper implements PieceAnalyzer {


    private List<String> validMoves = new ArrayList<String>();
    private ChessTileView view1;
    private ChessTileView view2;
    private List<ChessTileView> currentState;
    private boolean foundPiece = false;

    public BishopAnalyzer(List<ChessTileView> chessTileViews, ChessTileView view1, ChessTileView view2) {
        super(chessTileViews);

        this.view1 = view1;
        this.view2 = view2;
        this.currentState = chessTileViews;

    }

    @Override
    public boolean isThisALegalMove() {


            return analyzeBishop();




    }

    private boolean analyzeBishop() {

        int positionNumber = Integer.valueOf(view1.getPositionNumber().substring(0, 1));


        String color;
        if (view1.getTypeOfPiece().contains(ChessPieceConstants.BLACK)) {
            color = ChessPieceConstants.BLACK;
        } else {
            color = ChessPieceConstants.WHITE;
        }
        // If bishop is on A no valid left moves so no need to build

        analyzeLeftDiagonal(color);

        if (!foundPiece) {
            analyzeRightDiagonal(color);
        }

        return foundPiece;
    }



    private void analyzeRightDiagonal(String color) {

        if (!view1.getPositionNumber().substring(1).equalsIgnoreCase("H")) {

            // There is only a left diagonal move if the position is not on A
            if (color.equalsIgnoreCase(ChessPieceConstants.WHITE)) {


                if (Integer.valueOf(view1.getPositionNumber().substring(0, 1)) != 1) {

                    // Check Up Diagonal
                    rightDiagonalUpOrDownPerspective(true , ChessPieceConstants.WHITE);

                    // Check Down Diagonal
                    rightDiagonalUpOrDownPerspective(false , ChessPieceConstants.WHITE);


                } else {
                    rightDiagonalUpOrDownPerspective(true , ChessPieceConstants.WHITE);

                }


            } else if (color.equalsIgnoreCase(ChessPieceConstants.BLACK)) {


                if (!view1.getPositionNumber().substring(1).equalsIgnoreCase("H")) {

                    if (Integer.valueOf(view1.getPositionNumber().substring(0, 1)) != 8) {
                        rightDiagonalUpOrDownPerspective(true ,ChessPieceConstants.BLACK) ;


                        rightDiagonalUpOrDownPerspective(false , ChessPieceConstants.BLACK);
                    } else {
                        rightDiagonalUpOrDownPerspective(true , ChessPieceConstants.BLACK);

                    }

                }

            }

        }
    }

    private void analyzeLeftDiagonal(String color) {

        if (!view1.getPositionNumber().substring(1).equalsIgnoreCase("A")) {


            // There is only a left diagonal move if the position is not on A
            if (color.equalsIgnoreCase(ChessPieceConstants.WHITE)) {


                if (Integer.valueOf(view1.getPositionNumber().substring(0, 1)) != 1) {

                    // Check Up Diagonal
                    leftDiagonalUpOrDownPerspective(true , ChessPieceConstants.WHITE);

                    // Check Down Diagonal 
                    leftDiagonalUpOrDownPerspective(false , ChessPieceConstants.WHITE);


                } else {
                    leftDiagonalUpOrDownPerspective(true , ChessPieceConstants.WHITE);

                }


            } else if (color.equalsIgnoreCase(ChessPieceConstants.BLACK)) {


                if (!view1.getPositionNumber().substring(1).equalsIgnoreCase("A")) {

                    if (Integer.valueOf(view1.getPositionNumber().substring(0, 1)) != 8) {
                        leftDiagonalUpOrDownPerspective(true , ChessPieceConstants.BLACK);


                        leftDiagonalUpOrDownPerspective(false , ChessPieceConstants.BLACK);
                    } else {
                        leftDiagonalUpOrDownPerspective(true , ChessPieceConstants.BLACK);

                    }

                }

            }


        }


    }

    private void leftDiagonalUpOrDownPerspective(boolean upDiagonal , String color) {

        String currentPosition = view1.getPositionNumber();
        String letter = view1.getPositionNumber().substring(1);
        int rangeLetter = alphabetMapping.get(letter);
        int numPosition = Integer.valueOf(currentPosition.substring(0, 1));
        boolean keepSearching = true;
        while (keepSearching) {
            // There could be a bottom left move and a top left move
            try {
                rangeLetter--;
                // Top Left increment pos and decrement letters
                if (upDiagonal) {

                    if(color.equalsIgnoreCase(ChessPieceConstants.WHITE))
                        numPosition++;
                    else
                        numPosition--;
                } else {

                    if(color.equalsIgnoreCase(ChessPieceConstants.WHITE))
                         numPosition--;
                    else
                        numPosition++;
                }


                String validMove = numPosition + alphabet.get(rangeLetter);
                validMoves.add(validMove);
                if (view2.getPositionNumber().equalsIgnoreCase(validMove)) {
                    foundPiece = true;
                    break;
                } else {
                    keepSearching = keepBuildingDiagonal(keepSearching, validMove);
                }

            } catch (Exception e) {
                break;
            }

        }
    }


    private void rightDiagonalUpOrDownPerspective(boolean upDiagonal , String color) {

        String currentPosition = view1.getPositionNumber();
        String letter = view1.getPositionNumber().substring(1);
        int rangeLetter = alphabetMapping.get(letter);
        int numPosition = Integer.valueOf(currentPosition.substring(0, 1));
        boolean keepSearching = true;
        while (keepSearching) {
            // There could be a bottom left move and a top left move
            try {
                rangeLetter++;
                // Top Left increment pos and decrement letters
                if (upDiagonal ) {


                    if(color.equalsIgnoreCase("white"))
                    numPosition++;
                    else
                        numPosition--;


                } else {

                    if(color.equalsIgnoreCase("white"))
                    numPosition--;
                    else
                        numPosition++;
                }


                String validMove = numPosition + alphabet.get(rangeLetter);
                validMoves.add(validMove);
                if (view2.getPositionNumber().equalsIgnoreCase(validMove)) {
                    foundPiece = true;
                    break;
                } else {
                    keepSearching = keepBuildingDiagonal(keepSearching, validMove);
                }

            } catch (Exception e) {
                break;
            }

        }
    }







    /**
     * If the validMove is not the move intended check if it is not empty destroying the diagonal if not empty
     *
     * @param keepSearching
     * @param validMove
     * @return
     */
    private boolean keepBuildingDiagonal(boolean keepSearching, String validMove) {
        for (ChessTileView chessTile : currentState) {

            if (chessTile.getPositionNumber().equalsIgnoreCase(validMove)) {
                if (!chessTile.getTypeOfPiece().equalsIgnoreCase(ChessPieceConstants.EMPTY_PIECE)) {
                    keepSearching = false;
                    break;
                }
            }
        }
        return keepSearching;
    }

    // Build Right


}
