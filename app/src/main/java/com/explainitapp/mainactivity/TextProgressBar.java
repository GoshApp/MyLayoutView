package com.explainitapp.mainactivity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/**
 * Created by rikmen00@gmail.com on 22.08.2019.
 */

public class TextProgressBar extends ProgressBar {
    private Paint textPaint;

    public TextProgressBar(Context context) {
        super(context);
        textPaint = new Paint();
        textPaint.setColor(Color.BLACK);
    }

    public TextProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        textPaint = new Paint();
        textPaint.setColor(Color.BLACK);
        setMax(30);
        setProgress(12);
        setSecondaryProgress(20);

    }
}
