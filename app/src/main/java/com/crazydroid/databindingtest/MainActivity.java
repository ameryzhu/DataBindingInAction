package com.crazydroid.databindingtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.crazydroid.databindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        viewModel = new ViewModel();

        viewModel.fetchData();
        binding.setViewModel(viewModel);
//        binding.setAdapter(adapter);
//        viewModel.liveData.observe(this, new Observer<List>() {
//            @Override
//            public void onChanged(@Nullable List list) {
//                adapter.notifyDataSetChanged();
//            }
//        });
    }
}
