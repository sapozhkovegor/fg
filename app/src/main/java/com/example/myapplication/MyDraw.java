package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyDraw extends View {

    public MyDraw(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p=new Paint();
        p.setColor(Color.GREEN);
        p.setStrokeWidth(10);
        p.setAntiAlias(true);
        p.setColor(Color.parseColor("#388E3C"));
        p.setStyle(Paint.Style.FILL);
        canvas.drawRect(0,2300,1900,1800,p);
        p.setColor(Color.parseColor("#795548"));
        canvas.drawRect(200,2100,700,1600,p);
        Path path=new Path();
        path.moveTo(200,1600);
        path.lineTo(700,1600);
        path.lineTo(450,1300);
        p.setStyle(Paint.Style.FILL);
        canvas.drawPath(path,p);
        p.setColor(Color.parseColor("#448AFF"));
        canvas.drawCircle(450,1500,50,p);
        canvas.drawRect(200,1850,400,1650,p);
        p.setColor(Color.parseColor("#616161"));
        canvas.drawRect(200,2100,700,1600,p);
    }
}
