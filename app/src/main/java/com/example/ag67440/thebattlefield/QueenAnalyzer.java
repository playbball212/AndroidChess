package com.example.ag67440.thebattlefield;

import android.util.Log;

import com.example.ag67440.thebattlefield.constants.ChessPieceConstants;

import java.util.List;

public class QueenAnalyzer extends AlphabetMapper implements PieceAnalyzer {

    private ChessTileView view1;
    private ChessTileView view2;
    private String letter;
    private int position;
    private boolean foundPiece = false;


    public QueenAnalyzer(List<ChessTileView> currentState, ChessTileView view1, ChessTileView view2) {
        super(currentState);
        this.view1 = view1;
        this.letter = view1.getPositionNumber().substring(1);
        this.position = Integer.valueOf(view1.getPositionNumber().substring(0, 1));
        this.view2 = view2;
    }

    @Override
    public boolean isThisALegalMove() {


        // checkVerticalFile
        checkVerticalFileUpwardsDownwards(true);

        if (!foundPiece)

            checkVerticalFileUpwardsDownwards(false);

        if (!foundPiece)

            checkHorizontalFileLeftRight(true);


        if (!foundPiece)

            checkHorizontalFileLeftRight(false);
        if (!foundPiece)
            checkLeftDiagonalUpDown(true);

        if (!foundPiece)

            checkLeftDiagonalUpDown(false);

        if (!foundPiece)


            checkRightDiagonalUpDown(true);

        if (!foundPiece)

            checkRightDiagonalUpDown(false);


        return foundPiece;
    }

    private void checkRightDiagonalUpDown(boolean b) {

        int rangeNumber = alphabetMapping.get(letter);
        int counter = position;
        boolean keepSearching = true;
        while (keepSearching) {

            try {
                if (b) {
                    counter++;
                } else {
                    counter--;
                }
                rangeNumber++;

                if (view2.getPositionNumber().equalsIgnoreCase(counter + alphabet.get(rangeNumber))) {
                    foundPiece = true;
                    keepSearching = false;
                }
                else {
                    keepSearching = checkCurrentState(counter , alphabet.get(rangeNumber));
                }
            } catch (Exception e) {
                Log.d("Error" , "CHESS ERROR");

                keepSearching = false;
            }
        }
    }

    private void checkLeftDiagonalUpDown(boolean up) {

        int rangeNumber = alphabetMapping.get(letter);
        int counter = position;
        boolean keepSearching = true;
        while (keepSearching) {

            try {
                if (up) {
                    counter++;
                } else {
                    counter--;
                }
                rangeNumber--;
                if (view2.getPositionNumber().equalsIgnoreCase(counter + alphabet.get(rangeNumber))) {
                    foundPiece = true;
                    keepSearching = false;
                }
                else {
                    keepSearching = checkCurrentState(counter , alphabet.get(rangeNumber));
                }
            } catch (Exception e) {
                Log.d("Error" , "CHESS ERROR");
                keepSearching = false;
            }
        }


    }

    private void checkHorizontalFileLeftRight(boolean b) {

        int rangeNumber = alphabetMapping.get(letter);
        boolean keepSearching = true;
        while (keepSearching) {

            try {
                if (b)
                    rangeNumber--;
                else
                    rangeNumber++;


                if (view2.getPositionNumber().equalsIgnoreCase(position + alphabet.get(rangeNumber))) {
                    foundPiece = true;
                    keepSearching = false;
                }
                else {
                    keepSearching = checkCurrentState(position , alphabet.get(rangeNumber));
                }
            } catch (Exception e) {
                keepSearching = false;
            }

        }

    }


    private void checkVerticalFileUpwardsDownwards(boolean upward) {

        int counter = position;
        boolean keepSearching = true;

        while (keepSearching) {

            if (upward) {
                counter++;
            } else {
                counter--;
            }

            try {
                if (upward) {
                    keepSearching = upwardCheck(counter);

                } else {
                    keepSearching = downwardCheck(counter);
                }


            } catch (Exception e) {
                keepSearching = false;
            }

        }


    }

    private boolean downwardCheck(int counter) {
        if (counter < 1) {
            return false;
        } else {
            if (view2.getPositionNumber().equalsIgnoreCase(counter + letter)) {
                foundPiece = true;
                return false;
            }

            return checkCurrentState(counter , letter);
        }


    }



    private boolean upwardCheck(int counter) {
        if (counter > 8) {
            return false;
        } else {
            if (view2.getPositionNumber().equalsIgnoreCase(counter + letter)) {
                foundPiece = true;
                return false;
            }

            return checkCurrentState(counter , letter);
        }

    }
}
