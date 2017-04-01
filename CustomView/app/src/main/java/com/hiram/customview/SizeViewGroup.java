package com.hiram.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 作者： hiram on 2017/4/1
 */

public class SizeViewGroup extends ViewGroup {
    public SizeViewGroup(Context context) {
        this(context, null, 0);
    }
    public SizeViewGroup(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }
    public SizeViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
//􀡋􁔪􀐰􀑚􁤹􄫞
        TextView textView = new TextView(context);
        ViewGroup.LayoutParams layoutParams =
                new ViewGroup.LayoutParams(200, 200);
        textView.setText("Android");
        textView.setBackgroundColor(Color.GRAY);
//􀵘􁖃􀡽􁇩􀲘􀑝􂐫􀣐􁆀􃓴􀔦
        this.addView(textView, layoutParams);
//􄇮􃖞􁇩􀲘􃛼􁲟􄻌􃢢
        this.setBackgroundColor(Color.alpha(255));
    }
        @Override
        protected void onLayout(boolean changed, int l, int t, int r, int b) {
//􄇮􃖞􁆀􃓴􀔦􀋄􂆔􀼴􀑪 TextView􀋅􂲴􀕽􃖞􀪼􀽗􁈿
            View textView = this.getChildAt(0);//􀨚􁴹􀐰􀑚􃓴􀔦􀋈􃍒􁕅􀑪 0
            textView.layout(50, 50, textView.getMeasuredWidth() + 50,
                    textView.getMeasuredHeight() + 50);
        }
/**
 * 􂍻􄟿􃓴􀔦
 */
        @Override
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//􀝸􂍻􄟿􁡰􁴹􁆀􃓴􀔦􂲴􀽗􁈿
            this.measureChildren(widthMeasureSpec, heightMeasureSpec);
//􂍻􄟿􃠚􄓛􂲴􀽗􁈿􀋈􂆔􀼴􂴤􁧕􀟉􂆫􀑪 500 * 500
            this.setMeasuredDimension(400, 400);
        }
/**
 * 􃔈􀡦
 */
        @Override
        protected void onDraw(Canvas canvas) {
//􀑪􁇩􀲘􂭫􀐰􀑚􃓒􃢢􄗩􁹶
            RectF rect = new RectF(0, 0, getMeasuredWidth(), getMeasuredHeight());
            rect.inset(2, 2);
            Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(2);
            paint.setColor(Color.BLACK);
            Path path = new Path();
            path.addRoundRect(rect, 20, 20, Path.Direction.CCW);
            canvas.drawPath(path, paint);
            super.onDraw(canvas);
        }
    }
