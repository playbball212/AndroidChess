package com.example.ag67440.thebattlefield;

import android.graphics.Bitmap;

public class ChessPiece {


    public ChessPiece(String pieceType , Bitmap pieceImage , String playerType) {
        this.pieceImage = pieceImage;
        this.pieceType = pieceType;
        this.pieceImage = pieceImage;
    }

    private Bitmap pieceImage;


    private String pieceType;

    private String playerType;


    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }


    public Bitmap getPieceImage() {
        return pieceImage;
    }

    public void setPieceImage(Bitmap pieceImage) {
        this.pieceImage = pieceImage;
    }

    public String getPieceType() {
        return pieceType;
    }

    public void setPieceType(String pieceType) {
        this.pieceType = pieceType;
    }

}
