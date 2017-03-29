package com.hiram.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.Calendar;

/**
 * 作者： hiram on 2017/3/29
 */

public class WatchView extends View {
    private Paint paint;
    private Calendar calendar;
    public WatchView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.GRAY);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1);
        calendar = Calendar.getInstance();
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = this.getMeasuredWidth();
        int height = this.getMeasuredHeight();
        int len = Math.min(width, height);
        //绘制表盘
        drawPlate(canvas, len);
        //绘制指针
        drawPoints(canvas, len);
    }

    /**
     * 􃔈􀡦􃺘􂴈
     * @param canvas
     * @param len 􃓴􀔦􁇭􁓖
     */
    protected void drawPlate(Canvas canvas, int len){
        canvas.save();
        int r = len / 2;
        canvas.drawCircle(r, r, r, paint);
        for(int i = 0; i < 60; i ++){
            if(i % 5 == 0){
                paint.setColor(Color.RED);
                paint.setStrokeWidth(4);
                canvas.drawLine(r + 9 * r / 10, r, len, r, paint);
            }else{
                paint.setColor(Color.GRAY);
                paint.setStrokeWidth(1);
                canvas.drawLine(r + 14 * r / 15, r, len, r, paint);
            }
            canvas.rotate(6, r, r);
        }
        canvas.restore();
    }

    protected void drawPoints(Canvas canvas, int len){
//􀝸􃧧􀨆􃌫􃔏􁰦􄰤
        calendar.setTimeInMillis(System.currentTimeMillis());
//􃧧􀨆􁰦􀠶􃀂
        int hours = calendar.get(Calendar.HOUR) % 12;//􄖜􁦒􀑪 12 􁈿􁰦􀡦
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);
        //花时针
        int degree = 360 / 12 * hours;
        double radians = Math.toRadians(degree);
        int r = len / 2;
        int startX = r;
        int startY = r;
        int endX = (int) (startX + r * 0.5 * Math.cos(radians));
        int endY = (int) (startY + r * 0.5 * Math.sin(radians));
        canvas.save();
        paint.setStrokeWidth(3);
//0 􁓖􀓾 3 􂛩􀼴􁔰􀿻􀋈􁰦􄰤􀓾 12 􂛩􀼴􁔰􀿻􀋈􁡰􀔕􄴰􃾱􁈶􂭫􁐳􁯻􄖜 90 􁓖
        canvas.rotate(-90, r, r);
//􂭫􁰦􄪸
        canvas.drawLine(startX, startY, endX, endY, paint);
        canvas.restore();
//􂭫􀠶􄪸
//􄇑􃇇􄀂􁓖
        degree = 360 / 60 * minutes;
        radians = Math.toRadians(degree);
        endX = (int) (startX + r * 0.6 * Math.cos(radians));
        endY = (int) (startY + r * 0.6 * Math.sin(radians));
        canvas.save();
        paint.setStrokeWidth(2);
//0 􁓖􀓾 3 􂛩􀼴􁔰􀿻􀋈􁰦􄰤􀓾 12 􂛩􀼴􁔰􀿻􀋈􁡰􀔕􄴰􃾱􁈶􂭫􁐳􁯻􄖜 90 􁓖
        canvas.rotate(-90, r, r);
//􂭫􁰦􄪸
        canvas.drawLine(startX, startY, endX, endY, paint);
        canvas.restore();
//􂭫􃀂􄪸
        degree = 360 / 60 * seconds;
        radians = Math.toRadians(degree);
        endX = (int) (startX + r * 0.8 * Math.cos(radians));
        endY = (int) (startY + r * 0.8 * Math.sin(radians));
        canvas.save();
        paint.setStrokeWidth(1);
//0 􁓖􀓾 3 􂛩􀼴􁔰􀿻􀋈􁰦􄰤􀓾 12 􂛩􀼴􁔰􀿻􀋈􁡰􀔕􄴰􃾱􁈶􂭫􁐳􁯻􄖜 90 􁓖
        canvas.rotate(-90, r, r);
//􂭫􁰦􄪸
        canvas.drawLine(startX, startY, endX, endY, paint);
//􀞽􃔉􃀂􄪸􂭫􀑚“􁉮􁐤”
        radians = Math.toRadians(degree - 180);
        endX = (int) (startX + r * 0.15 * Math.cos(radians));
        endY = (int) (startY + r * 0.15 * Math.sin(radians));
        canvas.drawLine(startX, startY, endX, endY, paint);
        canvas.restore();
    }
}
