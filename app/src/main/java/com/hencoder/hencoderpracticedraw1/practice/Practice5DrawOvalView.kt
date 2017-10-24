package com.hencoder.hencoderpracticedraw1.practice

import android.annotation.TargetApi
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Build
import android.util.AttributeSet
import android.view.View

class Practice5DrawOvalView : View {

    private val paint = Paint()

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        练习内容：使用 canvas.drawOval() 方法画椭圆
        paint.run {
            style = Paint.Style.FILL
            color = Color.BLACK
            isAntiAlias = true
        }
        canvas.drawOval(400f, 300f, 750f, 450f, paint)
    }
}
