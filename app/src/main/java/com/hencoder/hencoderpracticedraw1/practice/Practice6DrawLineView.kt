package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Practice6DrawLineView : View {
    private val paint = Paint()

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onDraw(canvas: Canvas) {
        //        练习内容：使用 canvas.drawLine() 方法画直线
        super.onDraw(canvas)
        paint.color = Color.BLACK
        paint.isAntiAlias = true
        paint.strokeWidth = 4f
        canvas.drawLine(300f, 300f, 700f, 700f, paint)
    }
}
