package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class Practice11PieChartView : View {
    private val paint = Paint().apply { isAntiAlias = true }
    private val rectNormal = RectF(200f, 60f, 800f, 660f)
    private val rectBig = RectF(180f, 40f, 780f, 640f)

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        //绘制折线
        paint.color = Color.parseColor("#BBBBBB")
        paint.strokeWidth = 4f
        canvas.run {
            drawLines(floatArrayOf(
                480f - 300 * cos(60.0), 340f - 300 * sin(60.0),
                480f - 330 * cos(60.0), 340f - 330 * sin(60.0),
                480f - 330 * cos(60.0), 340f - 330 * sin(60.0),
                480f - 330 * cos(60.0) - 150, 340f - 330 * sin(60.0)), paint)
            drawLines(floatArrayOf(
                500f + 300 * cos(30.0), 360f - 300 * sin(30.0),
                500f + 330 * cos(30.0), 360f - 330 * sin(30.0),
                500f + 330 * cos(30.0), 360f - 330 * sin(30.0),
                500f + 330 * cos(30.0) + 110f, 360f - 330 * sin(30.0)), paint)
            drawLine(800f, 360f, 900f, 360f, paint)
            drawLines(floatArrayOf(
                500 + 300 * cos(4.5), 360 + 300 * sin(4.5),
                500 + 330 * cos(4.5), 360 + 330 * sin(4.5),
                500 + 330 * cos(4.5), 360 + 330 * sin(4.5),
                500 + 330 * cos(4.5) + 50, 360 + 330 * sin(4.5)), paint)
            drawLines(floatArrayOf(
                500 + 300 * cos(10.5), 360 + 300 * sin(10.5),
                500 + 330 * cos(10.5), 360 + 330 * sin(10.5),
                500 + 330 * cos(10.5), 360 + 330 * sin(10.5),
                500 + 330 * cos(10.5) + 18, 360 + 330 * sin(10.5)
            ), paint)
            drawLines(floatArrayOf(
                500 + 300 * cos(44.0), 360 + 300 * sin(44.0),
                500 + 330 * cos(44.0), 360 + 330 * sin(44.0),
                500 + 330 * cos(44.0), 360 + 330 * sin(44.0),
                500 + 330 * cos(44.0) + 160, 360 + 330 * sin(44.0)
            ), paint)

            drawLines(floatArrayOf(
                500 - 300 * cos(53.0), 360 + 300 * sin(53.0),
                500 - 330 * cos(53.0), 360 + 330 * sin(53.0),
                500 - 330 * cos(53.0), 360 + 330 * sin(53.0),
                500 - 330 * cos(53.0) - 160, 360 + 330 * sin(53.0)
            ), paint)
        }

        //绘制文字
        paint.textSize = 26f
        paint.color = Color.WHITE
        canvas.run {
            drawText("Lollipop", 480f - 330 * cos(60.0) - 260f, 340f - 330 * sin(60.0), paint)
            drawText("Marshmallow", 500f + 330 * cos(30.0) + 112f, 360f - 330 * sin(30.0), paint)
            drawText("Froyo", 902f, 360f, paint)
            drawText("Gingerbread", 500 + 330 * cos(4.5) + 52, 362 + 330 * sin(4.5), paint)
            drawText("Ice Cream Sandwich", 500 + 330 * cos(10.5) + 20, 362 + 330 * sin(10.5), paint)
            drawText("Jelly Bean", 500 + 330 * cos(44.0) + 170, 360 + 330 * sin(44.0), paint)
            drawText("KitKat",500 - 330 * cos(53.0) - 240f,360 + 330 * sin(53.0),paint)
            paint.textSize = 45f
            drawText("饼图", 400f, 730f,paint)
        }

        //绘制扇形
        paint.run {
            color = Color.parseColor("#F44336")
            style = Paint.Style.FILL
        }
        canvas.run {
            drawArc(rectBig, 180f, 120f, true, paint)
            paint.color = Color.parseColor("#FFC107")
            drawArc(rectNormal, -60f, 59f, true, paint)
            paint.color = Color.parseColor("#506E7A")
            drawArc(rectNormal, -1f, 3f, true, paint)
            paint.color = Color.parseColor("#9C27B0")
            drawArc(rectNormal, 2f, 5f, true, paint)
            paint.color = Color.parseColor("#9E9E9E")
            drawArc(rectNormal, 8.5f, 4f, true, paint)
            paint.color = Color.parseColor("#009688")
            drawArc(rectNormal, 14f, 60f, true, paint)
            paint.color = Color.parseColor("#2196F3")
            drawArc(rectNormal, 76f, 102f, true, paint)
        }

    }

    private fun sqrt(num: Int) = Math.sqrt(num.toDouble()).toFloat()
    private fun sin(angle: Double) = Math.sin(Math.toRadians(angle)).toFloat()
    private fun cos(angle: Double) = Math.cos(Math.toRadians(angle)).toFloat()
}


