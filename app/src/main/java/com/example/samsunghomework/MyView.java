package com.example.samsunghomework;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    float[] x;
    float[] y;
    float[] vx;
    float[] vy;
    int N = 50;
    void addValues(float[] array, float[] values){
        for (int i = 0; i < array.length; i++){
            array[i] += values[i];
        }
    }
    public MyView(Context context) {

        super(context);
        fillRandom(x, 0, 500);
        fillRandom(y, 0, 500);
        fillRandom(vx, -3, 3);
        fillRandom(vy, 500, 900);
        }

    float rand(float min , float max){
        return (float)(Math.random() * (max - min + 1)) + min;
    }
    void fillRandom(float[] array , float min, float max){
        for (int i = 0; i < array.length; i++){
            array[i] = rand (min, max);
        }
    }

    Paint paint = new Paint();
    @Override
    protected void onDraw(Canvas canvas){

        for (int i = 0; i < N; i++) {
            canvas.drawCircle(x[i], y[i], 20, paint);
        }

        // готовим массивы x и у для следущего кадра
        addValues(x, vx);
        addValues(y, vy);
        //запрашиваем перерисовку
        invalidate();
    }




}




