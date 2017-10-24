package com.hencoder.hencoderpracticedraw1.practice

import android.annotation.TargetApi
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.os.Build
import android.util.AttributeSet
import android.view.View

class Practice9DrawPathView : View {
    private val paint = Paint()

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    private val path = Path()

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        练习内容：使用 canvas.drawPath() 方法画心形
        path.run {
            addArc(300f,200f,500f,400f,140f,220f)
            arcTo(500f,200f,700f,400f,-180f,220f,false)
            lineTo(500f,540f)
        }
        paint.run {
            style = Paint.Style.FILL
            color = Color.BLACK
            isAntiAlias = true
        }
        canvas.run {
            drawPath(path,paint)
        }
    }
}
