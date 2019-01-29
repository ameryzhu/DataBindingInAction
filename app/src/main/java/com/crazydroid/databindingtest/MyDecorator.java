package com.crazydroid.databindingtest;

import android.databinding.DataBindingUtil;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.crazydroid.databindingtest.databinding.LayoutItem2Binding;
import com.crazydroid.databindingtest.databinding.LayoutItemBinding;

public class MyDecorator extends RecyclerView.ItemDecoration {

    private float mDividerHeight;

    private Paint mPaint;

    public MyDecorator() {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.GRAY);
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        //第一个ItemView以及grid item不需要在上面绘制分割线
        if (parent.getChildAdapterPosition(view) != 0 && DataBindingUtil.getBinding(view) instanceof LayoutItemBinding){
            //这里直接硬编码为1px
            outRect.top = 10;
            mDividerHeight = 10;
        }
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c, parent, state);

        int childCount = parent.getChildCount();

        for ( int i = 0; i < childCount; i++ ) {
            View view = parent.getChildAt(i);

            int index = parent.getChildAdapterPosition(view);

            //第一个ItemView、非标题类不需要绘制
            if ( index == 0 ||DataBindingUtil.getBinding(view) instanceof LayoutItem2Binding) {
                continue;
            }

            float dividerTop = view.getTop() - mDividerHeight;
            float dividerLeft = parent.getPaddingLeft();
            float dividerBottom = view.getTop();
            float dividerRight = parent.getWidth() - parent.getPaddingRight();

            c.drawRect(dividerLeft,dividerTop,dividerRight,dividerBottom,mPaint);
        }
    }
}