package com.example.wp.testforview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by WangPeng on 2018/6/30.
 */
public class PointAnimView extends View {

    private static final float RADIUS = 20f;
    private PositionPoint mPositionPoint;
    private Paint mPaint;
    public PointAnimView(Context context) {
        super(context);
        init();
    }

    public PointAnimView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.RED);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mPositionPoint == null){
            mPositionPoint = new PositionPoint(RADIUS,RADIUS);
            drawCircle(canvas);
            startAnima();
        }else{
            drawCircle(canvas);
        }
    }

    private void startAnima() {

        ValueAnimator animator = ValueAnimator.ofFloat();
    }

    private void drawCircle(Canvas canvas) {
        float x = mPositionPoint.getX();
        float y = mPositionPoint.getY();
        canvas.drawCircle(x,y,RADIUS,mPaint);

    }
    /**
     * createPoint()创建PositionPointView对象
     */
    public PositionPoint createPoint(float x, float y) {
        return new PositionPoint(x, y);
    }
    /**
     * 小圆点内部类
     */
    class PositionPoint {
        private float x;
        private float y;

        public PositionPoint(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public float getY() {
            return y;
        }
    }

}
