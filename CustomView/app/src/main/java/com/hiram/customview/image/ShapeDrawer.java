package com.hiram.customview.image;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

/**
 * 作者： hiram on 2017/3/29
 */

public abstract class ShapeDrawer {
    private View view;
    public ShapeDrawer(View view) {
        super();
        this.view = view;
    }
    public View getView() {
        return view;
    }

    public void draw(Canvas viewCanvas){
        Bitmap bitmap = BitmapBuffer.getInstance().getBitmap();
        viewCanvas.drawBitmap(bitmap, 0, 0, null);
    }

    public abstract boolean onTouchEvent(MotionEvent event);

    public abstract void logic();
}
