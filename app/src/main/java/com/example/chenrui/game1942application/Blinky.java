package com.example.chenrui.game1942application;

/*
 * Authors: Rui Chen, Chucheng Qian
 * Date: 14/10/2019
 *
 * Blinky is one of the Ghosts: Blinky, is a red ghost who, in the original arcade game, follows behind Pac-Man. He is considered the leader of the ghosts.
 */

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

class Blinky extends Ghost {

    static float B_STEP = 0.005f;

    Blinky(Pos pos) {
        super(pos);
        STEP = B_STEP;
    }

    /*
     * Authors: Rui Chen, Chucheng Qian
     * Date: 15/10/2019
     */
    @Override
    void onDraw(Canvas canvas, Paint paint) {
        paint.setColor(Color.RED);
        super.onDraw(canvas, paint);
    }

    /*
     * Authors: Rui Chen, Chucheng Qian
     * Date: 14/10/2019
     */
    void step(Pos pacManPos) {
        super.step(pacManPos);
        if (!blueMode) getMove(AI.chasing(pacManPos, this.pos));
    }
}


