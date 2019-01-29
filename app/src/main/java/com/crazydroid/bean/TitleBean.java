package com.crazydroid.bean;

import android.databinding.ObservableField;
import android.view.View;
import android.widget.Toast;

public class TitleBean {
    public ObservableField<String> title = new ObservableField<>();
    public int size;

    public void titleClick(View view){
        Toast.makeText(view.getContext(), title.get(), Toast.LENGTH_SHORT).show();
    }
}
