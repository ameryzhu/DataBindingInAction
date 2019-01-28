package com.crazydroid.databindingtest;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter;

public class RecyclerViewAdapter extends BindingRecyclerViewAdapter {

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        //如果是title就占据2个单元格(重点)
        GridLayoutManager manager = (GridLayoutManager) recyclerView.getLayoutManager();
        if (manager != null) {
            manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int position) {
                    Object object =  getAdapterItem(position);
                    if(object instanceof TitleBean){
                        return 8;
                    }else{
                        return 1;
                    }
//                    if(position==0||position==13||position==25){
//                        return 8;
//                    }else {
//                        return 1;
//                    }
                }
            });
        }
    }
}
