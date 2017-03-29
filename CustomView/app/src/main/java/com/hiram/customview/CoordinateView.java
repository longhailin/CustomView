package com.hiram.customview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;

/**
 * 作者： hiram on 2017/3/29
 */

public class CoordinateView extends View {
    public CoordinateView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
/*        Bitmap bmpDog = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
//􃔈􀡦􂤇􂤇􁆼􁮤􂞗􂡷
        canvas.drawBitmap(bmpDog, 0, 0, null);
//􁒣􃀫􀶀􁸷
        canvas.translate(0, 500);
//􁇊􀑹􀢚􀠷􀥪
        canvas.clipRect(new Rect(0, 0, 600, 600));
//􁇊􀑹􀐰􀑚􁯠􂲴􀢚􀠷􀥪􀋈􀐾􀐺􀐰􀢚􀠷􀥪􀚊 Op 􄘀􃇇
        Path path = new Path();
        path.addCircle(500, 350, 300, Path.Direction.CCW);
        canvas.clipPath(path, Region.Op.UNION);
//􀞽􂅑􃔈􀡦􂤇􂤇􂞗􂡷
        canvas.drawBitmap(bmpDog, 0, 0, null);*/


        /*Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(2);
        paint.setStyle(Paint.Style.STROKE);
//􀘍􁆈􂧠􀵪
        canvas.save();
        for(int i = 0; i < 10; i ++){
            canvas.drawRect(0, 0, 150, 150, paint);
            canvas.translate(20, 20);
        }
//􁚒􀼽􂧠􀵪
        canvas.restore();
        canvas.translate(300, 400);
        canvas.save();
        canvas.drawLine(200, 150, 455, 56, paint);
        for(int i = 0; i < 10; i ++){
            canvas.drawRect(0, 0, 300, 300, paint);
            canvas.scale(0.9f, 0.9f, 150, 150);
            //Matrix效果不好,最好直接用canvas的变换函数
//            Matrix matrix = canvas.getMatrix();
//            matrix.postScale(0.9f, 0.9f, 150, 150);
//            canvas.setMatrix(matrix);
        }
        canvas.drawLine(200, 280, 455, 186, paint);
        canvas.restore();
//        canvas.translate(0, 350);
*//*        canvas.save();
//        canvas.drawRect(0,0,250,250, paint);
        canvas.drawCircle(150, 150, 150, paint);
        for(int i = 0; i < 12; i ++){
            canvas.drawLine(280, 150, 300, 150, paint);
            canvas.rotate(30, 150, 150);
        }
//        canvas.drawLine(280, 150, 455, 56, paint);
        canvas.restore();*/
    }
}
