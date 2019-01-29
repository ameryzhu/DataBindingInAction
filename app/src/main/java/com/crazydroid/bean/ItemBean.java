package com.crazydroid.bean;

import android.databinding.ObservableField;
import android.view.View;
import android.widget.Toast;

public class ItemBean {
    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<String> age = new ObservableField<>();
    public ObservableField<String> url = new ObservableField<>();

    public void itemClick(View view){
        Toast.makeText(view.getContext(), name.get(), Toast.LENGTH_SHORT).show();

    }
}
