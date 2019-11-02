package com.example.samsunghomework;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {

    int N = 50; // количество шариков
    float[] x = new float[N];
    float[] y = new float[N];
    float[] vx = new float[N];
    float[] vy = new float[N];
    float rand(float min , float max){
        return (float)(Math.random() * (max - min + 1)) + min;
    }
    void fillRandom(float[] array , float min, float max){
        for (int i = 0; i < array.length; i++){
            array[i] = rand (min, max);
        }
    }

    public MyView(Context context) {
        super(context);
        fillRandom(x, 0, 500);
        fillRandom(y, 0, 500);
        fillRandom(vx, -3, 3);
        fillRandom(vy, 500, 0);

    }

    void add(float[] array, float[] values) {
        for (int i = 0; i < array.length; i++) {
            array[i] += values[i];
        }
    }

    Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        // отрисовываем все шарики
        drawBalls(canvas);
        // готовим массивы x и у для следующего кадра
        add(x, vx);
        add(y, vy);
        // запрашиваем перерисовку
        invalidate();
    }

    private void drawBalls(Canvas canvas) {
        for (int i = 0; i < N; i++) {
            canvas.drawCircle(x[i], y[i], 20, paint);
        }
    }
}

