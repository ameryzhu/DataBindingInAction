package com.crazydroid.databindingtest;

import android.databinding.ObservableField;

public class ItemBean {
    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<String> age = new ObservableField<>();
    public ObservableField<String> url = new ObservableField<>();
}
