package com.example.ag67440.thebattlefield;

import com.example.ag67440.thebattlefield.constants.ChessPieceConstants;

import java.util.List;

public class QueenAnalyzer extends AlphabetMapper implements PieceAnalyzer {

    private List<ChessTileView> currentState;
    private ChessTileView view1;
    private ChessTileView view2;
    private String letter;
    private int position;
    private boolean foundPiece = false;


    public QueenAnalyzer(List<ChessTileView> currentState, ChessTileView view1, ChessTileView view2) {

        this.currentState = currentState;
        this.view1 = view1;
        this.letter = view1.getPositionNumber().substring(1);
        this.position = Integer.valueOf(view1.getPositionNumber().substring(0, 1));
        this.view2 = view2;
    }

    @Override
    public boolean isThisALegalMove() {


        // checkVerticalFile
        checkVerticalFileUpwardsDownwards(true);

        if(!foundPiece)

            checkVerticalFileUpwardsDownwards(false);

        if(!foundPiece)

            checkHorizontalFileLeftRight(true);


        if(!foundPiece)

            checkHorizontalFileLeftRight(false);
        if(!foundPiece)
            checkLeftDiagonalUpDown(true);

        if(!foundPiece)

            checkLeftDiagonalUpDown(false);

        if(!foundPiece)


            checkRightDiagonalUpDown(true);

        if(!foundPiece)

            checkRightDiagonalUpDown(false);


        return foundPiece;
    }

    private void checkRightDiagonalUpDown(boolean b) {

        int rangeNumber = alphabetMapping.get(letter);
        int counter = position;

        while (true) {

            try {
                if (b) {
                    counter++;
                    rangeNumber++;
                } else {
                    counter--;
                    rangeNumber++;
                }
                rangeNumber--;
                if (view2.getPositionNumber().equalsIgnoreCase(counter + alphabet.get(rangeNumber))) {
                    foundPiece = true;
                    break;
                }

                checkCurrentState(counter);
            } catch (Exception e) {

            }
        }
    }

    private void checkLeftDiagonalUpDown(boolean up) {

        int rangeNumber = alphabetMapping.get(letter);
        int counter = position;

        while (true) {

            try {
                if (up) {
                    counter++;
                    rangeNumber--;
                } else {
                    counter--;
                    rangeNumber--;
                }
                rangeNumber--;
                if (view2.getPositionNumber().equalsIgnoreCase(counter + alphabet.get(rangeNumber))) {
                    foundPiece = true;
                    break;
                }

                checkCurrentState(counter);
            } catch (Exception e) {

            }
        }


    }

    private void checkHorizontalFileLeftRight(boolean b) {

        int rangeNumber = alphabetMapping.get(letter);

        while (true) {

            try {
                if (b)
                    rangeNumber--;
                else
                    rangeNumber++;
                if (view2.getPositionNumber().equalsIgnoreCase(position + alphabet.get(rangeNumber))) {
                    foundPiece = true;
                    break;
                }

                checkCurrentState(position);
            } catch (Exception e) {

            }

        }

    }


    private void checkVerticalFileUpwardsDownwards(boolean upward) {

        int counter = position;


        while (true) {

            if (upward) {
                counter++;
            } else {
                counter--;
            }

            try {
                if (upward) {
                    if (upwardCheck(counter)) break;

                } else {
                    downwardCheck(counter);
                }


            } catch (Exception e) {
                break;
            }

        }


    }

    private void downwardCheck(int counter) {
        if (counter < 1) {
            foundPiece = false;
        } else {
            if (view2.getPositionNumber().equalsIgnoreCase(counter + letter)) {
                foundPiece = true;
            }

            checkCurrentState(counter);
        }
    }

    private void checkCurrentState(int counter) {
        for (ChessTileView tileView : currentState) {

            if (tileView.getPositionNumber().equalsIgnoreCase(counter + letter)) {

                if (tileView.getTypeOfPiece().equalsIgnoreCase(ChessPieceConstants.EMPTY_PIECE)) {
                    continue;

                } else {
                    break;
                }
            }


        }
    }

    private boolean upwardCheck(int counter) {
        if (counter > 8) {
            return false;
        } else {
            if (view1.getPositionNumber().equalsIgnoreCase(counter + letter)) {
                foundPiece = true;
                return true;
            }

            checkCurrentState(counter);
        }
        return false;
    }
}
