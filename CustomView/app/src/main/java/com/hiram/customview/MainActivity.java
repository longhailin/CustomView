package com.hiram.customview;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;

import com.nineoldandroids.animation.ValueAnimator;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    BallMoveView ballview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView) findViewById(R.id.iv);
//        ballview = (BallMoveView) findViewById(R.id.ballview);

       /* Bitmap bmpBuffer = Bitmap.createBitmap(500, 800,
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmpBuffer);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(14);
        String text = "陶睿科技，移动互联网卓越品牌，我爱Android􀊽";
        canvas.drawText(text, 10, 50, paint);
        canvas.drawText(text, 0, 4, 10, 100, paint);
        canvas.drawText(text.toCharArray(), 5, 10, 10, 150, paint);
        Path path = new Path();
        path.moveTo(10, 200);
        path.cubicTo(100, 100, 200,300,400,50);
//        path.quadTo(100, 100, 300, 300);

        canvas.drawTextOnPath(text, path, 15, -15, paint);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(path, paint);
        iv.setImageBitmap(bmpBuffer);*/


        /*Bitmap bmpBuffer = Bitmap.createBitmap(500, 800,
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmpBuffer);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        Path path1 = new Path();
        path1.addRect(new RectF(10, 10, 110, 110), Path.Direction.CCW);
        Path path2 = new Path();
        path2.addCircle(100, 100, 50, Path.Direction.CCW);
//        canvas.drawPath(path1, paint);
        paint.setColor(Color.RED);

        path1.op(path2, Path.Op.UNION);
        canvas.drawPath(path1, paint);
//        path1.op(path2, Path.Op.DIFFERENCE);
        iv.setImageBitmap(bmpBuffer);*/
//        new Timer().schedule(new TimerTask() {
//            @Override
//            public void run() {
//                ballview.postInvalidate();
//            }
//        }, 200, 50);
    }
    int bmpHeight = 100;
    int bmpWidth = 100;
    private Rect mSrcRect, mDestRect;

    private void draw2(){
          /* Bitmap bmpBuffer = Bitmap.createBitmap(500, 800,
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmpBuffer);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.moveTo(0, 150);
        path.rLineTo(300, 0);
        path.rLineTo(-300, 150);
        path.rLineTo(150, -300);
        path.rLineTo(150, 300);
        path.close();
        path.addCircle(300,300,5, Path.Direction.CCW);
        canvas.drawPath(path, paint);
        iv.setImageBitmap(bmpBuffer);*/
          /*        Bitmap bmpBuffer = Bitmap.createBitmap(500, 800,
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmpBuffer);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();

        path.addRect(new RectF(10, 10, 300, 100), Path.Direction.CCW);

        path.addRoundRect(new RectF(10, 120, 300, 220),
                new float[]{10, 20, 20, 10, 30, 40, 40, 30}, Path.Direction.CCW);

        path.addOval(new RectF(10, 240, 300, 340), Path.Direction.CCW);

        path.addCircle(60, 390, 50, Path.Direction.CCW);

//        path.offset(100,200);

        path.arcTo(new RectF(10, 500, 300, 600), -30, -60, false);
        path.close();
//        path.addArc(new RectF(10, 500, 300, 600), -30, -60);
        canvas.drawPath(path, paint);
        iv.setImageBitmap(bmpBuffer);*/

        /*Bitmap bmpBuffer = Bitmap.createBitmap(500, 800,
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmpBuffer);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.moveTo(100, 100);
        path.quadTo(200, 10, 300, 300);
        canvas.drawPath(path, paint);

        paint.setStrokeWidth(4);
        paint.setColor(Color.RED);
        canvas.drawPoints(new float[]{100, 100, 200, 10, 300, 300}, paint);
        iv.setImageBitmap(bmpBuffer);*/

        /*Bitmap bmpBuffer = Bitmap.createBitmap(500, 800,
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmpBuffer);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.moveTo(100, 100);
        path.arcTo(new RectF(100, 150, 300, 300), -30, 60, false);
        path.close();
        canvas.drawPath(path, paint);
        iv.setImageBitmap(bmpBuffer);*/
    }
    private void draw1(){
         /*    Bitmap bmp = Bitmap.createBitmap(400,400, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmp);
        //绘制文字
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextAlign(Paint.Align.LEFT);
        int sp = 22;
        paint.setTextSize(sp);
        paint.setTextSkewX(-0.8f);
        paint.setUnderlineText(true);
        paint.setFakeBoldText(true);
        canvas.drawText("Helllloooo   ofssdofj !", 10, 100, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(20);
        paint.setStrokeJoin(Paint.Join.ROUND);
        canvas.drawRect(new Rect(10,200,350,350), paint);
        iv.setImageBitmap(bmp);*/
 /*       Bitmap bmpBuffer = Bitmap.createBitmap(500, 1000, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmpBuffer);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        canvas.drawBitmap(bmp, 0, 0, null);

        bmpWidth = bmp.getWidth();
        bmpHeight = bmp.getHeight();
//        Rect src = new Rect(0, 0, bmpWidth, bmpHeight);
//        Rect dst = new Rect(0, bmpHeight, bmpWidth * 3, bmpHeight * 3);
        mSrcRect = new Rect(0, 0, bmpWidth, bmpHeight/2);
        mDestRect = new Rect(0, bmpHeight, bmpWidth*3, bmpHeight*4);
        canvas.drawBitmap(bmp, mSrcRect, mDestRect, null);

        iv.setImageBitmap(bmpBuffer);*/
/*        Bitmap bmpBuffer = Bitmap.createBitmap(500, 800,
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmpBuffer);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(35);
//..............
        canvas.drawPoint(120, 50, paint);
        paint.setColor(Color.BLUE);
//􀑔􀑚􁮠􀐰􃓴􂭫 4 􀑚􃬍􃢢􂲴􂛩
        float[] points1 = new float[]{10, 20, 50, 80, 50, 100, 50, 150};
//        canvas.drawPoints(points1, paint);
        paint.setColor(Color.GREEN);
        canvas.drawPoints(points1, 1, 4, paint);
        iv.setImageBitmap(bmpBuffer);*/

  /*      Bitmap bmpBuffer = Bitmap.createBitmap(500, 800,
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmpBuffer);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(5);
        final int offsetDy = 50;
        for(int i = 0; i < 5; i ++){
            canvas.drawLine(20, offsetDy * i +10, 300, offsetDy * i + 10, paint);
        }
        iv.setImageBitmap(bmpBuffer);*/

        /*Bitmap bmpBuffer = Bitmap.createBitmap(500, 800,
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmpBuffer);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        canvas.drawRoundRect(new RectF(10, 10, 400, 300), 50, 50, paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRoundRect(new RectF(10, 320, 400, 620), 30, 50, paint);
        iv.setImageBitmap(bmpBuffer);*/
        /*Bitmap bmpBuffer = Bitmap.createBitmap(500, 800,
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmpBuffer);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        RectF rect = new RectF(10, 10, 400, 300);
        paint.setColor(Color.GRAY);
        canvas.drawOval(rect, paint);
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        canvas.drawArc(rect, 0, 30, true, paint);
        iv.setImageBitmap(bmpBuffer);*/
    }
}
