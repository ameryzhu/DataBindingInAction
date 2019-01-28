package com.crazydroid.databindingtest;

import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MyBindable {

    @BindingAdapter(value = {"app:url"}, requireAll = false)
    public static void setImg(ImageView imageView, ObservableField<String> url){
        Glide.with(imageView.getContext())
                .load(url.get())
                .into(imageView);
    }

    @BindingAdapter(value = {"app:mgr"}, requireAll = false)
    public static void setMgr(RecyclerView view, RecyclerView.LayoutManager manager){
//        view.setLayoutManager(new GridLayoutManager(view.getContext(),4,LinearLayoutManager.VERTICAL,false));
        view.setLayoutManager(new GridLayoutManager(view.getContext(),4,LinearLayoutManager.VERTICAL,false));
    }

    @BindingAdapter(value = {"app:decorator"}, requireAll = false)
    public static void setDecorator(RecyclerView view, RecyclerView.ItemDecoration decoration){
//        view.setLayoutManager(new GridLayoutManager(view.getContext(),4,LinearLayoutManager.VERTICAL,false));
        view.addItemDecoration(decoration);
    }
}
