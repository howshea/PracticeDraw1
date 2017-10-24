package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Paint.*
import android.util.AttributeSet
import android.view.View

class Practice2DrawCircleView : View {
    private val paint: Paint = Paint()

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        paint.isAntiAlias = true

        //        练习内容：使用 canvas.drawCircle() 方法画圆
        //        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        canvas.run {
            paint.color = Color.BLACK
            paint.style = Style.FILL
            drawCircle(300f, 178f, 170f, paint)
            paint.style = Style.STROKE
            paint.strokeWidth = 4f
            drawCircle(700f, 178f, 170f, paint)
            paint.style = Style.FILL
            paint.color = Color.parseColor("#4A90E2")
            drawCircle(300f, 560f, 170f, paint)
            paint.style = Style.STROKE
            paint.strokeWidth = 20f
            paint.color = Color.BLACK
            drawCircle(700f,560f,170f,paint)
        }
    }
}
