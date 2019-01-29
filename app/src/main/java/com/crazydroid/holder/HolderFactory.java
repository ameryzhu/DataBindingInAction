package com.crazydroid.holder;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

import com.crazydroid.databindingtest.databinding.LayoutItem2Binding;
import com.crazydroid.databindingtest.databinding.LayoutItemBinding;

import me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter;

public class HolderFactory implements BindingRecyclerViewAdapter.ViewHolderFactory{
    private static HolderFactory instance;

    private HolderFactory(){}

    public static HolderFactory getInstance(){
        if(instance==null){
            instance = new HolderFactory();
        }
        return instance;
    }

    @Override
    public RecyclerView.ViewHolder createViewHolder(ViewDataBinding binding) {
        if(binding instanceof LayoutItemBinding){
            return new ViewHolderTitle(binding);
        }else if(binding instanceof LayoutItem2Binding){
            return new ViewHolderContent(binding);
        }
        return null;
    }
}
