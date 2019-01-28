package com.crazydroid.databindingtest;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MyDecorator extends RecyclerView.ItemDecoration {

    public MyDecorator() {
        super();
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        // get the position
        int position = parent.getChildAdapterPosition(view);
        // get the view type
        int viewTypeTitle = parent.getAdapter().getItemViewType(0);
        int viewTypeCurrent = parent.getAdapter().getItemViewType(position);
        if (viewTypeCurrent==viewTypeTitle) {
            if (parent.getChildAdapterPosition(view) != 0) {
                //这里直接硬编码为1px
                outRect.top = 20;
            }
        }
    }

    @Override
    public void onDraw(@NonNull Canvas c, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.onDraw(c, parent, state);
//        for (int i = 0; i < parent.getChildCount(); i++) {
//            View view = parent.getChildAt(i);
//            int position = parent.getChildAdapterPosition(view);
//            int viewType = parent.getAdapter().getItemViewType(position);
//            if (viewType == MY_VIEW_TYPE) {
//                c.drawRect(view.getLeft(), view.getBottom(), view.getRight(), view.getBottom() + mHeightDp, mPaint);
//            }
//        }
    }
}