package com.crazydroid.holder;

import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.crazydroid.databindingtest.databinding.LayoutItem2Binding;
import com.crazydroid.databindingtest.databinding.LayoutItemBinding;

public class ViewHolderContent extends RecyclerView.ViewHolder {
    public ViewHolderContent(@NonNull ViewDataBinding itemView) {
        super(itemView.getRoot());
        final LayoutItem2Binding itemBinding = (LayoutItem2Binding) itemView;
        itemBinding.iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), itemBinding.getItemBean().age.get(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
