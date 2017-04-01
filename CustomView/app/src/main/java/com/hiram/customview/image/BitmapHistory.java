package com.hiram.customview.image;

import android.graphics.Bitmap;

import java.util.Stack;

/**
 * 作者： hiram on 2017/3/29
 */
public class BitmapHistory {
    private static Stack<Bitmap> stack;
    private static BitmapHistory self;
    private BitmapHistory() {
        if(stack == null){
            stack = new Stack<Bitmap>();
        }
    }
    public static BitmapHistory getInstance(){
        if(self == null){
            self = new BitmapHistory();
        }
        return self;
    }
    public void pushBitmap(Bitmap bitmap){
        int count = stack.size();
        if(count >= 5){
            Bitmap bmp = stack.remove(0);
            if(!bmp.isRecycled()){
                bmp.recycle();
                System.gc();
                bmp = null;
            }
        }
        stack.push(bitmap);
    }

    public Bitmap reDo(){
        Bitmap bmp = stack.pop();
        if(bmp != null && !bmp.isRecycled()){
            bmp.recycle();
            System.gc();
            bmp = null;
        }
        if(stack.empty()) return null;
        return stack.peek();
    }
    public boolean isReDo(){
        return !stack.empty();
    }
}
