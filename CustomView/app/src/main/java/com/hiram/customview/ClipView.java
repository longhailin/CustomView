package com.hiram.customview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * 作者： hiram on 2017/3/29
 */

public class ClipView extends View {
    private int i = 0;
    private Bitmap bmpBoom;
    public ClipView(Context context, AttributeSet attrs) {
        super(context, attrs);
        bmpBoom = BitmapFactory.decodeResource(getResources(), R.mipmap.boom);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = bmpBoom.getWidth();
        int height = bmpBoom.getHeight();
        int frameWidth = width / 7;
        Rect rect = new Rect(0, 0, frameWidth, height);
        canvas.save();
        canvas.translate(100, 100);
        canvas.clipRect(rect);
        canvas.drawBitmap(bmpBoom, -i * frameWidth, 0, null);
        canvas.restore();
        i ++;
        if(i == 7) i = 0;
    }
}
