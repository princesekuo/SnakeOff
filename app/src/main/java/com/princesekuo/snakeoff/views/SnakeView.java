package com.princesekuo.snakeoff.views;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

import com.princesekuo.snakeoff.bll.wall.WallInfo;

public class SnakeView extends View {
    public void setmWallInfo(WallInfo mWallInfo) {
        this.mWallInfo = mWallInfo;
    }

    private WallInfo mWallInfo = new WallInfo();

    public SnakeView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (mWallInfo != null) {
            float width = canvs.getWidth();
            float height = canvs.getHeight();
        }
    }

}
