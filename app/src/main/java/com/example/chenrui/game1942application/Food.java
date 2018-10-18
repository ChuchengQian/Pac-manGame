package com.example.chenrui.game1942application;

/*
 * Authors: Rui Chen
 * Date: 19/09/2018
 */

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

abstract class Food {

    private static float dotRadius = 0.004f;
    private static float pelletRadius = 0.008f;

    static void drawPacDot(Canvas canvas, Paint paint, float x, float y) {
        paint.setColor(Color.RED);// the PacDot should be a red dot
        canvas.drawCircle(x * canvas.getWidth(), y * canvas.getHeight(), dotRadius * canvas.getHeight(), paint);
    }

    static void drawPowerPellet(Canvas canvas, Paint paint, float x, float y) {
        paint.setColor(Color.BLUE);// the PacDot should be a yellow dot
        canvas.drawCircle(x * canvas.getWidth(), y*canvas.getHeight(), pelletRadius * canvas.getHeight(), paint);
    }



}
