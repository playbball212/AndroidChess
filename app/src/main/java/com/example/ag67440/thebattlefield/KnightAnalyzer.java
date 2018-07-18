package com.example.ag67440.thebattlefield;

public class KnightAnalyzer extends AlphabetMapper implements PieceAnalyzer {

    private ChessTileView view1;
    private ChessTileView view2;
    private int posNumber;
    private int rangeNumber;
    private boolean foundPiece = false;


    public KnightAnalyzer(ChessTileView view1, ChessTileView view2) {
        this.view1 = view1;
        this.view2 = view2;
        posNumber = Integer.valueOf(view1.getPositionNumber().substring(0, 1));
        rangeNumber = alphabetMapping.get(view1.getPositionNumber().substring(1));

    }

    @Override
    public boolean isThisALegalMove() {


        // A valid move could be position
        checkTopLeftMove();

        analyzeDifferentPositions();


        return foundPiece;
    }

    private void analyzeDifferentPositions() {
        if (!foundPiece)
            checkTopRightMove();

        if (!foundPiece)
            checkSideRightMove();

        if (!foundPiece)
            checkSideLeftMove();

        if (!foundPiece)
            checkBottomRightMove();


        if (!foundPiece)
            checkBottomLeftMove();


        if (!foundPiece)
            checkSideRightBottomMove();

        if (!foundPiece)
            checkSideLeftBottomMove();
    }

    private void checkSideLeftBottomMove() {

        try {
            String validMove = (posNumber - 1) + alphabet.get(rangeNumber - 2);
            checkView2ForMatch(validMove);
        } catch (Exception e) {

        }
    }

    private void checkSideRightBottomMove() {

        try {
            String validMove = (posNumber - 1) + alphabet.get(rangeNumber + 2);
            checkView2ForMatch(validMove);
        } catch (Exception e) {

        }
    }

    private void checkBottomLeftMove() {

        try {
            String validMove = (posNumber - 2) + alphabet.get(rangeNumber - 1);
            checkView2ForMatch(validMove);
        } catch (Exception e) {

        }


    }

    private void checkBottomRightMove() {

        try {
            String validMove = (posNumber - 2) + alphabet.get(rangeNumber + 1);
            checkView2ForMatch(validMove);

        } catch (Exception e) {

        }
    }

    private void checkSideLeftMove() {

        try {
            String validMove = (posNumber + 1) + alphabet.get(rangeNumber - 2);
            checkView2ForMatch(validMove);
        } catch (Exception e) {

        }
    }

    private void checkSideRightMove() {

        try {
            String validMove = (posNumber + 1) + alphabet.get(rangeNumber + 2);
            checkView2ForMatch(validMove);
        } catch (Exception e) {

        }
    }

    private void checkTopRightMove() {


        try {
            String validMove = (posNumber + 2) + alphabet.get(rangeNumber + 1);
            checkView2ForMatch(validMove);

        } catch (Exception e) {

        }
    }

    private void checkTopLeftMove() {

        try {
            String validMove = (posNumber + 2) + alphabet.get(rangeNumber - 1);
            checkView2ForMatch(validMove);
        } catch (Exception e) {

        }

    }

    private void checkView2ForMatch(String validMove) {
        if (view2.getPositionNumber().equalsIgnoreCase(validMove)) {
            foundPiece = true;
        }
    }
}
