package com.example.ag67440.thebattlefield;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SmartTileView.CommunicateBackToActivity{

    private FrameLayout f1;
    private FrameLayout f2;
    private FrameLayout f3;

    private List<SmartTileView> currentState = new ArrayList<SmartTileView>();
    private LinkedHashSet<SmartTileView> currentMoves = new LinkedHashSet<SmartTileView>();

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
        Bitmap blackCastle = getBitmapByPieceName("blackrook" , this);
        SmartTileView tileView = new SmartTileView(f1.getContext() , player1 , blackCastle , this , "8A");
        currentState.add(tileView);

        // Row 1 Black Knight
        Bitmap blackKnight = getBitmapByPieceName("blackknight" , this);
        SmartTileView tileView2 = new SmartTileView(f2.getContext() , player2 , blackKnight, this , "8B");
        currentState.add(tileView2);

        // Row 1 Black Bishop
        Bitmap blackBishop = getBitmapByPieceName("blackbishop" , this);
        SmartTileView tileView3 = new SmartTileView(f3.getContext() , player1 , blackBishop, this , "8C");
        currentState.add(tileView3);

        // Row 1 Black Queen
        Bitmap blackQueen = getBitmapByPieceName("blackqueen" , this);
        SmartTileView tileView4 = new SmartTileView(f4.getContext() , player2 , blackQueen, this , "8D");
        currentState.add(tileView4);

        // Row 1 Black King
        Bitmap blackKing = getBitmapByPieceName("blackKing" , this);
        SmartTileView tileView5 = new SmartTileView(f5.getContext() , player1 , blackKing, this , "8E");
        currentState.add(tileView5);


        SmartTileView tileView6 = new SmartTileView(f6.getContext() , player2 , blackBishop, this , "8F");
        currentState.add(tileView6);

        SmartTileView tileView7 = new SmartTileView(f7.getContext() , player1 , blackKnight, this , "8G");
        currentState.add(tileView7);

        SmartTileView tileView8 = new SmartTileView(f8.getContext() , player2 , blackCastle, this , "8H");
        currentState.add(tileView8);


        // Row 2
        Bitmap blackpawn = getBitmapByPieceName("blackpawn" , this);

        SmartTileView tileView9 = new SmartTileView(f9.getContext() , player2 , blackpawn, this , "7A");
        currentState.add(tileView9);

        SmartTileView tileView10 = new SmartTileView(f10.getContext() , player1 , blackpawn, this , "7B");
        currentState.add(tileView10);

        SmartTileView tileView11 = new SmartTileView(f11.getContext() , player2 , blackpawn, this , "7C");
        currentState.add(tileView11);

        SmartTileView tileView12 = new SmartTileView(f12.getContext() , player1 , blackpawn, this , "7D");
        currentState.add(tileView12);

        SmartTileView tileView13 = new SmartTileView(f13.getContext() , player2 , blackpawn, this , "7E");
        currentState.add(tileView13);

        SmartTileView tileView14 = new SmartTileView(f14.getContext() , player1 , blackpawn, this , "7F");
        currentState.add(tileView14);

        SmartTileView tileView15 = new SmartTileView(f15.getContext() , player2 , blackpawn, this , "7G");
        currentState.add(tileView15);
        SmartTileView tileView16 = new SmartTileView(f16.getContext() , player1 , blackpawn, this , "7H");
        currentState.add(tileView16);


        // Row 3
        SmartTileView tileView17 = new SmartTileView(f17.getContext() , player1 , null, this , "6A");
        currentState.add(tileView17);

        SmartTileView tileView18 = new SmartTileView(f18.getContext() , player2 , null, this , "6B");
        currentState.add(tileView18);

        SmartTileView tileView19 = new SmartTileView(f19.getContext() , player1 , null, this , "6C");
        currentState.add(tileView19);

        SmartTileView tileView20 = new SmartTileView(f20.getContext() , player2 , null, this , "6D");
        currentState.add(tileView20);

        SmartTileView tileView21 = new SmartTileView(f21.getContext() , player1 , null, this , "6E");
        currentState.add(tileView21);

        SmartTileView tileView22 = new SmartTileView(f22.getContext() , player2 , null, this , "6F");
        currentState.add(tileView22);

        SmartTileView tileView23 = new SmartTileView(f23.getContext() , player1 , null, this , "6G");
        currentState.add(tileView23);

        SmartTileView tileView24 = new SmartTileView(f24.getContext() , player2 , null, this , "6H");
        currentState.add(tileView24);



        // Row 4
        SmartTileView tileView25 = new SmartTileView(f25.getContext() , player2 , null, this , "5A");
        currentState.add(tileView25);

        SmartTileView tileView26 = new SmartTileView(f26.getContext() , player1 , null, this , "5B");
        currentState.add(tileView26);

        SmartTileView tileView27 = new SmartTileView(f27.getContext() , player2, null, this , "5C");
        currentState.add(tileView27);

        SmartTileView tileView28 = new SmartTileView(f28.getContext() , player1, null, this , "5D");
        currentState.add(tileView28);

        SmartTileView tileView29 = new SmartTileView(f29.getContext() , player2, null, this , "5E");
        currentState.add(tileView29);

        SmartTileView tileView30 = new SmartTileView(f30.getContext() , player1, null, this , "5F");
        currentState.add(tileView30);

        SmartTileView tileView31 = new SmartTileView(f31.getContext() , player2, null, this , "5G");
        currentState.add(tileView31);

        SmartTileView tileView32 = new SmartTileView(f32.getContext() , player1, null, this , "5H");
        currentState.add(tileView32);



        // Row 5
        SmartTileView tileView33 = new SmartTileView(f33.getContext() , player1, null, this , "4A");
        currentState.add(tileView33);

        SmartTileView tileView34 = new SmartTileView(f34.getContext() , player2, null, this , "4B");
        currentState.add(tileView34);

        SmartTileView tileView35 = new SmartTileView(f35.getContext() , player1, null, this  , "4C");
        currentState.add(tileView35);

        SmartTileView tileView36 = new SmartTileView(f36.getContext() , player2, null, this , "4D");
        currentState.add(tileView36);

        SmartTileView tileView37 = new SmartTileView(f37.getContext() , player1, null, this , "4E");
        currentState.add(tileView37);

        SmartTileView tileView38 = new SmartTileView(f38.getContext() , player2, null, this , "4F");
        currentState.add(tileView38);

        SmartTileView tileView39 = new SmartTileView(f39.getContext() , player1, null, this , "4G");
        currentState.add(tileView39);

        SmartTileView tileView40 = new SmartTileView(f40.getContext() , player2, null, this , "4H");
        currentState.add(tileView40);


        // Row 6
        SmartTileView tileView41 = new SmartTileView(f41.getContext() , player2, null, this , "3A");
        currentState.add(tileView41);

        SmartTileView tileView42 = new SmartTileView(f42.getContext() , player1, null, this , "3B");
        currentState.add(tileView42);

        SmartTileView tileView43 = new SmartTileView(f43.getContext() , player2, null, this , "3C");
        currentState.add(tileView43);

        SmartTileView tileView44 = new SmartTileView(f44.getContext() , player1, null, this , "3D");
        currentState.add(tileView44);

        SmartTileView tileView45 = new SmartTileView(f45.getContext() , player2, null, this , "3E");
        currentState.add(tileView45);

        SmartTileView tileView46 = new SmartTileView(f46.getContext() , player1, null, this , "3F");
        currentState.add(tileView46);

        SmartTileView tileView47 = new SmartTileView(f47.getContext() , player2, null, this , "3G");
        currentState.add(tileView47);

        SmartTileView tileView48 = new SmartTileView(f48.getContext() , player1, null, this , "3H");



        Bitmap whitepawn = getBitmapByPieceName("whitepawn" , this);

        // Row 7
        SmartTileView tileView49 = new SmartTileView(f49.getContext() , player1, whitepawn , this , "2A");
        currentState.add(tileView49);

        SmartTileView tileView50 = new SmartTileView(f50.getContext() , player2 , whitepawn, this , "2B");
        currentState.add(tileView50);

        SmartTileView tileView51 = new SmartTileView(f51.getContext() , player1 , whitepawn, this , "2C");
        currentState.add(tileView51);

        SmartTileView tileView52 = new SmartTileView(f52.getContext() , player2, whitepawn, this , "2D");
        currentState.add(tileView52);

        SmartTileView tileView53 = new SmartTileView(f53.getContext() , player1, whitepawn, this , "2E");
        currentState.add(tileView53);

        SmartTileView tileView54 = new SmartTileView(f54.getContext() , player2, whitepawn, this , "2F");
        currentState.add(tileView54);

        SmartTileView tileView55 = new SmartTileView(f55.getContext() , player1, whitepawn, this , "2G");
        currentState.add(tileView55);

        SmartTileView tileView56 = new SmartTileView(f56.getContext() , player2, whitepawn, this , "2H");
        currentState.add(tileView56);


        // Row 8 white castle
        Bitmap whitecastle = getBitmapByPieceName("whiterook" , this);
        Bitmap whitequeen = getBitmapByPieceName("whitequeen" , this);

        SmartTileView tileView57 = new SmartTileView(f57.getContext() , player2 , whitecastle, this , "1A");
        currentState.add(tileView57);


        // White Knight
        Bitmap whiteknight = getBitmapByPieceName("whiteknight" , this);

        SmartTileView tileView58 = new SmartTileView(f58.getContext() , player1 , whiteknight, this , "1B");
        currentState.add(tileView58);


        // White Bishop
        Bitmap whitebishop = getBitmapByPieceName("whitebishop" , this);

        SmartTileView tileView59 = new SmartTileView(f59.getContext() , player2 , whitebishop, this , "1C");
        currentState.add(tileView59);



        //White King
        Bitmap whiteking = getBitmapByPieceName("whiteking" , this);

        SmartTileView tileView60 = new SmartTileView(f60.getContext() , player1 , whitequeen, this , "1D");
        currentState.add(tileView60);

        // White Queen

        SmartTileView tileView61 = new SmartTileView(f61.getContext() , player2 , whiteking, this , "1E");
        currentState.add(tileView61);

        //
        SmartTileView tileView62 = new SmartTileView(f62.getContext() , player1  , whitebishop, this , "1F");
        currentState.add(tileView62);

        SmartTileView tileView63 = new SmartTileView(f63.getContext() , player2 , whiteknight, this , "1G");
        currentState.add(tileView63);

        SmartTileView tileView64 = new SmartTileView(f64.getContext() , player1 , whitecastle, this , "1H");
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


    public Bitmap getBitmapByPieceName(String pieceName , Context context) {


        if( pieceName.equalsIgnoreCase("blackpawn")) {
            return    BitmapFactory.decodeResource(context.getResources(), R.drawable.blackpawn);

        }

        else if(pieceName.equalsIgnoreCase("whitepawn")) {
            return   BitmapFactory.decodeResource(context.getResources(), R.drawable.whitepawntiny);

        }

        else if(pieceName.equalsIgnoreCase("blackbishop")) {
            return   BitmapFactory.decodeResource(context.getResources(), R.drawable.blackbishop);

        }

        else if(pieceName.equalsIgnoreCase("whitebishop")) {
            return   BitmapFactory.decodeResource(context.getResources(), R.drawable.whitebishop);

        }

        else if(pieceName.equalsIgnoreCase("whiteknight")) {
            return  BitmapFactory.decodeResource(context.getResources(), R.drawable.whiteknight);

        }

        else if(pieceName.equalsIgnoreCase("whiteking")) {
            return  BitmapFactory.decodeResource(context.getResources(), R.drawable.whiteking);

        }

        else if(pieceName.equalsIgnoreCase("whitequeen")) {
            return  BitmapFactory.decodeResource(context.getResources(), R.drawable.whitequeen);

        }

        else if(pieceName.equalsIgnoreCase("whiterook")) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.whiterook);
        }

        else if(pieceName.equalsIgnoreCase("blackrook")) {
            return  BitmapFactory.decodeResource(context.getResources(), R.drawable.blackrook);

        }
        else if(pieceName.equalsIgnoreCase("blackknight")) {
            return  BitmapFactory.decodeResource(context.getResources(), R.drawable.blackknight);
        }
        else if(pieceName.equalsIgnoreCase("blackking")) {
            return  BitmapFactory.decodeResource(context.getResources(), R.drawable.blackking);
        }

        else if(pieceName.equalsIgnoreCase("blackqueen")) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.blackqueen);

        }
        else {
            return null;
        }

    }


    @Override
    public void addMove(SmartTileView smartTileView) {


        currentMoves.add(smartTileView);

        if(currentMoves.size() == 1) {
            if(smartTileView.getPieceImage() == null) {
                currentMoves.clear();
            }
        }

        if(currentMoves.size() == 2) {
            // Perform Exchange
            performExchange();

        }

    }

    @Override
    public void performExchange() {

        Iterator<SmartTileView> iterator = currentMoves.iterator();
        SmartTileView view1 = null;
        SmartTileView view2 = null;
        int count = 0;
        while(iterator.hasNext()) {
                if( count == 0) {
                    view1 = iterator.next();
                    count++;
                }
                else {
                    view2 = iterator.next();

                }
        }
        if(view1.getPieceImage() != null ) {
            view2.setPieceImage(view1.getPieceImage());
            view2.invalidate();
            view1.setPieceImage(null);
            view1.invalidate();
        }



        currentMoves.clear();

    }
}
