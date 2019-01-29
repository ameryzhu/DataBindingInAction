package com.crazydroid.holder;

import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.crazydroid.databindingtest.databinding.LayoutItemBinding;

public class ViewHolderTitle extends RecyclerView.ViewHolder {
    public ViewHolderTitle(@NonNull final ViewDataBinding itemView) {
        super(itemView.getRoot());
        final LayoutItemBinding itemBinding = (LayoutItemBinding) itemView;
        itemBinding.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}

