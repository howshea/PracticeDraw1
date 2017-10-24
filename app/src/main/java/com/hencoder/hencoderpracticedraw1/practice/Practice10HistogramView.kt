package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Practice10HistogramView : View {
    private val paint = Paint()

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        //划线
        paint.isAntiAlias = true
        paint.color = Color.WHITE
        paint.strokeWidth = 2f
        canvas.drawLines(floatArrayOf(100f, 50f, 100f, 550f, 100f, 550f, 960f, 550f), paint)
        paint.color = Color.parseColor("#72B916")
        paint.style = Paint.Style.FILL
        //画柱子
        canvas.run {
            drawRect(120f, 545f, 220f)
            drawRect(240f, 530f, 340f)
            drawRect(360f, 526f, 460f)
            drawRect(480f, 350f, 580f)
            drawRect(600f, 250f, 700f)
            drawRect(720f, 200f, 820f)
            drawRect(840f, 370f, 940f)
        }
        //写字
        paint.run {
            color = Color.WHITE
            textSize = 30f
            textAlign = Paint.Align.CENTER
        }
        canvas.run {
            drawText("Froyo", 170f)
            drawText("GB", 290f)
            drawText("ICS", 410f)
            drawText("JB", 530f)
            drawText("KitKat", 650f)
            drawText("L", 770f)
            drawText("M", 890f)
            paint.textSize = 50f
            drawText("直方图", 530f, 680f)
        }
    }

    private fun Canvas.drawText(text: String, x: Float, y: Float = 580f) = drawText(text, x, y, paint)
    private fun Canvas.drawRect(left: Float, top: Float, right: Float, bottom: Float = 548f) = drawRect(left, top, right, bottom, paint)
}
