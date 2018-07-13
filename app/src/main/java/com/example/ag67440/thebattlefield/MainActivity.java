package com.example.ag67440.thebattlefield;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.ag67440.thebattlefield.constants.ChessPieceConstants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ChessTileView.CommunicateBackToActivity {

    private FrameLayout f1;
    private FrameLayout f2;
    private FrameLayout f3;

    private int whiteTurn = 2;

    private List<ChessTileView> currentState = new ArrayList<ChessTileView>();
    private LinkedHashSet<ChessTileView> currentMoves = new LinkedHashSet<ChessTileView>();

    private FrameLayout f4;
    private FrameLayout f5;
    private FrameLayout f6;

    private FrameLayout f7;
    private FrameLayout f8;


    private FrameLayout f9;
    private FrameLayout f10;
    private FrameLayout f11;

    private FrameLayout f12;
    private FrameLayout f13;
    private FrameLayout f14;

    private FrameLayout f15;
    private FrameLayout f16;


    private FrameLayout f17;
    private FrameLayout f18;
    private FrameLayout f19;

    private FrameLayout f20;
    private FrameLayout f21;
    private FrameLayout f22;

    private FrameLayout f23;
    private FrameLayout f24;


    private FrameLayout f25;
    private FrameLayout f26;
    private FrameLayout f27;

    private FrameLayout f28;
    private FrameLayout f29;
    private FrameLayout f30;

    private FrameLayout f31;
    private FrameLayout f32;


    private FrameLayout f33;
    private FrameLayout f34;
    private FrameLayout f35;

    private FrameLayout f36;
    private FrameLayout f37;
    private FrameLayout f38;

    private FrameLayout f39;
    private FrameLayout f40;


    private FrameLayout f41;
    private FrameLayout f42;
    private FrameLayout f43;

    private FrameLayout f44;
    private FrameLayout f45;
    private FrameLayout f46;

    private FrameLayout f47;
    private FrameLayout f48;


    private FrameLayout f49;
    private FrameLayout f50;
    private FrameLayout f51;

    private FrameLayout f52;
    private FrameLayout f53;
    private FrameLayout f54;

    private FrameLayout f55;
    private FrameLayout f56;


    private FrameLayout f57;
    private FrameLayout f58;
    private FrameLayout f59;

    private FrameLayout f60;
    private FrameLayout f61;
    private FrameLayout f62;

    private FrameLayout f63;
    private FrameLayout f64;


    private Paint player1;
    private Paint player2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f1 = (FrameLayout) findViewById(R.id.f1);

        player1 = new Paint();
        player1.setColor(Color.BLUE);
        player2 = new Paint();
        player2.setColor(Color.GREEN);


        f2 = (FrameLayout) findViewById(R.id.f2);

        f3 = (FrameLayout) findViewById(R.id.f3);

        f4 = (FrameLayout) findViewById(R.id.f4);

        f5 = (FrameLayout) findViewById(R.id.f5);

        f6 = (FrameLayout) findViewById(R.id.f6);

        f7 = (FrameLayout) findViewById(R.id.f7);

        f8 = (FrameLayout) findViewById(R.id.f8);


        f9 = (FrameLayout) findViewById(R.id.f9);

        f10 = (FrameLayout) findViewById(R.id.f10);

        f11 = (FrameLayout) findViewById(R.id.f11);

        f12 = (FrameLayout) findViewById(R.id.f12);

        f13 = (FrameLayout) findViewById(R.id.f13);

        f14 = (FrameLayout) findViewById(R.id.f14);

        f15 = (FrameLayout) findViewById(R.id.f15);

        f16 = (FrameLayout) findViewById(R.id.f16);


        f17 = (FrameLayout) findViewById(R.id.f17);

        f18 = (FrameLayout) findViewById(R.id.f18);

        f19 = (FrameLayout) findViewById(R.id.f19);

        f20 = (FrameLayout) findViewById(R.id.f20);

        f21 = (FrameLayout) findViewById(R.id.f21);

        f22 = (FrameLayout) findViewById(R.id.f22);

        f23 = (FrameLayout) findViewById(R.id.f23);

        f24 = (FrameLayout) findViewById(R.id.f24);


        f25 = (FrameLayout) findViewById(R.id.f25);

        f26 = (FrameLayout) findViewById(R.id.f26);

        f27 = (FrameLayout) findViewById(R.id.f27);

        f28 = (FrameLayout) findViewById(R.id.f28);

        f29 = (FrameLayout) findViewById(R.id.f29);

        f30 = (FrameLayout) findViewById(R.id.f30);

        f31 = (FrameLayout) findViewById(R.id.f31);

        f32 = (FrameLayout) findViewById(R.id.f32);


        f33 = (FrameLayout) findViewById(R.id.f33);

        f34 = (FrameLayout) findViewById(R.id.f34);

        f35 = (FrameLayout) findViewById(R.id.f35);

        f36 = (FrameLayout) findViewById(R.id.f36);

        f37 = (FrameLayout) findViewById(R.id.f37);

        f38 = (FrameLayout) findViewById(R.id.f38);

        f39 = (FrameLayout) findViewById(R.id.f39);

        f40 = (FrameLayout) findViewById(R.id.f40);


        f41 = (FrameLayout) findViewById(R.id.f41);

        f42 = (FrameLayout) findViewById(R.id.f42);

        f43 = (FrameLayout) findViewById(R.id.f43);

        f44 = (FrameLayout) findViewById(R.id.f44);

        f45 = (FrameLayout) findViewById(R.id.f45);

        f46 = (FrameLayout) findViewById(R.id.f46);

        f47 = (FrameLayout) findViewById(R.id.f47);

        f48 = (FrameLayout) findViewById(R.id.f48);


        f49 = (FrameLayout) findViewById(R.id.f49);

        f50 = (FrameLayout) findViewById(R.id.f50);

        f51 = (FrameLayout) findViewById(R.id.f51);

        f52 = (FrameLayout) findViewById(R.id.f52);

        f53 = (FrameLayout) findViewById(R.id.f53);

        f54 = (FrameLayout) findViewById(R.id.f54);

        f55 = (FrameLayout) findViewById(R.id.f55);

        f56 = (FrameLayout) findViewById(R.id.f56);


        f57 = (FrameLayout) findViewById(R.id.f57);

        f58 = (FrameLayout) findViewById(R.id.f58);

        f59 = (FrameLayout) findViewById(R.id.f59);

        f60 = (FrameLayout) findViewById(R.id.f60);

        f61 = (FrameLayout) findViewById(R.id.f61);

        f62 = (FrameLayout) findViewById(R.id.f62);

        f63 = (FrameLayout) findViewById(R.id.f63);

        f64 = (FrameLayout) findViewById(R.id.f64);


        // Row 1 Black Rook
        Bitmap blackRook = getBitmapByPieceName("blackrook", this);
        ChessTileView tileView = new ChessTileView(f1.getContext(), player1, blackRook, this, "8A", ChessPieceConstants.BLACK_ROOK);
        currentState.add(tileView);

        // Row 1 Black Knight
        Bitmap blackKnight = getBitmapByPieceName("blackknight", this);
        ChessTileView tileView2 = new ChessTileView(f2.getContext(), player2, blackKnight, this, "8B", ChessPieceConstants.BLACK_KNIGHT);
        currentState.add(tileView2);

        // Row 1 Black Bishop
        Bitmap blackBishop = getBitmapByPieceName("blackbishop", this);
        ChessTileView tileView3 = new ChessTileView(f3.getContext(), player1, blackBishop, this, "8C", ChessPieceConstants.BLACK_BISHOP);
        currentState.add(tileView3);

        // Row 1 Black Queen
        Bitmap blackQueen = getBitmapByPieceName("blackqueen", this);
        ChessTileView tileView4 = new ChessTileView(f4.getContext(), player2, blackQueen, this, "8D", ChessPieceConstants.BLACK_QUEEN);
        currentState.add(tileView4);

        // Row 1 Black King
        Bitmap blackKing = getBitmapByPieceName("blackKing", this);
        ChessTileView tileView5 = new ChessTileView(f5.getContext(), player1, blackKing, this, "8E", ChessPieceConstants.BLACK_KING);
        currentState.add(tileView5);


        ChessTileView tileView6 = new ChessTileView(f6.getContext(), player2, blackBishop, this, "8F", ChessPieceConstants.BLACK_BISHOP);
        currentState.add(tileView6);

        ChessTileView tileView7 = new ChessTileView(f7.getContext(), player1, blackKnight, this, "8G", ChessPieceConstants.BLACK_KNIGHT);
        currentState.add(tileView7);

        ChessTileView tileView8 = new ChessTileView(f8.getContext(), player2, blackRook, this, "8H", ChessPieceConstants.BLACK_ROOK);
        currentState.add(tileView8);


        // Row 2
        Bitmap blackpawn = getBitmapByPieceName("blackpawn", this);

        ChessTileView tileView9 = new ChessTileView(f9.getContext(), player2, blackpawn, this, "7A", ChessPieceConstants.BLACK_PAWN);
        currentState.add(tileView9);

        ChessTileView tileView10 = new ChessTileView(f10.getContext(), player1, blackpawn, this, "7B", ChessPieceConstants.BLACK_PAWN);
        currentState.add(tileView10);

        ChessTileView tileView11 = new ChessTileView(f11.getContext(), player2, blackpawn, this, "7C", ChessPieceConstants.BLACK_PAWN);
        currentState.add(tileView11);

        ChessTileView tileView12 = new ChessTileView(f12.getContext(), player1, blackpawn, this, "7D", ChessPieceConstants.BLACK_PAWN);
        currentState.add(tileView12);

        ChessTileView tileView13 = new ChessTileView(f13.getContext(), player2, blackpawn, this, "7E", ChessPieceConstants.BLACK_PAWN);
        currentState.add(tileView13);

        ChessTileView tileView14 = new ChessTileView(f14.getContext(), player1, blackpawn, this, "7F", ChessPieceConstants.BLACK_PAWN);
        currentState.add(tileView14);

        ChessTileView tileView15 = new ChessTileView(f15.getContext(), player2, blackpawn, this, "7G", ChessPieceConstants.BLACK_PAWN);
        currentState.add(tileView15);
        ChessTileView tileView16 = new ChessTileView(f16.getContext(), player1, blackpawn, this, "7H", ChessPieceConstants.BLACK_PAWN);
        currentState.add(tileView16);


        // Row 3
        ChessTileView tileView17 = new ChessTileView(f17.getContext(), player1, null, this, "6A", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView17);

        ChessTileView tileView18 = new ChessTileView(f18.getContext(), player2, null, this, "6B", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView18);

        ChessTileView tileView19 = new ChessTileView(f19.getContext(), player1, null, this, "6C", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView19);

        ChessTileView tileView20 = new ChessTileView(f20.getContext(), player2, null, this, "6D", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView20);

        ChessTileView tileView21 = new ChessTileView(f21.getContext(), player1, null, this, "6E", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView21);

        ChessTileView tileView22 = new ChessTileView(f22.getContext(), player2, null, this, "6F", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView22);

        ChessTileView tileView23 = new ChessTileView(f23.getContext(), player1, null, this, "6G", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView23);

        ChessTileView tileView24 = new ChessTileView(f24.getContext(), player2, null, this, "6H", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView24);


        // Row 4
        ChessTileView tileView25 = new ChessTileView(f25.getContext(), player2, null, this, "5A", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView25);

        ChessTileView tileView26 = new ChessTileView(f26.getContext(), player1, null, this, "5B", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView26);

        ChessTileView tileView27 = new ChessTileView(f27.getContext(), player2, null, this, "5C", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView27);

        ChessTileView tileView28 = new ChessTileView(f28.getContext(), player1, null, this, "5D", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView28);

        ChessTileView tileView29 = new ChessTileView(f29.getContext(), player2, null, this, "5E", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView29);

        ChessTileView tileView30 = new ChessTileView(f30.getContext(), player1, null, this, "5F", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView30);

        ChessTileView tileView31 = new ChessTileView(f31.getContext(), player2, null, this, "5G", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView31);

        ChessTileView tileView32 = new ChessTileView(f32.getContext(), player1, null, this, "5H", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView32);


        // Row 5
        ChessTileView tileView33 = new ChessTileView(f33.getContext(), player1, null, this, "4A", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView33);

        ChessTileView tileView34 = new ChessTileView(f34.getContext(), player2, null, this, "4B", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView34);

        ChessTileView tileView35 = new ChessTileView(f35.getContext(), player1, null, this, "4C", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView35);

        ChessTileView tileView36 = new ChessTileView(f36.getContext(), player2, null, this, "4D", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView36);

        ChessTileView tileView37 = new ChessTileView(f37.getContext(), player1, null, this, "4E", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView37);

        ChessTileView tileView38 = new ChessTileView(f38.getContext(), player2, null, this, "4F", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView38);

        ChessTileView tileView39 = new ChessTileView(f39.getContext(), player1, null, this, "4G", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView39);

        ChessTileView tileView40 = new ChessTileView(f40.getContext(), player2, null, this, "4H", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView40);


        // Row 6
        ChessTileView tileView41 = new ChessTileView(f41.getContext(), player2, null, this, "3A", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView41);

        ChessTileView tileView42 = new ChessTileView(f42.getContext(), player1, null, this, "3B", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView42);

        ChessTileView tileView43 = new ChessTileView(f43.getContext(), player2, null, this, "3C", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView43);

        ChessTileView tileView44 = new ChessTileView(f44.getContext(), player1, null, this, "3D", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView44);

        ChessTileView tileView45 = new ChessTileView(f45.getContext(), player2, null, this, "3E", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView45);

        ChessTileView tileView46 = new ChessTileView(f46.getContext(), player1, null, this, "3F", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView46);

        ChessTileView tileView47 = new ChessTileView(f47.getContext(), player2, null, this, "3G", ChessPieceConstants.EMPTY_PIECE);
        currentState.add(tileView47);

        ChessTileView tileView48 = new ChessTileView(f48.getContext(), player1, null, this, "3H", ChessPieceConstants.EMPTY_PIECE);


        Bitmap whitepawn = getBitmapByPieceName("whitepawn", this);

        // Row 7
        ChessTileView tileView49 = new ChessTileView(f49.getContext(), player1, whitepawn, this, "2A", ChessPieceConstants.WHITE_PAWN);
        currentState.add(tileView49);

        ChessTileView tileView50 = new ChessTileView(f50.getContext(), player2, whitepawn, this, "2B", ChessPieceConstants.WHITE_PAWN);
        currentState.add(tileView50);

        ChessTileView tileView51 = new ChessTileView(f51.getContext(), player1, whitepawn, this, "2C", ChessPieceConstants.WHITE_PAWN);
        currentState.add(tileView51);

        ChessTileView tileView52 = new ChessTileView(f52.getContext(), player2, whitepawn, this, "2D", ChessPieceConstants.WHITE_PAWN);
        currentState.add(tileView52);

        ChessTileView tileView53 = new ChessTileView(f53.getContext(), player1, whitepawn, this, "2E", ChessPieceConstants.WHITE_PAWN);
        currentState.add(tileView53);

        ChessTileView tileView54 = new ChessTileView(f54.getContext(), player2, whitepawn, this, "2F", ChessPieceConstants.WHITE_PAWN);
        currentState.add(tileView54);

        ChessTileView tileView55 = new ChessTileView(f55.getContext(), player1, whitepawn, this, "2G", ChessPieceConstants.WHITE_PAWN);
        currentState.add(tileView55);

        ChessTileView tileView56 = new ChessTileView(f56.getContext(), player2, whitepawn, this, "2H", ChessPieceConstants.WHITE_PAWN);
        currentState.add(tileView56);


        // Row 8 white castle
        Bitmap whiteRook = getBitmapByPieceName("whiterook", this);
        Bitmap whitequeen = getBitmapByPieceName("whitequeen", this);

        ChessTileView tileView57 = new ChessTileView(f57.getContext(), player2, whiteRook, this, "1A", ChessPieceConstants.WHITE_ROOK);
        currentState.add(tileView57);


        // White Knight
        Bitmap whiteknight = getBitmapByPieceName("whiteknight", this);

        ChessTileView tileView58 = new ChessTileView(f58.getContext(), player1, whiteknight, this, "1B", ChessPieceConstants.WHITE_KNIGHT);
        currentState.add(tileView58);


        // White Bishop
        Bitmap whitebishop = getBitmapByPieceName("whitebishop", this);

        ChessTileView tileView59 = new ChessTileView(f59.getContext(), player2, whitebishop, this, "1C", ChessPieceConstants.WHITE_BISHOP);
        currentState.add(tileView59);


        //White King
        Bitmap whiteking = getBitmapByPieceName("whiteking", this);

        ChessTileView tileView60 = new ChessTileView(f60.getContext(), player1, whitequeen, this, "1D", ChessPieceConstants.WHITE_QUEEN);
        currentState.add(tileView60);

        // White Queen

        ChessTileView tileView61 = new ChessTileView(f61.getContext(), player2, whiteking, this, "1E", ChessPieceConstants.WHITE_KING);
        currentState.add(tileView61);

        //
        ChessTileView tileView62 = new ChessTileView(f62.getContext(), player1, whitebishop, this, "1F", ChessPieceConstants.WHITE_QUEEN);
        currentState.add(tileView62);

        ChessTileView tileView63 = new ChessTileView(f63.getContext(), player2, whiteknight, this, "1G", ChessPieceConstants.WHITE_KNIGHT);
        currentState.add(tileView63);

        ChessTileView tileView64 = new ChessTileView(f64.getContext(), player1, whiteRook, this, "1H", ChessPieceConstants.WHITE_ROOK);
        currentState.add(tileView64);


        f1.addView(tileView);

        f2.addView(tileView2);
        f3.addView(tileView3);
        f4.addView(tileView4);
        f5.addView(tileView5);
        f6.addView(tileView6);
        f7.addView(tileView7);
        f8.addView(tileView8);


        f9.addView(tileView9);

        f10.addView(tileView10);
        f11.addView(tileView11);
        f12.addView(tileView12);
        f13.addView(tileView13);
        f14.addView(tileView14);
        f15.addView(tileView15);
        f16.addView(tileView16);


        f17.addView(tileView17);

        f18.addView(tileView18);
        f19.addView(tileView19);
        f20.addView(tileView20);
        f21.addView(tileView21);
        f22.addView(tileView22);
        f23.addView(tileView23);
        f24.addView(tileView24);

        f25.addView(tileView25);

        f26.addView(tileView26);
        f27.addView(tileView27);
        f28.addView(tileView28);
        f29.addView(tileView29);
        f30.addView(tileView30);
        f31.addView(tileView31);
        f32.addView(tileView32);


        f33.addView(tileView33);

        f34.addView(tileView34);
        f35.addView(tileView35);
        f36.addView(tileView36);
        f37.addView(tileView37);
        f38.addView(tileView38);
        f39.addView(tileView39);
        f40.addView(tileView40);


        f41.addView(tileView41);

        f42.addView(tileView42);
        f43.addView(tileView43);
        f44.addView(tileView44);
        f45.addView(tileView45);
        f46.addView(tileView46);
        f47.addView(tileView47);
        f48.addView(tileView48);


        f49.addView(tileView49);

        f50.addView(tileView50);
        f51.addView(tileView51);
        f52.addView(tileView52);
        f53.addView(tileView53);
        f54.addView(tileView54);
        f55.addView(tileView55);
        f56.addView(tileView56);


        f57.addView(tileView57);

        f58.addView(tileView58);
        f59.addView(tileView59);
        f60.addView(tileView60);
        f61.addView(tileView61);
        f62.addView(tileView62);
        f63.addView(tileView63);
        f64.addView(tileView64);


    }


    public Bitmap getBitmapByPieceName(String pieceName, Context context) {


        if (pieceName.equalsIgnoreCase("blackpawn")) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.blackpawn);

        } else if (pieceName.equalsIgnoreCase("whitepawn")) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.whitepawntiny);

        } else if (pieceName.equalsIgnoreCase("blackbishop")) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.blackbishop);

        } else if (pieceName.equalsIgnoreCase("whitebishop")) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.whitebishop);

        } else if (pieceName.equalsIgnoreCase("whiteknight")) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.whiteknight);

        } else if (pieceName.equalsIgnoreCase("whiteking")) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.whiteking);

        } else if (pieceName.equalsIgnoreCase("whitequeen")) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.whitequeen);

        } else if (pieceName.equalsIgnoreCase("whiterook")) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.whiterook);
        } else if (pieceName.equalsIgnoreCase("blackrook")) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.blackrook);

        } else if (pieceName.equalsIgnoreCase("blackknight")) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.blackknight);
        } else if (pieceName.equalsIgnoreCase("blackking")) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.blackking);
        } else if (pieceName.equalsIgnoreCase("blackqueen")) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.blackqueen);

        } else {
            return null;
        }

    }


    @Override
    public void addMove(ChessTileView chessTileView) {


        currentMoves.add(chessTileView);

        if (currentMoves.size() == 1) {

            if (chessTileView.getPieceImage() == null) {
                currentMoves.clear();
            }


        }

        if (currentMoves.size() == 2) {
            // Perform Exchange
            performExchange();

        }

    }

    @Override
    public void performExchange() {

        Iterator<ChessTileView> iterator = currentMoves.iterator();
        ChessTileView view1 = null;
        ChessTileView view2 = null;
        int count = 0;
        while (iterator.hasNext()) {
            if (count == 0) {
                view1 = iterator.next();
                count++;
            } else {
                view2 = iterator.next();

            }
        }
        if (view1.getPieceImage() != null) {


            if (isTheCorrectPlayerMoving(view1, view2)) {


                boolean moveWasLegal = ChessAnalyzer.takeInMovesAndDetermineLegality(currentState, view1, view2);


                // Increment Turn Counter to reflect new turn
                if (moveWasLegal) {
                    whiteTurn++;
                }

            }


        }


        currentMoves.clear();

    }

    private boolean isTheCorrectPlayerMoving(ChessTileView view1, ChessTileView view2) {
        // Determine who's move it is
        if (whiteTurn % 2 == 0) {
            // white should be first piece
            if (view1.getTypeOfPiece().contains("white")) {
                return true;
            }
        } else {
            // Black should be first piece
            if (view1.getTypeOfPiece().contains("black")) {
                return true;
            }
        }
        return false;
    }
}
