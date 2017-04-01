package com.hiram.customview.image;

import android.graphics.Color;
import android.graphics.Paint;

/**
 * 作者： hiram on 2017/3/29
 */

public class AttributesTool {
    /*颜色*/
    private int color;
    /**线条宽度*/
    private int borderWidth;
    /**是否填充*/
    private boolean fill;
    private static AttributesTool self;
    private static Paint paint;
    /**
     * 􁈶􁶴􄙐􁯩􂌅􁇊􀑹􁡀􀑪􂿱􁴹􀋈􂴞􂲴􀑪􀒶􄱢􂆒􀡋􁔪􁈩􄊑
     */
    private AttributesTool() {
        reset();
    }
    /**
     * 􀩁􀽆􄜘􁨀􀗋􁈩􄊑
     * @return
     */
    public static AttributesTool getInstance(){
        if(self == null){
            self = new AttributesTool();
        }
        return self;
    }
    /**
     * 􁈶􁖃􀡽􂲴􃔈􀴮􁊎􁙗􄖜􁦒􁡀 Paint 􁈩􄊑
     * @return
     */
    public Paint getPaint(){
        if(paint == null){
            paint = new Paint();
        }
        paint.setAntiAlias(true);
        paint.setColor(this.color);
        paint.setStrokeWidth(borderWidth);
        paint.setStyle(this.fill ? Paint.Style.FILL: Paint.Style.STROKE);
        paint.setTextSize(30);
        return paint;
    }
    /**
     * 􄟽􃖞
     */
    public void reset(){
        this.color = Color.BLACK;
        this.borderWidth = 1;
        this.fill = false;
    }
    public int getColor() {
        return color;
    }
    public void setColor(int color) {
        this.color = color;
    }
    public int getBorderWidth() {
        return borderWidth;
    }
    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }
    public boolean isFill() {
        return fill;
    }
    public void setFill(boolean fill) {
        this.fill = fill;
    }
}
