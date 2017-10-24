package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Build
import android.support.annotation.RequiresApi
import android.util.AttributeSet
import android.view.View

class Practice7DrawRoundRectView : View {

    private val paint = Paint().apply {
        color = Color.BLACK
        isAntiAlias = true
    }

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        //        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形
        canvas.drawRoundRect(400f,300f,780f,500f,50f,50f,paint)
    }
}
