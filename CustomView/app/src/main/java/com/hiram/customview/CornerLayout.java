package com.hiram.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/**
 * 作者： hiram on 2017/4/1
 */

public class CornerLayout extends ViewGroup {
    public CornerLayout(Context context) {
        super(context);
        setBackgroundColor(0x111ff1);
    }
    public CornerLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        setBackgroundColor(0x111ff1);
    }
    public CornerLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setBackgroundColor(0x111ff1);
    }
    /**
     * 􁇊􀕽􁆀􃓴􀔦
     */
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        Log.e("","CornerLayout=======onLayout==");
        for(int i = 0; i < getChildCount(); i ++){
            View child = getChildAt(i);
            if(i == 0){
//􁇊􀕽􀡠􁐖􀐺􄀂
                child.layout(0, 0, child.getMeasuredWidth(),
                        child.getMeasuredHeight());
            }else if(i == 1){
//􁇊􀕽􀡠􀨣􀐺􄀂
                child.layout(getMeasuredWidth() - child.getMeasuredWidth(),
                        0, getMeasuredWidth(), child.getMeasuredHeight());
            }else if(i == 2){
//􁇊􀕽􀡠􁐖􀐻􄀂
                child.layout(0, getMeasuredHeight() - child.getMeasuredHeight(),
                        child.getMeasuredWidth(), getMeasuredHeight());
            }else if(i == 3){
//􁇊􀕽􀡠􀨣􀐻􄀂
                child.layout(getMeasuredWidth() - child.getMeasuredWidth(),
                        getMeasuredHeight() - child.getMeasuredHeight(),
                        getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }
    /**
     * 􂍻􄟿􁉪􁈨
     * @param widthMeasureSpec
     * @param heightMeasureSpec
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//􀝸􂍻􄟿􁡰􁴹􁆀􃓴􀔦􂲴􀽗􁈿
        Log.e("","CornerLayout=======onMeasure==");
        this.measureChildren(widthMeasureSpec, heightMeasureSpec);
//􀞽􂍻􄟿􃠚􁐡􂲴􀽗􁈿
        int width = this.measureWidth(widthMeasureSpec);
        int height = this.measureHeight(heightMeasureSpec);
//􁓄􂭘􁉪􁈨
        this.setMeasuredDimension(width, height);
    }
    /**
     * 􂍻􄟿􁇩􀲘􂲴􁇭􁓖
     * @param widthMeasureSpec
     * @return
     */
    private int measureWidth(int widthMeasureSpec){
        int mode = MeasureSpec.getMode(widthMeasureSpec);
        int size = MeasureSpec.getSize(widthMeasureSpec);
        int width = 0;
        if(mode == MeasureSpec.EXACTLY) {
//match_parent 􁡆􀞧􀖃􀙬
            width = size;
        }else if(mode == MeasureSpec.AT_MOST){
//wrap_content
            int aWidth = 0;
            int bWidth = 0;
            int cWidth = 0;
            int dWidth = 0;
            for(int i = 0; i < this.getChildCount(); i ++){
                if(i == 0)
                    aWidth = getChildAt(i).getMeasuredWidth();
                else if(i == 1)
                    bWidth = getChildAt(i).getMeasuredWidth();
                else if(i == 2)
                    cWidth = getChildAt(i).getMeasuredWidth();
                else if(i == 3)
                    dWidth = getChildAt(i).getMeasuredWidth();
            }
            width = Math.max(aWidth, cWidth) + Math.max(bWidth, dWidth);
        }
        return width;
    }
    /**
     * 􂍻􄟿􁇩􀲘􂲴􅄈􁓖
     * @param heightMeasureSpec
     * @return
     */
    private int measureHeight(int heightMeasureSpec){
        int mode = MeasureSpec.getMode(heightMeasureSpec);
        int size = MeasureSpec.getSize(heightMeasureSpec);
        int height = 0;
        if(mode == MeasureSpec.EXACTLY) {
//match_parent 􁡆􀞧􀖃􀙬
            height = size;
        }else if(mode == MeasureSpec.AT_MOST){
//wrap_content
            int aHeight = 0;
            int bHeight = 0;
            int cHeight = 0;
            int dHeight = 0;
            for(int i = 0; i < this.getChildCount(); i ++){
                if(i == 0)
                    aHeight = getChildAt(i).getMeasuredHeight();
                else if(i == 1)
                    bHeight = getChildAt(i).getMeasuredHeight();
                else if(i == 2)
                    cHeight = getChildAt(i).getMeasuredHeight();
                else if(i == 3)
                    dHeight = getChildAt(i).getMeasuredHeight();
            }
            height = Math.max(aHeight, bHeight) + Math.max(cHeight, dHeight);
        }
        return height;
    }
}