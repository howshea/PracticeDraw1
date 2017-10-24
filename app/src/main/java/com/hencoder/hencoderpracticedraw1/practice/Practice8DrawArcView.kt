package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class Practice8DrawArcView : View {
    private val paint = Paint()
    val rectF = RectF(200f, 100f, 800f, 500f)

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        //        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        canvas.run {
            paint.apply {
            color = Color.BLACK
            isAntiAlias = true
            style = Paint.Style.FILL
        }
            drawArc(rectF, -110f, 100f, true, paint)
            drawArc(rectF, 20f, 140f, false,paint)
            paint.style = Paint.Style.STROKE
            drawArc(rectF,180f,65f,false,paint)
        }

    }
}
