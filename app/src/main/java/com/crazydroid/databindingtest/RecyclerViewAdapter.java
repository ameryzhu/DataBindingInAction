package com.crazydroid.databindingtest;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter;

public class RecyclerViewAdapter extends BindingRecyclerViewAdapter {

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        GridLayoutManager manager = (GridLayoutManager) recyclerView.getLayoutManager();
        if (manager != null) {
            manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int position) {
                    Object object =  getAdapterItem(position);
                    if(object instanceof TitleBean){
                        return 4;
                    }else{
                        return 1;
                    }
                }
            });
        }
    }
}
