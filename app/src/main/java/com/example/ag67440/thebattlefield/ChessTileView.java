package com.example.ag67440.thebattlefield;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ThumbnailUtils;
import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class ChessTileView extends View {
    private Rect rect;
    private Rect rect2;
    private RectF rectf;
    private RectF rectf3;

    public String getTypeOfPiece() {
        return typeOfPiece;
    }

    public void setTypeOfPiece(String typeOfPiece) {
        this.typeOfPiece = typeOfPiece;
    }

    private String typeOfPiece;

    public String getPositionNumber() {
        return positionNumber;
    }

    public void setPositionNumber(String positionNumber) {
        this.positionNumber = positionNumber;
    }

    private String positionNumber;

    public Bitmap getPieceImage() {
        return pieceImage;
    }

    public void setPieceImage(Bitmap pieceImage) {
        this.pieceImage = pieceImage;
    }

    private Bitmap pieceImage;


    private GestureDetector gestureDetector;

    private RectF rectf2;
    private Paint p;
    private Paint g;
    private Paint boxPaint;
    private Paint interestRateText;
    private CommunicateBackToActivity activity;

    interface CommunicateBackToActivity {
        public void addMove(ChessTileView chessTileView);

        public void performExchange();


    }

    public ChessTileView(Context context, Paint boxPaint, Bitmap pieceImage, CommunicateBackToActivity activity, String positionNumber, String typeOfPiece) {
        super(context);
        this.pieceImage = pieceImage;
        rectf = new RectF(rect);
        this.boxPaint = boxPaint;
        this.positionNumber = positionNumber;
        this.activity = activity;
        this.typeOfPiece = typeOfPiece;
        p = new Paint();
        g = new Paint();
        interestRateText = new Paint();
        interestRateText.setColor(Color.BLUE);
        interestRateText.setStyle(Paint.Style.FILL);
        interestRateText.setTextSize(20F);
        g.setColor(Color.BLACK);
        g.setStyle(Paint.Style.STROKE);
        p.setColor(Color.BLUE);

        gestureDetector = new GestureDetector(context, new CustomGestureListener());


    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {

        boolean result = gestureDetector.onTouchEvent(event);

        if (result) {

            int action = MotionEventCompat.getActionMasked(event);
            Log.d("The BattleField", "Action " + event.toString());
            if (event.getAction() == MotionEvent.ACTION_DOWN)
                activity.addMove(this);
            return true;
        }
        return result;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = canvas.getHeight();
        int width = canvas.getWidth();
        int screenSize = Resources.getSystem().getDisplayMetrics().widthPixels;


        rect = new Rect(0, 0, width, canvas.getHeight());
        //canvas.drawColor(p);

        rectf = new RectF(rect);
        rectf2 = new RectF(rect2);
        canvas.drawRect(rect, boxPaint);
        canvas.drawRect(rect, g);
        //canvas.drawRoundRect(rectf2 , 40 , 40 , p);

        if (pieceImage != null) {

            Bitmap thumbBitmap = null;

            if (screenSize <= 720)
                thumbBitmap = ThumbnailUtils.extractThumbnail(pieceImage, 80, 80);
            else
                thumbBitmap = ThumbnailUtils.extractThumbnail(pieceImage, 130, 130);

            canvas.drawBitmap(thumbBitmap, 5f, 25f, p);
        }


    }

    @Override
    public int hashCode() {

        return getPositionNumber().hashCode();
    }
}
